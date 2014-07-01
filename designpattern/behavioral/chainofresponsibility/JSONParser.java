package designpattern.behavioral.chainofresponsibility;

/**
 * Concrete editor.
 * @author Christian Kusan
 */
public class JSONParser extends Parser {

    
    // initializer
    
    /**
     * The default constructor.
     * @param successor the parser
     */
    public JSONParser(Parser successor){
        setSuccessor(successor);
    }
  
    
    // methods
  
    /**
     * Parses a json file.
     * @param filename the file path
     */
    @Override
    public void parse(String filename){
        
        if(canParse(filename, ".json"))
            System.out.println("Reads the JSON file.");
        else
            super.parse(filename);
    }

}