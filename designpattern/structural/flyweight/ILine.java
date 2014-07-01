package designpattern.structural.flyweight;

import java.awt.Color;
import java.awt.Point;

/**
 * Abstract flyweight.
 * @author Christian Kusan
 */
public interface ILine {
    
    /**
     * Draws the line.
     * @param p1 the line start point
     * @param p2 the line end point
     */
    public void draw(Point p1, Point p2);
    
    /**
     * Gets the line color. 
     * @return the color
     */
    public Color getColor();
	
}