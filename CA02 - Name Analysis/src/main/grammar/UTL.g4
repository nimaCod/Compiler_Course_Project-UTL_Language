grammar UTL;

@header{
    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;
}
// Parser rules
// do not change first rule (program) name
program returns [Program pro] : {$pro = new Program(); $pro.setLine(0);}
    ( varDeclaration { $pro.addVar($varDeclaration.varDecRet); }
    | functionDeclaration { $pro.addFunction($functionDeclaration.funcDecRet); }
    | initDeclaration { $pro.addInit($initDeclaration.initDecRet); }
    | startDeclaration { $pro.addStart($startDeclaration.startDecRet); }
    )* mainDeclaration { $pro.setMain($mainDeclaration.mainDecRet); }
    ;


statement returns [Statement statementRet] :
          ( varDeclaration { $statementRet = $varDeclaration.varDecRet; }
          | functionDeclaration { $statementRet = $functionDeclaration.funcDecRet; }
          | assignStatement { $statementRet = $assignStatement.assignStmtRet; }
          | continueBreakStatement { $statementRet = $continueBreakStatement.continueBreakStmtRet; }
          | returnStatement { $statementRet = $returnStatement.returnStmtRet; }
          | ifStatement { $statementRet = $ifStatement.ifStmtRet; }
          | whileStatement { $statementRet = $whileStatement.whileStmtRet; }
          | forStatement { $statementRet = $forStatement.forStmtRet; }
          | tryCatchStatement { $statementRet = $tryCatchStatement.tryCatchStmtRet; }
          | throwStatement { $statementRet = $throwStatement.throwStmtRet; }
          | expression SEMICOLON { $statementRet = new ExpressionStmt($expression.expressionRet); }
          );


varDeclaration returns [VarDeclaration varDecRet] : { $varDecRet = new VarDeclaration(); }
    allType { $varDecRet.setType($allType.allTypeRet); }
    (LBRACK INT_LITERAL RBRACK { $varDecRet.setLength(Integer.parseInt($INT_LITERAL.text)); })?
    identifier  { $varDecRet.setIdentifier($identifier.identifierRet); $varDecRet.setLine($identifier.identifierRet.getLine()); }
    (ASSIGN expression{$varDecRet.setExpression($expression.expressionRet);})? SEMICOLON;

functionDeclaration returns [FunctionDeclaration funcDecRet] : { $funcDecRet = new FunctionDeclaration(); }
    primitiveType { $funcDecRet.setReturnType($primitiveType.typeRet); }
    identifier { $funcDecRet.setName($identifier.identifierRet); $funcDecRet.setLine($identifier.identifierRet.getLine()); }
    LPAREN (allType (LBRACK INT_LITERAL RBRACK)? identifier { $funcDecRet.addArg(new VarDeclaration($allType.allTypeRet, $identifier.identifierRet)); }
    (COMMA allType (LBRACK INT_LITERAL RBRACK)? identifier { $funcDecRet.addArg(new VarDeclaration($allType.allTypeRet, $identifier.identifierRet)); })*)?
    RPAREN (THROW EXCEPTION)? (LBRACE (statement { $funcDecRet.addStatement($statement.statementRet); })* RBRACE | statement { $funcDecRet.addStatement($statement.statementRet); });

mainDeclaration returns [MainDeclaration mainDecRet]:{$mainDecRet = new MainDeclaration();}
    VOID
    main = MAIN {$mainDecRet.setLine($main.line); }
    LPAREN RPAREN (LBRACE (statement { $mainDecRet.addStatement($statement.statementRet); })* RBRACE
    | statement { $mainDecRet.addStatement($statement.statementRet); }
    );

initDeclaration returns [OnInitDeclaration initDecRet]:{$initDecRet = new OnInitDeclaration();}
    VOID
    oninit = ONINIT {$initDecRet.setLine($oninit.line); }
    LPAREN TRADE identifier RPAREN (THROW EXCEPTION)? {$initDecRet.setTradeName($identifier.identifierRet);}
    (LBRACE (statement  {$initDecRet.addStatement($statement.statementRet);} )* RBRACE
    | statement {$initDecRet.addStatement($statement.statementRet);}
    );

