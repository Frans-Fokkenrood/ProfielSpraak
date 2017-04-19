package com.fokkenrood.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Interpreteer {

	public static void main(String[] args) throws Exception {
		//	Compileer:
		ANTLRInputStream		input		= new ANTLRInputStream(args[0]);
		ProfielSpraakLexer		lexer		= new ProfielSpraakLexer(input);
		CommonTokenStream		tokens		= new CommonTokenStream(lexer);
		ProfielSpraakParser		parser		= new ProfielSpraakParser(tokens);
		AangifteDroolsListener	listener	= new AangifteDroolsListener();
		ParseTree				tree		= parser.statements();
		new ParseTreeWalker().walk(listener, tree);
		
		//	Beslis:
		String drl = listener.getDRL();
		System.out.println("DRL: \n" + drl);
	}	// end main
	
}	// end class