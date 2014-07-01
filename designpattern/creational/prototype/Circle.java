package designpattern.creational.prototype;

/**
 * Concrete prototype.
 * @author Christian Kusan
 */
public class Circle extends Shape {

    
    // initializer
    
    /**
     * The default constructor.
     */
    public Circle(){
        _type = "Circle";
    }

    /**
     * Draws the circle.
     */
    @Override
    public void draw() {
        System.out.println("Draws the circle.");
    }
    
}