startDeclaration returns [OnStartDeclaration startDecRet]:{$startDecRet = new OnStartDeclaration();}
    VOID
    onstart = ONSTART {$startDecRet.setLine($onstart.line); }
    LPAREN TRADE identifier RPAREN  (THROW EXCEPTION)? {$startDecRet.setTradeName($identifier.identifierRet);}
    (LBRACE (statement {$startDecRet.addStatement($statement.statementRet);} )* RBRACE
    | statement {$startDecRet.addStatement($statement.statementRet);}
    );

assignStatement returns [AssignStmt assignStmtRet]:{Identifier choice = new Identifier(); }
    identifier {choice = $identifier.identifierRet;}
    (LBRACK expression RBRACK {choice = new  ArrayIdentifier($identifier.identifierRet.getName(),$expression.expressionRet); })?
    assign {choice.setLine($assign.assignRet.getLine());}
    expression SEMICOLON {$assignStmtRet = new AssignStmt(choice,$expression.expressionRet);$assignStmtRet.setLine(choice.getLine());}
    ;

ifStatement returns [IfElseStmt ifStmtRet] :
    IF {Integer line = $IF.line; }
    LPAREN expression RPAREN  {$ifStmtRet = new IfElseStmt($expression.expressionRet);$ifStmtRet.setLine(line);}
    (LBRACE (statement {$ifStmtRet.addThenStatement($statement.statementRet);} )* RBRACE
    | statement {$ifStmtRet.addThenStatement($statement.statementRet);} )
    (ELSE
     (LBRACE (statement {$ifStmtRet.addElseStatement($statement.statementRet);} )* RBRACE
      | statement {$ifStmtRet.addElseStatement($statement.statementRet);} )
     )?
     ;

whileStatement returns [WhileStmt whileStmtRet]:
    WHILE {Integer line = $WHILE.line; }
    LPAREN expression RPAREN {$whileStmtRet = new WhileStmt($expression.expressionRet);$whileStmtRet.setLine(line);}
    (LBRACE (statement {$whileStmtRet.addBody($statement.statementRet);} )* RBRACE
     | statement {$whileStmtRet.addBody($statement.statementRet);} )
    ;

forStatement returns [ForStmt forStmtRet]: {$forStmtRet = new ForStmt();}
    FOR {$forStmtRet.setLine($FOR.line); }
    LPAREN statement {$forStmtRet.addInit($statement.statementRet);}
    expression SEMICOLON {$forStmtRet.setCondition($expression.expressionRet);}
    (expression {$forStmtRet.addUpdate($expression.expressionRet);} )?
    RPAREN
    (LBRACE (statement {$forStmtRet.addBody($statement.statementRet);} )* RBRACE
    | statement {$forStmtRet.addBody($statement.statementRet);}
    );

tryCatchStatement returns [TryCatchStmt tryCatchStmtRet] : {$tryCatchStmtRet = new TryCatchStmt(); }
    TRY {$tryCatchStmtRet.setLine($TRY.line); }
    (LBRACE (statement {$tryCatchStmtRet.addTryStatement($statement.statementRet);} )* RBRACE
     | statement {$tryCatchStmtRet.addTryStatement($statement.statementRet);} )
    (CATCH EXCEPTION identifier {$tryCatchStmtRet.setException($identifier.identifierRet);}
    (LBRACE (statement {$tryCatchStmtRet.addCatchStatement($statement.statementRet);} )* RBRACE
     | statement {$tryCatchStmtRet.addCatchStatement($statement.statementRet);} )
     )?;

continueBreakStatement returns [ContinueBreakStmt continueBreakStmtRet]: {$continueBreakStmtRet = new ContinueBreakStmt();}
 ( BREAK {$continueBreakStmtRet.setToken($BREAK.text);$continueBreakStmtRet.setLine($BREAK.line); }
 | CONTINUE {$continueBreakStmtRet.setToken($CONTINUE.text);$continueBreakStmtRet.setLine($CONTINUE.line); }
 ) SEMICOLON;

