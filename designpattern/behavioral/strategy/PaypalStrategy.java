package designpattern.behavioral.strategy;

/**
 * Concrete strategy.
 * @author Christian Kusan
 */
public class PaypalStrategy implements PaymentStrategy {

    
    // attributes
    
    /** The e-mail. */
    final private String _EMAIL;
    
    /** The password. */
    final private String _PASSWORD;

    
    // initializer
    
    /**
     * The default constructor.
     * @param eMail the mail adress
     * @param password the password
     */
    public PaypalStrategy(String eMail, String password){
        
        _EMAIL = eMail;
        _PASSWORD = password;
    }

    
    // methods
    
    /**
     * Pays via paypal.
     * @param amount the price amount
     */
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}