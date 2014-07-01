package designpattern.structural.adapter;

/**
 * The rectangle service.
 * @author Christian Kusan
 */
public class RectangleService {

    /**
     * Draws a rectangle.
     * @param x the position on x axis
     * @param y the position on y axis
     * @param width the width
     * @param height the height
     */
    public void draw(int x, int y, int width, int height){
        System.out.println(""
                + "Draw a rectangle at (" + x + ", " + y + ") with width "
                + width + " and height " + height);
    }
}