returnStatement returns [ ReturnStmt returnStmtRet]:
    RETURN {Integer line = $RETURN.line;}
    expression SEMICOLON {$returnStmtRet = new ReturnStmt($expression.expressionRet);$returnStmtRet.setLine(line); }
    ;

throwStatement returns [ThrowStmt throwStmtRet] :
    THROW {Integer line =$THROW.line; }
    expression {$throwStmtRet = new ThrowStmt($expression.expressionRet);$throwStmtRet.setLine(line);}
    SEMICOLON;

functionCall returns [FunctionCall functionCallRet]:
    (espetialFunction  {$functionCallRet = new FunctionCall($espetialFunction.espetialFunctionRet);$functionCallRet.setLine($espetialFunction.espetialFunctionRet.getLine());}
    | complexTypeIdentifier {$functionCallRet = new FunctionCall($complexTypeIdentifier.typeIdenRet);$functionCallRet.setLine($complexTypeIdentifier.typeIdenRet.getLine());}
    | identifier  {$functionCallRet = new FunctionCall($identifier.identifierRet);$functionCallRet.setLine($identifier.identifierRet.getLine());}
    )
    LPAREN (
    expression {$functionCallRet.addArg($expression.expressionRet);}
    (COMMA expression {$functionCallRet.addArg($expression.expressionRet);} )*
    )? RPAREN;


methodCall returns [MethodCall methodCallRet]:{Identifier choice = new Identifier();}
    identifier {choice = $identifier.identifierRet;choice.setLine($identifier.identifierRet.getLine());}
     (LBRACK expression RBRACK {choice = new ArrayIdentifier($identifier.identifierRet.getName(),$expression.expressionRet); })?
    DOT espetialMethod {$methodCallRet = new MethodCall( choice, $espetialMethod.espetialMethodRet);$methodCallRet.setLine(choice.getLine());}
    LPAREN (
        expression {$methodCallRet.addArg($expression.expressionRet);}
        (COMMA expression {$methodCallRet.addArg($expression.expressionRet);} )*
    )? RPAREN;

