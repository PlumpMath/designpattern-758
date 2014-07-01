package designpattern.behavioral.mediator;

/**
 * Abstract mediator.
 * @author Christian Kusan
 */
public interface IChat {
    
    /**
     * Adds an user.
     * @param user the user
     */
    void addUser(AbstractUser user);
    
    /**
     * Sends a message.
     * @param message the message
     * @param user the user
     */
    void sendMessage(String message, AbstractUser user);
}