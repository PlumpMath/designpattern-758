package designpattern.structural.bridge;

/**
 * Produces vehicles and fixed them, too.
 * @author Christian Kusan
 */
public class Production {

    /**
     * The default constructor produces a car and a bicycle.
     */
    public Production() {
        
        Vehicle v1 = new Car(new Produce(), new Repair());
        v1.produce();
        
        System.out.println("");
        
        Vehicle v2 = new Bicycle(new Produce(), new Repair());
        v2.produce();
    }    
}