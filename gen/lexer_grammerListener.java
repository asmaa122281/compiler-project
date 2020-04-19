// Generated from C:/Users/Nora/IdeaProjects/ass1/src\lexer_grammer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lexer_grammerParser}.
 */
public interface lexer_grammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(lexer_grammerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(lexer_grammerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDefinitionRule}
	 * labeled alternative in {@link lexer_grammerParser#classDefiniton}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinitionRule(lexer_grammerParser.ClassDefinitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDefinitionRule}
	 * labeled alternative in {@link lexer_grammerParser#classDefiniton}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinitionRule(lexer_grammerParser.ClassDefinitionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(lexer_grammerParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(lexer_grammerParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#featureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFeatureDefinition(lexer_grammerParser.FeatureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#featureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFeatureDefinition(lexer_grammerParser.FeatureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(lexer_grammerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(lexer_grammerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(lexer_grammerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(lexer_grammerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(lexer_grammerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(lexer_grammerParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmtRule(lexer_grammerParser.AssignmentStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmtRule(lexer_grammerParser.AssignmentStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code featureCallRule}
	 * labeled alternative in {@link lexer_grammerParser#featureCall}.
	 * @param ctx the parse tree
	 */
	void enterFeatureCallRule(lexer_grammerParser.FeatureCallRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code featureCallRule}
	 * labeled alternative in {@link lexer_grammerParser#featureCall}.
	 * @param ctx the parse tree
	 */
	void exitFeatureCallRule(lexer_grammerParser.FeatureCallRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(lexer_grammerParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(lexer_grammerParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtRule(lexer_grammerParser.IfStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtRule(lexer_grammerParser.IfStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmtRule(lexer_grammerParser.CaseStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmtRule(lexer_grammerParser.CaseStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(lexer_grammerParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(lexer_grammerParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmtRule(lexer_grammerParser.WhileStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmtRule(lexer_grammerParser.WhileStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(lexer_grammerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(lexer_grammerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObjectRule}
	 * labeled alternative in {@link lexer_grammerParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectRule(lexer_grammerParser.NewObjectRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObjectRule}
	 * labeled alternative in {@link lexer_grammerParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectRule(lexer_grammerParser.NewObjectRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoidExprRule}
	 * labeled alternative in {@link lexer_grammerParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoidExprRule(lexer_grammerParser.IsvoidExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoidExprRule}
	 * labeled alternative in {@link lexer_grammerParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoidExprRule(lexer_grammerParser.IsvoidExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invrseExprRule}
	 * labeled alternative in {@link lexer_grammerParser#invrseExpr}.
	 * @param ctx the parse tree
	 */
	void enterInvrseExprRule(lexer_grammerParser.InvrseExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invrseExprRule}
	 * labeled alternative in {@link lexer_grammerParser#invrseExpr}.
	 * @param ctx the parse tree
	 */
	void exitInvrseExprRule(lexer_grammerParser.InvrseExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExprRule}
	 * labeled alternative in {@link lexer_grammerParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExprRule(lexer_grammerParser.NotExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExprRule}
	 * labeled alternative in {@link lexer_grammerParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExprRule(lexer_grammerParser.NotExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(lexer_grammerParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(lexer_grammerParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(lexer_grammerParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(lexer_grammerParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#formalsList}.
	 * @param ctx the parse tree
	 */
	void enterFormalsList(lexer_grammerParser.FormalsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#formalsList}.
	 * @param ctx the parse tree
	 */
	void exitFormalsList(lexer_grammerParser.FormalsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(lexer_grammerParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(lexer_grammerParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexer_grammerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(lexer_grammerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexer_grammerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(lexer_grammerParser.TypeContext ctx);
}