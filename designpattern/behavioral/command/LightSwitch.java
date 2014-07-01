package designpattern.behavioral.command;

/**
 * Invoker object.
 * @author Christian Kusan
 */
public class LightSwitch {

    
    // attributes
    
    /** The light on command. */
    final private ICommand _ON_COMMAND;
        
    /** The light off command. */
    final private ICommand _OFF_COMMAND;
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param on the on command
     * @param off the off command
     */
    public LightSwitch(ICommand on, ICommand off) {
        
        _ON_COMMAND = on;
        _OFF_COMMAND = off;
    }

    
    // methods
    
    /**
     * Switch the light on.
     */
    public void switchOn(){
        _ON_COMMAND.execute();
    }
    
    /**
     * Switch the light off.
     */
    public void switchOff(){
        _OFF_COMMAND.execute();
    }
}