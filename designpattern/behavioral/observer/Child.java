package designpattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Concrete observer.
 * @author Christian Kusan
 */
public class Child implements Observer {

    
    // attributes
    
    /** The lamp in the near of the child. */
    final private Lamp _LAMP;
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param lamp the lamp in child's room
     */
    public Child(Lamp lamp) { 
        _LAMP = lamp; 
    }
    
    
    // methods
    
    /**
     * Describes the current feeling.
     * @param confidence the confidence on a happy ending
     */
    public void hasConfidence(boolean confidence){
        
        if(confidence)
            System.out.println("Kevin has many confidence on nice dreams and a happy ending.");
        else {
            System.out.println("Kevin is scared.");
            _LAMP.switchIt(true);
        }
    }
    
    /**
     * Updates the current feeling that depends on the behaviour of the light 
     * in the child's room.
     * @param o the observed lamp
     * @param arg the lamp behaviour
     */
    @Override
    public void update(Observable o, Object arg) {
        
        if(null != o && o instanceof Lamp)
            if(null != arg && arg instanceof Boolean)
                hasConfidence((Boolean)arg);
    }
}