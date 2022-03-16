#!/bin/sh

# To use this script to enable antlr4 and grun aliases
# call this by '. ./antlr4_alias_linux.sh'
# the first dot appends this script to source.

#doesnt seem to work
#shopt -s expand_aliases

export CLASSPATH=".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH";
alias antlr4='java -jar /usr/local/lib/antlr-4.9.2-complete.jar';
alias grun='java org.antlr.v4.gui.TestRig';

alias antlr-go="antlr4 $1 -o out -Dlanguage=Python3 -visitor -no-listener"

echo "Classpath for antlr4 + grun set"