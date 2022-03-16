# Generated from grammers/Scratch.g4 by ANTLR 4.9.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26")
        buf.write("F\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2\24\3\3\3\3\3\3\3\3\3")
        buf.write("\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\5\3\5\3\5\3\5\3")
        buf.write("\6\3\6\3\6\3\6\3\6\3\6\6\6-\n\6\r\6\16\6.\3\6\3\6\3\7")
        buf.write("\3\7\3\7\7\7\66\n\7\f\7\16\79\13\7\3\7\3\7\7\7=\n\7\f")
        buf.write("\7\16\7@\13\7\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16")
        buf.write("\2\3\4\2\13\13\r\r\2C\2\20\3\2\2\2\4\26\3\2\2\2\6\32\3")
        buf.write("\2\2\2\b\"\3\2\2\2\n&\3\2\2\2\f\62\3\2\2\2\16A\3\2\2\2")
        buf.write("\20\22\5\4\3\2\21\23\5\n\6\2\22\21\3\2\2\2\23\24\3\2\2")
        buf.write("\2\24\22\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2\2\26\27\7\25")
        buf.write("\2\2\27\30\7\23\2\2\30\31\5\6\4\2\31\5\3\2\2\2\32\37\5")
        buf.write("\b\5\2\33\34\7\26\2\2\34\36\5\b\5\2\35\33\3\2\2\2\36!")
        buf.write("\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!\37\3\2")
        buf.write("\2\2\"#\7\24\2\2#$\7\n\2\2$%\t\2\2\2%\t\3\2\2\2&\'\7\21")
        buf.write("\2\2\',\7\3\2\2()\5\f\7\2)*\7\23\2\2*+\7\21\2\2+-\3\2")
        buf.write("\2\2,(\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2")
        buf.write("\2\60\61\7\4\2\2\61\13\3\2\2\2\62\67\5\16\b\2\63\64\7")
        buf.write("\26\2\2\64\66\5\16\b\2\65\63\3\2\2\2\669\3\2\2\2\67\65")
        buf.write("\3\2\2\2\678\3\2\2\28>\3\2\2\29\67\3\2\2\2:;\7\26\2\2")
        buf.write(";=\5\b\5\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\r")
        buf.write("\3\2\2\2@>\3\2\2\2AB\7\24\2\2BC\7\t\2\2CD\7\r\2\2D\17")
        buf.write("\3\2\2\2\7\24\37.\67>")
        return buf.getvalue()


