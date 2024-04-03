grammar UTL;

program: (global_variables | function_declaration | comment)* main comment*;

main
    : types MAIN LPAR function_parameters? RPAR LBRACE
      (function_body | function_body scheduler function_body) RBRACE
    ;

function_declaration
    : types function_name LPAR function_parameters? RPAR (THROW EXCEPTION)? (SEMICOLON|LBRACE function_body RBRACE);

function_name
    : ONINT | ONSTART | CONNECT | OBSERVE
    | func_name=IDENTIFIER { System.out.println("MethodDec:"+$func_name.text); } ;

function_parameters
    : types IDENTIFIER (COMMA types IDENTIFIER)* ;

function_body
    : (statement | comment)* ;

function_call
    : function_name LPAR function_parameters RPAR
    | EXCEPTION IDENTIFIER LPAR types IDENTIFIER {System.out.println("Exeption:$IDENTIFIER.text");}(COMMA types IDENTIFIER)* RPAR ; //TODO Add call

statement
    : (print
            | return
            | function_call
            | arr_declaration
            | var_declaration
            | static_variable
            | throw
            | expression
            | BREAK  { System.out.println("Control:break"); }
            | CONTINUE { System.out.println("Control:continue"); }
        ) SEMICOLON
        | if_else
        | for_loop
        | while_loop
        | try_catch
    ;

throw
    : THROW expression;

print
    : PRINT { System.out.println("Built-in:print"); }  LPAR expression RPAR ;

return : RETURN expression ;

arr_declaration:
    types (
            LBRACKET
            arr_val = expression
            RBRACKET
          )+
    arr_name = IDENTIFIER { System.out.println("ArrayDec:" + $arr_name.text+ ":"+$arr_val.text); }
    (SEMICOLON
    | ASSIGN { System.out.println("Operator:="); }
     expression)
    ;

try_catch
    : TRY (LBRACE (statement|comment)* RBRACE | statement)
    CATCH EXCEPTION
    exception= IDENTIFIER
    (LBRACE (statement|comment)* RBRACE|statement);

if_else
    : IF {System.out.println("Conditional:if"); }
     LPAR expression RPAR (LBRACE (statement|comment)* RBRACE
        | statement
     )
     (ELSE {System.out.println("Conditional:else"); }
          (LBRACE (statement|comment)* RBRACE
            |statement)
    )?
    ;

for_loop
    : FOR {System.out.println("Loop:for"); }
    LPAR (expression| var_declaration) SEMICOLON expression SEMICOLON expression RPAR
    (LBRACE (statement | comment)* RBRACE|statement)
    ;

while_loop
    : WHILE {System.out.println("Loop:while"); }
     LPAR expression RPAR (LBRACE (statement|comment)* RBRACE|expression)
    ;

// Expression -----------------------------------------------------------------------------------------------------
expression: assignment_expression (
    COMMA assignment_expression
)*;

assignment_expression
    : logical_or_expression assignmentOperator assignment_expression
    | logical_or_expression;
//	| throwExpression;

assignmentOperator:
	ASSIGN {System.out.println("Operator:=");}
	| PLUSASSIGN {System.out.println("Operator:+=");}
	| MINUSASSIGN {System.out.println("Operator:-=");}
	| MULTASSIGN {System.out.println("Operator:*=");}
	| DIVASSGIN {System.out.println("Operator:/=");}
	| MODASSIGN {System.out.println("Operator:%=");};

logical_or_expression
    : logical_and_expression (
        OROR logical_and_expression {System.out.println("Operator:||");}
    )*;

logical_and_expression
	: bitwise_or (
	    ANDAND  bitwise_or {System.out.println("Operator:&&");}
	)*;

bitwise_or
	: bitwise_xor (
	    OR  bitwise_xor {System.out.println("Operator:|");}

	)*;

bitwise_xor
    : bitwise_and (
        XOR  bitwise_and {System.out.println("Operator:^");}

    )*;

bitwise_and
    : equal_notequal_expression (
        AND equal_notequal_expression{System.out.println("Operator:&");}
    )*;

