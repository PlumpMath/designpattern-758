package designpattern.behavioral.visitor;

/**
 * Concrete element.
 * @author Christian Kusan
 */
public class Rose implements Flower {

    /**
     * Accepts the visitor.
     * @param gardener the visitor
     */
    @Override
    public void accept(Gardener gardener) { 
        gardener.visit(this); 
    }
    
    /**
     * Describes how the rose shall handled.
     */
    public void prune() { 
        System.out.println("The gardener prunes the roses carefully."); 
    }
    
}