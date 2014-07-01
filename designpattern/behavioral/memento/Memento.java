package designpattern.behavioral.memento;

/**
 * Memento.
 * @author Christian Kusan
 * @param <T> the state type
 */
public class Memento<T> {
    
    
    // attributes
   
    /** The current state. */
    final private T _STATE;

    
    // initializer
    
    /**
     * The default constructor.
     * @param state the state
     */
    public Memento(T state){
        _STATE = state;
    }

    
    // getter
    
    /**
     * Gets the current state.
     * @return the state
     */
    public T getState(){
        return _STATE;
    }
}