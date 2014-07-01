package designpattern.structural.facade;

/**
 * A hotel.
 * @author Christian Kusan
 */
public class Hotel {

    
    // attributes
    
    /** Defines when the hotel is avaiable from. */
    private int _avaiableFrom;
    
    /** Defines when the hotel is avaiable to. */
    private int _avaiableTo;
    
    
    // getter and setter
    
    /**
     * Gets the avaiable from time.
     * @return a date
     */
    public int getAvaiableFrom() { 
        return _avaiableFrom; 
    }
    
    /**
     * Gets the avaiable to time.
     * @return a date
     */
    public int getAvaiableTo() { 
        return _avaiableTo; 
    }
    
    /** 
     * Sets the avaiable time.
     * @param from the start date
     * @param to the end date
     */
    public void setAvaiable(int from, int to) {
        _avaiableFrom = from;
        _avaiableTo = to;
    }
    
    
    // methods
    
    /**
     * Gets the class name.
     * @return a string
     */
    @Override
    public String toString() { 
        return getClass().getName(); 
    }
    
}