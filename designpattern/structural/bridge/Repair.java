package designpattern.structural.bridge;

/**
 * Concrete implementor.
 * @author Christian Kusan
 */
public class Repair implements Garage {
    
    /**
     * Repairs vehicles.
     */
    @Override
    public void work() { System.out.println("Fix it."); }
    
}