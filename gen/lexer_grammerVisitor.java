// Generated from C:/Users/Nora/IdeaProjects/ass1/src\lexer_grammer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lexer_grammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lexer_grammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(lexer_grammerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDefinitionRule}
	 * labeled alternative in {@link lexer_grammerParser#classDefiniton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinitionRule(lexer_grammerParser.ClassDefinitionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobals(lexer_grammerParser.GlobalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#featureDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureDefinition(lexer_grammerParser.FeatureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(lexer_grammerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(lexer_grammerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(lexer_grammerParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmtRule(lexer_grammerParser.AssignmentStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code featureCallRule}
	 * labeled alternative in {@link lexer_grammerParser#featureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureCallRule(lexer_grammerParser.FeatureCallRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(lexer_grammerParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtRule(lexer_grammerParser.IfStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#caseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStmtRule(lexer_grammerParser.CaseStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#letStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(lexer_grammerParser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmtRule}
	 * labeled alternative in {@link lexer_grammerParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmtRule(lexer_grammerParser.WhileStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(lexer_grammerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObjectRule}
	 * labeled alternative in {@link lexer_grammerParser#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectRule(lexer_grammerParser.NewObjectRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoidExprRule}
	 * labeled alternative in {@link lexer_grammerParser#isvoidExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoidExprRule(lexer_grammerParser.IsvoidExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invrseExprRule}
	 * labeled alternative in {@link lexer_grammerParser#invrseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvrseExprRule(lexer_grammerParser.InvrseExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExprRule}
	 * labeled alternative in {@link lexer_grammerParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExprRule(lexer_grammerParser.NotExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(lexer_grammerParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(lexer_grammerParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#formalsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalsList(lexer_grammerParser.FormalsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(lexer_grammerParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexer_grammerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(lexer_grammerParser.TypeContext ctx);
}