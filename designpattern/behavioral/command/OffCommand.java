package designpattern.behavioral.command;

/**
 * Concrete command.
 * @author Christian Kusan
 */
public class OffCommand implements ICommand {

    
    // attributes
    
    /** The light. */
    final private Light _LIGHT;
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param light the receiver object 
     */
    public OffCommand(Light light){
        _LIGHT = light; 
    }
    
    
    // methods
    
    /**
     * Executes the light off command.
     */
    @Override
    public void execute(){
        _LIGHT.off();
    }
}