equal_notequal_expression
	:comparative_expression (
		(EQL comparative_expression{System.out.println("Operator:==");}
		    | NEQ comparative_expression{System.out.println("Operator:!=");}
		)
	)*;

comparative_expression
	: shift_expression (
		(LES shift_expression{System.out.println("Operator:<");}
		    | GTR shift_expression{System.out.println("Operator:>");}
		    | LEQ shift_expression{System.out.println("Operator:<=");}
		    | GEQ shift_expression{System.out.println("Operator:>=");}
        )
	)*;

shift_expression
    :add_min_expression (GTR GTR  add_min_expression {System.out.println("Operator:>>");}
                            |LES LES  add_min_expression {System.out.println("Operator:<<");}
                        )*;

add_min_expression
	: mul_div_mod_expression (
		(PLUS mul_div_mod_expression {System.out.println("Operator:+");}
		    | MINUS mul_div_mod_expression {System.out.println("Operator:-");}
        )
	)*;

mul_div_mod_expression
	: prefix_unary_expression (
		(MULT prefix_unary_expression{System.out.println("Operator:*");}
             | DIV prefix_unary_expression{System.out.println("Operator:/");}
             | MOD prefix_unary_expression{System.out.println("Operator:%");}
        )
	)*;

prefix_unary_expression
	: (
	    (
	        PLUSPLUS postfix_unary_expression{System.out.println("Operator:++");}
	        | MINUSMINUS postfix_unary_expression{System.out.println("Operator:--");}
	        | NOT postfix_unary_expression{System.out.println("Operator:!");}
            | MINUS postfix_unary_expression{System.out.println("Operator:-");}
            | TILD postfix_unary_expression{System.out.println("Operator:~");}
	    )
	)* postfix_unary_expression;

postfix_unary_expression:
    list_access_expression ((PLUSPLUS list_access_expression{System.out.println("Operator:++");}
                                | MINUSMINUS list_access_expression{System.out.println("Operator:--");}
                            ) )*;

list_access_expression
    : class_method_access (
        LBRACKET expression RBRACKET class_method_access
    )*;

class_method_access
    :paranthesis_expression (
        DOT
         paranthesis_expression
    )*  ;

paranthesis_expression
    : primary_expression (LPAR expression RPAR primary_expression)* ;


primary_expression
	: types
    | values
    | IDENTIFIER
	| ONINT | ONSTART | CONNECT | OBSERVE | REFRESHRATE |GETCANDLE | TERMINATE
	|
	;
// End Expression ------------------------------------------------------------------------------------------------

comment
    : BLOCK_COMMENT
    | LINE_COMMENT
    ;

// Schedular ----------------------------------------------------------------------------------------------------

scheduler
    : ATS SCHEDULE { System.out.println("ConcurrencyControl:Schedule"); }
    parallel_id_set  PARALLEL parallel_id_set SEMICOLON
    ;

parallel_id_set
    : LPAR IDENTIFIER (PREORDER  IDENTIFIER)+ RPAR
    | IDENTIFIER
    ;

// Variable -----------------------------------------------------------------------------------------------------

var_declaration:
    types
    var_name = IDENTIFIER ( { System.out.println("VarDec:" + $var_name.text); }
    ASSIGN { System.out.println("Operator:="); }
    expression
    |
    );

global_variables
    : static_variable
    | shared_variable
    ;

static_variable
    : STATIC types
     var_name = IDENTIFIER { System.out.println("VarDec:" + $var_name.text); }
      SEMICOLON
    | STATIC types
     var_name = IDENTIFIER { System.out.println("VarDec:" + $var_name.text); }
    ASSIGN { System.out.println("Operator:="); }
    expression SEMICOLON
    ;

shared_variable // external variable
    : SHARED types
     var_name = IDENTIFIER { System.out.println("VarDec:" + $var_name.text); }
     SEMICOLON
    | SHARED types
     var_name = IDENTIFIER { System.out.println("VarDec:" + $var_name.text); }
     ASSIGN { System.out.println("Operator:="); }
     expression SEMICOLON
    ;

