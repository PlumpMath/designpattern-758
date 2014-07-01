package designpattern.behavioral.interpreter;

/**
 * Abstract expression.
 * @author Christian Kusan
 */
public interface Expression {
    
    /**
     * Interprets a token.
     * @param token the token
     * @return true if the token is true, otherwise false
     */
    public boolean interpret(String token);
    
}