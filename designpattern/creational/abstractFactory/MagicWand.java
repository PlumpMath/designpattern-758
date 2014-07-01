package designpattern.creational.abstractFactory;

/**
 * Concrete product.
 * @author Christian Kusan
 */
public class MagicWand extends Weapon {
    
    /**
     * Kills the enemy.
     */
    @Override
    public void kill(){
        System.out.println("The enemy detonates.");
    }
        
    /**
     * Gets a description.
     * @return a string
     */
    @Override
    public String toString(){
        return super.toString() + "Magic wand";
    }
    
}