package designpattern.creational.abstractFactory;

/**
 * Concrete product.
 * @author Christian Kusan
 */
public class Pony implements IMount{

    /**
     * Gets the mount description.
     * @return a string
     */ 
    @Override
    public String toString(){
        return "Mount: Pony";
    }
}