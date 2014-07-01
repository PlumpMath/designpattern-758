package designpattern.behavioral.strategy;

/**
 * Concrete strategy.
 * @author Christian Kusan
 */
public class CreditCardStrategy implements PaymentStrategy {
    
    
    // attributes
    
    /** The card number. */
    final private String _CARD_NUMBER;
    
    /** The cvv. */
    final private String _CVV;
    
    /** The date. */
    final private String _DATE;
    
    /** The name. */
    final private String _NAME;
    
    
    // initializer
    
    /**
     * The default constructor.
     * @param name the name
     * @param cardNumber the card number
     * @param cvv the cvv
     * @param date the date
     */
    public CreditCardStrategy(String name, String cardNumber, String cvv, String date){
        
        _CARD_NUMBER = cardNumber;
        _CVV = cvv;
        _DATE = date;
        _NAME = name;
    }

    
    // methods
    
    /**
     * Pays via credit card.
     * @param amount the price amount
     */
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit card");
    }

}