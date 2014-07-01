package designpattern.behavioral.visitor;

/**
 * Concrete visitor.
 * @author Christian Kusan
 */
public class FlowerGrower implements Gardener {

    /**
     * Describes the visitation of roses.
     * @param rose the visited rose
     */
    @Override
    public void visit(Rose rose) { 
        rose.prune(); 
    }
    
    /**
     * Describes the visitation of weed.
     * @param weed the visited weed
     */
    @Override
    public void visit(Weed weed){
        weed.prune();
    }
}