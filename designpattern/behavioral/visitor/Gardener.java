package designpattern.behavioral.visitor;

/**
 * Abstract visitor.
 * @author Christian Kusan
 */
public interface Gardener {
    
    /**
     * Describes the visitation of roses.
     * @param rose the visited rose
     */
    void visit(Rose rose);
    
    /**
     * Describes the visitation of weed.
     * @param weed the visited weed
     */
    void visit(Weed weed);
}