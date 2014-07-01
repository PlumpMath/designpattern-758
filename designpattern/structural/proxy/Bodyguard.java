package designpattern.structural.proxy;

/**
 * The proxy.
 * @author Christian Kusan
 */
public class Bodyguard extends Club {

    
    // attributes
    
    /** The assigned disco. */
    final private Disco _DISCO;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public Bodyguard() { 
        _DISCO = new Disco(); 
    }
    
    
    // methods
    
    /**
     * Checks a guest.
     * @param g the guest
     */
    @Override
    public void check(Guest g) { 
        guest = g; 
    }
    
    /**
     * Allows the guest to entry the club.
     */
    @Override
    public void letIn() {
        check(guest);
        
        if(guest instanceof SmartGuest) 
            _DISCO.letIn();
        else 
            System.out.println("You shall not pass!");
    }
    
}