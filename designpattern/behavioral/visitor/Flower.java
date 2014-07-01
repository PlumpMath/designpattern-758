package designpattern.behavioral.visitor;

/**
 * Abstract element.
 * @author Christian Kusan
 */
public interface Flower {

    /**
     * Accepts a visitor.
     * @param gardener the gardener
     */
    public void accept(Gardener gardener);
}