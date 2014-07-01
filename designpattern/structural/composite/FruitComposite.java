package designpattern.structural.composite;

import java.util.ArrayList;

/**
 * A fruit composite.
 * @author Christian Kusan
 */
public class FruitComposite implements Eatable {

    
    // attributes
    
    /**
     * A fruit basket.
     */
    final private ArrayList<Eatable> _BASKET;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public FruitComposite() { 
        _BASKET = new ArrayList<>(4); 
    }
    
    
    // methods
    
    /**
     * Adds a fruit.
     * @param f the fruit
     */
    public void add(Eatable f) { _BASKET.add(f); }
    
    /**
     * Eat a fruit.
     */
    @Override
    public void eat() { 
        
        // lambda
        _BASKET.stream().forEach((f) -> {
            f.eat(); 
        });
    }
    
    /**
     * Removes a fruit.
     * @param f the fruit
     */
    public void remove(Eatable f) { _BASKET.remove(f); }
    
}