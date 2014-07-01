package designpattern.behavioral.visitor;

/**
 * Describes a scene for the visitor pattern.
 * @author Christian Kusan
 */
public class Garden {

    /**
     * The default constructor.
     */
    public Garden(){
    
        // creates a bed of flowers and weed
        Flower[] bed = new Flower[10];
        for(int i = 0; bed.length > i; ++i)
            bed[i] = (5 > i) ? new Rose() : new Weed();
        
        // gardener works now
        Gardener hans = new FlowerGrower();
        
        for(int i = 0; bed.length > i; ++i) 
            bed[i].accept(hans);
    }
}