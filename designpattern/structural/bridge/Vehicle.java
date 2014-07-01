package designpattern.structural.bridge;

/**
 * The abstraction.
 * @author Christian Kusan
 */
public abstract class Vehicle {
    
    
    // attributes
    
    /** The first garage. */
    protected Garage garage1;
    
    /** The second garage. */
    protected Garage garage2;
    
    
    // initializer
    
    /**
     * The default constructor assigns garages to the vehicle.
     * @param g1 the first garage
     * @param g2 the second garage
     */
    protected Vehicle(Garage g1, Garage g2) {
        garage1 = g1;
        garage2 = g2;
    }
    
    
    // methods
    
    /**
     * Produces a vehicle.
     */
    public abstract void produce();
    
}