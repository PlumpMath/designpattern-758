package designpattern.behavioral.strategy;

/**
 * Abstract strategy.
 * @author Christian Kusan
 */
public interface PaymentStrategy {
    
    /**
     * Pays.
     * @param amount the price amount
     */
    public void pay(int amount);
    
}