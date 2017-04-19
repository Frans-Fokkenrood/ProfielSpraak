// Generated from src\main\java\com\fokkenrood\antlr\ProfielSpraak.g4 by ANTLR 4.6
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProfielSpraakParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCKCOMMENT=1, LINECOMMENT=2, TEKST=3, AANGIFTE=4, AAN=5, BEVAT=6, DAN=7, 
		DE=8, EEN=9, GELIJK=10, GROTER=11, HEEFT=12, INDIEN=13, IS=14, KLEINER=15, 
		MMAAK=16, MET=17, NIET=18, OF=19, PARAMETERS=20, RUBRIEK=21, SCORE=22, 
		VOLDAAN=23, VOLGENDE=24, VOORWAARDEN=25, WORDT=26, DUBBELE_PUNT=27, GETAL_NUL=28, 
		PUNT=29, STREEPJE=30, GETAL=31, WOORD=32, WS=33;
	public static final int
		RULE_statements = 0, RULE_regel = 1, RULE_object = 2, RULE_waarde = 3, 
		RULE_vergelijking = 4, RULE_feit = 5;
	public static final String[] ruleNames = {
		"statements", "regel", "object", "waarde", "vergelijking", "feit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'aangifte'", "'aan'", "'bevat'", "'dan'", "'de'", 
		"'een'", "'gelijk'", "'groter'", "'heeft'", "'indien'", "'is'", "'kleiner'", 
		"'Maak'", "'met'", "'niet'", "'of'", "'parameters'", "'rubriek'", "'score'", 
		"'voldaan'", "'volgende'", "'voorwaarden'", "'wordt'", "':'", "'0'", "'.'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BLOCKCOMMENT", "LINECOMMENT", "TEKST", "AANGIFTE", "AAN", "BEVAT", 
		"DAN", "DE", "EEN", "GELIJK", "GROTER", "HEEFT", "INDIEN", "IS", "KLEINER", 
		"MMAAK", "MET", "NIET", "OF", "PARAMETERS", "RUBRIEK", "SCORE", "VOLDAAN", 
		"VOLGENDE", "VOORWAARDEN", "WORDT", "DUBBELE_PUNT", "GETAL_NUL", "PUNT", 
		"STREEPJE", "GETAL", "WOORD", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ProfielSpraak.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProfielSpraakParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public List<RegelContext> regel() {
			return getRuleContexts(RegelContext.class);
		}
		public RegelContext regel(int i) {
			return getRuleContext(RegelContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				regel();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MMAAK );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegelContext extends ParserRuleContext {
		public WaardeContext w;
		public TerminalNode MMAAK() { return getToken(ProfielSpraakParser.MMAAK, 0); }
		public TerminalNode EEN() { return getToken(ProfielSpraakParser.EEN, 0); }
		public List<TerminalNode> SCORE() { return getTokens(ProfielSpraakParser.SCORE); }
		public TerminalNode SCORE(int i) {
			return getToken(ProfielSpraakParser.SCORE, i);
		}
		public TerminalNode MET() { return getToken(ProfielSpraakParser.MET, 0); }
		public List<TerminalNode> DE() { return getTokens(ProfielSpraakParser.DE); }
		public TerminalNode DE(int i) {
			return getToken(ProfielSpraakParser.DE, i);
		}
		public List<TerminalNode> VOLGENDE() { return getTokens(ProfielSpraakParser.VOLGENDE); }
		public TerminalNode VOLGENDE(int i) {
			return getToken(ProfielSpraakParser.VOLGENDE, i);
		}
		public TerminalNode PARAMETERS() { return getToken(ProfielSpraakParser.PARAMETERS, 0); }
		public List<TerminalNode> DUBBELE_PUNT() { return getTokens(ProfielSpraakParser.DUBBELE_PUNT); }
		public TerminalNode DUBBELE_PUNT(int i) {
			return getToken(ProfielSpraakParser.DUBBELE_PUNT, i);
		}
		public TerminalNode STREEPJE() { return getToken(ProfielSpraakParser.STREEPJE, 0); }
		public TerminalNode IS() { return getToken(ProfielSpraakParser.IS, 0); }
		public TerminalNode INDIEN() { return getToken(ProfielSpraakParser.INDIEN, 0); }
		public TerminalNode AAN() { return getToken(ProfielSpraakParser.AAN, 0); }
		public TerminalNode VOORWAARDEN() { return getToken(ProfielSpraakParser.VOORWAARDEN, 0); }
		public TerminalNode WORDT() { return getToken(ProfielSpraakParser.WORDT, 0); }
		public TerminalNode VOLDAAN() { return getToken(ProfielSpraakParser.VOLDAAN, 0); }
		public TerminalNode PUNT() { return getToken(ProfielSpraakParser.PUNT, 0); }
		public WaardeContext waarde() {
			return getRuleContext(WaardeContext.class,0);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public RegelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterRegel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitRegel(this);
		}
	}

	public final RegelContext regel() throws RecognitionException {
		RegelContext _localctx = new RegelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(17);
			match(MMAAK);
			setState(18);
			match(EEN);
			setState(19);
			match(SCORE);
			setState(20);
			match(MET);
			setState(21);
			match(DE);
			setState(22);
			match(VOLGENDE);
			setState(23);
			match(PARAMETERS);
			setState(24);
			match(DUBBELE_PUNT);
			setState(25);
			match(STREEPJE);
			setState(26);
			match(SCORE);
			setState(27);
			match(IS);
			setState(28);
			((RegelContext)_localctx).w = waarde();
			setState(29);
			match(INDIEN);
			setState(30);
			match(AAN);
			setState(31);
			match(DE);
			setState(32);
			match(VOLGENDE);
			setState(33);
			match(VOORWAARDEN);
			setState(34);
			match(WORDT);
			setState(35);
			match(VOLDAAN);
			setState(36);
			match(DUBBELE_PUNT);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				object();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STREEPJE );
			setState(42);
			match(PUNT);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public FeitContext f;
		public VergelijkingContext v;
		public WaardeContext w1;
		public Token not;
		public WaardeContext w2;
		public TerminalNode STREEPJE() { return getToken(ProfielSpraakParser.STREEPJE, 0); }
		public TerminalNode DE() { return getToken(ProfielSpraakParser.DE, 0); }
		public TerminalNode AANGIFTE() { return getToken(ProfielSpraakParser.AANGIFTE, 0); }
		public TerminalNode HEEFT() { return getToken(ProfielSpraakParser.HEEFT, 0); }
		public TerminalNode RUBRIEK() { return getToken(ProfielSpraakParser.RUBRIEK, 0); }
		public FeitContext feit() {
			return getRuleContext(FeitContext.class,0);
		}
		public TerminalNode BEVAT() { return getToken(ProfielSpraakParser.BEVAT, 0); }
		public VergelijkingContext vergelijking() {
			return getRuleContext(VergelijkingContext.class,0);
		}
		public WaardeContext waarde() {
			return getRuleContext(WaardeContext.class,0);
		}
		public TerminalNode NIET() { return getToken(ProfielSpraakParser.NIET, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			match(STREEPJE);
			setState(45);
			match(DE);
			setState(46);
			match(AANGIFTE);
			setState(47);
			match(HEEFT);
			setState(48);
			match(RUBRIEK);
			setState(49);
			((ObjectContext)_localctx).f = feit();
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
				{
				setState(50);
				((ObjectContext)_localctx).v = vergelijking();
				setState(51);
				((ObjectContext)_localctx).w1 = waarde();
				}
				break;
			case BEVAT:
				{
				setState(53);
				match(BEVAT);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NIET) {
					{
					setState(54);
					((ObjectContext)_localctx).not = match(NIET);
					}
				}

				setState(57);
				((ObjectContext)_localctx).w2 = waarde();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaardeContext extends ParserRuleContext {
		public String value;
		public Token WOORD;
		public Token TEKST;
		public Token GETAL;
		public TerminalNode WOORD() { return getToken(ProfielSpraakParser.WOORD, 0); }
		public TerminalNode TEKST() { return getToken(ProfielSpraakParser.TEKST, 0); }
		public TerminalNode GETAL() { return getToken(ProfielSpraakParser.GETAL, 0); }
		public TerminalNode GETAL_NUL() { return getToken(ProfielSpraakParser.GETAL_NUL, 0); }
		public WaardeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waarde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterWaarde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitWaarde(this);
		}
	}

	public final WaardeContext waarde() throws RecognitionException {
		WaardeContext _localctx = new WaardeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_waarde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WOORD:
				{
				setState(60);
				((WaardeContext)_localctx).WOORD = match(WOORD);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).WOORD!=null?((WaardeContext)_localctx).WOORD.getText():null); 
				}
				break;
			case TEKST:
				{
				setState(62);
				((WaardeContext)_localctx).TEKST = match(TEKST);
				 ((WaardeContext)_localctx).value =  "\"" + (((WaardeContext)_localctx).TEKST!=null?((WaardeContext)_localctx).TEKST.getText():null) + "\""; 
				}
				break;
			case GETAL:
				{
				setState(64);
				((WaardeContext)_localctx).GETAL = match(GETAL);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).GETAL!=null?((WaardeContext)_localctx).GETAL.getText():null); 
				}
				break;
			case GETAL_NUL:
				{
				setState(66);
				match(GETAL_NUL);
				 ((WaardeContext)_localctx).value =  "0"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VergelijkingContext extends ParserRuleContext {
		public String operator;
		public TerminalNode IS() { return getToken(ProfielSpraakParser.IS, 0); }
		public TerminalNode GELIJK() { return getToken(ProfielSpraakParser.GELIJK, 0); }
		public TerminalNode AAN() { return getToken(ProfielSpraakParser.AAN, 0); }
		public TerminalNode NIET() { return getToken(ProfielSpraakParser.NIET, 0); }
		public TerminalNode GROTER() { return getToken(ProfielSpraakParser.GROTER, 0); }
		public TerminalNode OF() { return getToken(ProfielSpraakParser.OF, 0); }
		public TerminalNode DAN() { return getToken(ProfielSpraakParser.DAN, 0); }
		public TerminalNode KLEINER() { return getToken(ProfielSpraakParser.KLEINER, 0); }
		public VergelijkingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergelijking; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterVergelijking(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitVergelijking(this);
		}
	}

	public final VergelijkingContext vergelijking() throws RecognitionException {
		VergelijkingContext _localctx = new VergelijkingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vergelijking);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(70);
				match(IS);
				setState(71);
				match(GELIJK);
				setState(72);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "=="; 
				}
				break;
			case 2:
				{
				setState(74);
				match(IS);
				setState(75);
				match(NIET);
				setState(76);
				match(GELIJK);
				setState(77);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "!="; 
				}
				break;
			case 3:
				{
				setState(79);
				match(IS);
				setState(80);
				match(GROTER);
				setState(81);
				match(OF);
				setState(82);
				match(GELIJK);
				setState(83);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  ">="; 
				}
				break;
			case 4:
				{
				setState(85);
				match(IS);
				setState(86);
				match(GROTER);
				setState(87);
				match(DAN);
				 ((VergelijkingContext)_localctx).operator =  ">";  
				}
				break;
			case 5:
				{
				setState(89);
				match(IS);
				setState(90);
				match(KLEINER);
				setState(91);
				match(OF);
				setState(92);
				match(GELIJK);
				setState(93);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "<="; 
				}
				break;
			case 6:
				{
				setState(95);
				match(IS);
				setState(96);
				match(KLEINER);
				setState(97);
				match(DAN);
				 ((VergelijkingContext)_localctx).operator =  "<";  
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeitContext extends ParserRuleContext {
		public String signifier;
		public Token WOORD;
		public List<TerminalNode> WOORD() { return getTokens(ProfielSpraakParser.WOORD); }
		public TerminalNode WOORD(int i) {
			return getToken(ProfielSpraakParser.WOORD, i);
		}
		public FeitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterFeit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitFeit(this);
		}
	}

	public final FeitContext feit() throws RecognitionException {
		FeitContext _localctx = new FeitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_feit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(101);
			((FeitContext)_localctx).WOORD = match(WOORD);
			 ((FeitContext)_localctx).signifier =  (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null); 
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WOORD) {
				{
				{
				setState(103);
				((FeitContext)_localctx).WOORD = match(WOORD);
				 _localctx.signifier += (" " + (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null)); 
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#q\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\6\3)\n\3\r\3\16\3*\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4:\n\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5G\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6f\n\6\3\7\3\7\3\7\3"+
		"\7\7\7l\n\7\f\7\16\7o\13\7\3\7\2\2\b\2\4\6\b\n\f\2\2w\2\17\3\2\2\2\4\23"+
		"\3\2\2\2\6.\3\2\2\2\bF\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16\20\5\4\3\2\17"+
		"\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23"+
		"\24\7\22\2\2\24\25\7\13\2\2\25\26\7\30\2\2\26\27\7\23\2\2\27\30\7\n\2"+
		"\2\30\31\7\32\2\2\31\32\7\26\2\2\32\33\7\35\2\2\33\34\7 \2\2\34\35\7\30"+
		"\2\2\35\36\7\20\2\2\36\37\5\b\5\2\37 \7\17\2\2 !\7\7\2\2!\"\7\n\2\2\""+
		"#\7\32\2\2#$\7\33\2\2$%\7\34\2\2%&\7\31\2\2&(\7\35\2\2\')\5\6\4\2(\'\3"+
		"\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\37\2\2-\5\3\2\2\2."+
		"/\7 \2\2/\60\7\n\2\2\60\61\7\6\2\2\61\62\7\16\2\2\62\63\7\27\2\2\63<\5"+
		"\f\7\2\64\65\5\n\6\2\65\66\5\b\5\2\66=\3\2\2\2\679\7\b\2\28:\7\24\2\2"+
		"98\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\5\b\5\2<\64\3\2\2\2<\67\3\2\2\2=\7\3"+
		"\2\2\2>?\7\"\2\2?G\b\5\1\2@A\7\5\2\2AG\b\5\1\2BC\7!\2\2CG\b\5\1\2DE\7"+
		"\36\2\2EG\b\5\1\2F>\3\2\2\2F@\3\2\2\2FB\3\2\2\2FD\3\2\2\2G\t\3\2\2\2H"+
		"I\7\20\2\2IJ\7\f\2\2JK\7\7\2\2Kf\b\6\1\2LM\7\20\2\2MN\7\24\2\2NO\7\f\2"+
		"\2OP\7\7\2\2Pf\b\6\1\2QR\7\20\2\2RS\7\r\2\2ST\7\25\2\2TU\7\f\2\2UV\7\7"+
		"\2\2Vf\b\6\1\2WX\7\20\2\2XY\7\r\2\2YZ\7\t\2\2Zf\b\6\1\2[\\\7\20\2\2\\"+
		"]\7\21\2\2]^\7\25\2\2^_\7\f\2\2_`\7\7\2\2`f\b\6\1\2ab\7\20\2\2bc\7\21"+
		"\2\2cd\7\t\2\2df\b\6\1\2eH\3\2\2\2eL\3\2\2\2eQ\3\2\2\2eW\3\2\2\2e[\3\2"+
		"\2\2ea\3\2\2\2f\13\3\2\2\2gh\7\"\2\2hm\b\7\1\2ij\7\"\2\2jl\b\7\1\2ki\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\r\3\2\2\2om\3\2\2\2\t\21*9<Fem";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}