expression returns [Expression expressionRet]:
             value {$expressionRet = $value.valueRet;$expressionRet.setLine($value.valueRet.getLine());}
           | e1=expression DOT espetialVariable {$expressionRet = new VarAccess($e1.expressionRet,$espetialVariable.espetialVariableRet);$expressionRet.setLine($e1.expressionRet.getLine());}
           | e1=expression (
                INC {$expressionRet = new UnaryExpression(UnaryOperator.INC,$e1.expressionRet);$expressionRet.setLine($INC.line);}
               | DEC {$expressionRet = new UnaryExpression(UnaryOperator.DEC,$e1.expressionRet);$expressionRet.setLine($DEC.line);}
           )
           | (
                NOT      expression {$expressionRet = new UnaryExpression(UnaryOperator.NOT,$expression.expressionRet);$expressionRet.setLine($NOT.line);}
               | MINUS   expression {$expressionRet = new UnaryExpression(UnaryOperator.MINUS,$expression.expressionRet);$expressionRet.setLine($MINUS.line);}
               | BIT_NOT expression {$expressionRet = new UnaryExpression(UnaryOperator.BIT_NOT,$expression.expressionRet);$expressionRet.setLine($BIT_NOT.line);}
               | INC     expression {$expressionRet = new UnaryExpression(UnaryOperator.INC,$expression.expressionRet);$expressionRet.setLine($INC.line);}
               | DEC     expression {$expressionRet = new UnaryExpression(UnaryOperator.DEC,$expression.expressionRet);$expressionRet.setLine($DEC.line);}
           )
           | e1 = expression (
                MULT e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.MULT);$expressionRet.setLine($MULT.line);}
               | DIV e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.DIV);$expressionRet.setLine($DIV.line);}
               | MOD e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.MOD);$expressionRet.setLine($MOD.line);}
           )
           | e1 = expression (
                 PLUS   e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.PLUS);$expressionRet.setLine($PLUS.line);}
                | MINUS e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.MINUS);$expressionRet.setLine($MINUS.line);}
            )
           | e1 = expression (
                  L_SHIFT  e2 =  expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.L_SHIFT);$expressionRet.setLine($L_SHIFT.line);}
                | R_SHIFT  e2 =  expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.R_SHIFT);$expressionRet.setLine($R_SHIFT.line);}
            )
           | e1 = expression (
                  LT  e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.LT);$expressionRet.setLine($LT.line);}
                | GT  e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.GT);$expressionRet.setLine($GT.line);}
           )
           | e1 = expression (
                  EQ  e2 =  expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.EQ);$expressionRet.setLine($EQ.line);}
                | NEQ e2 =  expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.NEQ);$expressionRet.setLine($NEQ.line);}
           )
           | e1 = expression (
                 BIT_AND   e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.BIT_AND);$expressionRet.setLine($BIT_AND.line);}
                | BIT_OR   e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.BIT_OR);$expressionRet.setLine($BIT_OR.line);}
                | BIT_XOR  e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.BIT_XOR);$expressionRet.setLine($BIT_XOR.line);}
                )
           | e1 = expression AND e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.AND);$expressionRet.setLine($AND.line);}
           | e1 = expression OR e2 = expression {$expressionRet = new BinaryExpression($e1.expressionRet,$e2.expressionRet,BinaryOperator.OR);$expressionRet.setLine($OR.line);}
           | {Identifier choice = new Identifier();}
             identifier {choice = $identifier.identifierRet;choice.setLine($identifier.identifierRet.getLine());}
             (LBRACK expression RBRACK {choice = new ArrayIdentifier($identifier.identifierRet.getName(),$expression.expressionRet); })?
             {$expressionRet = choice;$expressionRet.setLine($identifier.identifierRet.getLine());}
           | LPAREN expression RPAREN {$expressionRet = $expression.expressionRet;}
           | functionCall {$expressionRet = $functionCall.functionCallRet;}
           | methodCall {$expressionRet = $methodCall.methodCallRet;}
           ;

value returns [Value valueRet]:
    INT_LITERAL       {$valueRet = new IntValue(Integer.parseInt($INT_LITERAL.text)); $valueRet.setLine($INT_LITERAL.line);}
    | FLOAT_LITERAL   {$valueRet = new FloatValue(Float.parseFloat($FLOAT_LITERAL.text)); $valueRet.setLine($FLOAT_LITERAL.line);}
    | STRING_LITERAL  {$valueRet = new StringValue($STRING_LITERAL.text); $valueRet.setLine($STRING_LITERAL.line);}
    | SELL            {$valueRet = new BoolValue(true); $valueRet.setLine($SELL.line);}
    | BUY             {$valueRet = new BoolValue(false); $valueRet.setLine($BUY.line);}
    ;

primitiveType returns [Type typeRet]:
    FLOAT  {$typeRet = new FloatType(); $typeRet.setLine($FLOAT.line);}
  | DOUBLE {$typeRet = new DoubleType(); $typeRet.setLine($DOUBLE.line);}
  | INT    {$typeRet = new IntType();   $typeRet.setLine($INT.line);}
  | BOOL   {$typeRet = new BoolType();  $typeRet.setLine($BOOL.line);}
  | STRING {$typeRet = new StringType();$typeRet.setLine($STRING.line);}
  | VOID   {$typeRet = new VoidType();   $typeRet.setLine($VOID.line);}
  ;

complexType returns [Type typeRet]:
      ORDER     {$typeRet = new OrderType(); $typeRet.setLine($ORDER.line);}
    | TRADE     {$typeRet = new TradeType(); $typeRet.setLine($TRADE.line);}
    | CANDLE    {$typeRet = new CandleType(); $typeRet.setLine($CANDLE.line);}
    | EXCEPTION {$typeRet = new ExceptionType(); $typeRet.setLine($EXCEPTION.line);}
    ;

