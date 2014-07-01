package designpattern.behavioral.chainofresponsibility;

/**
 * Concrete editor.
 * @author Christian Kusan
 */
public class TextParser extends Parser {

    
    // initializer
    
    /**
     * The default constructor.
     * @param successor the parser
     */
    public TextParser(Parser successor){
        setSuccessor(successor);
    }
  
    
    // methods
  
    /**
     * Parses a text file.
     * @param filename the file path
     */
    @Override
    public void parse(String filename){
        
        if(canParse(filename, ".txt"))
            System.out.println("Reads the text file.");
        else
            super.parse(filename);
    }

}