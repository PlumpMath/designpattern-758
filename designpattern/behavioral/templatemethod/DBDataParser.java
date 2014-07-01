package designpattern.behavioral.templatemethod;

/**
 * Concrete data parser.
 * @author Christian Kusan
 */
public class DBDataParser extends DataParser {

    /**
     * Processes the data.
     */
    @Override
    public void process() {
        System.out.println("Processing the data from database.");    
    }
    
    /**
     * Reads the data.
     */
    @Override
    public void read() {
        System.out.println("Reading the database.");
    }    
}