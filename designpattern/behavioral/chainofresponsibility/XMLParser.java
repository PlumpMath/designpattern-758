package designpattern.behavioral.chainofresponsibility;

/**
 * Concrete editor.
 * @author Christian Kusan
 */
public class XMLParser extends Parser {

    /**
     * Parses a xml file.
     * @param filename the file path
     */
    @Override
    public void parse(String filename){
        
        if(canParse(filename, ".xml"))
            System.out.println("Reads the XML file.");
        else
            super.parse(filename);
    }

}