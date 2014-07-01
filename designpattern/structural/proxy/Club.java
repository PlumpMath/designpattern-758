package designpattern.structural.proxy;

/**
 * Abstract subject.
 * @author Christian Kusan
 */
public abstract class Club {
    
    
    // attributes
    
    /** The guest who wants to be let. */
    protected Guest guest;
    
    
    // getter and setter
    
    /**
     * Gets a subclass instance of the abstract club class. 
     * @param useBodyguard decides whether the bodyguard shall work or not
     * @return an instance of bodyguard or a disco instance
     */
    public static Club getInstance(boolean useBodyguard) {
        return (useBodyguard) ? new Bodyguard() : new Disco();
    }
    
    
    // methods
    
    /**
     * Checks a guest.
     * @param g the guest
     */
    public abstract void check(Guest g);
    
    /**
     * Allows the entry.
     */
    public abstract void letIn();
    
}