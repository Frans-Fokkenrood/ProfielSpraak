package com.fokkenrood.antlr;

import java.io.StringReader;

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
		ANTLRInputStream		input		= new ANTLRInputStream(args[0]);
		ProfielSpraakLexer		lexer		= new ProfielSpraakLexer(input);
		CommonTokenStream		tokens		= new CommonTokenStream(lexer);
		ProfielSpraakParser		parser		= new ProfielSpraakParser(tokens);
		AangifteDroolsListener	listener	= new AangifteDroolsListener();
		ParseTree				tree		= parser.regel();
		new ParseTreeWalker().walk(listener, tree);
		String 					drl 		= listener.getDRL();
		System.out.println(drl);
		
		//	Beslis:
		KieServices ks = KieServices.Factory.get();
		KieFileSystem kfs = ks.newKieFileSystem();
		kfs.write("src/main/resources/Regel.drl", ks.getResources().newReaderResource(new StringReader(drl)));
		KieBuilder kb = ks.newKieBuilder(kfs).buildAll();
		KieContainer kc = ks.newKieContainer(kb.getKieModule().getReleaseId());
		KieSession ksession = kc.newKieSession();
		
		//	Voeg feit Aangifte toe en roep de rule engine aan:
		Aangifte aangifte = new Aangifte();
		aangifte.setBestemming(args[1]);
		aangifte.setOmschrijving(args[2]);
		
		ksession.insert(aangifte);
		int count = ksession.fireAllRules();
		ksession.dispose();
		
		//	Toon resultaat:
		System.out.println("de regel heeft " + (count==0 ? "NIET " : "") + "gevuurd...");
		System.out.println("de score is " + (count==0 ? "ONBEKEND" : aangifte.getScore()));
	}	// end main
	
}	// end class