pre_defined_vars : ASK | BID | CANDLES | DIGITS;

pre_defined_set_array : TIME | CLOSE | OPEN | LOW | HIGH | VOLUME ;

types: primitive_types | non_primitive_variables;

primitive_types:INT | FLOAT | DOUBLE| BOOLEAN | STRING | VOID ;

non_primitive_variables: pre_defined_vars|pre_defined_set_array| TRADE| ORDER | EXCEPTION|TYPE |SELL | BUY;

values: ZERO | INT_VAL | FLOAT_VAL | BOOLEAN_VAL | STRING_VAL;

// Lexer ----------------------------------------------------------------------------------------------------------

// Keywords

MAIN:     'Main';
FUNCTION: 'function';
PRINT:    'Print';
FOR:      'for';
RETURN:   'return';
STATIC:   'static';
SHARED:   'shared';
THROW:    'throw';
EXCEPTION:'Exception';
TRY:      'try';
CATCH:    'catch';
IF:       'if';
ELSE:     'else';
// Non Primitive Variables
TRADE:    'Trade';
ORDER:    'Order';
// Function Names
ONINT:    'OnInit';
ONSTART:  'OnStart';
OBSERVE:  'Observe';
CONNECT:  'Connect';
REFRESHRATE: 'RefreshRate';
GETCANDLE:   'GetCandle';
TERMINATE: 'Terminate';
BREAK:    'break';
CONTINUE: 'continue';
WHILE:    'while';
BUY:      'BUY';
SELL:     'SELL';
// Keyword schedule
PREORDER: 'preorder';
PARALLEL: 'parallel';
SCHEDULE: 'schedule';
TYPE:     'Type';
TEXT:     'Text';

// Global Var keyword
ASK :      'Ask';
BID :      'Bid';
CANDLES :  'Candles';
DIGITS :   'Digits';

// Global Set & Array keyword
TIME :   'Time';
CLOSE :  'Close';
OPEN:    'Open';
LOW:     'Low';
HIGH:    'High';
VOLUME : 'Volume';

// Types
INT:       'int';
FLOAT:     'float';
DOUBLE:    'double';
BOOLEAN:   'bool';
STRING:    'string';
VOID:      'void';


// Type Values
ZERO:        '0';
INT_VAL:     [1-9][0-9]*;
FLOAT_VAL:   INT_VAL '.' [0-9]+ | '0.' [0-9]*;
BOOLEAN_VAL: 'true' | 'false';
STRING_VAL:  '"' ~["]* '"' ;
// Parenthesis

LPAR: '(';
RPAR: ')';

// Brackets (array element access)

LBRACKET: '[';
RBRACKET: ']';

// Arithmetic Operators

NOT:   '!';
PLUSPLUS:  '++';
PLUS:  '+';
MINUSMINUS: '--';
MINUS: '-';
MULT:  '*';
DIV:   '/';
MOD:   '%';
ATS:   '@';
TILD:  '~';

// Relational Operators

GEQ: '>=';
LEQ: '<=';
GTR: '>';
LES: '<';
EQL: '==';
NEQ: '!=';

// Logical Operators

AND:    '&';
OR:     '|';
ANDAND: '&&';
OROR:   '||';
XOR:    '^';

// Other Operators

// Assigns
ASSIGN: '=';
PLUSASSIGN: '+=';
MINUSASSIGN: '-=';
MULTASSIGN:  '*=';
DIVASSGIN:   '/=';
MODASSIGN:   '%=';

// Symbols

LBRACE:    '{';
RBRACE:    '}';
COMMA:     ',';
DOT:       '.';
COLON:     ':';
SEMICOLON: ';';
DBL_QUT:   '"';
SNG_QUT:   '\'';

// Other

IDENTIFIER:       [a-zA-Z][a-zA-Z0-9_]*;
LINE_COMMENT:     '//' ~[\r\n]* -> skip;
BLOCK_COMMENT:    '/*' ~[*/]* '*/' -> skip;
WS:               [ \t\r\n]+ -> skip;