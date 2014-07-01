package designpattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Context.
 * @author Christian Kusan
 */
public class ShoppingCart {

    
    // attributes
    
    /** The list of cart items. */
    final private List<Item> _ITEMS;

    
    // initializer
    
    /**
     * The default constructor.
     */
    public ShoppingCart(){
        _ITEMS = new ArrayList<>();
    }

    
    // methods
    
    /**
     * Adds an item.
     * @param item the item
     */
    public void addItem(Item item){
        _ITEMS.add(item);
    }

    /**
     * Calculates the total price.
     * @return the price value
     */
    public int calculateTotal(){
        
        int sum = 0;
        sum = _ITEMS.stream().map((item) -> item.getPrice()).reduce(sum, Integer::sum);
        
        return sum;
    }
    
    /**
     * Pays.
     * @param paymentMethod the payment method
     */
    public void pay(PaymentStrategy paymentMethod){
        
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
    
    /**
     * Removes an item.
     * @param item the item
     */
    public void removeItem(Item item){
        _ITEMS.remove(item);
    }
}