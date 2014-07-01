package designpattern.structural.decorator;

/**
 * Concrete decorator.
 * @author Christian Kusan
 */
public class Armor extends ArmamentDecorator {

    
    // attributes
    
    /** The base character. */
    private AbstractCharacter _character;
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param character the character to decorate
     */
    public Armor(AbstractCharacter character){
        _character = character;
    }
    
    
    // methods
    
    /**
     * Gets a description to the decorated character.
     * @return a string
     */ 
    @Override
    public String description() {
        return _character.description() + "Has an armor. ";
    }
}