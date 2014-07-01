package designpattern.behavioral.command;

/**
 * Receiver object.
 * @author Christian Kusan
 */
public class Monster {
    
    
    // attributes
    
    /** The fear level. */
    private static int _scared;
    
    
    // initializer
    
    /**
     * The static constructor.
     */
    static { _scared = 0; }
    
    
    // getter and setter
    
    /**
     * Returns whether the monster is scared or not.
     * @return an integer that defines the level of fear
     */
    public int isScared(){
        return _scared;
    }
    
    
    // methods
    
    /**
     * Comes out of hiding when the coast is clear.
     */
    public void comeOutOfHiding(){
        System.out.println("The monster comes out of hiding and causes chaos.");
    }
    
    /**
     * The monster can not be bothered to do hide.
     */
    public void comeOutOfHiding2(){
        System.out.println("The monster runs out of steam.");
    }
    
    /**
     * Hides.
     */
    public void hide() {
        System.out.println("The monster ducks out of sight.");
        ++_scared;
    }
}