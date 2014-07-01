package designpattern.behavioral.templatemethod;

/**
 * Abstract data parser.
 * @author Christian Kusan
 */
public abstract class DataParser {
    
    /**
     * Defines a generic structure for parsing data.
     */
    public void parse(){
        
        read();
        process();
        write();
    }
    
    /**
     * Processes the data.
     */
    abstract void process();
    
    /**
     * Reads the data.
     */
    abstract void read();
    
    /**
     * Writes the data.
     */
    public void write(){
        System.out.println("Ready.");
    }
}