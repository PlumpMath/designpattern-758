package designpattern.structural.facade;

/**
 * An aeroplane thats fly just to certain times.
 * @author Christian Kusan
 */
public class Aeroplane {

    
    // attributes
    
    /** Defines when the aeroplane flies next time. */
    private int _avaiableFrom;
    
    /** Defines up when the flight is avaiable. */
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