allType returns [Type allTypeRet]:
    primitiveType {$allTypeRet = $primitiveType.typeRet;$allTypeRet.setLine($primitiveType.typeRet.getLine());}
    | complexType {$allTypeRet = $complexType.typeRet;$allTypeRet.setLine($complexType.typeRet.getLine());};

complexTypeIdentifier returns [Identifier typeIdenRet]:
     nam=( ORDER | TRADE | CANDLE | EXCEPTION)
      {$typeIdenRet = new Identifier($nam.text);$typeIdenRet.setLine($nam.line);}
    ;

espetialFunction returns [Identifier espetialFunctionRet]:
    nam = ( REFRESH_RATE | CONNECT | OBSERVE | GET_CANDLE | TERMINATE | PRINT)
    {$espetialFunctionRet = new Identifier($nam.text); $espetialFunctionRet.setLine($nam.line);}
;

espetialVariable returns [Identifier espetialVariableRet]:
    nam = (ASK | BID | TIME | HIGH | LOW | DIGITS | VOLUME | TYPE | TEXT | OPEN | CLOSE)
    {$espetialVariableRet = new Identifier($nam.text); $espetialVariableRet.setLine($nam.line);}
    ;

espetialMethod returns [Identifier espetialMethodRet] : nam =  (OPEN | CLOSE)
    {$espetialMethodRet = new Identifier($nam.text); $espetialMethodRet.setLine($nam.line); };

assign  returns [Identifier assignRet] :
    nam = (ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN )
    {$assignRet = new Identifier($nam.text); $assignRet.setLine($nam.line); }
    ;

identifier returns [Identifier identifierRet]:
    ID  { $identifierRet = new Identifier($ID.text); $identifierRet.setLine($ID.line); }
    ;

// Lexer rules
SPACES : [ \t\r\n]+ -> skip;
SEMICOLON : ';';
COMMA : ',';
COLON : ':';
DOT: '.';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';

AND : '&&';
OR: '||';
NOT: '!';

BIT_AND : '&';
BIT_OR : '|';
BIT_XOR : '^';
L_SHIFT : '<<';
R_SHIFT : '>>';
BIT_NOT : '~';

LT : '<';
GT : '>';
EQ : '==';
NEQ : '!=';

INC : '++';
DEC : '--';

ASSIGN : '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

TRY : 'try';
THROW : 'throw';
CATCH : 'catch';
IF : 'if';
ELSE : 'else';
FOR: 'for';
WHILE : 'while';
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';

MAIN : 'Main';
ONINIT : 'OnInit';
ONSTART : 'OnStart';

FLOAT : 'float';
DOUBLE : 'double';
STRING: 'string';
BOOL: 'bool';
VOID: 'void';
INT : 'int';

BUY : 'BUY';
SELL : 'SELL';

ASK : 'Ask';
BID : 'Bid';
TIME : 'Time';
HIGH : 'High';
LOW : 'Low';
DIGITS : 'Digits';
VOLUME : 'Volume';
TYPE: 'Type';
TEXT: 'Text';
OPEN : 'Open';
CLOSE : 'Close';

TRADE: 'Trade';
ORDER: 'Order';
CANDLE: 'Candle';
EXCEPTION: 'Exception';

REFRESH_RATE : 'RefreshRate';
GET_CANDLE : 'GetCandle';
TERMINATE : 'Terminate';
CONNECT : 'Connect';
OBSERVE : 'Observe';
PRINT : 'Print';

ID : [a-zA-Z_][a-zA-Z_0-9]*;

INT_LITERAL : [1-9][0-9]* | '0';
FLOAT_LITERAL : [0-9]* '.' [0-9]+;
STRING_LITERAL : '"' (~["])* '"';

COMMENT: (('//' ~('\r'|'\n')*) | ('/*' .*? '*/')) -> skip;
