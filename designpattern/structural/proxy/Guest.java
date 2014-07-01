package designpattern.structural.proxy;

/**
 * The guest.
 * @author Christian Kusan
 */
public abstract class Guest {

    /**
     * Enters the club.
     * @param time the enter time
     */
    public void enter(int time) {
        
        Club club = Club.getInstance(time >= 20);
        club.check(this);
        club.letIn();
    }
    
}