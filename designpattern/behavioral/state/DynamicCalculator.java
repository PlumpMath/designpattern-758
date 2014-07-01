package designpattern.behavioral.state;

/**
 * The context.
 * @description This calculator calculates anything, depending on a state.
 * @author Christian Kusan
 */
public class DynamicCalculator {

    
    // attributes
    
    /** The state. */
    private ArithmeticOperation _state;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public DynamicCalculator(){
        _state = ArithmeticOperation.PLUS;
    }
    
    
    // getter and setter
    
    /**
     * Sets the arithmetic operation.
     * @param state the new state 
     */
    public void setArithmeticOperation(ArithmeticOperation state){
        _state = state;
    }
    
    
    // methods
    
    /**
     * Calculate.
     * @param x the first number
     * @param y the second number
     * @return the result or NaN if no operation is defined 
     */
    public double calculate(double x, double y) {
        
        switch(_state) {
            case PLUS: //fall-through
            case MINUS:
            case MULTI:
            case DIVIDE: 
                return _state.calculate(x, y);
            default: 
                return Double.NaN;
        }
    }
}