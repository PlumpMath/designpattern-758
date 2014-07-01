package designpattern.behavioral.mediator;

import java.util.ArrayList;

/**
 * Concrete mediator.
 * @author Christian Kusan
 */
public class Chat implements IChat {
    
    
    // attributes
    
    /** A list of all chat users. */
    final private ArrayList<AbstractUser> _USERS;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public Chat(){
        _USERS = new ArrayList<>();
    }
    
    
    // methods
    
    /**
     * Adds an user.
     * @param user the user
     */
    @Override
    public void addUser(AbstractUser user){
        _USERS.add(user);
    }
    
    /**
     * Sends a message.
     * @param message the message
     * @param user the user
     */
    @Override
    public void sendMessage(String message, AbstractUser user){
        
        // send message only to the other users, but not the sender
        _USERS.stream().filter((u) -> (user != u)).forEach((u) -> {
            u.receive(message);
        });
    }
}