package designpattern.structural.proxy;

/**
 * Describes a disco party.
 * @author Christian Kusan
 */
public class Party {

    /**
     * The default constructor shows an example.
     */
    public Party() {
        
        StupidGuest artieZiff = new StupidGuest();
        SmartGuest homerSimpson = new SmartGuest();
        
        System.out.println("In the morning, the bodyguard sleeps:");
        artieZiff.enter(9);
        homerSimpson.enter(13);
        
        System.out.println("");
        
        System.out.println("At the evening, the bodyguard works:");
        artieZiff.enter(20);
        homerSimpson.enter(21);
    }
    
}