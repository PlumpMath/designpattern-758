package designpattern.behavioral.mediator;

/**
 * Concrete collegue.
 * @author Christian Kusan
 */
public class User extends AbstractUser {
    
    
    // initializer
    
    /**
     * The default constructor
     * @param chat the chat mediator
     * @param name the username
     */
    public User(IChat chat, String name){
        super(chat, name);
    }
    
    
    // methods
    
    /**
     * Receives a message.
     * @param message the message
     */
    @Override
    public void receive(String message) {
        System.out.println(_name + " receives: " + message);
    }
 
    /**
     * Sends a message.
     * @param message the message
     */
    @Override
    public void send(String message){
        System.out.println(_name + " sends: " + message);
        _chat.sendMessage(message, this);
    }
}