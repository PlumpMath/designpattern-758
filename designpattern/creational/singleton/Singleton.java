package designpattern.creational.singleton;

/**
 * Describes an instance that exists only once during the 
 * application run-time.
 * @author Christian Kusan
 */
public class Singleton {

    
    // attributes
    
    /** The singleton instance. */
    final private static Singleton _INSTANCE;
    
    
    // initializer
    
    /** 
     * The static constructor.
     */
    static { 
        _INSTANCE = new Singleton(); 
    }
    
    /**
     * The default constructor.
     */
    private Singleton(){}
    
    
    // getter and setter
    
    /**
     * Gets the singleton instance.
     * @return the singleton object
     */
    public static Singleton getInstance(){
        return _INSTANCE;
    }
}