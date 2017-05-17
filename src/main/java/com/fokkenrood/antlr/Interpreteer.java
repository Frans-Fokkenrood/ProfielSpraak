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
		//	Compileer:
		ANTLRInputStream 		input 		= new ANTLRFileStream((args.length > 0) ? args[0] : "data\\ProfielSpraak.txt");
		ProfielSpraakLexer		lexer		= new ProfielSpraakLexer(input);
		CommonTokenStream		tokens		= new CommonTokenStream(lexer);
		ProfielSpraakParser		parser		= new ProfielSpraakParser(tokens);
		AangifteDroolsListener	listener	= new AangifteDroolsListener();
		ParseTree				tree		= parser.statements();
		new ParseTreeWalker().walk(listener, tree);
		String 					drlRset		= listener.getDRL();
		
		//	Debug info:
		System.out.println("- De ANTLR4 compiler neemt als bron '" + input.getSourceName() + "'...\n");
		System.out.println(drlRset);
		
		//	Beslis:
		KieServices ks = KieServices.Factory.get();
		KieFileSystem kfs = ks.newKieFileSystem();
		kfs.write("src/main/resources/Regel.drl", ks.getResources().newReaderResource(new StringReader(drlRset)));
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
			System.out.println("- Regel '" + aangifte.getRegel_naam() + "'heeft gevuurd...");
			System.out.println("  -- het bedrag aan invoerrecht is: " + aangifte.getBedrag_aan_invoerrecht());
			System.out.println("  -- het certificaat is: '" + aangifte.getCertificaat() + "'");
		}	// end if
		
	}	// end main
	
}	// end class