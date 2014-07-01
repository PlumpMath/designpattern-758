package designpattern.structural.bridge;

/**
 * Refined abstraction.
 * @author Christian Kusan
 */
public class Car extends Vehicle {

    
    // initializer
    
    /**
     * The default constructor.
     * @param g1 the first garage
     * @param g2 the second garage
     */
    public Car(Garage g1, Garage g2) { super(g1, g2); }
    
    
    // methods
    
    /**
     * Produces a car.
     */
    @Override
    public void produce() {
        System.out.println("Car ");
        garage1.work();
        garage2.work();
    }    
}