package designpattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Concrete subject and concrete observer, too.
 * @author Christian Kusan
 */
public class Mother extends Observable implements Observer {
    
    
    // attributes
    
    /**
     * Defines how much annoyed is the mother. This attribute prevents an 
     * infinity loop of observer pattern.
     */
    private int _angryness;
    
    /**
     * The lamp in child's room.
     */
    final private Lamp _LAMP;
    
    
    // initializer
    
    /**
     * Erzeugt eine Mutterinstanz.
     * @param lamp the lamp in child's room
     */
    public Mother(Lamp lamp) { 
        _angryness = 0;
        _LAMP = lamp;
    }
    
    
    // methods
    
    /**
     * The mother comes in the room.
     */
    public void comeIn() {
        
        if(++_angryness >= 3) {
            System.out.println("The mother is in rage, neither monster nor child risk to make any sound.");
            System.exit(-1);
        }
        
        System.out.println("The mother comes in the room and switch off the light. Then she go back into the kitchen.");
        setChanged();
        notifyObservers(true);
        _LAMP.switchIt(false);
    }
    
    /**
     * Updates the mothers behaviour after notifying about changes in child's room.
     * @param o the changed light behaviour
     * @param arg the light state
     */
    @Override
    public void update(Observable o, Object arg) {
        
        if(null != o && o instanceof Lamp)
            if(null != arg && arg instanceof Boolean)
                if((Boolean)arg) 
                    comeIn();
    }
}