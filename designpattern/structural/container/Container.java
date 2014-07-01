package designpattern.structural.container;

import java.util.Iterator;

/**
 * Describes a container.
 * @author Christian Kusan
 * @param <E>
 */
public class Container<E> {
    
    
    // attributes
    
    /** The last node. */
    protected Node _last;
    
    /** The first node. */
    protected Node _root;
    
    /**
     * Describes a node.
     */
    protected class Node {
        
        
        // attributes
        
        /** The stored element. */
        private E _element;
        
        /** The next element. */
        private Node _next;
        
        /** The previous element. */
        private Node _prev;
        
        
        // initializer
        
        /**
         * The default constructor.
         * @param element the element
         */
        public Node(E element){
            _element = element;
            _next = null;
            _prev = null;
        }
    }
    
    /**
     * Describes a node iterator.
     */
    public class NodeIterator implements Iterator<E> {

        
        // attributes
        
        /** The current node. */
        protected Node _current;
        
        
        // initializer
        
        /**
         * The default constructor.
         */
        public NodeIterator(){
            _current = _root;
        }
        
        
        // iterator methods
        
        /**
         * Checks whether a next element exists.
         * @return true if a next element exists, otherwise false
         */
        @Override
        public boolean hasNext() {
            return null != _current;
        }

        /**
         * Returns the next element.
         * @return the element
         */
        @Override
        public E next() {
            
            if(null == _current)
                return null;
            
            E data = _current._element;
            _current = _current._next;
            
            return data;
        }
        
        /**
         * Removes the last element returned by the iterator.
         */
        @Override
        public void remove() {
            
            Node n = _current._prev;
            _current._prev._next = _current._next;
            _current._next._prev = _current._prev;
        }
    }
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public Container(){
        _last = null;
        _root = null;
    }
    
    
    // methods
    
    /**
     * Adds an element.
     * @param element the element
     */
    public void add(E element){
        
        if(null == _root)
            _last = _root = new Node(element);
        else {
            Node n = new Node(element);
            n._prev = _last;
            _last = _last._next = n;
        }
    }
    
    /**
     * Returns an iterator.
     * @return the iterator
     */
    public Iterator<E> iterator(){
        return new NodeIterator();
    }

}