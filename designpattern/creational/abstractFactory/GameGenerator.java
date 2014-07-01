package designpattern.creational.abstractFactory;

/**
 * The game generator class presents an example.
 * @author Christian Kusan
 */
public class GameGenerator {

    /**
     * The default constructor.
     */
    public GameGenerator() {
        
        //new wizard
        createCharacter(new Wizard());
        
        //new cavalier
        createCharacter(new Cavalier());
        
        //new amazon
        createCharacter(new Amazon());
    }
    
    /**
     * Creates a new character.
     * @param character the character
     */
    public static void createCharacter(ICharacter character){
    
        System.out.println(character.createMount().toString());
        System.out.println(character.createWeapon().toString());
        character.createWeapon().kill();
    }
}