package com.fokkenrood.antlr;

import java.io.StringReader;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.fokkenrood.drools.Aangifte;

public class Interpreteer {

	public static void main(String[] args) throws Exception {
		//	Lees ProfielSpraak via een bestand, of direct vanaf sysin:
		String regelset = (args.length > 0) ? args[0] : "FILE:data\\ProfielSpraak.txt";
		ANTLRInputStream input = null;
		if (regelset.startsWith("FILE:")) {
			input = new ANTLRFileStream(regelset.substring(5));
		} else {
			input = new ANTLRInputStream(regelset.substring(5).replaceAll("##", "\n"));
		}	// end if

		//	Compileer:
		ProfielSpraakLexer lexer = new ProfielSpraakLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ProfielSpraakParser parser = new ProfielSpraakParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(new AangifteErrorListener());
		AangifteDroolsListener listener = new AangifteDroolsListener();
		ParseTree tree = parser.statements();
		new ParseTreeWalker().walk(listener, tree);
		
		//	Controleer op fouten in de ProfielSpraak:
		String message = ((AangifteErrorListener) parser.getErrorListeners().get(0)).getMessage();
		if (message.length() > 0) {
			int nr = 0;
			for (String regel : regelset.substring(5).split("##")) {
				System.out.println(String.format("%02d", ++nr) + "| " + regel);
			}	// end for
			System.out.println(message);
			return;
		}	// end if

		//	Het statement is correct, dus roep de beslis-service aan:
		String result = listener.getResult();
//		System.out.println(result);
		
		KieServices ks = KieServices.Factory.get();
		KieFileSystem kfs = ks.newKieFileSystem();
		kfs.write("src/main/resources/Regel.drl", ks.getResources().newReaderResource(new StringReader(result)));
		KieBuilder kb = ks.newKieBuilder(kfs).buildAll();
		KieContainer kc = ks.newKieContainer(kb.getKieModule().getReleaseId());
		KieSession ksession = kc.newKieSession();
		
		//	Voeg feit Aangifte toe en roep de rule engine aan:
		Aangifte aangifte = new Aangifte();
		aangifte.setGoederen_omschrijving((args.length > 1) ? args[1] : "Fiets");
		aangifte.setLand_van_herkomst((args.length > 2) ? args[2] : "Nederland");
		
		ksession.insert(aangifte);
		int count = ksession.fireAllRules();
		ksession.dispose();
		
		//	Toon resultaat:
		if (count == 0) {
			System.out.println("Er heeft geen enkele regel gevuurd!");
		} else {	
			System.out.println("- Regel '" + aangifte.getRegel_naam() + "' heeft gevuurd...");
			System.out.println("  -- het bedrag aan invoerrecht is: " + aangifte.getBedrag_aan_invoerrecht());
			System.out.println("  -- het certificaat is: '" + aangifte.getCertificaat() + "'");
		}	// end if
		
	}	// end main
	
}	// end class