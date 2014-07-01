package designpattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Concrete observer.
 * @author Christian Kusan
 */
public class Monster implements Observer {

    /**
     * Comes out of hiding when the coast is clear.
     */
    public void comeOutOfHiding(){
        System.out.println("Hempel comes out of hiding and causes chaos.");
    }
    
    /**
     * Flees because it's anything but safe.
     */
    public void flee(){
        System.out.println("Hempel ducks out of sight under the bed.");
    }
    
    /**
     * Updates the monsters reaction.
     * @param o the changed light behaviour
     * @param arg the light state
     */
    @Override
    public void update(Observable o, Object arg) {
        
        if(null != o && o instanceof Lamp)
            if(null != arg && arg instanceof Boolean)
                if(!((Boolean)arg))
                    comeOutOfHiding();
        
        if(o instanceof Mother) 
            if(null != arg && arg instanceof Boolean)
                if((Boolean)arg) 
                    flee();
    }
}