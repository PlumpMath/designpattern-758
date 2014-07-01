package designpattern.behavioral.templatemethod;

/**
 * Concrete data parser.
 * @author Christian Kusan
 */
public class CSVDataParser extends DataParser {

    /**
     * Processes the data.
     */
    @Override
    public void process() {
        System.out.println("Processing the data from csv file.");    
    }
    
    /**
     * Reads the data.
     */
    @Override
    public void read() {
        System.out.println("Reading the csv file.");
    }
}