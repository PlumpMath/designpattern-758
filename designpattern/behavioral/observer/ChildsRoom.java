package designpattern.behavioral.observer;

/**
 * Describes the scenario via observer pattern.
 * @author Christian Kusan
 */
public class ChildsRoom {

    /**
     * The default constructor creates the main scenario.
     */
    public ChildsRoom(){
    
        // protagonists
        Lamp lamp = new Lamp();
        Child kevin = new Child(lamp);
        Mother barbara = new Mother(lamp);
        Monster hempel = new Monster();
        
        // connections between the protagonists
        barbara.addObserver(hempel);
        lamp.addObserver(kevin);
        lamp.addObserver(barbara);
        lamp.addObserver(hempel);
        
        // start
        lamp.switchIt(true);
    }
}