class ScratchParser ( Parser ):

    grammarFileName = "Scratch.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'{'", "'}'", "'('", "')'", "'['", "']'", 
                     "<INVALID>", "'='", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'Text '", "'string '", "';'", "<INVALID>", "'+'", 
                     "'--> '", "<INVALID>", "'clock '", "','" ]

    symbolicNames = [ "<INVALID>", "CURLY_LEFT", "CURLY_RIGHT", "PAREN_LEFT", 
                      "PAREN_RIGHT", "ANCKLE_LEFT", "ANCKLE_RIGHT", "CMP_OP", 
                      "ASSIGN_OP", "BOOL", "WHITESPACE", "NUM", "KEYWORD_TEXT", 
                      "KEYWORD_STRING", "END_STMT", "STRING", "PLUS_OP", 
                      "ARROW", "VAR", "CLOCK", "COMMA" ]

    RULE_program = 0
    RULE_state_setup = 1
    RULE_variables = 2
    RULE_variable_assign = 3
    RULE_states = 4
    RULE_conditional = 5
    RULE_comp_decl = 6

    ruleNames =  [ "program", "state_setup", "variables", "variable_assign", 
                   "states", "conditional", "comp_decl" ]

    EOF = Token.EOF
    CURLY_LEFT=1
    CURLY_RIGHT=2
    PAREN_LEFT=3
    PAREN_RIGHT=4
    ANCKLE_LEFT=5
    ANCKLE_RIGHT=6
    CMP_OP=7
    ASSIGN_OP=8
    BOOL=9
    WHITESPACE=10
    NUM=11
    KEYWORD_TEXT=12
    KEYWORD_STRING=13
    END_STMT=14
    STRING=15
    PLUS_OP=16
    ARROW=17
    VAR=18
    CLOCK=19
    COMMA=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def state_setup(self):
            return self.getTypedRuleContext(ScratchParser.State_setupContext,0)


        def states(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ScratchParser.StatesContext)
            else:
                return self.getTypedRuleContext(ScratchParser.StatesContext,i)


        def getRuleIndex(self):
            return ScratchParser.RULE_program

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = ScratchParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            self.state_setup()
            self.state = 16 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 15
                self.states()
                self.state = 18 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==ScratchParser.STRING):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class State_setupContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLOCK(self):
            return self.getToken(ScratchParser.CLOCK, 0)

        def ARROW(self):
            return self.getToken(ScratchParser.ARROW, 0)

        def variables(self):
            return self.getTypedRuleContext(ScratchParser.VariablesContext,0)


        def getRuleIndex(self):
            return ScratchParser.RULE_state_setup

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitState_setup" ):
                return visitor.visitState_setup(self)
            else:
                return visitor.visitChildren(self)




    def state_setup(self):

        localctx = ScratchParser.State_setupContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_state_setup)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 20
            self.match(ScratchParser.CLOCK)
            self.state = 21
            self.match(ScratchParser.ARROW)
            self.state = 22
            self.variables()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariablesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable_assign(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ScratchParser.Variable_assignContext)
            else:
                return self.getTypedRuleContext(ScratchParser.Variable_assignContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(ScratchParser.COMMA)
            else:
                return self.getToken(ScratchParser.COMMA, i)

        def getRuleIndex(self):
            return ScratchParser.RULE_variables

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariables" ):
                return visitor.visitVariables(self)
            else:
                return visitor.visitChildren(self)




    def variables(self):

        localctx = ScratchParser.VariablesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_variables)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.variable_assign()
            self.state = 29
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==ScratchParser.COMMA:
                self.state = 25
                self.match(ScratchParser.COMMA)
                self.state = 26
                self.variable_assign()
                self.state = 31
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Variable_assignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(ScratchParser.VAR, 0)

        def ASSIGN_OP(self):
            return self.getToken(ScratchParser.ASSIGN_OP, 0)

        def BOOL(self):
            return self.getToken(ScratchParser.BOOL, 0)

        def NUM(self):
            return self.getToken(ScratchParser.NUM, 0)

        def getRuleIndex(self):
            return ScratchParser.RULE_variable_assign

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariable_assign" ):
                return visitor.visitVariable_assign(self)
            else:
                return visitor.visitChildren(self)




    def variable_assign(self):

        localctx = ScratchParser.Variable_assignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_variable_assign)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self.match(ScratchParser.VAR)
            self.state = 33
            self.match(ScratchParser.ASSIGN_OP)
            self.state = 34
            _la = self._input.LA(1)
            if not(_la==ScratchParser.BOOL or _la==ScratchParser.NUM):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self, i:int=None):
            if i is None:
                return self.getTokens(ScratchParser.STRING)
            else:
                return self.getToken(ScratchParser.STRING, i)

        def CURLY_LEFT(self):
            return self.getToken(ScratchParser.CURLY_LEFT, 0)

        def CURLY_RIGHT(self):
            return self.getToken(ScratchParser.CURLY_RIGHT, 0)

        def conditional(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ScratchParser.ConditionalContext)
            else:
                return self.getTypedRuleContext(ScratchParser.ConditionalContext,i)


        def ARROW(self, i:int=None):
            if i is None:
                return self.getTokens(ScratchParser.ARROW)
            else:
                return self.getToken(ScratchParser.ARROW, i)

        def getRuleIndex(self):
            return ScratchParser.RULE_states

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStates" ):
                return visitor.visitStates(self)
            else:
                return visitor.visitChildren(self)




    def states(self):

        localctx = ScratchParser.StatesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_states)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.match(ScratchParser.STRING)
            self.state = 37
            self.match(ScratchParser.CURLY_LEFT)
            self.state = 42 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 38
                self.conditional()
                self.state = 39
                self.match(ScratchParser.ARROW)
                self.state = 40
                self.match(ScratchParser.STRING)
                self.state = 44 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==ScratchParser.VAR):
                    break

            self.state = 46
            self.match(ScratchParser.CURLY_RIGHT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def comp_decl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ScratchParser.Comp_declContext)
            else:
                return self.getTypedRuleContext(ScratchParser.Comp_declContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(ScratchParser.COMMA)
            else:
                return self.getToken(ScratchParser.COMMA, i)

        def variable_assign(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ScratchParser.Variable_assignContext)
            else:
                return self.getTypedRuleContext(ScratchParser.Variable_assignContext,i)


        def getRuleIndex(self):
            return ScratchParser.RULE_conditional

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConditional" ):
                return visitor.visitConditional(self)
            else:
                return visitor.visitChildren(self)




    def conditional(self):

        localctx = ScratchParser.ConditionalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_conditional)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48
            self.comp_decl()
            self.state = 53
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 49
                    self.match(ScratchParser.COMMA)
                    self.state = 50
                    self.comp_decl() 
                self.state = 55
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

            self.state = 60
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==ScratchParser.COMMA:
                self.state = 56
                self.match(ScratchParser.COMMA)
                self.state = 57
                self.variable_assign()
                self.state = 62
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comp_declContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(ScratchParser.VAR, 0)

        def CMP_OP(self):
            return self.getToken(ScratchParser.CMP_OP, 0)

        def NUM(self):
            return self.getToken(ScratchParser.NUM, 0)

        def getRuleIndex(self):
            return ScratchParser.RULE_comp_decl

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComp_decl" ):
                return visitor.visitComp_decl(self)
            else:
                return visitor.visitChildren(self)




    def comp_decl(self):

        localctx = ScratchParser.Comp_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_comp_decl)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(ScratchParser.VAR)
            self.state = 64
            self.match(ScratchParser.CMP_OP)
            self.state = 65
            self.match(ScratchParser.NUM)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





