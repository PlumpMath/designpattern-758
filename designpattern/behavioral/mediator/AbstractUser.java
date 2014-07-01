package designpattern.behavioral.mediator;

/**
 * Abstract collegue.
 * @author Christian Kusan
 */
public abstract class AbstractUser {
    
    
    // attributes
    
    /** The chat mediator. */
    protected IChat _chat;
    
    /** The username. */
    protected String _name;

    
    // initializer
    
    /**
     * The default constructor.
     * @param chat the chat mediator
     * @param name the name
     */
    public AbstractUser(IChat chat, String name){
        _chat = chat;
        _name = name;
    }

    
    // methods
    
    /**
     * Receives a message.
     * @param message the message
     */
    public abstract void receive(String message);
    
    /**
     * Sends a message.
     * @param message the message
     */
    public abstract void send(String message);
	
}