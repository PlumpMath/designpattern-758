package designpattern.creational.factoryMethod;

/**
 * Abstract factory.
 * @author Christian Kusan
 */
public abstract class Restaurant {

    
    // attributes
    
    /** The meal. */
    protected Meal _meal;
    
    
    // methods
    
    /**
     * Prepares the meal.
     */
    protected abstract void prepare();
    
    /**
     * Serves the meal.
     */
    public void serveUp(){
        prepare();
    }
}