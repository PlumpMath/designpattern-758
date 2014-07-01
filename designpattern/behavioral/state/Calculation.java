package designpattern.behavioral.state;

import java.util.Scanner;

/**
 * Shows the pratical use of the state pattern.
 * @author Christian Kusan
 */
public class Calculation {
    
    /**
     * The default constructor.
     */
    public Calculation(){
 
        double a, b;
        String operator;
        Scanner scan = new Scanner(System.in);
        DynamicCalculator dc = new DynamicCalculator();
        
        System.out.println("Input number 1: ");
        a = scan.nextDouble();
        System.out.println("Input arithmetic operation (+,-,*,/): ");
        operator = scan.next();
        System.out.println("Input number 2: ");
        b = scan.nextDouble();
        
        switch(operator) {
            case "-": dc.setArithmeticOperation(ArithmeticOperation.MINUS);
                break;
            case "*": dc.setArithmeticOperation(ArithmeticOperation.MULTI);
                break;
            case "/": dc.setArithmeticOperation(ArithmeticOperation.DIVIDE);
                break;
            default: dc.setArithmeticOperation(ArithmeticOperation.PLUS);
        }
        
        System.out.println("Calculation: " + a + " " + operator + " " + b);
        System.out.println("Result: " + dc.calculate(a, b)); 
    }
    
}