package designpattern.structural.adapter;

/**
 * The adapter target.
 * @author Christian Kusan
 */
public interface IShape {
    
    /**
     * Draws a shape.
     * @param x the position on x axis
     * @param y the position on y axis
     * @param width the width
     * @param height the height
     */
    public void draw(int x, int y, int width, int height);

}