package designpattern.behavioral.interpreter;

/**
 * Concrete terminal expression.
 * @author Christian Kusan
 */
public class TerminalExpression implements Expression {
   
    
    // attributes
    
    /** The expression. */
    final private String _EXPRESSION;
	
    
    // initializer

    /**
     * The default constructor.
     * @param expression the expression
     */
    public TerminalExpression(String expression){
        _EXPRESSION = expression; 
    }

    
    // methods
    
    /**
     * Interprets a token.
     * @param token the token
     * @return true if the token contains the expression, otherwise false
     */
    @Override
    public boolean interpret(String token) {
        
        return token.contains(_EXPRESSION);
    }
}