package designpattern.creational.abstractFactory;

/**
 * Abstract product.
 * @author Christian Kusan
 */
public class Weapon {
    
    /**
     * Kills the enemy.
     */
    public void kill(){
        System.out.println("The enemy falls to the ground.");
    }

    /**
     * Prints out the weapon description.
     * @return a string
     */
    @Override
    public String toString(){
        return "Weapon: ";
    }

}