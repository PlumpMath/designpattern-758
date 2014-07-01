package designpattern.creational.abstractFactory;

/**
 * Concrete product.
 * @author Christian Kusan
 */
public class Sword extends Weapon {

    /**
     * Gets a weapon description.
     * @return the weapon
     */ 
    @Override
    public String toString(){
        return super.toString() + "Sword";
    }
}