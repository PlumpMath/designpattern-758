package designpattern.behavioral.memento;

/**
 * Originator.
 * @author Christian Kusan
 * @param <T> the state type
 */
public class Originator<T> {
    
    
    // attributes
   
    /** The current state. */
    private T _state;

    
    // getter and setter
    
    /**
     * Gets the current state.
     * @return the state
     */
    public T getState(){
        return _state;
    }
    
    /**
     * Gets the current memento state.
     * @param Memento 
     */
    public void getStateFromMemento(Memento<T> Memento){
        _state = Memento.getState();
    }
   
    /**
     * Sets the state.
     * @param state the new state
     */
    public void setState(T state){
        _state = state;
    }

    
    // methods

    /**
     * Saves the current state.
     * @return the memento object that stores the state
     */
    public Memento saveStateToMemento(){
        return new Memento<>(_state);
    }
   
}