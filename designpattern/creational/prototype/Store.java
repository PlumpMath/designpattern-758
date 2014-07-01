package designpattern.creational.prototype;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Stores the shapes.
 * @author Christian Kusan
 */
public class Store {
    
    
    // attributes
    
    /** The map of stored shapes. */
    final private static Map<String, Shape> _SHAPES;
    
    
    // initializer
    
    /**
     * The static constructor.
     */
    static {
        _SHAPES = new HashMap<>();
    }
    
    public static void init(){
        
        Circle circle = new Circle();
        circle.setId("1");
        _SHAPES.put(circle.getId(), circle);
        
        Rectangle rect = new Rectangle();
        rect.setId("2");
        _SHAPES.put(rect.getId(), rect);
    }
    
    
    // static methods
    
    /**
     * Gets the stored shape.
     * @param shapeId the shape id
     * @return a clone of the shape
     */
    public static Shape getShape(String shapeId){
        
        Shape shape = null;
        
        try {
            shape = (Shape) _SHAPES.get(shapeId).clone();
        }
        catch(CloneNotSupportedException cex){
            cex.printStackTrace();
        }
        
        return shape;
    }
    
    
}