package designpattern.other.mvp;

/**
 * Model.
 * @author Christian Kusan
 */
public class User {

    
    // attributes
    
    /** The username. */
    private String _username;
    
    
    // getter and setter
    
    /**
     * Gets the username.
     * @return a name
     */
    public String getUsername() {
        return _username;
    }

    /**
     * Sets the username.
     * @param username the new username
     */
    public void setUsername(String username) {
        _username = username;
    }
}