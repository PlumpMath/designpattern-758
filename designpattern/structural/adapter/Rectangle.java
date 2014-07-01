package designpattern.structural.adapter;

/**
 * The rectangle adapter.
 * @author Christian Kusan
 */
public class Rectangle implements IShape {
    
    
    // attributes
    
    /** The rectangle service. */
    final private RectangleService _RECT_SERVICE;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public Rectangle(){
        _RECT_SERVICE = new RectangleService();
    }
    
    
    // methods
    
    /**
     * Draws the rectangle.
     * @param x the start position on x axis
     * @param y the start position on y axis
     * @param x2 the end position on x axis
     * @param y2 the end position on y axis
     */
    @Override
    public void draw(int x, int y, int x2, int y2){
        
        _RECT_SERVICE.draw(Math.min(x, x2), 
                            Math.min(y, y2),
                            Math.abs(x2 - x),
                            Math.abs(y2 - y));
    }
}