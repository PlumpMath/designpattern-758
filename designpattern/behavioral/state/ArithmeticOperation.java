package designpattern.behavioral.state;

/**
 * Abstract state who defines all possible concrete states, too.
 * @author Christian Kusan
 */
public enum ArithmeticOperation {
    
    
    // singleton instances
    
    /**
     * Division.
     */
    DIVIDE {

        /**
         * Divides a number y from another number x.
         */
        @Override
        double calculate(double x, double y) { return (0 != y) ? (x / y) : Double.NaN; } 
    },
    
    /**
     * Subtraction.
     */
    MINUS {
        
        /**
         * Subtracts a subtrahend y from a minuend x.
         */
        @Override
        double calculate(double x, double y) { return x - y; } 
    },
    
    /**
     * Multiplication.
     */
    MULTI { 

        /**
         * Calculates the product of two factors.
         */
        @Override
        double calculate(double x, double y) { return x * y; } 
    },
    
    /**
     * Addition.
     */
    PLUS {
        
        /**
         * Adds two summands to each other.
         */
        @Override
        double calculate(double x, double y) { return x + y; } 
    };
    
    
    // methods
    
    /**
     * Uses two numbers to calculate anything.
     * @param x the first number
     * @param y the second number
     * @return the result
     */
    abstract double calculate(double x, double y);
}