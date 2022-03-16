grammar Scratch;

//parser rules
program: state_setup states+;

state_setup: CLOCK ARROW variables;

variables: (variable_assign (COMMA variable_assign)*);
variable_assign:VAR ASSIGN_OP (BOOL  | NUM);

states: STRING CURLY_LEFT (conditional ARROW STRING)+  CURLY_RIGHT;

conditional: (comp_decl (COMMA comp_decl)* (COMMA variable_assign)*);
comp_decl: VAR CMP_OP NUM;




CURLY_LEFT         : '{';
CURLY_RIGHT        : '}';
PAREN_LEFT         : '(';
PAREN_RIGHT        : ')';
ANCKLE_LEFT        : '[';
ANCKLE_RIGHT       : ']';
//Lexer Rules

fragment LOWERCASE : [a-z];
fragment UPPERCASE : [A-Z];
CMP_OP             : ('=='|'<=' | '>=' | '<' | '>' | '!=' );
ASSIGN_OP          : '=';
BOOL               : 'True' | 'False' | '0' | '1';
WHITESPACE         : (' ' | '\t' | '\n' | '\r')+ -> skip;
NUM                : [0-9]+;
KEYWORD_TEXT       : 'Text ';
KEYWORD_STRING     : 'string ';
END_STMT           : ';';
STRING             : '"' ~('"')* '"';
PLUS_OP            : '+';
ARROW              : '--> ';
VAR                : (LOWERCASE | UPPERCASE | '_')+;
CLOCK              : 'clock ';
COMMA              : ',';

