package designpattern.behavioral.command;

/**
 * Concrete command.
 * @author Christian Kusan
 */
public class OnCommand implements ICommand {

    
    // attributes
    
    /** The light. */
    final private Light _LIGHT;
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param light the receiver object
     */
    public OnCommand(Light light){
        _LIGHT = light; 
    }
    
    
    // methods
    
    /**
     * Executes the light on command.
     */
    @Override
    public void execute(){
        _LIGHT.on();
    }
}