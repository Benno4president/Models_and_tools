from antlr4 import *

from _antlr4.ScratchVisitor import ScratchVisitor
from _antlr4.ScratchParser import ScratchParser


class OutputVisitor(ScratchVisitor):
    def visitProgram(self, ctx: ScratchParser.ProgramContext):
        return super().visitProgram(ctx)

    def visitState_setup(self, ctx: ScratchParser.State_setupContext):
        return super().visitState_setup(ctx)

    def visitVariables(self, ctx: ScratchParser.VariablesContext):
        return super().visitVariables(ctx)

    def visitVariable_assign(self, ctx: ScratchParser.Variable_assignContext):
        return super().visitVariable_assign(ctx)

    def visitStates(self, ctx: ScratchParser.StatesContext):
        return super().visitStates(ctx)

    def visitConditional(self, ctx: ScratchParser.ConditionalContext):
        return super().visitConditional(ctx)

    def visitComp_decl(self, ctx: ScratchParser.Comp_declContext):
        return super().visitComp_decl(ctx)


