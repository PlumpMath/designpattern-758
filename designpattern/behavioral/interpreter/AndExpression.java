package designpattern.behavioral.interpreter;

/**
 * Concrete AND expression.
 * @author Christian Kusan
 */
public class AndExpression implements Expression {
	 
    
    // attributes
    
    /** The first expression. */
    final private Expression _EXPRESSION_1;
   
    /** The second expression. */
    final private Expression _EXPRESSION_2;

   
    // initializer
   
    /**
     * The default constructor.
     * @param expression1 the first expression
     * @param expression2 the second expression
     */
    public AndExpression(Expression expression1, Expression expression2) {
       
        _EXPRESSION_1 = expression1;
        _EXPRESSION_2 = expression2;
    }

    
    // methods
    
    /**
     * Interprets a token.
     * @param token the token
     * @return true if the token contains expression 1 and expression 2, 
     * otherwise false
     */
    @Override
    public boolean interpret(String token) {
        return _EXPRESSION_1.interpret(token) && _EXPRESSION_2.interpret(token);
    }
}