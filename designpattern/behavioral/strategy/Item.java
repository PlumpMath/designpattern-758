package designpattern.behavioral.strategy;

/**
 * Cart item.
 * @author Christian Kusan
 */
public class Item {

    
    // attributes
    
    /** The price. */
    final private int _PRICE;
    
    /** The UPC code. */
    final private String _UPC_CODE;
    

    // initializer
    
    /**
     * The default constructor.
     * @param upc the UPC code
     * @param cost the price
     */
    public Item(String upc, int cost){
        
        _PRICE = cost;
        _UPC_CODE = upc;
    }

    
    // methods
    
    /**
     * Gets the price.
     * @return the value
     */
    public int getPrice() {
        return _PRICE;
    }

    /**
     * Gets the UPC code.
     * @return the code number
     */
    public String getUPCCode() {
        return _UPC_CODE;
    }
}