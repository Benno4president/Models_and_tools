// Generated from c:\Users\Kenneth Køpke\Documents\Models_and_tools\antlrfiles\Scratch.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScratchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CURLY_LEFT=1, CURLY_RIGHT=2, PAREN_LEFT=3, PAREN_RIGHT=4, ANCKLE_LEFT=5, 
		ANCKLE_RIGHT=6, CMP_OP=7, ASSIGN_OP=8, BOOL=9, WHITESPACE=10, NUM=11, 
		KEYWORD_TEXT=12, KEYWORD_STRING=13, END_STMT=14, STRING=15, PLUS_OP=16, 
		ARROW=17, VAR=18, CLOCK=19, COMMA=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CURLY_LEFT", "CURLY_RIGHT", "PAREN_LEFT", "PAREN_RIGHT", "ANCKLE_LEFT", 
			"ANCKLE_RIGHT", "LOWERCASE", "UPPERCASE", "CMP_OP", "ASSIGN_OP", "BOOL", 
			"WHITESPACE", "NUM", "KEYWORD_TEXT", "KEYWORD_STRING", "END_STMT", "STRING", 
			"PLUS_OP", "ARROW", "VAR", "CLOCK", "COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'['", "']'", null, "'='", null, null, 
			null, "'Text '", "'string '", "';'", null, "'+'", "'--> '", null, "'clock '", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CURLY_LEFT", "CURLY_RIGHT", "PAREN_LEFT", "PAREN_RIGHT", "ANCKLE_LEFT", 
			"ANCKLE_RIGHT", "CMP_OP", "ASSIGN_OP", "BOOL", "WHITESPACE", "NUM", "KEYWORD_TEXT", 
			"KEYWORD_STRING", "END_STMT", "STRING", "PLUS_OP", "ARROW", "VAR", "CLOCK", 
			"COMMA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ScratchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scratch.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nI\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\fW\n\f\3\r\6\rZ\n\r\r\r\16\r[\3\r\3\r\3\16\6\16a\n\16\r\16\16"+
		"\16b\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\7\22w\n\22\f\22\16\22z\13\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\6\25\u0088\n\25\r\25\16"+
		"\25\u0089\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\2\2\30\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\2\21\2\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20"+
		"#\21%\22\'\23)\24+\25-\26\3\2\b\3\2c|\3\2C\\\4\2>>@@\5\2\13\f\17\17\""+
		"\"\3\2\62;\3\2$$\2\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5"+
		"\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2"+
		"\2\2\21=\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27V\3\2\2\2\31Y\3\2\2\2\33`\3"+
		"\2\2\2\35d\3\2\2\2\37j\3\2\2\2!r\3\2\2\2#t\3\2\2\2%}\3\2\2\2\'\177\3\2"+
		"\2\2)\u0087\3\2\2\2+\u008b\3\2\2\2-\u0092\3\2\2\2/\60\7}\2\2\60\4\3\2"+
		"\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63\64\7*\2\2\64\b\3\2\2\2\65\66\7+\2"+
		"\2\66\n\3\2\2\2\678\7]\2\28\f\3\2\2\29:\7_\2\2:\16\3\2\2\2;<\t\2\2\2<"+
		"\20\3\2\2\2=>\t\3\2\2>\22\3\2\2\2?@\7?\2\2@I\7?\2\2AB\7>\2\2BI\7?\2\2"+
		"CD\7@\2\2DI\7?\2\2EI\t\4\2\2FG\7#\2\2GI\7?\2\2H?\3\2\2\2HA\3\2\2\2HC\3"+
		"\2\2\2HE\3\2\2\2HF\3\2\2\2I\24\3\2\2\2JK\7?\2\2K\26\3\2\2\2LM\7V\2\2M"+
		"N\7t\2\2NO\7w\2\2OW\7g\2\2PQ\7H\2\2QR\7c\2\2RS\7n\2\2ST\7u\2\2TW\7g\2"+
		"\2UW\4\62\63\2VL\3\2\2\2VP\3\2\2\2VU\3\2\2\2W\30\3\2\2\2XZ\t\5\2\2YX\3"+
		"\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\r\2\2^\32\3\2\2\2"+
		"_a\t\6\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\34\3\2\2\2de\7V\2"+
		"\2ef\7g\2\2fg\7z\2\2gh\7v\2\2hi\7\"\2\2i\36\3\2\2\2jk\7u\2\2kl\7v\2\2"+
		"lm\7t\2\2mn\7k\2\2no\7p\2\2op\7i\2\2pq\7\"\2\2q \3\2\2\2rs\7=\2\2s\"\3"+
		"\2\2\2tx\7$\2\2uw\n\7\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3"+
		"\2\2\2zx\3\2\2\2{|\7$\2\2|$\3\2\2\2}~\7-\2\2~&\3\2\2\2\177\u0080\7/\2"+
		"\2\u0080\u0081\7/\2\2\u0081\u0082\7@\2\2\u0082\u0083\7\"\2\2\u0083(\3"+
		"\2\2\2\u0084\u0088\5\17\b\2\u0085\u0088\5\21\t\2\u0086\u0088\7a\2\2\u0087"+
		"\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a*\3\2\2\2\u008b\u008c"+
		"\7e\2\2\u008c\u008d\7n\2\2\u008d\u008e\7q\2\2\u008e\u008f\7e\2\2\u008f"+
		"\u0090\7m\2\2\u0090\u0091\7\"\2\2\u0091,\3\2\2\2\u0092\u0093\7.\2\2\u0093"+
		".\3\2\2\2\n\2HV[bx\u0087\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}