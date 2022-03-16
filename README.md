# Models_and_tools

(Install + start guide)[https://faun.pub/introduction-to-antlr-python-af8a3c603d23]
```
$ cd /usr/local/lib
$ sudo curl -O https://www.antlr.org/download/antlr-4.9.2-complete.jar

# note these should be added to .zshrc/.bashrc or resourced by calling the .sh script.
$ export CLASSPATH=".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH"
$ alias antlr4='java -jar /usr/local/lib/antlr-4.9.2-complete.jar'
$ alias grun='java org.antlr.v4.gui.TestRig'
```

Python runtime/lib
```
pip install antlr4-python3-runtime
```

The Language dev example:
```
clock x=0,y=1

state rest(x>10){
    x>5, y=0, x=0 --> s2 {name:start, color:red},
    y=0 --> s3
}
```




