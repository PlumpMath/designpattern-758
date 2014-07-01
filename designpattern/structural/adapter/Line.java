package designpattern.structural.adapter;

/**
 * The line adapter.
 * @author Christian Kusan
 */
public class Line implements IShape {
    
    
    // attributes
    
    /** The line service. */
    final private LineService _LINE_SERVICE;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public Line(){
        _LINE_SERVICE = new LineService();
    }
    
    
    // methods
    
    /**
     * Draws the line.
     * @param x the start position on x axis
     * @param y the start position on y axis
     * @param x2 the end position on x axis
     * @param y2 the end position on y axis
     */
    @Override
    public void draw(int x, int y, int x2, int y2){
        
        _LINE_SERVICE.draw(x, y, x2, y2);
    }
    
}