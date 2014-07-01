package designpattern.structural.decorator;

/**
 * Concrete component.
 * @author Christian Kusan
 */
public class Amazon extends AbstractCharacter {

    /**
     * Gets a description about the amazon.
     * @return a string
     */
    @Override
    public String description() {
        return "Amazon girl Emily. ";
    }

}