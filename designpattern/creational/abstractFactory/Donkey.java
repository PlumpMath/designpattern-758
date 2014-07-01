package designpattern.creational.abstractFactory;

/**
 * Concrete product.
 * @author Christian Kusan
 */
public class Donkey implements IMount {
    
    @Override
    public String toString(){
        return "Mount: Donkey";
    }
    
}