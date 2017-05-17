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
		BLOCKCOMMENT=1, LINECOMMENT=2, TEKST=3, AAN=4, ALLE=5, ALS=6, BEREKEND=7, 
		DAN=8, DE=9, EN=10, GELIJK=11, GESTELD=12, GROTER=13, HHET=14, HET=15, 
		INDIEN=16, IS=17, KLEINER=18, LUIDT=19, MAAL=20, NIET=21, OF=22, OP=23, 
		RREGEL=24, VOLDAAN=25, VOLGENDE=26, VOORWAARDEN=27, WORDT=28, DUBBELE_PUNT=29, 
		GETAL_NUL=30, PUNT=31, STREEPJE=32, GETAL=33, WOORD=34, WS=35;
	public static final int
		RULE_statements = 0, RULE_regel = 1, RULE_toekenning = 2, RULE_object = 3, 
		RULE_waarde = 4, RULE_vergelijking = 5, RULE_feit = 6;
	public static final String[] ruleNames = {
		"statements", "regel", "toekenning", "object", "waarde", "vergelijking", 
		"feit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'aan'", "'alle'", "'als'", "'berekend'", "'dan'", 
		"'de'", "'en'", "'gelijk'", "'gesteld'", "'groter'", "'Het'", "'het'", 
		"'indien'", "'is'", "'kleiner'", "'luidt'", "'maal'", "'niet'", "'of'", 
		"'op'", "'Regel'", "'voldaan'", "'volgende'", "'voorwaarden'", "'wordt'", 
		"':'", "'0'", "'.'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BLOCKCOMMENT", "LINECOMMENT", "TEKST", "AAN", "ALLE", "ALS", "BEREKEND", 
		"DAN", "DE", "EN", "GELIJK", "GESTELD", "GROTER", "HHET", "HET", "INDIEN", 
		"IS", "KLEINER", "LUIDT", "MAAL", "NIET", "OF", "OP", "RREGEL", "VOLDAAN", 
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				regel();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RREGEL );
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
		public Token rg;
		public TerminalNode RREGEL() { return getToken(ProfielSpraakParser.RREGEL, 0); }
		public TerminalNode LUIDT() { return getToken(ProfielSpraakParser.LUIDT, 0); }
		public List<TerminalNode> DUBBELE_PUNT() { return getTokens(ProfielSpraakParser.DUBBELE_PUNT); }
		public TerminalNode DUBBELE_PUNT(int i) {
			return getToken(ProfielSpraakParser.DUBBELE_PUNT, i);
		}
		public TerminalNode INDIEN() { return getToken(ProfielSpraakParser.INDIEN, 0); }
		public TerminalNode AAN() { return getToken(ProfielSpraakParser.AAN, 0); }
		public TerminalNode ALLE() { return getToken(ProfielSpraakParser.ALLE, 0); }
		public TerminalNode VOLGENDE() { return getToken(ProfielSpraakParser.VOLGENDE, 0); }
		public TerminalNode VOORWAARDEN() { return getToken(ProfielSpraakParser.VOORWAARDEN, 0); }
		public TerminalNode WORDT() { return getToken(ProfielSpraakParser.WORDT, 0); }
		public TerminalNode VOLDAAN() { return getToken(ProfielSpraakParser.VOLDAAN, 0); }
		public TerminalNode PUNT() { return getToken(ProfielSpraakParser.PUNT, 0); }
		public TerminalNode TEKST() { return getToken(ProfielSpraakParser.TEKST, 0); }
		public List<ToekenningContext> toekenning() {
			return getRuleContexts(ToekenningContext.class);
		}
		public ToekenningContext toekenning(int i) {
			return getRuleContext(ToekenningContext.class,i);
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
			setState(19);
			match(RREGEL);
			setState(20);
			((RegelContext)_localctx).rg = match(TEKST);
			setState(21);
			match(LUIDT);
			setState(22);
			match(DUBBELE_PUNT);
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				toekenning();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EN || _la==HHET );
			setState(28);
			match(INDIEN);
			setState(29);
			match(AAN);
			setState(30);
			match(ALLE);
			setState(31);
			match(VOLGENDE);
			setState(32);
			match(VOORWAARDEN);
			setState(33);
			match(WORDT);
			setState(34);
			match(VOLDAAN);
			setState(35);
			match(DUBBELE_PUNT);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				object();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STREEPJE );
			setState(41);
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

	public static class ToekenningContext extends ParserRuleContext {
		public FeitContext f;
		public WaardeContext w;
		public FeitContext f1;
		public FeitContext f2;
		public TerminalNode WORDT() { return getToken(ProfielSpraakParser.WORDT, 0); }
		public List<FeitContext> feit() {
			return getRuleContexts(FeitContext.class);
		}
		public FeitContext feit(int i) {
			return getRuleContext(FeitContext.class,i);
		}
		public TerminalNode HHET() { return getToken(ProfielSpraakParser.HHET, 0); }
		public TerminalNode EN() { return getToken(ProfielSpraakParser.EN, 0); }
		public List<TerminalNode> DE() { return getTokens(ProfielSpraakParser.DE); }
		public TerminalNode DE(int i) {
			return getToken(ProfielSpraakParser.DE, i);
		}
		public List<TerminalNode> HET() { return getTokens(ProfielSpraakParser.HET); }
		public TerminalNode HET(int i) {
			return getToken(ProfielSpraakParser.HET, i);
		}
		public TerminalNode GESTELD() { return getToken(ProfielSpraakParser.GESTELD, 0); }
		public TerminalNode OP() { return getToken(ProfielSpraakParser.OP, 0); }
		public TerminalNode BEREKEND() { return getToken(ProfielSpraakParser.BEREKEND, 0); }
		public TerminalNode ALS() { return getToken(ProfielSpraakParser.ALS, 0); }
		public TerminalNode MAAL() { return getToken(ProfielSpraakParser.MAAL, 0); }
		public WaardeContext waarde() {
			return getRuleContext(WaardeContext.class,0);
		}
		public ToekenningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toekenning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterToekenning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitToekenning(this);
		}
	}

	public final ToekenningContext toekenning() throws RecognitionException {
		ToekenningContext _localctx = new ToekenningContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_toekenning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(43);
				match(HHET);
				}
				break;
			case 2:
				{
				setState(44);
				match(EN);
				setState(45);
				match(DE);
				}
				break;
			case 3:
				{
				setState(46);
				match(EN);
				setState(47);
				match(HET);
				}
				break;
			}
			setState(50);
			((ToekenningContext)_localctx).f = feit();
			setState(51);
			match(WORDT);
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GESTELD:
				{
				setState(52);
				match(GESTELD);
				setState(53);
				match(OP);
				setState(54);
				((ToekenningContext)_localctx).w = waarde();
				}
				break;
			case BEREKEND:
				{
				setState(55);
				match(BEREKEND);
				setState(56);
				match(ALS);
				setState(57);
				_la = _input.LA(1);
				if ( !(_la==DE || _la==HET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				((ToekenningContext)_localctx).f1 = feit();
				setState(59);
				match(MAAL);
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==DE || _la==HET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(61);
				((ToekenningContext)_localctx).f2 = feit();
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

	public static class ObjectContext extends ParserRuleContext {
		public FeitContext f;
		public VergelijkingContext v;
		public WaardeContext w;
		public TerminalNode STREEPJE() { return getToken(ProfielSpraakParser.STREEPJE, 0); }
		public FeitContext feit() {
			return getRuleContext(FeitContext.class,0);
		}
		public VergelijkingContext vergelijking() {
			return getRuleContext(VergelijkingContext.class,0);
		}
		public WaardeContext waarde() {
			return getRuleContext(WaardeContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			match(STREEPJE);
			setState(66);
			((ObjectContext)_localctx).f = feit();
			setState(67);
			((ObjectContext)_localctx).v = vergelijking();
			setState(68);
			((ObjectContext)_localctx).w = waarde();
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
		enterRule(_localctx, 8, RULE_waarde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WOORD:
				{
				setState(70);
				((WaardeContext)_localctx).WOORD = match(WOORD);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).WOORD!=null?((WaardeContext)_localctx).WOORD.getText():null); 
				}
				break;
			case TEKST:
				{
				setState(72);
				((WaardeContext)_localctx).TEKST = match(TEKST);
				 ((WaardeContext)_localctx).value =  "\"" + (((WaardeContext)_localctx).TEKST!=null?((WaardeContext)_localctx).TEKST.getText():null) + "\""; 
				}
				break;
			case GETAL:
				{
				setState(74);
				((WaardeContext)_localctx).GETAL = match(GETAL);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).GETAL!=null?((WaardeContext)_localctx).GETAL.getText():null); 
				}
				break;
			case GETAL_NUL:
				{
				setState(76);
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
		enterRule(_localctx, 10, RULE_vergelijking);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(80);
				match(IS);
				setState(81);
				match(GELIJK);
				setState(82);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "=="; 
				}
				break;
			case 2:
				{
				setState(84);
				match(IS);
				setState(85);
				match(NIET);
				setState(86);
				match(GELIJK);
				setState(87);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "!="; 
				}
				break;
			case 3:
				{
				setState(89);
				match(IS);
				setState(90);
				match(GROTER);
				setState(91);
				match(OF);
				setState(92);
				match(GELIJK);
				setState(93);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  ">="; 
				}
				break;
			case 4:
				{
				setState(95);
				match(IS);
				setState(96);
				match(GROTER);
				setState(97);
				match(DAN);
				 ((VergelijkingContext)_localctx).operator =  ">";  
				}
				break;
			case 5:
				{
				setState(99);
				match(IS);
				setState(100);
				match(KLEINER);
				setState(101);
				match(OF);
				setState(102);
				match(GELIJK);
				setState(103);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "<="; 
				}
				break;
			case 6:
				{
				setState(105);
				match(IS);
				setState(106);
				match(KLEINER);
				setState(107);
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
		public List<TerminalNode> AAN() { return getTokens(ProfielSpraakParser.AAN); }
		public TerminalNode AAN(int i) {
			return getToken(ProfielSpraakParser.AAN, i);
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
		enterRule(_localctx, 12, RULE_feit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111);
			((FeitContext)_localctx).WOORD = match(WOORD);
			 ((FeitContext)_localctx).signifier =  (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null); 
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AAN || _la==WOORD) {
				{
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WOORD:
					{
					setState(113);
					((FeitContext)_localctx).WOORD = match(WOORD);
					 _localctx.signifier += ("_" + (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null)); 
					}
					break;
				case AAN:
					{
					setState(115);
					match(AAN);
					 _localctx.signifier += ("_aan"); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(121);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%}\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23\3"+
		"\3\3\3\3\3\3\3\3\3\6\3\33\n\3\r\3\16\3\34\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bx\n\b\f"+
		"\b\16\b{\13\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\4\2\13\13\21\21\u0085\2\21"+
		"\3\2\2\2\4\25\3\2\2\2\6\62\3\2\2\2\bC\3\2\2\2\nP\3\2\2\2\fo\3\2\2\2\16"+
		"q\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24"+
		"\3\2\2\2\24\3\3\2\2\2\25\26\7\32\2\2\26\27\7\5\2\2\27\30\7\25\2\2\30\32"+
		"\7\37\2\2\31\33\5\6\4\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\36\3\2\2\2\36\37\7\22\2\2\37 \7\6\2\2 !\7\7\2\2!\"\7\34\2"+
		"\2\"#\7\35\2\2#$\7\36\2\2$%\7\33\2\2%\'\7\37\2\2&(\5\b\5\2\'&\3\2\2\2"+
		"()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7!\2\2,\5\3\2\2\2-\63\7\20"+
		"\2\2./\7\f\2\2/\63\7\13\2\2\60\61\7\f\2\2\61\63\7\21\2\2\62-\3\2\2\2\62"+
		".\3\2\2\2\62\60\3\2\2\2\63\64\3\2\2\2\64\65\5\16\b\2\65A\7\36\2\2\66\67"+
		"\7\16\2\2\678\7\31\2\28B\5\n\6\29:\7\t\2\2:;\7\b\2\2;<\t\2\2\2<=\5\16"+
		"\b\2=>\7\26\2\2>?\t\2\2\2?@\5\16\b\2@B\3\2\2\2A\66\3\2\2\2A9\3\2\2\2B"+
		"\7\3\2\2\2CD\7\"\2\2DE\5\16\b\2EF\5\f\7\2FG\5\n\6\2G\t\3\2\2\2HI\7$\2"+
		"\2IQ\b\6\1\2JK\7\5\2\2KQ\b\6\1\2LM\7#\2\2MQ\b\6\1\2NO\7 \2\2OQ\b\6\1\2"+
		"PH\3\2\2\2PJ\3\2\2\2PL\3\2\2\2PN\3\2\2\2Q\13\3\2\2\2RS\7\23\2\2ST\7\r"+
		"\2\2TU\7\6\2\2Up\b\7\1\2VW\7\23\2\2WX\7\27\2\2XY\7\r\2\2YZ\7\6\2\2Zp\b"+
		"\7\1\2[\\\7\23\2\2\\]\7\17\2\2]^\7\30\2\2^_\7\r\2\2_`\7\6\2\2`p\b\7\1"+
		"\2ab\7\23\2\2bc\7\17\2\2cd\7\n\2\2dp\b\7\1\2ef\7\23\2\2fg\7\24\2\2gh\7"+
		"\30\2\2hi\7\r\2\2ij\7\6\2\2jp\b\7\1\2kl\7\23\2\2lm\7\24\2\2mn\7\n\2\2"+
		"np\b\7\1\2oR\3\2\2\2oV\3\2\2\2o[\3\2\2\2oa\3\2\2\2oe\3\2\2\2ok\3\2\2\2"+
		"p\r\3\2\2\2qr\7$\2\2ry\b\b\1\2st\7$\2\2tx\b\b\1\2uv\7\6\2\2vx\b\b\1\2"+
		"ws\3\2\2\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{y\3\2\2"+
		"\2\13\23\34)\62APowy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}