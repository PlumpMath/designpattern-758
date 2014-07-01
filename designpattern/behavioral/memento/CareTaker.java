package designpattern.behavioral.memento;

import java.util.ArrayList;

/**
 * Caretaker.
 * @author Christian Kusan
 * @param <T> the state type
 */
public class CareTaker<T> {
    
    
    // attributes
    
    /** The list of all memento objects. */
    final private ArrayList<Memento<T>> _MEMENTOS;

    
    // initializer
    
    /**
     * The default constructor.
     */
    public CareTaker(){
        _MEMENTOS = new ArrayList<>();
    }
    
    
    // methods
    
    /**
     * Adds a state.
     * @param state the state
     */
    public void add(Memento<T> state){
        _MEMENTOS.add(state);
    }

    /**
     * Gets a state.
     * @param index the chronical index
     * @return a memento object
     */
    public Memento<T> get(int index){
        return _MEMENTOS.get(index);
    }
}