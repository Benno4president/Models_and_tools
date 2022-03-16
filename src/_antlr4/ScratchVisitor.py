# Generated from grammers/Scratch.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .ScratchParser import ScratchParser
else:
    from ScratchParser import ScratchParser

# This class defines a complete generic visitor for a parse tree produced by ScratchParser.

class ScratchVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ScratchParser#program.
    def visitProgram(self, ctx:ScratchParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ScratchParser#state_setup.
    def visitState_setup(self, ctx:ScratchParser.State_setupContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ScratchParser#variables.
    def visitVariables(self, ctx:ScratchParser.VariablesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ScratchParser#variable_assign.
    def visitVariable_assign(self, ctx:ScratchParser.Variable_assignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ScratchParser#states.
    def visitStates(self, ctx:ScratchParser.StatesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ScratchParser#conditional.
    def visitConditional(self, ctx:ScratchParser.ConditionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ScratchParser#comp_decl.
    def visitComp_decl(self, ctx:ScratchParser.Comp_declContext):
        return self.visitChildren(ctx)



del ScratchParser