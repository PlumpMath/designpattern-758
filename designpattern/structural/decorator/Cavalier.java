package designpattern.structural.decorator;

/**
 * Concrete component.
 * @author Christian Kusan
 */
public class Cavalier extends AbstractCharacter {

    /**
     * Gets a description about the cavalier.
     * @return a string
     */
    @Override
    public String description() {
        return "Cavalier Kunibert. ";
    }
}