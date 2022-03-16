// Generated from c:\Users\Kenneth Køpke\Documents\Models_and_tools\antlrfiles\Scratch.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScratchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CURLY_LEFT=1, CURLY_RIGHT=2, PAREN_LEFT=3, PAREN_RIGHT=4, ANCKLE_LEFT=5, 
		ANCKLE_RIGHT=6, CMP_OP=7, ASSIGN_OP=8, BOOL=9, WHITESPACE=10, NUM=11, 
		KEYWORD_TEXT=12, KEYWORD_STRING=13, END_STMT=14, STRING=15, PLUS_OP=16, 
		ARROW=17, VAR=18, CLOCK=19, COMMA=20;
	public static final int
		RULE_program = 0, RULE_state_setup = 1, RULE_variables = 2, RULE_variable_assign = 3, 
		RULE_states = 4, RULE_conditional = 5, RULE_comp_decl = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "state_setup", "variables", "variable_assign", "states", "conditional", 
			"comp_decl"
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

	@Override
	public String getGrammarFileName() { return "Scratch.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScratchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public State_setupContext state_setup() {
			return getRuleContext(State_setupContext.class,0);
		}
		public List<StatesContext> states() {
			return getRuleContexts(StatesContext.class);
		}
		public StatesContext states(int i) {
			return getRuleContext(StatesContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			state_setup();
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				states();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class State_setupContext extends ParserRuleContext {
		public TerminalNode CLOCK() { return getToken(ScratchParser.CLOCK, 0); }
		public TerminalNode ARROW() { return getToken(ScratchParser.ARROW, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public State_setupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_setup; }
	}

	public final State_setupContext state_setup() throws RecognitionException {
		State_setupContext _localctx = new State_setupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(CLOCK);
			setState(21);
			match(ARROW);
			setState(22);
			variables();
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

	public static class VariablesContext extends ParserRuleContext {
		public List<Variable_assignContext> variable_assign() {
			return getRuleContexts(Variable_assignContext.class);
		}
		public Variable_assignContext variable_assign(int i) {
			return getRuleContext(Variable_assignContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScratchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScratchParser.COMMA, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(24);
			variable_assign();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(25);
				match(COMMA);
				setState(26);
				variable_assign();
				}
				}
				setState(31);
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

	public static class Variable_assignContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ScratchParser.VAR, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(ScratchParser.ASSIGN_OP, 0); }
		public TerminalNode BOOL() { return getToken(ScratchParser.BOOL, 0); }
		public TerminalNode NUM() { return getToken(ScratchParser.NUM, 0); }
		public Variable_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assign; }
	}

	public final Variable_assignContext variable_assign() throws RecognitionException {
		Variable_assignContext _localctx = new Variable_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(VAR);
			setState(33);
			match(ASSIGN_OP);
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StatesContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(ScratchParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ScratchParser.STRING, i);
		}
		public TerminalNode CURLY_LEFT() { return getToken(ScratchParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(ScratchParser.CURLY_RIGHT, 0); }
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<TerminalNode> ARROW() { return getTokens(ScratchParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(ScratchParser.ARROW, i);
		}
		public StatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states; }
	}

	public final StatesContext states() throws RecognitionException {
		StatesContext _localctx = new StatesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(STRING);
			setState(37);
			match(CURLY_LEFT);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				conditional();
				setState(39);
				match(ARROW);
				setState(40);
				match(STRING);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
			setState(46);
			match(CURLY_RIGHT);
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

	public static class ConditionalContext extends ParserRuleContext {
		public List<Comp_declContext> comp_decl() {
			return getRuleContexts(Comp_declContext.class);
		}
		public Comp_declContext comp_decl(int i) {
			return getRuleContext(Comp_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScratchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScratchParser.COMMA, i);
		}
		public List<Variable_assignContext> variable_assign() {
			return getRuleContexts(Variable_assignContext.class);
		}
		public Variable_assignContext variable_assign(int i) {
			return getRuleContext(Variable_assignContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(48);
			comp_decl();
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					match(COMMA);
					setState(50);
					comp_decl();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(56);
				match(COMMA);
				setState(57);
				variable_assign();
				}
				}
				setState(62);
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

	public static class Comp_declContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ScratchParser.VAR, 0); }
		public TerminalNode CMP_OP() { return getToken(ScratchParser.CMP_OP, 0); }
		public TerminalNode NUM() { return getToken(ScratchParser.NUM, 0); }
		public Comp_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_decl; }
	}

	public final Comp_declContext comp_decl() throws RecognitionException {
		Comp_declContext _localctx = new Comp_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comp_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(VAR);
			setState(64);
			match(CMP_OP);
			setState(65);
			match(NUM);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6-\n\6\r\6\16\6.\3\6\3\6\3\7\3\7\3\7\7"+
		"\7\66\n\7\f\7\16\79\13\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\b\3\b\3\b\3"+
		"\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\4\2\13\13\r\r\2C\2\20\3\2\2\2\4\26\3\2"+
		"\2\2\6\32\3\2\2\2\b\"\3\2\2\2\n&\3\2\2\2\f\62\3\2\2\2\16A\3\2\2\2\20\22"+
		"\5\4\3\2\21\23\5\n\6\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25"+
		"\3\2\2\2\25\3\3\2\2\2\26\27\7\25\2\2\27\30\7\23\2\2\30\31\5\6\4\2\31\5"+
		"\3\2\2\2\32\37\5\b\5\2\33\34\7\26\2\2\34\36\5\b\5\2\35\33\3\2\2\2\36!"+
		"\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!\37\3\2\2\2\"#\7\24\2\2"+
		"#$\7\n\2\2$%\t\2\2\2%\t\3\2\2\2&\'\7\21\2\2\',\7\3\2\2()\5\f\7\2)*\7\23"+
		"\2\2*+\7\21\2\2+-\3\2\2\2,(\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60"+
		"\3\2\2\2\60\61\7\4\2\2\61\13\3\2\2\2\62\67\5\16\b\2\63\64\7\26\2\2\64"+
		"\66\5\16\b\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28>\3\2"+
		"\2\29\67\3\2\2\2:;\7\26\2\2;=\5\b\5\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?"+
		"\3\2\2\2?\r\3\2\2\2@>\3\2\2\2AB\7\24\2\2BC\7\t\2\2CD\7\r\2\2D\17\3\2\2"+
		"\2\7\24\37.\67>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}