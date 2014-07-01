package designpattern.creational.prototype;

/**
 * Concrete prototype.
 * @author Christian Kusan
 */
public class Rectangle extends Shape {

    
    // initializer
    
    /**
     * The default constructor.
     */
    public Rectangle(){
        _type = "Rectangle";
    }

    
    // methods
    
    /**
     * Draws the rectangle.
     */
    @Override
    public void draw() {
        System.out.println("Draws the rectangle.");
    }
    
}