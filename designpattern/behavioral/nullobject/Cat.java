package designpattern.behavioral.nullobject;

/**
 * Real concrete object.
 * @author Christian Kusan
 */
public class Cat implements ICreature {

    /**
     * Eats.
     */
    @Override
    public void eat(){
        System.out.println("Eats.");
    }
}