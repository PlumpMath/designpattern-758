package designpattern.structural.bridge;

/**
 * Refined abstraction.
 * @author Christian Kusan
 */
public class Bicycle extends Vehicle {

    
    // initializer
    
    /**
     * The default constructor assigns garages to the bicycle.
     * @param g1 the first garage
     * @param g2 the second garage
     */
    public Bicycle(Garage g1, Garage g2) { super(g1, g2); }
    
    
    // methods
    
    /**
     * Produces a bicycle.
     */
    @Override
    public void produce() {
        System.out.println("Bicycle ");
        garage1.work();
        garage2.work();
    }
}