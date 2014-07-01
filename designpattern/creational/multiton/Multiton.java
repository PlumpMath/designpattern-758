package designpattern.creational.multiton;

import java.util.HashMap;
import java.util.Map;

/**
 * A multiton class describes a group of singletons.
 * @author Christian Kusan
 */
public class Multiton {

    
    // attributes
    
    /** The multiton map. */
    final private static Map<Object, Multiton> _INSTANCES;
    
    
    // initializer
    
    /**
     * The static constructor.
     */
    static {
        _INSTANCES = new HashMap<>();
    }
    
    /**
     * The default constructor.
     */ 
    private Multiton(){}
    
    
    // getter and setter
    
    /**
     * Gets a multiton instance.
     * @param key the singleton key
     * @return an instance of multiton
     */
    public static Multiton getInstance(Object key){
        
        synchronized(_INSTANCES) {
 
            Multiton instance = _INSTANCES.get(key);
 
            if(null == instance){
                
                instance = new Multiton();
                _INSTANCES.put(key, instance);
            }
 
            return instance;
        }
    }
}