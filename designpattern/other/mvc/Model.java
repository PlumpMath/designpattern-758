package designpattern.other.mvc;

import java.util.Observable;

/**
 * The model class.
 * @author Christian Kusan
 */
public class Model extends Observable {

    
    // attributes
    
    /** The stored content. */
    private String _content; 
    
    
    // initializer
    
    /**
     * The default constructor.
     */ 
    public Model() { 
        _content = ""; 
    }
    
    
    // getter and setter
    
    /**
     * Gets the content.
     * @return the stored content
     */
    public String getContent() { 
        return _content; 
    }
    
    /**
     * Sets the content.
     * @param content the new content
     */
    public void setContent(String content){
        
        _content = content; 
        setChanged(); 
        notifyObservers(); 
    }
}