package designpattern.structural.composite;

/**
 * A leaf in the composite pattern.
 * @author Christian Kusan
 */
public class Apple implements Eatable {

    /**
     * Eats the apple.
     */
    @Override
    public void eat() { System.out.println("The apple is eaten."); }
    
}