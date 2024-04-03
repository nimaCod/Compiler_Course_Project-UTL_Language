// Generated from E:/NIMA/Compiler/CA/CA02/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;

    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, SEMICOLON=2, COMMA=3, COLON=4, DOT=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, LBRACK=10, RBRACK=11, PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, 
		AND=17, OR=18, NOT=19, BIT_AND=20, BIT_OR=21, BIT_XOR=22, L_SHIFT=23, 
		R_SHIFT=24, BIT_NOT=25, LT=26, GT=27, EQ=28, NEQ=29, INC=30, DEC=31, ASSIGN=32, 
		ADD_ASSIGN=33, SUB_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, MOD_ASSIGN=37, 
		TRY=38, THROW=39, CATCH=40, IF=41, ELSE=42, FOR=43, WHILE=44, BREAK=45, 
		CONTINUE=46, RETURN=47, MAIN=48, ONINIT=49, ONSTART=50, FLOAT=51, DOUBLE=52, 
		STRING=53, BOOL=54, VOID=55, INT=56, BUY=57, SELL=58, ASK=59, BID=60, 
		TIME=61, HIGH=62, LOW=63, DIGITS=64, VOLUME=65, TYPE=66, TEXT=67, OPEN=68, 
		CLOSE=69, TRADE=70, ORDER=71, CANDLE=72, EXCEPTION=73, REFRESH_RATE=74, 
		GET_CANDLE=75, TERMINATE=76, CONNECT=77, OBSERVE=78, PRINT=79, ID=80, 
		INT_LITERAL=81, FLOAT_LITERAL=82, STRING_LITERAL=83, COMMENT=84;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varDeclaration = 2, RULE_functionDeclaration = 3, 
		RULE_mainDeclaration = 4, RULE_initDeclaration = 5, RULE_startDeclaration = 6, 
		RULE_assignStatement = 7, RULE_ifStatement = 8, RULE_whileStatement = 9, 
		RULE_forStatement = 10, RULE_tryCatchStatement = 11, RULE_continueBreakStatement = 12, 
		RULE_returnStatement = 13, RULE_throwStatement = 14, RULE_functionCall = 15, 
		RULE_methodCall = 16, RULE_expression = 17, RULE_value = 18, RULE_primitiveType = 19, 
		RULE_complexType = 20, RULE_allType = 21, RULE_complexTypeIdentifier = 22, 
		RULE_espetialFunction = 23, RULE_espetialVariable = 24, RULE_espetialMethod = 25, 
		RULE_assign = 26, RULE_identifier = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDeclaration", "functionDeclaration", "mainDeclaration", 
			"initDeclaration", "startDeclaration", "assignStatement", "ifStatement", 
			"whileStatement", "forStatement", "tryCatchStatement", "continueBreakStatement", 
			"returnStatement", "throwStatement", "functionCall", "methodCall", "expression", 
			"value", "primitiveType", "complexType", "allType", "complexTypeIdentifier", 
			"espetialFunction", "espetialVariable", "espetialMethod", "assign", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','", "':'", "'.'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'|'", "'^'", "'<<'", "'>>'", "'~'", "'<'", "'>'", "'=='", "'!='", "'++'", 
			"'--'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'try'", "'throw'", 
			"'catch'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'Main'", "'OnInit'", "'OnStart'", "'float'", "'double'", 
			"'string'", "'bool'", "'void'", "'int'", "'BUY'", "'SELL'", "'Ask'", 
			"'Bid'", "'Time'", "'High'", "'Low'", "'Digits'", "'Volume'", "'Type'", 
			"'Text'", "'Open'", "'Close'", "'Trade'", "'Order'", "'Candle'", "'Exception'", 
			"'RefreshRate'", "'GetCandle'", "'Terminate'", "'Connect'", "'Observe'", 
			"'Print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACES", "SEMICOLON", "COMMA", "COLON", "DOT", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "L_SHIFT", 
			"R_SHIFT", "BIT_NOT", "LT", "GT", "EQ", "NEQ", "INC", "DEC", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"TRY", "THROW", "CATCH", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", 
			"RETURN", "MAIN", "ONINIT", "ONSTART", "FLOAT", "DOUBLE", "STRING", "BOOL", 
			"VOID", "INT", "BUY", "SELL", "ASK", "BID", "TIME", "HIGH", "LOW", "DIGITS", 
			"VOLUME", "TYPE", "TEXT", "OPEN", "CLOSE", "TRADE", "ORDER", "CANDLE", 
			"EXCEPTION", "REFRESH_RATE", "GET_CANDLE", "TERMINATE", "CONNECT", "OBSERVE", 
			"PRINT", "ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "UTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program pro;
		public VarDeclarationContext varDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public InitDeclarationContext initDeclaration;
		public StartDeclarationContext startDeclaration;
		public MainDeclarationContext mainDeclaration;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<InitDeclarationContext> initDeclaration() {
			return getRuleContexts(InitDeclarationContext.class);
		}
		public InitDeclarationContext initDeclaration(int i) {
			return getRuleContext(InitDeclarationContext.class,i);
		}
		public List<StartDeclarationContext> startDeclaration() {
			return getRuleContexts(StartDeclarationContext.class);
		}
		public StartDeclarationContext startDeclaration(int i) {
			return getRuleContext(StartDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).pro =  new Program(); _localctx.pro.setLine(0);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(57);
						((ProgramContext)_localctx).varDeclaration = varDeclaration();
						 _localctx.pro.addVar(((ProgramContext)_localctx).varDeclaration.varDecRet); 
						}
						break;
					case 2:
						{
						setState(60);
						((ProgramContext)_localctx).functionDeclaration = functionDeclaration();
						 _localctx.pro.addFunction(((ProgramContext)_localctx).functionDeclaration.funcDecRet); 
						}
						break;
					case 3:
						{
						setState(63);
						((ProgramContext)_localctx).initDeclaration = initDeclaration();
						 _localctx.pro.addInit(((ProgramContext)_localctx).initDeclaration.initDecRet); 
						}
						break;
					case 4:
						{
						setState(66);
						((ProgramContext)_localctx).startDeclaration = startDeclaration();
						 _localctx.pro.addStart(((ProgramContext)_localctx).startDeclaration.startDecRet); 
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(74);
			((ProgramContext)_localctx).mainDeclaration = mainDeclaration();
			 _localctx.pro.setMain(((ProgramContext)_localctx).mainDeclaration.mainDecRet); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public VarDeclarationContext varDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public AssignStatementContext assignStatement;
		public ContinueBreakStatementContext continueBreakStatement;
		public ReturnStatementContext returnStatement;
		public IfStatementContext ifStatement;
		public WhileStatementContext whileStatement;
		public ForStatementContext forStatement;
		public TryCatchStatementContext tryCatchStatement;
		public ThrowStatementContext throwStatement;
		public ExpressionContext expression;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(77);
				((StatementContext)_localctx).varDeclaration = varDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).varDeclaration.varDecRet; 
				}
				break;
			case 2:
				{
				setState(80);
				((StatementContext)_localctx).functionDeclaration = functionDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).functionDeclaration.funcDecRet; 
				}
				break;
			case 3:
				{
				setState(83);
				((StatementContext)_localctx).assignStatement = assignStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).assignStatement.assignStmtRet; 
				}
				break;
			case 4:
				{
				setState(86);
				((StatementContext)_localctx).continueBreakStatement = continueBreakStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).continueBreakStatement.continueBreakStmtRet; 
				}
				break;
			case 5:
				{
				setState(89);
				((StatementContext)_localctx).returnStatement = returnStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).returnStatement.returnStmtRet; 
				}
				break;
			case 6:
				{
				setState(92);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ifStatement.ifStmtRet; 
				}
				break;
			case 7:
				{
				setState(95);
				((StatementContext)_localctx).whileStatement = whileStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).whileStatement.whileStmtRet; 
				}
				break;
			case 8:
				{
				setState(98);
				((StatementContext)_localctx).forStatement = forStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).forStatement.forStmtRet; 
				}
				break;
			case 9:
				{
				setState(101);
				((StatementContext)_localctx).tryCatchStatement = tryCatchStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).tryCatchStatement.tryCatchStmtRet; 
				}
				break;
			case 10:
				{
				setState(104);
				((StatementContext)_localctx).throwStatement = throwStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).throwStatement.throwStmtRet; 
				}
				break;
			case 11:
				{
				setState(107);
				((StatementContext)_localctx).expression = expression(0);
				setState(108);
				match(SEMICOLON);
				 ((StatementContext)_localctx).statementRet =  new ExpressionStmt(((StatementContext)_localctx).expression.expressionRet); 
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDecRet;
		public AllTypeContext allType;
		public Token INT_LITERAL;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((VarDeclarationContext)_localctx).varDecRet =  new VarDeclaration(); 
			setState(114);
			((VarDeclarationContext)_localctx).allType = allType();
			 _localctx.varDecRet.setType(((VarDeclarationContext)_localctx).allType.allTypeRet); 
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(116);
				match(LBRACK);
				setState(117);
				((VarDeclarationContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(118);
				match(RBRACK);
				 _localctx.varDecRet.setLength(Integer.parseInt((((VarDeclarationContext)_localctx).INT_LITERAL!=null?((VarDeclarationContext)_localctx).INT_LITERAL.getText():null))); 
				}
			}

			setState(122);
			((VarDeclarationContext)_localctx).identifier = identifier();
			 _localctx.varDecRet.setIdentifier(((VarDeclarationContext)_localctx).identifier.identifierRet); _localctx.varDecRet.setLine(((VarDeclarationContext)_localctx).identifier.identifierRet.getLine()); 
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(124);
				match(ASSIGN);
				setState(125);
				((VarDeclarationContext)_localctx).expression = expression(0);
				_localctx.varDecRet.setExpression(((VarDeclarationContext)_localctx).expression.expressionRet);
				}
			}

			setState(130);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration funcDecRet;
		public PrimitiveTypeContext primitiveType;
		public IdentifierContext identifier;
		public AllTypeContext allType;
		public StatementContext statement;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AllTypeContext> allType() {
			return getRuleContexts(AllTypeContext.class);
		}
		public AllTypeContext allType(int i) {
			return getRuleContext(AllTypeContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(UTLParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(UTLParser.LBRACK, i);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(UTLParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(UTLParser.INT_LITERAL, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(UTLParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(UTLParser.RBRACK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionDeclarationContext)_localctx).funcDecRet =  new FunctionDeclaration(); 
			setState(133);
			((FunctionDeclarationContext)_localctx).primitiveType = primitiveType();
			 _localctx.funcDecRet.setReturnType(((FunctionDeclarationContext)_localctx).primitiveType.typeRet); 
			setState(135);
			((FunctionDeclarationContext)_localctx).identifier = identifier();
			 _localctx.funcDecRet.setName(((FunctionDeclarationContext)_localctx).identifier.identifierRet); _localctx.funcDecRet.setLine(((FunctionDeclarationContext)_localctx).identifier.identifierRet.getLine()); 
			setState(137);
			match(LPAREN);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 7864383L) != 0)) {
				{
				setState(138);
				((FunctionDeclarationContext)_localctx).allType = allType();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(139);
					match(LBRACK);
					setState(140);
					match(INT_LITERAL);
					setState(141);
					match(RBRACK);
					}
				}

				setState(144);
				((FunctionDeclarationContext)_localctx).identifier = identifier();
				 _localctx.funcDecRet.addArg(new VarDeclaration(((FunctionDeclarationContext)_localctx).allType.allTypeRet, ((FunctionDeclarationContext)_localctx).identifier.identifierRet)); 
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(146);
					match(COMMA);
					setState(147);
					((FunctionDeclarationContext)_localctx).allType = allType();
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACK) {
						{
						setState(148);
						match(LBRACK);
						setState(149);
						match(INT_LITERAL);
						setState(150);
						match(RBRACK);
						}
					}

					setState(153);
					((FunctionDeclarationContext)_localctx).identifier = identifier();
					 _localctx.funcDecRet.addArg(new VarDeclaration(((FunctionDeclarationContext)_localctx).allType.allTypeRet, ((FunctionDeclarationContext)_localctx).identifier.identifierRet)); 
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(163);
			match(RPAREN);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(164);
				match(THROW);
				setState(165);
				match(EXCEPTION);
				}
				break;
			}
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(168);
				match(LBRACE);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(169);
					((FunctionDeclarationContext)_localctx).statement = statement();
					 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(178);
				((FunctionDeclarationContext)_localctx).statement = statement();
				 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainDeclarationContext extends ParserRuleContext {
		public MainDeclaration mainDecRet;
		public Token main;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode MAIN() { return getToken(UTLParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).mainDecRet =  new MainDeclaration();
			setState(184);
			match(VOID);
			setState(185);
			((MainDeclarationContext)_localctx).main = match(MAIN);
			_localctx.mainDecRet.setLine((((MainDeclarationContext)_localctx).main!=null?((MainDeclarationContext)_localctx).main.getLine():0)); 
			setState(187);
			match(LPAREN);
			setState(188);
			match(RPAREN);
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(189);
				match(LBRACE);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(190);
					((MainDeclarationContext)_localctx).statement = statement();
					 _localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(199);
				((MainDeclarationContext)_localctx).statement = statement();
				 _localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclarationContext extends ParserRuleContext {
		public OnInitDeclaration initDecRet;
		public Token oninit;
		public IdentifierContext identifier;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode ONINIT() { return getToken(UTLParser.ONINIT, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public InitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterInitDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitInitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitInitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclarationContext initDeclaration() throws RecognitionException {
		InitDeclarationContext _localctx = new InitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InitDeclarationContext)_localctx).initDecRet =  new OnInitDeclaration();
			setState(205);
			match(VOID);
			setState(206);
			((InitDeclarationContext)_localctx).oninit = match(ONINIT);
			_localctx.initDecRet.setLine((((InitDeclarationContext)_localctx).oninit!=null?((InitDeclarationContext)_localctx).oninit.getLine():0)); 
			setState(208);
			match(LPAREN);
			setState(209);
			match(TRADE);
			setState(210);
			((InitDeclarationContext)_localctx).identifier = identifier();
			setState(211);
			match(RPAREN);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(212);
				match(THROW);
				setState(213);
				match(EXCEPTION);
				}
				break;
			}
			_localctx.initDecRet.setTradeName(((InitDeclarationContext)_localctx).identifier.identifierRet);
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(217);
				match(LBRACE);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(218);
					((InitDeclarationContext)_localctx).statement = statement();
					_localctx.initDecRet.addStatement(((InitDeclarationContext)_localctx).statement.statementRet);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(227);
				((InitDeclarationContext)_localctx).statement = statement();
				_localctx.initDecRet.addStatement(((InitDeclarationContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartDeclarationContext extends ParserRuleContext {
		public OnStartDeclaration startDecRet;
		public Token onstart;
		public IdentifierContext identifier;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode ONSTART() { return getToken(UTLParser.ONSTART, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public StartDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStartDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStartDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStartDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartDeclarationContext startDeclaration() throws RecognitionException {
		StartDeclarationContext _localctx = new StartDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StartDeclarationContext)_localctx).startDecRet =  new OnStartDeclaration();
			setState(233);
			match(VOID);
			setState(234);
			((StartDeclarationContext)_localctx).onstart = match(ONSTART);
			_localctx.startDecRet.setLine((((StartDeclarationContext)_localctx).onstart!=null?((StartDeclarationContext)_localctx).onstart.getLine():0)); 
			setState(236);
			match(LPAREN);
			setState(237);
			match(TRADE);
			setState(238);
			((StartDeclarationContext)_localctx).identifier = identifier();
			setState(239);
			match(RPAREN);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(240);
				match(THROW);
				setState(241);
				match(EXCEPTION);
				}
				break;
			}
			_localctx.startDecRet.setTradeName(((StartDeclarationContext)_localctx).identifier.identifierRet);
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(245);
				match(LBRACE);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(246);
					((StartDeclarationContext)_localctx).statement = statement();
					_localctx.startDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(255);
				((StartDeclarationContext)_localctx).statement = statement();
				_localctx.startDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStmt assignStmtRet;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public AssignContext assign;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Identifier choice = new Identifier(); 
			setState(261);
			((AssignStatementContext)_localctx).identifier = identifier();
			choice = ((AssignStatementContext)_localctx).identifier.identifierRet;
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(263);
				match(LBRACK);
				setState(264);
				((AssignStatementContext)_localctx).expression = expression(0);
				setState(265);
				match(RBRACK);
				choice = new  ArrayIdentifier(((AssignStatementContext)_localctx).identifier.identifierRet.getName(),((AssignStatementContext)_localctx).expression.expressionRet); 
				}
			}

			setState(270);
			((AssignStatementContext)_localctx).assign = assign();
			choice.setLine(((AssignStatementContext)_localctx).assign.assignRet.getLine());
			setState(272);
			((AssignStatementContext)_localctx).expression = expression(0);
			setState(273);
			match(SEMICOLON);
			((AssignStatementContext)_localctx).assignStmtRet =  new AssignStmt(choice,((AssignStatementContext)_localctx).expression.expressionRet);_localctx.assignStmtRet.setLine(choice.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfElseStmt ifStmtRet;
		public Token IF;
		public ExpressionContext expression;
		public StatementContext statement;
		public TerminalNode IF() { return getToken(UTLParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UTLParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((IfStatementContext)_localctx).IF = match(IF);
			Integer line = (((IfStatementContext)_localctx).IF!=null?((IfStatementContext)_localctx).IF.getLine():0); 
			setState(278);
			match(LPAREN);
			setState(279);
			((IfStatementContext)_localctx).expression = expression(0);
			setState(280);
			match(RPAREN);
			((IfStatementContext)_localctx).ifStmtRet =  new IfElseStmt(((IfStatementContext)_localctx).expression.expressionRet);_localctx.ifStmtRet.setLine(line);
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(282);
				match(LBRACE);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(283);
					((IfStatementContext)_localctx).statement = statement();
					_localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).statement.statementRet);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(291);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(292);
				((IfStatementContext)_localctx).statement = statement();
				_localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(297);
				match(ELSE);
				setState(311);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(298);
					match(LBRACE);
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(299);
						((IfStatementContext)_localctx).statement = statement();
						_localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).statement.statementRet);
						}
						}
						setState(306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(307);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					setState(308);
					((IfStatementContext)_localctx).statement = statement();
					_localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).statement.statementRet);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStmt whileStmtRet;
		public Token WHILE;
		public ExpressionContext expression;
		public StatementContext statement;
		public TerminalNode WHILE() { return getToken(UTLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			((WhileStatementContext)_localctx).WHILE = match(WHILE);
			Integer line = (((WhileStatementContext)_localctx).WHILE!=null?((WhileStatementContext)_localctx).WHILE.getLine():0); 
			setState(317);
			match(LPAREN);
			setState(318);
			((WhileStatementContext)_localctx).expression = expression(0);
			setState(319);
			match(RPAREN);
			((WhileStatementContext)_localctx).whileStmtRet =  new WhileStmt(((WhileStatementContext)_localctx).expression.expressionRet);_localctx.whileStmtRet.setLine(line);
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(321);
				match(LBRACE);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(322);
					((WhileStatementContext)_localctx).statement = statement();
					_localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).statement.statementRet);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(331);
				((WhileStatementContext)_localctx).statement = statement();
				_localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt forStmtRet;
		public Token FOR;
		public StatementContext statement;
		public ExpressionContext expression;
		public TerminalNode FOR() { return getToken(UTLParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForStatementContext)_localctx).forStmtRet =  new ForStmt();
			setState(337);
			((ForStatementContext)_localctx).FOR = match(FOR);
			_localctx.forStmtRet.setLine((((ForStatementContext)_localctx).FOR!=null?((ForStatementContext)_localctx).FOR.getLine():0)); 
			setState(339);
			match(LPAREN);
			setState(340);
			((ForStatementContext)_localctx).statement = statement();
			_localctx.forStmtRet.addInit(((ForStatementContext)_localctx).statement.statementRet);
			setState(342);
			((ForStatementContext)_localctx).expression = expression(0);
			setState(343);
			match(SEMICOLON);
			_localctx.forStmtRet.setCondition(((ForStatementContext)_localctx).expression.expressionRet);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(345);
				((ForStatementContext)_localctx).expression = expression(0);
				_localctx.forStmtRet.addUpdate(((ForStatementContext)_localctx).expression.expressionRet);
				}
			}

			setState(350);
			match(RPAREN);
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(351);
				match(LBRACE);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(352);
					((ForStatementContext)_localctx).statement = statement();
					_localctx.forStmtRet.addBody(((ForStatementContext)_localctx).statement.statementRet);
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(360);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(361);
				((ForStatementContext)_localctx).statement = statement();
				_localctx.forStmtRet.addBody(((ForStatementContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TryCatchStmt tryCatchStmtRet;
		public Token TRY;
		public StatementContext statement;
		public IdentifierContext identifier;
		public TerminalNode TRY() { return getToken(UTLParser.TRY, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CATCH() { return getToken(UTLParser.CATCH, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TryCatchStatementContext)_localctx).tryCatchStmtRet =  new TryCatchStmt(); 
			setState(367);
			((TryCatchStatementContext)_localctx).TRY = match(TRY);
			_localctx.tryCatchStmtRet.setLine((((TryCatchStatementContext)_localctx).TRY!=null?((TryCatchStatementContext)_localctx).TRY.getLine():0)); 
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(369);
				match(LBRACE);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(370);
					((TryCatchStatementContext)_localctx).statement = statement();
					_localctx.tryCatchStmtRet.addTryStatement(((TryCatchStatementContext)_localctx).statement.statementRet);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(379);
				((TryCatchStatementContext)_localctx).statement = statement();
				_localctx.tryCatchStmtRet.addTryStatement(((TryCatchStatementContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(384);
				match(CATCH);
				setState(385);
				match(EXCEPTION);
				setState(386);
				((TryCatchStatementContext)_localctx).identifier = identifier();
				_localctx.tryCatchStmtRet.setException(((TryCatchStatementContext)_localctx).identifier.identifierRet);
				setState(401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(388);
					match(LBRACE);
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(389);
						((TryCatchStatementContext)_localctx).statement = statement();
						_localctx.tryCatchStmtRet.addCatchStatement(((TryCatchStatementContext)_localctx).statement.statementRet);
						}
						}
						setState(396);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(397);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					setState(398);
					((TryCatchStatementContext)_localctx).statement = statement();
					_localctx.tryCatchStmtRet.addCatchStatement(((TryCatchStatementContext)_localctx).statement.statementRet);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public ContinueBreakStmt continueBreakStmtRet;
		public Token BREAK;
		public Token CONTINUE;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(UTLParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(UTLParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ContinueBreakStatementContext)_localctx).continueBreakStmtRet =  new ContinueBreakStmt();
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(406);
				((ContinueBreakStatementContext)_localctx).BREAK = match(BREAK);
				_localctx.continueBreakStmtRet.setToken((((ContinueBreakStatementContext)_localctx).BREAK!=null?((ContinueBreakStatementContext)_localctx).BREAK.getText():null));_localctx.continueBreakStmtRet.setLine((((ContinueBreakStatementContext)_localctx).BREAK!=null?((ContinueBreakStatementContext)_localctx).BREAK.getLine():0)); 
				}
				break;
			case CONTINUE:
				{
				setState(408);
				((ContinueBreakStatementContext)_localctx).CONTINUE = match(CONTINUE);
				_localctx.continueBreakStmtRet.setToken((((ContinueBreakStatementContext)_localctx).CONTINUE!=null?((ContinueBreakStatementContext)_localctx).CONTINUE.getText():null));_localctx.continueBreakStmtRet.setLine((((ContinueBreakStatementContext)_localctx).CONTINUE!=null?((ContinueBreakStatementContext)_localctx).CONTINUE.getLine():0)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(412);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStmtRet;
		public Token RETURN;
		public ExpressionContext expression;
		public TerminalNode RETURN() { return getToken(UTLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			Integer line = (((ReturnStatementContext)_localctx).RETURN!=null?((ReturnStatementContext)_localctx).RETURN.getLine():0);
			setState(416);
			((ReturnStatementContext)_localctx).expression = expression(0);
			setState(417);
			match(SEMICOLON);
			((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt(((ReturnStatementContext)_localctx).expression.expressionRet);_localctx.returnStmtRet.setLine(line); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStmt throwStmtRet;
		public Token THROW;
		public ExpressionContext expression;
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			((ThrowStatementContext)_localctx).THROW = match(THROW);
			Integer line =(((ThrowStatementContext)_localctx).THROW!=null?((ThrowStatementContext)_localctx).THROW.getLine():0); 
			setState(422);
			((ThrowStatementContext)_localctx).expression = expression(0);
			((ThrowStatementContext)_localctx).throwStmtRet =  new ThrowStmt(((ThrowStatementContext)_localctx).expression.expressionRet);_localctx.throwStmtRet.setLine(line);
			setState(424);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCall functionCallRet;
		public EspetialFunctionContext espetialFunction;
		public ComplexTypeIdentifierContext complexTypeIdentifier;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public EspetialFunctionContext espetialFunction() {
			return getRuleContext(EspetialFunctionContext.class,0);
		}
		public ComplexTypeIdentifierContext complexTypeIdentifier() {
			return getRuleContext(ComplexTypeIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
				{
				setState(426);
				((FunctionCallContext)_localctx).espetialFunction = espetialFunction();
				((FunctionCallContext)_localctx).functionCallRet =  new FunctionCall(((FunctionCallContext)_localctx).espetialFunction.espetialFunctionRet);_localctx.functionCallRet.setLine(((FunctionCallContext)_localctx).espetialFunction.espetialFunctionRet.getLine());
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				{
				setState(429);
				((FunctionCallContext)_localctx).complexTypeIdentifier = complexTypeIdentifier();
				((FunctionCallContext)_localctx).functionCallRet =  new FunctionCall(((FunctionCallContext)_localctx).complexTypeIdentifier.typeIdenRet);_localctx.functionCallRet.setLine(((FunctionCallContext)_localctx).complexTypeIdentifier.typeIdenRet.getLine());
				}
				break;
			case ID:
				{
				setState(432);
				((FunctionCallContext)_localctx).identifier = identifier();
				((FunctionCallContext)_localctx).functionCallRet =  new FunctionCall(((FunctionCallContext)_localctx).identifier.identifierRet);_localctx.functionCallRet.setLine(((FunctionCallContext)_localctx).identifier.identifierRet.getLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(437);
			match(LPAREN);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(438);
				((FunctionCallContext)_localctx).expression = expression(0);
				_localctx.functionCallRet.addArg(((FunctionCallContext)_localctx).expression.expressionRet);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(440);
					match(COMMA);
					setState(441);
					((FunctionCallContext)_localctx).expression = expression(0);
					_localctx.functionCallRet.addArg(((FunctionCallContext)_localctx).expression.expressionRet);
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(451);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall methodCallRet;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public EspetialMethodContext espetialMethod;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspetialMethodContext espetialMethod() {
			return getRuleContext(EspetialMethodContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Identifier choice = new Identifier();
			setState(454);
			((MethodCallContext)_localctx).identifier = identifier();
			choice = ((MethodCallContext)_localctx).identifier.identifierRet;choice.setLine(((MethodCallContext)_localctx).identifier.identifierRet.getLine());
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(456);
				match(LBRACK);
				setState(457);
				((MethodCallContext)_localctx).expression = expression(0);
				setState(458);
				match(RBRACK);
				choice = new ArrayIdentifier(((MethodCallContext)_localctx).identifier.identifierRet.getName(),((MethodCallContext)_localctx).expression.expressionRet); 
				}
			}

			setState(463);
			match(DOT);
			setState(464);
			((MethodCallContext)_localctx).espetialMethod = espetialMethod();
			((MethodCallContext)_localctx).methodCallRet =  new MethodCall( choice, ((MethodCallContext)_localctx).espetialMethod.espetialMethodRet);_localctx.methodCallRet.setLine(choice.getLine());
			setState(466);
			match(LPAREN);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(467);
				((MethodCallContext)_localctx).expression = expression(0);
				_localctx.methodCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(469);
					match(COMMA);
					setState(470);
					((MethodCallContext)_localctx).expression = expression(0);
					_localctx.methodCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet);
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(480);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExpressionContext e1;
		public ValueContext value;
		public Token NOT;
		public ExpressionContext expression;
		public Token MINUS;
		public Token BIT_NOT;
		public Token INC;
		public Token DEC;
		public IdentifierContext identifier;
		public FunctionCallContext functionCall;
		public MethodCallContext methodCall;
		public Token AND;
		public ExpressionContext e2;
		public Token OR;
		public EspetialVariableContext espetialVariable;
		public Token MULT;
		public Token DIV;
		public Token MOD;
		public Token PLUS;
		public Token L_SHIFT;
		public Token R_SHIFT;
		public Token LT;
		public Token GT;
		public Token EQ;
		public Token NEQ;
		public Token BIT_AND;
		public Token BIT_OR;
		public Token BIT_XOR;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NOT() { return getToken(UTLParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(UTLParser.MINUS, 0); }
		public TerminalNode BIT_NOT() { return getToken(UTLParser.BIT_NOT, 0); }
		public TerminalNode INC() { return getToken(UTLParser.INC, 0); }
		public TerminalNode DEC() { return getToken(UTLParser.DEC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode AND() { return getToken(UTLParser.AND, 0); }
		public TerminalNode OR() { return getToken(UTLParser.OR, 0); }
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspetialVariableContext espetialVariable() {
			return getRuleContext(EspetialVariableContext.class,0);
		}
		public TerminalNode MULT() { return getToken(UTLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(UTLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(UTLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(UTLParser.PLUS, 0); }
		public TerminalNode L_SHIFT() { return getToken(UTLParser.L_SHIFT, 0); }
		public TerminalNode R_SHIFT() { return getToken(UTLParser.R_SHIFT, 0); }
		public TerminalNode LT() { return getToken(UTLParser.LT, 0); }
		public TerminalNode GT() { return getToken(UTLParser.GT, 0); }
		public TerminalNode EQ() { return getToken(UTLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(UTLParser.NEQ, 0); }
		public TerminalNode BIT_AND() { return getToken(UTLParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(UTLParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(UTLParser.BIT_XOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(483);
				((ExpressionContext)_localctx).value = value();
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).value.valueRet;_localctx.expressionRet.setLine(((ExpressionContext)_localctx).value.valueRet.getLine());
				}
				break;
			case 2:
				{
				setState(506);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(486);
					((ExpressionContext)_localctx).NOT = match(NOT);
					setState(487);
					((ExpressionContext)_localctx).expression = expression(0);
					((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(UnaryOperator.NOT,((ExpressionContext)_localctx).expression.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).NOT!=null?((ExpressionContext)_localctx).NOT.getLine():0));
					}
					break;
				case MINUS:
					{
					setState(490);
					((ExpressionContext)_localctx).MINUS = match(MINUS);
					setState(491);
					((ExpressionContext)_localctx).expression = expression(0);
					((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(UnaryOperator.MINUS,((ExpressionContext)_localctx).expression.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).MINUS!=null?((ExpressionContext)_localctx).MINUS.getLine():0));
					}
					break;
				case BIT_NOT:
					{
					setState(494);
					((ExpressionContext)_localctx).BIT_NOT = match(BIT_NOT);
					setState(495);
					((ExpressionContext)_localctx).expression = expression(0);
					((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(UnaryOperator.BIT_NOT,((ExpressionContext)_localctx).expression.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).BIT_NOT!=null?((ExpressionContext)_localctx).BIT_NOT.getLine():0));
					}
					break;
				case INC:
					{
					setState(498);
					((ExpressionContext)_localctx).INC = match(INC);
					setState(499);
					((ExpressionContext)_localctx).expression = expression(0);
					((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(UnaryOperator.INC,((ExpressionContext)_localctx).expression.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).INC!=null?((ExpressionContext)_localctx).INC.getLine():0));
					}
					break;
				case DEC:
					{
					setState(502);
					((ExpressionContext)_localctx).DEC = match(DEC);
					setState(503);
					((ExpressionContext)_localctx).expression = expression(0);
					((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(UnaryOperator.DEC,((ExpressionContext)_localctx).expression.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).DEC!=null?((ExpressionContext)_localctx).DEC.getLine():0));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				Identifier choice = new Identifier();
				setState(509);
				((ExpressionContext)_localctx).identifier = identifier();
				choice = ((ExpressionContext)_localctx).identifier.identifierRet;choice.setLine(((ExpressionContext)_localctx).identifier.identifierRet.getLine());
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(511);
					match(LBRACK);
					setState(512);
					((ExpressionContext)_localctx).expression = expression(0);
					setState(513);
					match(RBRACK);
					choice = new ArrayIdentifier(((ExpressionContext)_localctx).identifier.identifierRet.getName(),((ExpressionContext)_localctx).expression.expressionRet); 
					}
					break;
				}
				((ExpressionContext)_localctx).expressionRet =  choice;_localctx.expressionRet.setLine(((ExpressionContext)_localctx).identifier.identifierRet.getLine());
				}
				break;
			case 4:
				{
				setState(520);
				match(LPAREN);
				setState(521);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(522);
				match(RPAREN);
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).expression.expressionRet;
				}
				break;
			case 5:
				{
				setState(525);
				((ExpressionContext)_localctx).functionCall = functionCall();
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).functionCall.functionCallRet;
				}
				break;
			case 6:
				{
				setState(528);
				((ExpressionContext)_localctx).methodCall = methodCall();
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).methodCall.methodCallRet;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(629);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(533);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(534);
						((ExpressionContext)_localctx).AND = match(AND);
						setState(535);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.AND);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).AND!=null?((ExpressionContext)_localctx).AND.getLine():0));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(538);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(539);
						((ExpressionContext)_localctx).OR = match(OR);
						setState(540);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(6);
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.OR);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).OR!=null?((ExpressionContext)_localctx).OR.getLine():0));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(543);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(544);
						match(DOT);
						setState(545);
						((ExpressionContext)_localctx).espetialVariable = espetialVariable();
						((ExpressionContext)_localctx).expressionRet =  new VarAccess(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).espetialVariable.espetialVariableRet);_localctx.expressionRet.setLine(((ExpressionContext)_localctx).e1.expressionRet.getLine());
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(548);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(553);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case INC:
							{
							setState(549);
							((ExpressionContext)_localctx).INC = match(INC);
							((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(UnaryOperator.INC,((ExpressionContext)_localctx).e1.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).INC!=null?((ExpressionContext)_localctx).INC.getLine():0));
							}
							break;
						case DEC:
							{
							setState(551);
							((ExpressionContext)_localctx).DEC = match(DEC);
							((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(UnaryOperator.DEC,((ExpressionContext)_localctx).e1.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).DEC!=null?((ExpressionContext)_localctx).DEC.getLine():0));
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(555);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(568);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(556);
							((ExpressionContext)_localctx).MULT = match(MULT);
							setState(557);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.MULT);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).MULT!=null?((ExpressionContext)_localctx).MULT.getLine():0));
							}
							break;
						case DIV:
							{
							setState(560);
							((ExpressionContext)_localctx).DIV = match(DIV);
							setState(561);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.DIV);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).DIV!=null?((ExpressionContext)_localctx).DIV.getLine():0));
							}
							break;
						case MOD:
							{
							setState(564);
							((ExpressionContext)_localctx).MOD = match(MOD);
							setState(565);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.MOD);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).MOD!=null?((ExpressionContext)_localctx).MOD.getLine():0));
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(570);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(579);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(571);
							((ExpressionContext)_localctx).PLUS = match(PLUS);
							setState(572);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.PLUS);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).PLUS!=null?((ExpressionContext)_localctx).PLUS.getLine():0));
							}
							break;
						case MINUS:
							{
							setState(575);
							((ExpressionContext)_localctx).MINUS = match(MINUS);
							setState(576);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.MINUS);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).MINUS!=null?((ExpressionContext)_localctx).MINUS.getLine():0));
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(581);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(590);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case L_SHIFT:
							{
							setState(582);
							((ExpressionContext)_localctx).L_SHIFT = match(L_SHIFT);
							setState(583);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.L_SHIFT);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).L_SHIFT!=null?((ExpressionContext)_localctx).L_SHIFT.getLine():0));
							}
							break;
						case R_SHIFT:
							{
							setState(586);
							((ExpressionContext)_localctx).R_SHIFT = match(R_SHIFT);
							setState(587);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.R_SHIFT);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).R_SHIFT!=null?((ExpressionContext)_localctx).R_SHIFT.getLine():0));
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(592);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(601);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(593);
							((ExpressionContext)_localctx).LT = match(LT);
							setState(594);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.LT);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).LT!=null?((ExpressionContext)_localctx).LT.getLine():0));
							}
							break;
						case GT:
							{
							setState(597);
							((ExpressionContext)_localctx).GT = match(GT);
							setState(598);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.GT);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).GT!=null?((ExpressionContext)_localctx).GT.getLine():0));
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(603);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(612);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQ:
							{
							setState(604);
							((ExpressionContext)_localctx).EQ = match(EQ);
							setState(605);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.EQ);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).EQ!=null?((ExpressionContext)_localctx).EQ.getLine():0));
							}
							break;
						case NEQ:
							{
							setState(608);
							((ExpressionContext)_localctx).NEQ = match(NEQ);
							setState(609);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.NEQ);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).NEQ!=null?((ExpressionContext)_localctx).NEQ.getLine():0));
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(627);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BIT_AND:
							{
							setState(615);
							((ExpressionContext)_localctx).BIT_AND = match(BIT_AND);
							setState(616);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.BIT_AND);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).BIT_AND!=null?((ExpressionContext)_localctx).BIT_AND.getLine():0));
							}
							break;
						case BIT_OR:
							{
							setState(619);
							((ExpressionContext)_localctx).BIT_OR = match(BIT_OR);
							setState(620);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.BIT_OR);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).BIT_OR!=null?((ExpressionContext)_localctx).BIT_OR.getLine():0));
							}
							break;
						case BIT_XOR:
							{
							setState(623);
							((ExpressionContext)_localctx).BIT_XOR = match(BIT_XOR);
							setState(624);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e2.expressionRet,BinaryOperator.BIT_XOR);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).BIT_XOR!=null?((ExpressionContext)_localctx).BIT_XOR.getLine():0));
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public Token INT_LITERAL;
		public Token FLOAT_LITERAL;
		public Token STRING_LITERAL;
		public Token SELL;
		public Token BUY;
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(UTLParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(UTLParser.STRING_LITERAL, 0); }
		public TerminalNode SELL() { return getToken(UTLParser.SELL, 0); }
		public TerminalNode BUY() { return getToken(UTLParser.BUY, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				((ValueContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				((ValueContext)_localctx).valueRet =  new IntValue(Integer.parseInt((((ValueContext)_localctx).INT_LITERAL!=null?((ValueContext)_localctx).INT_LITERAL.getText():null))); _localctx.valueRet.setLine((((ValueContext)_localctx).INT_LITERAL!=null?((ValueContext)_localctx).INT_LITERAL.getLine():0));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				((ValueContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((ValueContext)_localctx).valueRet =  new FloatValue(Float.parseFloat((((ValueContext)_localctx).FLOAT_LITERAL!=null?((ValueContext)_localctx).FLOAT_LITERAL.getText():null))); _localctx.valueRet.setLine((((ValueContext)_localctx).FLOAT_LITERAL!=null?((ValueContext)_localctx).FLOAT_LITERAL.getLine():0));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				((ValueContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((ValueContext)_localctx).valueRet =  new StringValue((((ValueContext)_localctx).STRING_LITERAL!=null?((ValueContext)_localctx).STRING_LITERAL.getText():null)); _localctx.valueRet.setLine((((ValueContext)_localctx).STRING_LITERAL!=null?((ValueContext)_localctx).STRING_LITERAL.getLine():0));
				}
				break;
			case SELL:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				((ValueContext)_localctx).SELL = match(SELL);
				((ValueContext)_localctx).valueRet =  new BoolValue(true); _localctx.valueRet.setLine((((ValueContext)_localctx).SELL!=null?((ValueContext)_localctx).SELL.getLine():0));
				}
				break;
			case BUY:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				((ValueContext)_localctx).BUY = match(BUY);
				((ValueContext)_localctx).valueRet =  new BoolValue(false); _localctx.valueRet.setLine((((ValueContext)_localctx).BUY!=null?((ValueContext)_localctx).BUY.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type typeRet;
		public Token FLOAT;
		public Token DOUBLE;
		public Token INT;
		public Token BOOL;
		public Token STRING;
		public Token VOID;
		public TerminalNode FLOAT() { return getToken(UTLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(UTLParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(UTLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(UTLParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(UTLParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitiveType);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				((PrimitiveTypeContext)_localctx).FLOAT = match(FLOAT);
				((PrimitiveTypeContext)_localctx).typeRet =  new FloatType(); _localctx.typeRet.setLine((((PrimitiveTypeContext)_localctx).FLOAT!=null?((PrimitiveTypeContext)_localctx).FLOAT.getLine():0));
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				((PrimitiveTypeContext)_localctx).DOUBLE = match(DOUBLE);
				((PrimitiveTypeContext)_localctx).typeRet =  new DoubleType(); _localctx.typeRet.setLine((((PrimitiveTypeContext)_localctx).DOUBLE!=null?((PrimitiveTypeContext)_localctx).DOUBLE.getLine():0));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				((PrimitiveTypeContext)_localctx).INT = match(INT);
				((PrimitiveTypeContext)_localctx).typeRet =  new IntType();   _localctx.typeRet.setLine((((PrimitiveTypeContext)_localctx).INT!=null?((PrimitiveTypeContext)_localctx).INT.getLine():0));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(652);
				((PrimitiveTypeContext)_localctx).BOOL = match(BOOL);
				((PrimitiveTypeContext)_localctx).typeRet =  new BoolType();  _localctx.typeRet.setLine((((PrimitiveTypeContext)_localctx).BOOL!=null?((PrimitiveTypeContext)_localctx).BOOL.getLine():0));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(654);
				((PrimitiveTypeContext)_localctx).STRING = match(STRING);
				((PrimitiveTypeContext)_localctx).typeRet =  new StringType();_localctx.typeRet.setLine((((PrimitiveTypeContext)_localctx).STRING!=null?((PrimitiveTypeContext)_localctx).STRING.getLine():0));
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 6);
				{
				setState(656);
				((PrimitiveTypeContext)_localctx).VOID = match(VOID);
				((PrimitiveTypeContext)_localctx).typeRet =  new VoidType();   _localctx.typeRet.setLine((((PrimitiveTypeContext)_localctx).VOID!=null?((PrimitiveTypeContext)_localctx).VOID.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexTypeContext extends ParserRuleContext {
		public Type typeRet;
		public Token ORDER;
		public Token TRADE;
		public Token CANDLE;
		public Token EXCEPTION;
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_complexType);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				((ComplexTypeContext)_localctx).ORDER = match(ORDER);
				((ComplexTypeContext)_localctx).typeRet =  new OrderType(); _localctx.typeRet.setLine((((ComplexTypeContext)_localctx).ORDER!=null?((ComplexTypeContext)_localctx).ORDER.getLine():0));
				}
				break;
			case TRADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				((ComplexTypeContext)_localctx).TRADE = match(TRADE);
				((ComplexTypeContext)_localctx).typeRet =  new TradeType(); _localctx.typeRet.setLine((((ComplexTypeContext)_localctx).TRADE!=null?((ComplexTypeContext)_localctx).TRADE.getLine():0));
				}
				break;
			case CANDLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				((ComplexTypeContext)_localctx).CANDLE = match(CANDLE);
				((ComplexTypeContext)_localctx).typeRet =  new CandleType(); _localctx.typeRet.setLine((((ComplexTypeContext)_localctx).CANDLE!=null?((ComplexTypeContext)_localctx).CANDLE.getLine():0));
				}
				break;
			case EXCEPTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(666);
				((ComplexTypeContext)_localctx).EXCEPTION = match(EXCEPTION);
				((ComplexTypeContext)_localctx).typeRet =  new ExceptionType(); _localctx.typeRet.setLine((((ComplexTypeContext)_localctx).EXCEPTION!=null?((ComplexTypeContext)_localctx).EXCEPTION.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllTypeContext extends ParserRuleContext {
		public Type allTypeRet;
		public PrimitiveTypeContext primitiveType;
		public ComplexTypeContext complexType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public AllTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAllType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAllType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAllType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllTypeContext allType() throws RecognitionException {
		AllTypeContext _localctx = new AllTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_allType);
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				((AllTypeContext)_localctx).primitiveType = primitiveType();
				((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).primitiveType.typeRet;_localctx.allTypeRet.setLine(((AllTypeContext)_localctx).primitiveType.typeRet.getLine());
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				((AllTypeContext)_localctx).complexType = complexType();
				((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).complexType.typeRet;_localctx.allTypeRet.setLine(((AllTypeContext)_localctx).complexType.typeRet.getLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexTypeIdentifierContext extends ParserRuleContext {
		public Identifier typeIdenRet;
		public Token nam;
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public ComplexTypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexTypeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterComplexTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitComplexTypeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitComplexTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeIdentifierContext complexTypeIdentifier() throws RecognitionException {
		ComplexTypeIdentifierContext _localctx = new ComplexTypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_complexTypeIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			((ComplexTypeIdentifierContext)_localctx).nam = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 15L) != 0)) ) {
				((ComplexTypeIdentifierContext)_localctx).nam = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((ComplexTypeIdentifierContext)_localctx).typeIdenRet =  new Identifier((((ComplexTypeIdentifierContext)_localctx).nam!=null?((ComplexTypeIdentifierContext)_localctx).nam.getText():null));_localctx.typeIdenRet.setLine((((ComplexTypeIdentifierContext)_localctx).nam!=null?((ComplexTypeIdentifierContext)_localctx).nam.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspetialFunctionContext extends ParserRuleContext {
		public Identifier espetialFunctionRet;
		public Token nam;
		public TerminalNode REFRESH_RATE() { return getToken(UTLParser.REFRESH_RATE, 0); }
		public TerminalNode CONNECT() { return getToken(UTLParser.CONNECT, 0); }
		public TerminalNode OBSERVE() { return getToken(UTLParser.OBSERVE, 0); }
		public TerminalNode GET_CANDLE() { return getToken(UTLParser.GET_CANDLE, 0); }
		public TerminalNode TERMINATE() { return getToken(UTLParser.TERMINATE, 0); }
		public TerminalNode PRINT() { return getToken(UTLParser.PRINT, 0); }
		public EspetialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialFunctionContext espetialFunction() throws RecognitionException {
		EspetialFunctionContext _localctx = new EspetialFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_espetialFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			((EspetialFunctionContext)_localctx).nam = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 63L) != 0)) ) {
				((EspetialFunctionContext)_localctx).nam = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((EspetialFunctionContext)_localctx).espetialFunctionRet =  new Identifier((((EspetialFunctionContext)_localctx).nam!=null?((EspetialFunctionContext)_localctx).nam.getText():null)); _localctx.espetialFunctionRet.setLine((((EspetialFunctionContext)_localctx).nam!=null?((EspetialFunctionContext)_localctx).nam.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspetialVariableContext extends ParserRuleContext {
		public Identifier espetialVariableRet;
		public Token nam;
		public TerminalNode ASK() { return getToken(UTLParser.ASK, 0); }
		public TerminalNode BID() { return getToken(UTLParser.BID, 0); }
		public TerminalNode TIME() { return getToken(UTLParser.TIME, 0); }
		public TerminalNode HIGH() { return getToken(UTLParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(UTLParser.LOW, 0); }
		public TerminalNode DIGITS() { return getToken(UTLParser.DIGITS, 0); }
		public TerminalNode VOLUME() { return getToken(UTLParser.VOLUME, 0); }
		public TerminalNode TYPE() { return getToken(UTLParser.TYPE, 0); }
		public TerminalNode TEXT() { return getToken(UTLParser.TEXT, 0); }
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public EspetialVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialVariableContext espetialVariable() throws RecognitionException {
		EspetialVariableContext _localctx = new EspetialVariableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_espetialVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			((EspetialVariableContext)_localctx).nam = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 2047L) != 0)) ) {
				((EspetialVariableContext)_localctx).nam = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).nam!=null?((EspetialVariableContext)_localctx).nam.getText():null)); _localctx.espetialVariableRet.setLine((((EspetialVariableContext)_localctx).nam!=null?((EspetialVariableContext)_localctx).nam.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspetialMethodContext extends ParserRuleContext {
		public Identifier espetialMethodRet;
		public Token nam;
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public EspetialMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialMethodContext espetialMethod() throws RecognitionException {
		EspetialMethodContext _localctx = new EspetialMethodContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_espetialMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			((EspetialMethodContext)_localctx).nam = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==OPEN || _la==CLOSE) ) {
				((EspetialMethodContext)_localctx).nam = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((EspetialMethodContext)_localctx).espetialMethodRet =  new Identifier((((EspetialMethodContext)_localctx).nam!=null?((EspetialMethodContext)_localctx).nam.getText():null)); _localctx.espetialMethodRet.setLine((((EspetialMethodContext)_localctx).nam!=null?((EspetialMethodContext)_localctx).nam.getLine():0)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Identifier assignRet;
		public Token nam;
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(UTLParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(UTLParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(UTLParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(UTLParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(UTLParser.MOD_ASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			((AssignContext)_localctx).nam = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
				((AssignContext)_localctx).nam = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((AssignContext)_localctx).assignRet =  new Identifier((((AssignContext)_localctx).nam!=null?((AssignContext)_localctx).nam.getText():null)); _localctx.assignRet.setLine((((AssignContext)_localctx).nam!=null?((AssignContext)_localctx).nam.getLine():0)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token ID;
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			((IdentifierContext)_localctx).ID = match(ID);
			 ((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).ID!=null?((IdentifierContext)_localctx).ID.getText():null)); _localctx.identifierRet.setLine((((IdentifierContext)_localctx).ID!=null?((IdentifierContext)_localctx).ID.getLine():0)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001T\u02b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001p\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002y\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0081\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u008f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0098\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u009d\b\u0003\n\u0003"+
		"\f\u0003\u00a0\t\u0003\u0003\u0003\u00a2\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00a7\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00ad\b\u0003\n\u0003\f\u0003\u00b0\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b6\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00c2\b\u0004\n"+
		"\u0004\f\u0004\u00c5\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00cb\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00d7\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00de\b\u0005\n\u0005\f\u0005\u00e1\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e7\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f3\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00fa\b\u0006\n\u0006\f\u0006\u00fd\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0103\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u010d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u011f\b\b\n\b\f\b\u0122\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0128\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u012f\b\b\n\b\f\b\u0132\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u0138\b\b\u0003\b\u013a\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0146\b\t\n"+
		"\t\f\t\u0149\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u014f\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u015d\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0164\b\n\n\n\f\n\u0167\t\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u016d\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0176\b\u000b\n\u000b\f\u000b"+
		"\u0179\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u017f\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0189\b\u000b\n\u000b"+
		"\f\u000b\u018c\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0192\b\u000b\u0003\u000b\u0194\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u019b\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u01b4\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u01bd\b\u000f\n\u000f\f\u000f\u01c0"+
		"\t\u000f\u0003\u000f\u01c2\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u01ce\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u01da\b\u0010\n\u0010\f\u0010\u01dd\t\u0010\u0003"+
		"\u0010\u01df\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01fb\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0205\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0214"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u022a\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0239\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0244"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u024f\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u025a\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0265\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0274"+
		"\b\u0011\u0005\u0011\u0276\b\u0011\n\u0011\f\u0011\u0279\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0285\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0293\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u029d\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u02a5\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0000\u0001\"\u001c\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0246\u0000\u0005\u0001\u0000FI\u0001\u0000JO\u0001\u0000;E\u0001\u0000"+
		"DE\u0001\u0000 %\u02fd\u00008\u0001\u0000\u0000\u0000\u0002o\u0001\u0000"+
		"\u0000\u0000\u0004q\u0001\u0000\u0000\u0000\u0006\u0084\u0001\u0000\u0000"+
		"\u0000\b\u00b7\u0001\u0000\u0000\u0000\n\u00cc\u0001\u0000\u0000\u0000"+
		"\f\u00e8\u0001\u0000\u0000\u0000\u000e\u0104\u0001\u0000\u0000\u0000\u0010"+
		"\u0114\u0001\u0000\u0000\u0000\u0012\u013b\u0001\u0000\u0000\u0000\u0014"+
		"\u0150\u0001\u0000\u0000\u0000\u0016\u016e\u0001\u0000\u0000\u0000\u0018"+
		"\u0195\u0001\u0000\u0000\u0000\u001a\u019e\u0001\u0000\u0000\u0000\u001c"+
		"\u01a4\u0001\u0000\u0000\u0000\u001e\u01b3\u0001\u0000\u0000\u0000 \u01c5"+
		"\u0001\u0000\u0000\u0000\"\u0213\u0001\u0000\u0000\u0000$\u0284\u0001"+
		"\u0000\u0000\u0000&\u0292\u0001\u0000\u0000\u0000(\u029c\u0001\u0000\u0000"+
		"\u0000*\u02a4\u0001\u0000\u0000\u0000,\u02a6\u0001\u0000\u0000\u0000."+
		"\u02a9\u0001\u0000\u0000\u00000\u02ac\u0001\u0000\u0000\u00002\u02af\u0001"+
		"\u0000\u0000\u00004\u02b2\u0001\u0000\u0000\u00006\u02b5\u0001\u0000\u0000"+
		"\u00008G\u0006\u0000\uffff\uffff\u00009:\u0003\u0004\u0002\u0000:;\u0006"+
		"\u0000\uffff\uffff\u0000;F\u0001\u0000\u0000\u0000<=\u0003\u0006\u0003"+
		"\u0000=>\u0006\u0000\uffff\uffff\u0000>F\u0001\u0000\u0000\u0000?@\u0003"+
		"\n\u0005\u0000@A\u0006\u0000\uffff\uffff\u0000AF\u0001\u0000\u0000\u0000"+
		"BC\u0003\f\u0006\u0000CD\u0006\u0000\uffff\uffff\u0000DF\u0001\u0000\u0000"+
		"\u0000E9\u0001\u0000\u0000\u0000E<\u0001\u0000\u0000\u0000E?\u0001\u0000"+
		"\u0000\u0000EB\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000JK\u0003\b\u0004\u0000KL\u0006\u0000\uffff\uffff"+
		"\u0000L\u0001\u0001\u0000\u0000\u0000MN\u0003\u0004\u0002\u0000NO\u0006"+
		"\u0001\uffff\uffff\u0000Op\u0001\u0000\u0000\u0000PQ\u0003\u0006\u0003"+
		"\u0000QR\u0006\u0001\uffff\uffff\u0000Rp\u0001\u0000\u0000\u0000ST\u0003"+
		"\u000e\u0007\u0000TU\u0006\u0001\uffff\uffff\u0000Up\u0001\u0000\u0000"+
		"\u0000VW\u0003\u0018\f\u0000WX\u0006\u0001\uffff\uffff\u0000Xp\u0001\u0000"+
		"\u0000\u0000YZ\u0003\u001a\r\u0000Z[\u0006\u0001\uffff\uffff\u0000[p\u0001"+
		"\u0000\u0000\u0000\\]\u0003\u0010\b\u0000]^\u0006\u0001\uffff\uffff\u0000"+
		"^p\u0001\u0000\u0000\u0000_`\u0003\u0012\t\u0000`a\u0006\u0001\uffff\uffff"+
		"\u0000ap\u0001\u0000\u0000\u0000bc\u0003\u0014\n\u0000cd\u0006\u0001\uffff"+
		"\uffff\u0000dp\u0001\u0000\u0000\u0000ef\u0003\u0016\u000b\u0000fg\u0006"+
		"\u0001\uffff\uffff\u0000gp\u0001\u0000\u0000\u0000hi\u0003\u001c\u000e"+
		"\u0000ij\u0006\u0001\uffff\uffff\u0000jp\u0001\u0000\u0000\u0000kl\u0003"+
		"\"\u0011\u0000lm\u0005\u0002\u0000\u0000mn\u0006\u0001\uffff\uffff\u0000"+
		"np\u0001\u0000\u0000\u0000oM\u0001\u0000\u0000\u0000oP\u0001\u0000\u0000"+
		"\u0000oS\u0001\u0000\u0000\u0000oV\u0001\u0000\u0000\u0000oY\u0001\u0000"+
		"\u0000\u0000o\\\u0001\u0000\u0000\u0000o_\u0001\u0000\u0000\u0000ob\u0001"+
		"\u0000\u0000\u0000oe\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000"+
		"ok\u0001\u0000\u0000\u0000p\u0003\u0001\u0000\u0000\u0000qr\u0006\u0002"+
		"\uffff\uffff\u0000rs\u0003*\u0015\u0000sx\u0006\u0002\uffff\uffff\u0000"+
		"tu\u0005\n\u0000\u0000uv\u0005Q\u0000\u0000vw\u0005\u000b\u0000\u0000"+
		"wy\u0006\u0002\uffff\uffff\u0000xt\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u00036\u001b\u0000{\u0080\u0006"+
		"\u0002\uffff\uffff\u0000|}\u0005 \u0000\u0000}~\u0003\"\u0011\u0000~\u007f"+
		"\u0006\u0002\uffff\uffff\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"|\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0002\u0000\u0000\u0083\u0005"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u0003\uffff\uffff\u0000\u0085"+
		"\u0086\u0003&\u0013\u0000\u0086\u0087\u0006\u0003\uffff\uffff\u0000\u0087"+
		"\u0088\u00036\u001b\u0000\u0088\u0089\u0006\u0003\uffff\uffff\u0000\u0089"+
		"\u00a1\u0005\u0006\u0000\u0000\u008a\u008e\u0003*\u0015\u0000\u008b\u008c"+
		"\u0005\n\u0000\u0000\u008c\u008d\u0005Q\u0000\u0000\u008d\u008f\u0005"+
		"\u000b\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0003"+
		"6\u001b\u0000\u0091\u009e\u0006\u0003\uffff\uffff\u0000\u0092\u0093\u0005"+
		"\u0003\u0000\u0000\u0093\u0097\u0003*\u0015\u0000\u0094\u0095\u0005\n"+
		"\u0000\u0000\u0095\u0096\u0005Q\u0000\u0000\u0096\u0098\u0005\u000b\u0000"+
		"\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u00036\u001b\u0000"+
		"\u009a\u009b\u0006\u0003\uffff\uffff\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u0092\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u008a\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6\u0005\u0007\u0000"+
		"\u0000\u00a4\u00a5\u0005\'\u0000\u0000\u00a5\u00a7\u0005I\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00b5\u0001\u0000\u0000\u0000\u00a8\u00ae\u0005\b\u0000\u0000\u00a9"+
		"\u00aa\u0003\u0002\u0001\u0000\u00aa\u00ab\u0006\u0003\uffff\uffff\u0000"+
		"\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b6\u0005\t\u0000\u0000\u00b2"+
		"\u00b3\u0003\u0002\u0001\u0000\u00b3\u00b4\u0006\u0003\uffff\uffff\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b6\u0007\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0006\u0004\uffff\uffff\u0000\u00b8\u00b9\u00057\u0000\u0000"+
		"\u00b9\u00ba\u00050\u0000\u0000\u00ba\u00bb\u0006\u0004\uffff\uffff\u0000"+
		"\u00bb\u00bc\u0005\u0006\u0000\u0000\u00bc\u00ca\u0005\u0007\u0000\u0000"+
		"\u00bd\u00c3\u0005\b\u0000\u0000\u00be\u00bf\u0003\u0002\u0001\u0000\u00bf"+
		"\u00c0\u0006\u0004\uffff\uffff\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00cb\u0005\t\u0000\u0000\u00c7\u00c8\u0003\u0002\u0001\u0000\u00c8"+
		"\u00c9\u0006\u0004\uffff\uffff\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ca\u00bd\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000"+
		"\u00cb\t\u0001\u0000\u0000\u0000\u00cc\u00cd\u0006\u0005\uffff\uffff\u0000"+
		"\u00cd\u00ce\u00057\u0000\u0000\u00ce\u00cf\u00051\u0000\u0000\u00cf\u00d0"+
		"\u0006\u0005\uffff\uffff\u0000\u00d0\u00d1\u0005\u0006\u0000\u0000\u00d1"+
		"\u00d2\u0005F\u0000\u0000\u00d2\u00d3\u00036\u001b\u0000\u00d3\u00d6\u0005"+
		"\u0007\u0000\u0000\u00d4\u00d5\u0005\'\u0000\u0000\u00d5\u00d7\u0005I"+
		"\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00e6\u0006\u0005"+
		"\uffff\uffff\u0000\u00d9\u00df\u0005\b\u0000\u0000\u00da\u00db\u0003\u0002"+
		"\u0001\u0000\u00db\u00dc\u0006\u0005\uffff\uffff\u0000\u00dc\u00de\u0001"+
		"\u0000\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00de\u00e1\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00df\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e7\u0005\t\u0000\u0000\u00e3\u00e4\u0003\u0002"+
		"\u0001\u0000\u00e4\u00e5\u0006\u0005\uffff\uffff\u0000\u00e5\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e6\u00d9\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e7\u000b\u0001\u0000\u0000\u0000\u00e8\u00e9\u0006"+
		"\u0006\uffff\uffff\u0000\u00e9\u00ea\u00057\u0000\u0000\u00ea\u00eb\u0005"+
		"2\u0000\u0000\u00eb\u00ec\u0006\u0006\uffff\uffff\u0000\u00ec\u00ed\u0005"+
		"\u0006\u0000\u0000\u00ed\u00ee\u0005F\u0000\u0000\u00ee\u00ef\u00036\u001b"+
		"\u0000\u00ef\u00f2\u0005\u0007\u0000\u0000\u00f0\u00f1\u0005\'\u0000\u0000"+
		"\u00f1\u00f3\u0005I\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u0102\u0006\u0006\uffff\uffff\u0000\u00f5\u00fb\u0005\b\u0000\u0000\u00f6"+
		"\u00f7\u0003\u0002\u0001\u0000\u00f7\u00f8\u0006\u0006\uffff\uffff\u0000"+
		"\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0103\u0005\t\u0000\u0000\u00ff"+
		"\u0100\u0003\u0002\u0001\u0000\u0100\u0101\u0006\u0006\uffff\uffff\u0000"+
		"\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00f5\u0001\u0000\u0000\u0000"+
		"\u0102\u00ff\u0001\u0000\u0000\u0000\u0103\r\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0006\u0007\uffff\uffff\u0000\u0105\u0106\u00036\u001b\u0000\u0106"+
		"\u010c\u0006\u0007\uffff\uffff\u0000\u0107\u0108\u0005\n\u0000\u0000\u0108"+
		"\u0109\u0003\"\u0011\u0000\u0109\u010a\u0005\u000b\u0000\u0000\u010a\u010b"+
		"\u0006\u0007\uffff\uffff\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c"+
		"\u0107\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u00034\u001a\u0000\u010f\u0110"+
		"\u0006\u0007\uffff\uffff\u0000\u0110\u0111\u0003\"\u0011\u0000\u0111\u0112"+
		"\u0005\u0002\u0000\u0000\u0112\u0113\u0006\u0007\uffff\uffff\u0000\u0113"+
		"\u000f\u0001\u0000\u0000\u0000\u0114\u0115\u0005)\u0000\u0000\u0115\u0116"+
		"\u0006\b\uffff\uffff\u0000\u0116\u0117\u0005\u0006\u0000\u0000\u0117\u0118"+
		"\u0003\"\u0011\u0000\u0118\u0119\u0005\u0007\u0000\u0000\u0119\u0127\u0006"+
		"\b\uffff\uffff\u0000\u011a\u0120\u0005\b\u0000\u0000\u011b\u011c\u0003"+
		"\u0002\u0001\u0000\u011c\u011d\u0006\b\uffff\uffff\u0000\u011d\u011f\u0001"+
		"\u0000\u0000\u0000\u011e\u011b\u0001\u0000\u0000\u0000\u011f\u0122\u0001"+
		"\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0128\u0005\t\u0000\u0000\u0124\u0125\u0003\u0002"+
		"\u0001\u0000\u0125\u0126\u0006\b\uffff\uffff\u0000\u0126\u0128\u0001\u0000"+
		"\u0000\u0000\u0127\u011a\u0001\u0000\u0000\u0000\u0127\u0124\u0001\u0000"+
		"\u0000\u0000\u0128\u0139\u0001\u0000\u0000\u0000\u0129\u0137\u0005*\u0000"+
		"\u0000\u012a\u0130\u0005\b\u0000\u0000\u012b\u012c\u0003\u0002\u0001\u0000"+
		"\u012c\u012d\u0006\b\uffff\uffff\u0000\u012d\u012f\u0001\u0000\u0000\u0000"+
		"\u012e\u012b\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0138\u0005\t\u0000\u0000\u0134\u0135\u0003\u0002\u0001\u0000\u0135"+
		"\u0136\u0006\b\uffff\uffff\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137"+
		"\u012a\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0138"+
		"\u013a\u0001\u0000\u0000\u0000\u0139\u0129\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a\u0011\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005,\u0000\u0000\u013c\u013d\u0006\t\uffff\uffff\u0000\u013d"+
		"\u013e\u0005\u0006\u0000\u0000\u013e\u013f\u0003\"\u0011\u0000\u013f\u0140"+
		"\u0005\u0007\u0000\u0000\u0140\u014e\u0006\t\uffff\uffff\u0000\u0141\u0147"+
		"\u0005\b\u0000\u0000\u0142\u0143\u0003\u0002\u0001\u0000\u0143\u0144\u0006"+
		"\t\uffff\uffff\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0142\u0001"+
		"\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001"+
		"\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014f\u0005"+
		"\t\u0000\u0000\u014b\u014c\u0003\u0002\u0001\u0000\u014c\u014d\u0006\t"+
		"\uffff\uffff\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0141\u0001"+
		"\u0000\u0000\u0000\u014e\u014b\u0001\u0000\u0000\u0000\u014f\u0013\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0006\n\uffff\uffff\u0000\u0151\u0152\u0005"+
		"+\u0000\u0000\u0152\u0153\u0006\n\uffff\uffff\u0000\u0153\u0154\u0005"+
		"\u0006\u0000\u0000\u0154\u0155\u0003\u0002\u0001\u0000\u0155\u0156\u0006"+
		"\n\uffff\uffff\u0000\u0156\u0157\u0003\"\u0011\u0000\u0157\u0158\u0005"+
		"\u0002\u0000\u0000\u0158\u015c\u0006\n\uffff\uffff\u0000\u0159\u015a\u0003"+
		"\"\u0011\u0000\u015a\u015b\u0006\n\uffff\uffff\u0000\u015b\u015d\u0001"+
		"\u0000\u0000\u0000\u015c\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u016c\u0005"+
		"\u0007\u0000\u0000\u015f\u0165\u0005\b\u0000\u0000\u0160\u0161\u0003\u0002"+
		"\u0001\u0000\u0161\u0162\u0006\n\uffff\uffff\u0000\u0162\u0164\u0001\u0000"+
		"\u0000\u0000\u0163\u0160\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000"+
		"\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000"+
		"\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0168\u016d\u0005\t\u0000\u0000\u0169\u016a\u0003\u0002\u0001"+
		"\u0000\u016a\u016b\u0006\n\uffff\uffff\u0000\u016b\u016d\u0001\u0000\u0000"+
		"\u0000\u016c\u015f\u0001\u0000\u0000\u0000\u016c\u0169\u0001\u0000\u0000"+
		"\u0000\u016d\u0015\u0001\u0000\u0000\u0000\u016e\u016f\u0006\u000b\uffff"+
		"\uffff\u0000\u016f\u0170\u0005&\u0000\u0000\u0170\u017e\u0006\u000b\uffff"+
		"\uffff\u0000\u0171\u0177\u0005\b\u0000\u0000\u0172\u0173\u0003\u0002\u0001"+
		"\u0000\u0173\u0174\u0006\u000b\uffff\uffff\u0000\u0174\u0176\u0001\u0000"+
		"\u0000\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\u017f\u0005\t\u0000\u0000\u017b\u017c\u0003\u0002\u0001"+
		"\u0000\u017c\u017d\u0006\u000b\uffff\uffff\u0000\u017d\u017f\u0001\u0000"+
		"\u0000\u0000\u017e\u0171\u0001\u0000\u0000\u0000\u017e\u017b\u0001\u0000"+
		"\u0000\u0000\u017f\u0193\u0001\u0000\u0000\u0000\u0180\u0181\u0005(\u0000"+
		"\u0000\u0181\u0182\u0005I\u0000\u0000\u0182\u0183\u00036\u001b\u0000\u0183"+
		"\u0191\u0006\u000b\uffff\uffff\u0000\u0184\u018a\u0005\b\u0000\u0000\u0185"+
		"\u0186\u0003\u0002\u0001\u0000\u0186\u0187\u0006\u000b\uffff\uffff\u0000"+
		"\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0185\u0001\u0000\u0000\u0000"+
		"\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000"+
		"\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u0192\u0005\t\u0000\u0000\u018e"+
		"\u018f\u0003\u0002\u0001\u0000\u018f\u0190\u0006\u000b\uffff\uffff\u0000"+
		"\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u0184\u0001\u0000\u0000\u0000"+
		"\u0191\u018e\u0001\u0000\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000"+
		"\u0193\u0180\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000"+
		"\u0194\u0017\u0001\u0000\u0000\u0000\u0195\u019a\u0006\f\uffff\uffff\u0000"+
		"\u0196\u0197\u0005-\u0000\u0000\u0197\u019b\u0006\f\uffff\uffff\u0000"+
		"\u0198\u0199\u0005.\u0000\u0000\u0199\u019b\u0006\f\uffff\uffff\u0000"+
		"\u019a\u0196\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u0002\u0000\u0000"+
		"\u019d\u0019\u0001\u0000\u0000\u0000\u019e\u019f\u0005/\u0000\u0000\u019f"+
		"\u01a0\u0006\r\uffff\uffff\u0000\u01a0\u01a1\u0003\"\u0011\u0000\u01a1"+
		"\u01a2\u0005\u0002\u0000\u0000\u01a2\u01a3\u0006\r\uffff\uffff\u0000\u01a3"+
		"\u001b\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\'\u0000\u0000\u01a5\u01a6"+
		"\u0006\u000e\uffff\uffff\u0000\u01a6\u01a7\u0003\"\u0011\u0000\u01a7\u01a8"+
		"\u0006\u000e\uffff\uffff\u0000\u01a8\u01a9\u0005\u0002\u0000\u0000\u01a9"+
		"\u001d\u0001\u0000\u0000\u0000\u01aa\u01ab\u0003.\u0017\u0000\u01ab\u01ac"+
		"\u0006\u000f\uffff\uffff\u0000\u01ac\u01b4\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0003,\u0016\u0000\u01ae\u01af\u0006\u000f\uffff\uffff\u0000\u01af"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b0\u01b1\u00036\u001b\u0000\u01b1\u01b2"+
		"\u0006\u000f\uffff\uffff\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3"+
		"\u01aa\u0001\u0000\u0000\u0000\u01b3\u01ad\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5"+
		"\u01c1\u0005\u0006\u0000\u0000\u01b6\u01b7\u0003\"\u0011\u0000\u01b7\u01be"+
		"\u0006\u000f\uffff\uffff\u0000\u01b8\u01b9\u0005\u0003\u0000\u0000\u01b9"+
		"\u01ba\u0003\"\u0011\u0000\u01ba\u01bb\u0006\u000f\uffff\uffff\u0000\u01bb"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b8\u0001\u0000\u0000\u0000\u01bd"+
		"\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0"+
		"\u01be\u0001\u0000\u0000\u0000\u01c1\u01b6\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0005\u0007\u0000\u0000\u01c4\u001f\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0006\u0010\uffff\uffff\u0000\u01c6\u01c7\u00036\u001b\u0000\u01c7"+
		"\u01cd\u0006\u0010\uffff\uffff\u0000\u01c8\u01c9\u0005\n\u0000\u0000\u01c9"+
		"\u01ca\u0003\"\u0011\u0000\u01ca\u01cb\u0005\u000b\u0000\u0000\u01cb\u01cc"+
		"\u0006\u0010\uffff\uffff\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd"+
		"\u01c8\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0005\u0000\u0000\u01d0"+
		"\u01d1\u00032\u0019\u0000\u01d1\u01d2\u0006\u0010\uffff\uffff\u0000\u01d2"+
		"\u01de\u0005\u0006\u0000\u0000\u01d3\u01d4\u0003\"\u0011\u0000\u01d4\u01db"+
		"\u0006\u0010\uffff\uffff\u0000\u01d5\u01d6\u0005\u0003\u0000\u0000\u01d6"+
		"\u01d7\u0003\"\u0011\u0000\u01d7\u01d8\u0006\u0010\uffff\uffff\u0000\u01d8"+
		"\u01da\u0001\u0000\u0000\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000\u01da"+
		"\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd"+
		"\u01db\u0001\u0000\u0000\u0000\u01de\u01d3\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0005\u0007\u0000\u0000\u01e1!\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0006\u0011\uffff\uffff\u0000\u01e3\u01e4\u0003$\u0012\u0000\u01e4\u01e5"+
		"\u0006\u0011\uffff\uffff\u0000\u01e5\u0214\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0005\u0013\u0000\u0000\u01e7\u01e8\u0003\"\u0011\u0000\u01e8\u01e9"+
		"\u0006\u0011\uffff\uffff\u0000\u01e9\u01fb\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0005\r\u0000\u0000\u01eb\u01ec\u0003\"\u0011\u0000\u01ec\u01ed"+
		"\u0006\u0011\uffff\uffff\u0000\u01ed\u01fb\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ef\u0005\u0019\u0000\u0000\u01ef\u01f0\u0003\"\u0011\u0000\u01f0\u01f1"+
		"\u0006\u0011\uffff\uffff\u0000\u01f1\u01fb\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0005\u001e\u0000\u0000\u01f3\u01f4\u0003\"\u0011\u0000\u01f4\u01f5"+
		"\u0006\u0011\uffff\uffff\u0000\u01f5\u01fb\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0005\u001f\u0000\u0000\u01f7\u01f8\u0003\"\u0011\u0000\u01f8\u01f9"+
		"\u0006\u0011\uffff\uffff\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa"+
		"\u01e6\u0001\u0000\u0000\u0000\u01fa\u01ea\u0001\u0000\u0000\u0000\u01fa"+
		"\u01ee\u0001\u0000\u0000\u0000\u01fa\u01f2\u0001\u0000\u0000\u0000\u01fa"+
		"\u01f6\u0001\u0000\u0000\u0000\u01fb\u0214\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0006\u0011\uffff\uffff\u0000\u01fd\u01fe\u00036\u001b\u0000\u01fe"+
		"\u0204\u0006\u0011\uffff\uffff\u0000\u01ff\u0200\u0005\n\u0000\u0000\u0200"+
		"\u0201\u0003\"\u0011\u0000\u0201\u0202\u0005\u000b\u0000\u0000\u0202\u0203"+
		"\u0006\u0011\uffff\uffff\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204"+
		"\u01ff\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0006\u0011\uffff\uffff\u0000"+
		"\u0207\u0214\u0001\u0000\u0000\u0000\u0208\u0209\u0005\u0006\u0000\u0000"+
		"\u0209\u020a\u0003\"\u0011\u0000\u020a\u020b\u0005\u0007\u0000\u0000\u020b"+
		"\u020c\u0006\u0011\uffff\uffff\u0000\u020c\u0214\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0003\u001e\u000f\u0000\u020e\u020f\u0006\u0011\uffff\uffff"+
		"\u0000\u020f\u0214\u0001\u0000\u0000\u0000\u0210\u0211\u0003 \u0010\u0000"+
		"\u0211\u0212\u0006\u0011\uffff\uffff\u0000\u0212\u0214\u0001\u0000\u0000"+
		"\u0000\u0213\u01e2\u0001\u0000\u0000\u0000\u0213\u01fa\u0001\u0000\u0000"+
		"\u0000\u0213\u01fc\u0001\u0000\u0000\u0000\u0213\u0208\u0001\u0000\u0000"+
		"\u0000\u0213\u020d\u0001\u0000\u0000\u0000\u0213\u0210\u0001\u0000\u0000"+
		"\u0000\u0214\u0277\u0001\u0000\u0000\u0000\u0215\u0216\n\u0006\u0000\u0000"+
		"\u0216\u0217\u0005\u0011\u0000\u0000\u0217\u0218\u0003\"\u0011\u0007\u0218"+
		"\u0219\u0006\u0011\uffff\uffff\u0000\u0219\u0276\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\n\u0005\u0000\u0000\u021b\u021c\u0005\u0012\u0000\u0000\u021c"+
		"\u021d\u0003\"\u0011\u0006\u021d\u021e\u0006\u0011\uffff\uffff\u0000\u021e"+
		"\u0276\u0001\u0000\u0000\u0000\u021f\u0220\n\u000f\u0000\u0000\u0220\u0221"+
		"\u0005\u0005\u0000\u0000\u0221\u0222\u00030\u0018\u0000\u0222\u0223\u0006"+
		"\u0011\uffff\uffff\u0000\u0223\u0276\u0001\u0000\u0000\u0000\u0224\u0229"+
		"\n\u000e\u0000\u0000\u0225\u0226\u0005\u001e\u0000\u0000\u0226\u022a\u0006"+
		"\u0011\uffff\uffff\u0000\u0227\u0228\u0005\u001f\u0000\u0000\u0228\u022a"+
		"\u0006\u0011\uffff\uffff\u0000\u0229\u0225\u0001\u0000\u0000\u0000\u0229"+
		"\u0227\u0001\u0000\u0000\u0000\u022a\u0276\u0001\u0000\u0000\u0000\u022b"+
		"\u0238\n\f\u0000\u0000\u022c\u022d\u0005\u000e\u0000\u0000\u022d\u022e"+
		"\u0003\"\u0011\u0000\u022e\u022f\u0006\u0011\uffff\uffff\u0000\u022f\u0239"+
		"\u0001\u0000\u0000\u0000\u0230\u0231\u0005\u000f\u0000\u0000\u0231\u0232"+
		"\u0003\"\u0011\u0000\u0232\u0233\u0006\u0011\uffff\uffff\u0000\u0233\u0239"+
		"\u0001\u0000\u0000\u0000\u0234\u0235\u0005\u0010\u0000\u0000\u0235\u0236"+
		"\u0003\"\u0011\u0000\u0236\u0237\u0006\u0011\uffff\uffff\u0000\u0237\u0239"+
		"\u0001\u0000\u0000\u0000\u0238\u022c\u0001\u0000\u0000\u0000\u0238\u0230"+
		"\u0001\u0000\u0000\u0000\u0238\u0234\u0001\u0000\u0000\u0000\u0239\u0276"+
		"\u0001\u0000\u0000\u0000\u023a\u0243\n\u000b\u0000\u0000\u023b\u023c\u0005"+
		"\f\u0000\u0000\u023c\u023d\u0003\"\u0011\u0000\u023d\u023e\u0006\u0011"+
		"\uffff\uffff\u0000\u023e\u0244\u0001\u0000\u0000\u0000\u023f\u0240\u0005"+
		"\r\u0000\u0000\u0240\u0241\u0003\"\u0011\u0000\u0241\u0242\u0006\u0011"+
		"\uffff\uffff\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u023b\u0001"+
		"\u0000\u0000\u0000\u0243\u023f\u0001\u0000\u0000\u0000\u0244\u0276\u0001"+
		"\u0000\u0000\u0000\u0245\u024e\n\n\u0000\u0000\u0246\u0247\u0005\u0017"+
		"\u0000\u0000\u0247\u0248\u0003\"\u0011\u0000\u0248\u0249\u0006\u0011\uffff"+
		"\uffff\u0000\u0249\u024f\u0001\u0000\u0000\u0000\u024a\u024b\u0005\u0018"+
		"\u0000\u0000\u024b\u024c\u0003\"\u0011\u0000\u024c\u024d\u0006\u0011\uffff"+
		"\uffff\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u0246\u0001\u0000"+
		"\u0000\u0000\u024e\u024a\u0001\u0000\u0000\u0000\u024f\u0276\u0001\u0000"+
		"\u0000\u0000\u0250\u0259\n\t\u0000\u0000\u0251\u0252\u0005\u001a\u0000"+
		"\u0000\u0252\u0253\u0003\"\u0011\u0000\u0253\u0254\u0006\u0011\uffff\uffff"+
		"\u0000\u0254\u025a\u0001\u0000\u0000\u0000\u0255\u0256\u0005\u001b\u0000"+
		"\u0000\u0256\u0257\u0003\"\u0011\u0000\u0257\u0258\u0006\u0011\uffff\uffff"+
		"\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0251\u0001\u0000\u0000"+
		"\u0000\u0259\u0255\u0001\u0000\u0000\u0000\u025a\u0276\u0001\u0000\u0000"+
		"\u0000\u025b\u0264\n\b\u0000\u0000\u025c\u025d\u0005\u001c\u0000\u0000"+
		"\u025d\u025e\u0003\"\u0011\u0000\u025e\u025f\u0006\u0011\uffff\uffff\u0000"+
		"\u025f\u0265\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u001d\u0000\u0000"+
		"\u0261\u0262\u0003\"\u0011\u0000\u0262\u0263\u0006\u0011\uffff\uffff\u0000"+
		"\u0263\u0265\u0001\u0000\u0000\u0000\u0264\u025c\u0001\u0000\u0000\u0000"+
		"\u0264\u0260\u0001\u0000\u0000\u0000\u0265\u0276\u0001\u0000\u0000\u0000"+
		"\u0266\u0273\n\u0007\u0000\u0000\u0267\u0268\u0005\u0014\u0000\u0000\u0268"+
		"\u0269\u0003\"\u0011\u0000\u0269\u026a\u0006\u0011\uffff\uffff\u0000\u026a"+
		"\u0274\u0001\u0000\u0000\u0000\u026b\u026c\u0005\u0015\u0000\u0000\u026c"+
		"\u026d\u0003\"\u0011\u0000\u026d\u026e\u0006\u0011\uffff\uffff\u0000\u026e"+
		"\u0274\u0001\u0000\u0000\u0000\u026f\u0270\u0005\u0016\u0000\u0000\u0270"+
		"\u0271\u0003\"\u0011\u0000\u0271\u0272\u0006\u0011\uffff\uffff\u0000\u0272"+
		"\u0274\u0001\u0000\u0000\u0000\u0273\u0267\u0001\u0000\u0000\u0000\u0273"+
		"\u026b\u0001\u0000\u0000\u0000\u0273\u026f\u0001\u0000\u0000\u0000\u0274"+
		"\u0276\u0001\u0000\u0000\u0000\u0275\u0215\u0001\u0000\u0000\u0000\u0275"+
		"\u021a\u0001\u0000\u0000\u0000\u0275\u021f\u0001\u0000\u0000\u0000\u0275"+
		"\u0224\u0001\u0000\u0000\u0000\u0275\u022b\u0001\u0000\u0000\u0000\u0275"+
		"\u023a\u0001\u0000\u0000\u0000\u0275\u0245\u0001\u0000\u0000\u0000\u0275"+
		"\u0250\u0001\u0000\u0000\u0000\u0275\u025b\u0001\u0000\u0000\u0000\u0275"+
		"\u0266\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277"+
		"\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278"+
		"#\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\u0005Q\u0000\u0000\u027b\u0285\u0006\u0012\uffff\uffff\u0000\u027c\u027d"+
		"\u0005R\u0000\u0000\u027d\u0285\u0006\u0012\uffff\uffff\u0000\u027e\u027f"+
		"\u0005S\u0000\u0000\u027f\u0285\u0006\u0012\uffff\uffff\u0000\u0280\u0281"+
		"\u0005:\u0000\u0000\u0281\u0285\u0006\u0012\uffff\uffff\u0000\u0282\u0283"+
		"\u00059\u0000\u0000\u0283\u0285\u0006\u0012\uffff\uffff\u0000\u0284\u027a"+
		"\u0001\u0000\u0000\u0000\u0284\u027c\u0001\u0000\u0000\u0000\u0284\u027e"+
		"\u0001\u0000\u0000\u0000\u0284\u0280\u0001\u0000\u0000\u0000\u0284\u0282"+
		"\u0001\u0000\u0000\u0000\u0285%\u0001\u0000\u0000\u0000\u0286\u0287\u0005"+
		"3\u0000\u0000\u0287\u0293\u0006\u0013\uffff\uffff\u0000\u0288\u0289\u0005"+
		"4\u0000\u0000\u0289\u0293\u0006\u0013\uffff\uffff\u0000\u028a\u028b\u0005"+
		"8\u0000\u0000\u028b\u0293\u0006\u0013\uffff\uffff\u0000\u028c\u028d\u0005"+
		"6\u0000\u0000\u028d\u0293\u0006\u0013\uffff\uffff\u0000\u028e\u028f\u0005"+
		"5\u0000\u0000\u028f\u0293\u0006\u0013\uffff\uffff\u0000\u0290\u0291\u0005"+
		"7\u0000\u0000\u0291\u0293\u0006\u0013\uffff\uffff\u0000\u0292\u0286\u0001"+
		"\u0000\u0000\u0000\u0292\u0288\u0001\u0000\u0000\u0000\u0292\u028a\u0001"+
		"\u0000\u0000\u0000\u0292\u028c\u0001\u0000\u0000\u0000\u0292\u028e\u0001"+
		"\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\'\u0001\u0000"+
		"\u0000\u0000\u0294\u0295\u0005G\u0000\u0000\u0295\u029d\u0006\u0014\uffff"+
		"\uffff\u0000\u0296\u0297\u0005F\u0000\u0000\u0297\u029d\u0006\u0014\uffff"+
		"\uffff\u0000\u0298\u0299\u0005H\u0000\u0000\u0299\u029d\u0006\u0014\uffff"+
		"\uffff\u0000\u029a\u029b\u0005I\u0000\u0000\u029b\u029d\u0006\u0014\uffff"+
		"\uffff\u0000\u029c\u0294\u0001\u0000\u0000\u0000\u029c\u0296\u0001\u0000"+
		"\u0000\u0000\u029c\u0298\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000"+
		"\u0000\u0000\u029d)\u0001\u0000\u0000\u0000\u029e\u029f\u0003&\u0013\u0000"+
		"\u029f\u02a0\u0006\u0015\uffff\uffff\u0000\u02a0\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a2\u0003(\u0014\u0000\u02a2\u02a3\u0006\u0015\uffff\uffff"+
		"\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000\u02a4\u029e\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a1\u0001\u0000\u0000\u0000\u02a5+\u0001\u0000\u0000\u0000"+
		"\u02a6\u02a7\u0007\u0000\u0000\u0000\u02a7\u02a8\u0006\u0016\uffff\uffff"+
		"\u0000\u02a8-\u0001\u0000\u0000\u0000\u02a9\u02aa\u0007\u0001\u0000\u0000"+
		"\u02aa\u02ab\u0006\u0017\uffff\uffff\u0000\u02ab/\u0001\u0000\u0000\u0000"+
		"\u02ac\u02ad\u0007\u0002\u0000\u0000\u02ad\u02ae\u0006\u0018\uffff\uffff"+
		"\u0000\u02ae1\u0001\u0000\u0000\u0000\u02af\u02b0\u0007\u0003\u0000\u0000"+
		"\u02b0\u02b1\u0006\u0019\uffff\uffff\u0000\u02b13\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b3\u0007\u0004\u0000\u0000\u02b3\u02b4\u0006\u001a\uffff\uffff"+
		"\u0000\u02b45\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005P\u0000\u0000\u02b6"+
		"\u02b7\u0006\u001b\uffff\uffff\u0000\u02b77\u0001\u0000\u0000\u0000;E"+
		"Gox\u0080\u008e\u0097\u009e\u00a1\u00a6\u00ae\u00b5\u00c3\u00ca\u00d6"+
		"\u00df\u00e6\u00f2\u00fb\u0102\u010c\u0120\u0127\u0130\u0137\u0139\u0147"+
		"\u014e\u015c\u0165\u016c\u0177\u017e\u018a\u0191\u0193\u019a\u01b3\u01be"+
		"\u01c1\u01cd\u01db\u01de\u01fa\u0204\u0213\u0229\u0238\u0243\u024e\u0259"+
		"\u0264\u0273\u0275\u0277\u0284\u0292\u029c\u02a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}