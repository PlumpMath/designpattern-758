package designpattern.structural.decorator;

/**
 * Concrete component.
 * @author Christian Kusan
 */
public class Wizard extends AbstractCharacter {
    
    /**
     * Gets a description about the wizard.
     * @return a string
     */
    @Override
    public String description(){
        return "Wizard Oswald. ";
    }

}