package designpattern.structural.flyweight;

import java.awt.Color;
import java.awt.Point;

/**
 * Concrete flyweight.
 * @author Christian Kusan
 */
public class Line implements ILine {

    
    // attributes
    
    /** The color. */
    final private Color _color; 
	
	
    // initializer
    
    /**
     * The default constructor.
     * @param color the line color
     */
    public Line(Color color){
        _color = color;
    }

    
    // getter and setter
    
    /**
     * Gets the color.
     * @return the color
     */
    @Override
    public Color getColor(){
        return _color;
    }
	
    
    // methods
    
    /**
     * Draws the line.
     * @param p1 the line start point
     * @param p2 the line end point
     */
    @Override
    public void draw(Point p1, Point p2){
        System.out.println("Draws from " + p1.toString() + " to " + p2.toString());
    }

}