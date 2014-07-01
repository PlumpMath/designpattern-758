package designpattern.creational.factoryMethod;

/**
 * Concrete product.
 * @author Christian Kusan
 */
public class Sandwich extends Meal {

    /**
     * The default constructor.
     * @param sideDish the side dish to the sandwich
     */
    public Sandwich(String sideDish){
        System.out.println("Sandwich" + (null != sideDish ? " with " + sideDish : ""));
    }
}