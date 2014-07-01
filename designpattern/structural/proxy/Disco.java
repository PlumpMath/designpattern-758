package designpattern.structural.proxy;

/**
 * The real subject.
 * @author Christian Kusan
 */
public class Disco extends Club {

    /**
     * Checks a guest.
     * @param g the guest
     */
    @Override
    public void check(Guest g) {} // empty, the proxy takes on the task
    
    /**
     * L&auml;sst Guest ein.
     */
    @Override
    public void letIn() { 
        System.out.println("Allows the guest to enter the club."); 
    }
    
}