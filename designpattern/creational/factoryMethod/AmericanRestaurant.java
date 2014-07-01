package designpattern.creational.factoryMethod;

/**
 * Concrete factory.
 * @author Christian Kusan
 */
public class AmericanRestaurant extends Restaurant {

    /**
     * Prepares the meal (a sandwich).
     */
    @Override
    protected void prepare() {
        _meal = new Sandwich("Salad");
    }

}