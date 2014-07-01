package designpattern.structural.bridge;

/**
 * Concrete implementor.
 * @author Christian Kusan
 */
public class Produce implements Garage {

    /**
     * Produces vehicles.
     */
    @Override
    public void work() { System.out.println("Produces."); }

}