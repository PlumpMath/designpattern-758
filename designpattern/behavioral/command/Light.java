package designpattern.behavioral.command;

/**
 * Receiver object.
 * @author Christian Kusan
 */
public class Light {
    
    /**
     * Switch the light off.
     */
    public void off() {
        System.out.println("The light is off.");
    }
    
    /**
     * Switch the light on.
     */
    public void on() {
        System.out.println("The light is on.");
    }
}