package designpattern.creational.abstractFactory;

/**
 * Concrete product.
 * @author Christian Kusan
 */
public class Bow extends Weapon {

    /**
     * Gets a weapon description.
     * @return a string
     */
    @Override
    public String toString(){
        return super.toString() + "Bow";
    }
    
}