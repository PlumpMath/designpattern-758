package designpattern.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * This generic stack describes a concrete iterable aggregate.
 * @param <T> the data element
 * @author Christian Kusan
 */
public class Stack<T> implements Iterable {
    
    
    // attributes
    
    /** Contains all stack elements. */
    private T[] _elements;
    
    /** The current top. */
    private int _top;
    
    
    // initializer
    
    /**
     * The default constructor that initializes a stack with a size of 10.
     */
    public Stack() { this(10); }
    
    /**
     * Initializes a stack.
     * @param size the start size 
     */
    public Stack(int size) {
        _top = 0;
        _elements = (T[]) new Object[size];
    }
    
    
    // methods
    
    /**
     * Grows up the stack.
     */
    private void grow() {
        
        T[] e = Arrays.copyOf(_elements, 2 * _elements.length);
        _elements = e;
    }
    
    /**
     * Checks whether the stack is empty or not.
     * @return true if the stack is empty, otherwise false
     */
    public boolean isEmpty() { 
        return 1 > _elements.length; 
    }
    
    /**
     * Creates an iterator.
     * @return the created iterator
     */
    @Override
    public Iterator<T> iterator() {
        
        StackIterator<T> iter = new StackIterator<>();
        iter.setData(_elements);
        
        return iter;
    }
    
    /**
     * Gets the top of stack at first, then remove it.
     * @return an element of type T
     */
    public T pop() {
        
        T value = null;
        
        if(0 < _top) { 
            value = _elements[--_top];
            _elements[_top] = null;
        }
        return value;
    }
    
    /**
     * Adds a new element.
     * @param e the new element
     */
    public void push(T e) {
        
        if(_elements.length <= _top)
            grow();
        
        _elements[_top++] = e;
    }

    /**
     * Gets the stack size.
     * @return a number
     */
    public int size() { 
        return _elements.length; 
    }
    
}