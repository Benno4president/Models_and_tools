# Models_and_tools

A language/tool for simulation of cyberphysical systems.

## For development
Intructions on how to install antlr4, if making changes to the grammer. If not, skip to Python runtime/lib. 
### install dependencies
```
$ cd /usr/local/lib
$ sudo curl -O https://www.antlr.org/download/antlr-4.9.2-complete.jar
```
These should be added to .zshrc/.bashrc or added to source by calling the .sh script like this: 'source ./antlr4_alias_linux.sh' The script contains:
```
$ export CLASSPATH=".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH"
$ alias antlr4='java -jar /usr/local/lib/antlr-4.9.2-complete.jar'
$ alias grun='java org.antlr.v4.gui.TestRig'
$ alias antlr-go="antlr4 $1 -o dev -Dlanguage=Python3 -visitor -no-listener"
```

Python runtime/lib
```
pip install antlr4-python3-runtime
```

ignore this..
The Language dev example:
```
clock x=0,y=1

state rest(x>10){
    x>5, y=0, x=0 --> s2 {name:start, color:red},
    y=0 --> s3
}
```




