// Generated from src\main\java\com\fokkenrood\antlr\ProfielSpraak.g4 by ANTLR 4.6
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProfielSpraakLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BLOCKCOMMENT", "LINECOMMENT", "QUOTE", "KOMMA", "LETTER", "CIJFER", "TEKST", 
		"AANGIFTE", "AAN", "BEVAT", "DAN", "DE", "EEN", "GELIJK", "GROTER", "HEEFT", 
		"INDIEN", "IS", "KLEINER", "MMAAK", "MET", "NIET", "OF", "PARAMETERS", 
		"RUBRIEK", "SCORE", "VOLDAAN", "VOLGENDE", "VOORWAARDEN", "WORDT", "DUBBELE_PUNT", 
		"GETAL_NUL", "PUNT", "STREEPJE", "GETAL", "WOORD", "WS"
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


	public ProfielSpraakLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProfielSpraak.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			TEKST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEKST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText(getText().replaceAll("\"","")); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2R\n\2\f\2\16\2"+
		"U\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3`\n\3\f\3\16\3c\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\bt\n\b\f\b"+
		"\16\bw\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\5$\u0116\n"+
		"$\3$\6$\u0119\n$\r$\16$\u011a\3%\3%\3%\7%\u0120\n%\f%\16%\u0123\13%\3"+
		"&\6&\u0126\n&\r&\16&\u0127\3&\3&\5Sau\2\'\3\3\5\4\7\2\t\2\13\2\r\2\17"+
		"\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-"+
		"\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#\3\2\5"+
		"\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5[\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2"+
		"\2\2\ro\3\2\2\2\17q\3\2\2\2\21{\3\2\2\2\23\u0084\3\2\2\2\25\u0088\3\2"+
		"\2\2\27\u008e\3\2\2\2\31\u0092\3\2\2\2\33\u0095\3\2\2\2\35\u0099\3\2\2"+
		"\2\37\u00a0\3\2\2\2!\u00a7\3\2\2\2#\u00ad\3\2\2\2%\u00b4\3\2\2\2\'\u00b7"+
		"\3\2\2\2)\u00bf\3\2\2\2+\u00c4\3\2\2\2-\u00c8\3\2\2\2/\u00cd\3\2\2\2\61"+
		"\u00d0\3\2\2\2\63\u00db\3\2\2\2\65\u00e3\3\2\2\2\67\u00e9\3\2\2\29\u00f1"+
		"\3\2\2\2;\u00fa\3\2\2\2=\u0106\3\2\2\2?\u010c\3\2\2\2A\u010e\3\2\2\2C"+
		"\u0110\3\2\2\2E\u0112\3\2\2\2G\u0115\3\2\2\2I\u011c\3\2\2\2K\u0125\3\2"+
		"\2\2MN\7\61\2\2NO\7,\2\2OS\3\2\2\2PR\13\2\2\2QP\3\2\2\2RU\3\2\2\2ST\3"+
		"\2\2\2SQ\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7,\2\2WX\7\61\2\2XY\3\2\2\2YZ\b"+
		"\2\2\2Z\4\3\2\2\2[\\\7\61\2\2\\]\7\61\2\2]a\3\2\2\2^`\13\2\2\2_^\3\2\2"+
		"\2`c\3\2\2\2ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\17\2\2ef\7\f"+
		"\2\2fg\3\2\2\2gh\b\3\2\2h\6\3\2\2\2ij\7$\2\2j\b\3\2\2\2kl\7.\2\2l\n\3"+
		"\2\2\2mn\t\2\2\2n\f\3\2\2\2op\t\3\2\2p\16\3\2\2\2qu\5\7\4\2rt\13\2\2\2"+
		"sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\5\7\4\2"+
		"yz\b\b\3\2z\20\3\2\2\2{|\7c\2\2|}\7c\2\2}~\7p\2\2~\177\7i\2\2\177\u0080"+
		"\7k\2\2\u0080\u0081\7h\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083"+
		"\22\3\2\2\2\u0084\u0085\7c\2\2\u0085\u0086\7c\2\2\u0086\u0087\7p\2\2\u0087"+
		"\24\3\2\2\2\u0088\u0089\7d\2\2\u0089\u008a\7g\2\2\u008a\u008b\7x\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7v\2\2\u008d\26\3\2\2\2\u008e\u008f\7f\2\2\u008f"+
		"\u0090\7c\2\2\u0090\u0091\7p\2\2\u0091\30\3\2\2\2\u0092\u0093\7f\2\2\u0093"+
		"\u0094\7g\2\2\u0094\32\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7g\2\2\u0097"+
		"\u0098\7p\2\2\u0098\34\3\2\2\2\u0099\u009a\7i\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7n\2\2\u009c\u009d\7k\2\2\u009d\u009e\7l\2\2\u009e\u009f\7m\2\2"+
		"\u009f\36\3\2\2\2\u00a0\u00a1\7i\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7"+
		"q\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7t\2\2\u00a6 "+
		"\3\2\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7h\2\2\u00ab\u00ac\7v\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\u00b3\7p\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7u\2"+
		"\2\u00b6&\3\2\2\2\u00b7\u00b8\7m\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7"+
		"g\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7t\2\2\u00be(\3\2\2\2\u00bf\u00c0\7O\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7m\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7v\2\2\u00c7,\3\2\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca"+
		"\7k\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7v\2\2\u00cc.\3\2\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7h\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2"+
		"\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7t\2\2"+
		"\u00d9\u00da\7u\2\2\u00da\62\3\2\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7"+
		"w\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7m\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5"+
		"\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\66\3\2\2\2\u00e9\u00ea\7x\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7n\2\2\u00ec"+
		"\u00ed\7f\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7p\2\2"+
		"\u00f08\3\2\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7n\2"+
		"\2\u00f4\u00f5\7i\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8"+
		"\7f\2\2\u00f8\u00f9\7g\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7x\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7y\2\2\u00ff"+
		"\u0100\7c\2\2\u0100\u0101\7c\2\2\u0101\u0102\7t\2\2\u0102\u0103\7f\2\2"+
		"\u0103\u0104\7g\2\2\u0104\u0105\7p\2\2\u0105<\3\2\2\2\u0106\u0107\7y\2"+
		"\2\u0107\u0108\7q\2\2\u0108\u0109\7t\2\2\u0109\u010a\7f\2\2\u010a\u010b"+
		"\7v\2\2\u010b>\3\2\2\2\u010c\u010d\7<\2\2\u010d@\3\2\2\2\u010e\u010f\7"+
		"\62\2\2\u010fB\3\2\2\2\u0110\u0111\7\60\2\2\u0111D\3\2\2\2\u0112\u0113"+
		"\7/\2\2\u0113F\3\2\2\2\u0114\u0116\5E#\2\u0115\u0114\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0119\5\r\7\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bH\3\2\2\2"+
		"\u011c\u0121\5\13\6\2\u011d\u0120\5\13\6\2\u011e\u0120\5E#\2\u011f\u011d"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122J\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\t\4\2\2"+
		"\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b&\2\2\u012aL\3\2\2\2\13\2Sa"+
		"u\u0115\u011a\u011f\u0121\u0127\4\b\2\2\3\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}