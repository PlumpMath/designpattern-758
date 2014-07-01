package designpattern.structural.composite;

/**
 * The consumer.
 * @author Christian Kusan
 */
public class Consumer {
 
    /**
     * The default constructor shows an example of the composite pattern.
     */
    public Consumer() {
        
        FruitComposite fruitBasket1 = new FruitComposite();
        FruitComposite fruitBasket2 = new FruitComposite();
        FruitComposite allFruits = new FruitComposite();
        
        Apple[] b = new Apple[8];
        for(int i = 0; i < 8; i++) { 
            b[i] = new Apple();
            if(i > 3) fruitBasket1.add(b[i]);
            else fruitBasket2.add(b[i]);
        }
        allFruits.add(fruitBasket1);
        allFruits.add(fruitBasket2);
        
        allFruits.eat();
    }
    
}