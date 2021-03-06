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
		BLOCKCOMMENT=1, LINECOMMENT=2, TEKST=3, AAN=4, ALLE=5, ALS=6, BEREKEND=7, 
		DAN=8, DE=9, EN=10, GELIJK=11, GESTELD=12, GROTER=13, HHET=14, HET=15, 
		INDIEN=16, IS=17, KLEINER=18, LUIDT=19, MAAL=20, NIET=21, OF=22, OP=23, 
		RREGEL=24, VOLDAAN=25, VOLGENDE=26, VOORWAARDEN=27, WORDT=28, DUBBELE_PUNT=29, 
		GETAL_NUL=30, PUNT=31, STREEPJE=32, GETAL=33, WOORD=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BLOCKCOMMENT", "LINECOMMENT", "QUOTE", "KOMMA", "LETTER", "CIJFER", "TEKST", 
		"AAN", "ALLE", "ALS", "BEREKEND", "DAN", "DE", "EN", "GELIJK", "GESTELD", 
		"GROTER", "HHET", "HET", "INDIEN", "IS", "KLEINER", "LUIDT", "MAAL", "NIET", 
		"OF", "OP", "RREGEL", "VOLDAAN", "VOLGENDE", "VOORWAARDEN", "WORDT", "DUBBELE_PUNT", 
		"GETAL_NUL", "PUNT", "STREEPJE", "GETAL", "WOORD", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u012d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\7\2"+
		"V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3d\n\3\f\3"+
		"\16\3g\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\5&\u0118\n&\3&\6&\u011b\n&\r&\16&\u011c\3\'\3"+
		"\'\3\'\7\'\u0122\n\'\f\'\16\'\u0125\13\'\3(\6(\u0128\n(\r(\16(\u0129\3"+
		"(\3(\5Wey\2)\3\3\5\4\7\2\t\2\13\2\r\2\17\5\21\6\23\7\25\b\27\t\31\n\33"+
		"\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\31"+
		"9\32;\33=\34?\35A\36C\37E G!I\"K#M$O%\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\u0130\2\3\3\2\2\2\2\5\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\3Q\3\2\2\2\5_\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\r"+
		"s\3\2\2\2\17u\3\2\2\2\21\177\3\2\2\2\23\u0083\3\2\2\2\25\u0088\3\2\2\2"+
		"\27\u008c\3\2\2\2\31\u0095\3\2\2\2\33\u0099\3\2\2\2\35\u009c\3\2\2\2\37"+
		"\u009f\3\2\2\2!\u00a6\3\2\2\2#\u00ae\3\2\2\2%\u00b5\3\2\2\2\'\u00b9\3"+
		"\2\2\2)\u00bd\3\2\2\2+\u00c4\3\2\2\2-\u00c7\3\2\2\2/\u00cf\3\2\2\2\61"+
		"\u00d5\3\2\2\2\63\u00da\3\2\2\2\65\u00df\3\2\2\2\67\u00e2\3\2\2\29\u00e5"+
		"\3\2\2\2;\u00eb\3\2\2\2=\u00f3\3\2\2\2?\u00fc\3\2\2\2A\u0108\3\2\2\2C"+
		"\u010e\3\2\2\2E\u0110\3\2\2\2G\u0112\3\2\2\2I\u0114\3\2\2\2K\u0117\3\2"+
		"\2\2M\u011e\3\2\2\2O\u0127\3\2\2\2QR\7\61\2\2RS\7,\2\2SW\3\2\2\2TV\13"+
		"\2\2\2UT\3\2\2\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7"+
		",\2\2[\\\7\61\2\2\\]\3\2\2\2]^\b\2\2\2^\4\3\2\2\2_`\7\61\2\2`a\7\61\2"+
		"\2ae\3\2\2\2bd\13\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2"+
		"\2\2ge\3\2\2\2hi\7\17\2\2ij\7\f\2\2jk\3\2\2\2kl\b\3\2\2l\6\3\2\2\2mn\7"+
		"$\2\2n\b\3\2\2\2op\7.\2\2p\n\3\2\2\2qr\t\2\2\2r\f\3\2\2\2st\t\3\2\2t\16"+
		"\3\2\2\2uy\5\7\4\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2yw\3\2\2\2"+
		"z|\3\2\2\2{y\3\2\2\2|}\5\7\4\2}~\b\b\3\2~\20\3\2\2\2\177\u0080\7c\2\2"+
		"\u0080\u0081\7c\2\2\u0081\u0082\7p\2\2\u0082\22\3\2\2\2\u0083\u0084\7"+
		"c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\24"+
		"\3\2\2\2\u0088\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b"+
		"\26\3\2\2\2\u008c\u008d\7d\2\2\u008d\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7m\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2"+
		"\u0093\u0094\7f\2\2\u0094\30\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097\7"+
		"c\2\2\u0097\u0098\7p\2\2\u0098\32\3\2\2\2\u0099\u009a\7f\2\2\u009a\u009b"+
		"\7g\2\2\u009b\34\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\36"+
		"\3\2\2\2\u009f\u00a0\7i\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\7k\2\2\u00a3\u00a4\7l\2\2\u00a4\u00a5\7m\2\2\u00a5 \3\2\2\2\u00a6"+
		"\u00a7\7i\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7v\2\2"+
		"\u00aa\u00ab\7g\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7f\2\2\u00ad\"\3\2"+
		"\2\2\u00ae\u00af\7i\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2"+
		"\7v\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4$\3\2\2\2\u00b5\u00b6"+
		"\7J\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2\2\u00b8&\3\2\2\2\u00b9\u00ba"+
		"\7j\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7v\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7u\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7m\2\2\u00c8\u00c9\7n\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\u00ce\7t\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7w\2"+
		"\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7v\2\2\u00d4\60\3"+
		"\2\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7c\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9\62\3\2\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7k\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7v\2\2\u00de\64\3\2\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7h\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7r\2\2\u00e4"+
		"8\3\2\2\2\u00e5\u00e6\7T\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7i\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7n\2\2\u00ea:\3\2\2\2\u00eb\u00ec\7x\2\2\u00ec"+
		"\u00ed\7q\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7c\2\2"+
		"\u00f0\u00f1\7c\2\2\u00f1\u00f2\7p\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7x\2"+
		"\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		">\3\2\2\2\u00fc\u00fd\7x\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7t\2\2\u0100\u0101\7y\2\2\u0101\u0102\7c\2\2\u0102\u0103\7c\2\2"+
		"\u0103\u0104\7t\2\2\u0104\u0105\7f\2\2\u0105\u0106\7g\2\2\u0106\u0107"+
		"\7p\2\2\u0107@\3\2\2\2\u0108\u0109\7y\2\2\u0109\u010a\7q\2\2\u010a\u010b"+
		"\7t\2\2\u010b\u010c\7f\2\2\u010c\u010d\7v\2\2\u010dB\3\2\2\2\u010e\u010f"+
		"\7<\2\2\u010fD\3\2\2\2\u0110\u0111\7\62\2\2\u0111F\3\2\2\2\u0112\u0113"+
		"\7\60\2\2\u0113H\3\2\2\2\u0114\u0115\7/\2\2\u0115J\3\2\2\2\u0116\u0118"+
		"\5I%\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u011b\5\r\7\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011dL\3\2\2\2\u011e\u0123\5\13\6\2\u011f\u0122"+
		"\5\13\6\2\u0120\u0122\5I%\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124N\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0126\u0128\t\4\2\2\u0127\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\b(\2\2\u012cP\3\2\2\2\13\2Wey\u0117\u011c\u0121\u0123\u0129\4\b"+
		"\2\2\3\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}