package designpattern.behavioral.visitor;

/**
 * Concrete element.
 * @author Christian Kusan
 */
public class Weed implements Flower {

    /**
     * Accepts the visitor.
     * @param gardener the visitor
     */
    @Override
    public void accept(Gardener gardener) { 
        gardener.visit(this); 
    }
    
    /**
     * Describes how the weed shall handled.
     */
    public void prune(){
        System.out.println("The gardener prunes the weed regardless of the consequences.");
    }
}