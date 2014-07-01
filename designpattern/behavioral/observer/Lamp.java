package designpattern.behavioral.observer;

import java.util.Observable;

/**
 * Concrete subject.
 * @author Christian Kusan
 */
public class Lamp extends Observable {

    
    // attributes
    
    /** Defines the light behaviour. If the light is on the value is true, 
     * otherwise false. */
    private boolean _lightIsOn;
    
    
    // methods
    
    /**
     * Switch the lamp on or off.
     * @param on defines whether the light is on (true) or not (false)
     */
    public void switchIt(boolean on) {
        
        _lightIsOn = on;
        System.out.println("The light is " + ((_lightIsOn) ? "on" : "off") + ".");
        setChanged();
        notifyObservers(_lightIsOn);
    }
    
}