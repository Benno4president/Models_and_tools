import sys
from antlr4 import *
from _antlr4.ScratchLexer import ScratchLexer
from _antlr4.ScratchParser import ScratchParser
from output_visitor import OutputVisitor


def get_username():
    from pwd import getpwuid
    from os import getuid
    return getpwuid(getuid())[0]


def scratch_main(fp, args):
    data = FileStream(next(iter(fp)))
    # lexer
    lexer = ScratchLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = ScratchParser(stream)
    tree = parser.program()
    # evaluator
    visitor = OutputVisitor()
    output = visitor.visit(tree)


def scratch_cli(args):
    while 1:
        data = InputStream(input(">>> "))
        # lexer
        lexer = ScratchLexer(data)
        stream = CommonTokenStream(lexer)
        # parser
        parser = ScratchParser(stream)
        tree = parser.program()
        # evaluator
        visitor = OutputVisitor()
        output = visitor.visit(tree)
        print(output)


if __name__ == "__main__":
    if '-cli' in sys.argv:
        scratch_cli(sys.argv)
    elif filepath := [arg for arg in sys.argv if arg.endswith('.scratch') or arg.endswith('.txt')]:
        scratch_main(filepath, sys.argv)
    else:
        print('file.scratch/file.txt or -cli')


