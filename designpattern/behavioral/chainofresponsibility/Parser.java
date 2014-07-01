package designpattern.behavioral.chainofresponsibility;

/**
 * Abstract editor.
 * @author Christian Kusan
 */
public class Parser {
    
    
    // attributes
    
    /** The parser. */
    private Parser _successor;
    
    
    // getter and setter
    
    /**
     * Gets the successor.
     * @return a parser instance
     */
    public Parser getSuccessor(){
        return _successor;
    }
    
    /**
     * Sets the successor.
     * @param successor the new parser
     */
    public void setSuccessor(Parser successor){
        _successor = successor;
    }
    
    
    // methods
    
    /**
     * Checks whether the parser can parse the file.
     * @param filename the file path
     * @param format the file format
     * @return true if the reader is able to parse the file, otherwise false
     */
    protected boolean canParse(String filename, String format){
        return (null == filename) || (filename.endsWith(format));
    }
  
    /**
     * Parses a file.
     * @param filename the file path
     */
    public void parse(String filename){
    
        if(null != _successor)
            _successor.parse(filename);
        else
            System.out.println("Can not find the correct parser for this file");
    }
}