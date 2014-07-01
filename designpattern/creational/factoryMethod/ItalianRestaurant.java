package designpattern.creational.factoryMethod;

/**
 * Concrete factory.
 * @author Christian Kusan
 */
public class ItalianRestaurant extends Restaurant {

    /**
     * Prepares the meal (a pizza).
     */
    @Override
    protected void prepare() {
        _meal = new Pizza();
    }
    
}