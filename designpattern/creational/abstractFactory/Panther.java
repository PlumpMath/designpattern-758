package designpattern.creational.abstractFactory;

/**
 * Concrete product.
 * @author Christian Kusan
 */
class Panther implements IMount {

    /**
     * Gets the mount description.
     * @return a string
     */ 
    @Override
    public String toString(){
        return "Mount: Panther";
    }    
}