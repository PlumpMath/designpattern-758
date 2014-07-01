package designpattern.behavioral.nullobject;

/**
 * Shows an use case of the null object pattern.
 * @author Christian Kusan
 */
public class NullObjectExample {

    /**
     * The default constructor.
     */ 
    public NullObjectExample(){
        
        ICreature cat = new Cat();
        cat.eat();
        
        // instead of assigning NULL
        ICreature unknown = new Unknown();
        unknown.eat();
    }
}