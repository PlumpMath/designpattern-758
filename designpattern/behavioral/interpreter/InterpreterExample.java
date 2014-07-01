package designpattern.behavioral.interpreter;

/**
 * Shows an interpreter example.
 * @author Christian Kusan
 */
public class InterpreterExample {
    
    /**
     * The default constructor.
     */
    public InterpreterExample(){
    
        Expression earth = new TerminalExpression("Earth");
        Expression football = new TerminalExpression("Football");
        Expression isRound = new AndExpression(earth, football);
        System.out.println("The earth is round like a football: " + isRound.interpret("Earth Football"));

        Expression cube = new TerminalExpression("Cube");
        Expression hasFourCorners = new OrExpression(earth, cube);
        System.out.println("At least one of them has four corners: " + hasFourCorners.interpret("Earth Cube"));
        System.out.println("At least one of them has four corners: " + isRound.interpret("Earth World"));
    }
}