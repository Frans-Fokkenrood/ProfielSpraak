// Generated from src\main\java\com\fokkenrood\antlr\ProfielSpraak.g4 by ANTLR 4.6
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProfielSpraakParser}.
 */
public interface ProfielSpraakListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#regel}.
	 * @param ctx the parse tree
	 */
	void enterRegel(ProfielSpraakParser.RegelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#regel}.
	 * @param ctx the parse tree
	 */
	void exitRegel(ProfielSpraakParser.RegelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ProfielSpraakParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ProfielSpraakParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#waarde}.
	 * @param ctx the parse tree
	 */
	void enterWaarde(ProfielSpraakParser.WaardeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#waarde}.
	 * @param ctx the parse tree
	 */
	void exitWaarde(ProfielSpraakParser.WaardeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#vergelijking}.
	 * @param ctx the parse tree
	 */
	void enterVergelijking(ProfielSpraakParser.VergelijkingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#vergelijking}.
	 * @param ctx the parse tree
	 */
	void exitVergelijking(ProfielSpraakParser.VergelijkingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#feit}.
	 * @param ctx the parse tree
	 */
	void enterFeit(ProfielSpraakParser.FeitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#feit}.
	 * @param ctx the parse tree
	 */
	void exitFeit(ProfielSpraakParser.FeitContext ctx);
}