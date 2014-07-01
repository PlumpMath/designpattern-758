package designpattern.behavioral.iterator;

import java.util.Iterator;

/**
 * A (concrete) stack iterator.
 * @author Christian Kusan
 * @param <T> the stack element
 */
public class StackIterator<T> implements Iterator<T> {

    
    // attributes
    
    /** Contains all stack elements. */
    private T[] _elements;
    
    /** The current position. */
    private int _position;
    
    
    // initializer

    /**
     * The default constructor.
     */
    public StackIterator(){
        
        _elements = null;
        _position = -1;
    }
    
    
    // getter and setter
    
    /**
     * Gets the aggregate.
     * @return a generic array
     */
    public T[] getData() { 
        return _elements; 
    }
    
    /**
     * Gets the current position.
     * @return the position
     */
    public int getPos(){
        return _position;
    }
    
    /**
     * Sets the iterable stack aggregat.
     * @param aggregate the aggregate
     */
    public void setData(T[] aggregate) { 
        _elements = aggregate; 
    }
    
    /**
     * Sets the current position.
     * @param pos the position
     */
    public void setPos(int pos) { 
        _position = pos; 
    }
    
    
    // methods
    
    /**
     * Returns true if the iteration has more elements.
     * @return true if the iteration has more elements, otherwise false 
     */
    @Override
    public boolean hasNext() {
        return (_elements.length > (1 + _position));
    }

    /**
     * Returns the next element in the iteration.
     * @return the next element in the iteration.
     */
    @Override
    public T next() {
        return _elements[++_position];
    }
    
    /**
     * Removes from the underlying collection the last element returned 
     * by this iterator.
     */
    @Override
    public void remove(){
    
        T[] temp = (T[]) new Object[_elements.length-1];
        System.arraycopy(_elements, 0, temp, 0, _elements.length-1);
        _elements = temp;
    }
    
    /**
     * Returns the aggregat elements in reverse direction.
     */
    public void reverse() {
        
        for(int i = _elements.length-1; -1 < i; --i) 
            System.out.println(_elements[i]);
    }

}