package designpattern.structural.adapter;

/**
 *
 * @author Christian Kusan
 */
public class LineService {

    /**
     * Draws a line.
     * @param x the start position on x axis
     * @param y the start position on y axis
     * @param x2 the end position on x axis
     * @param y2 the end position on y axis
     */
    public void draw(int x, int y, int x2, int y2){
        System.out.println("Draw a line from (" + x + ", " + y + ") to " + x2 + ", " + y2);
    }
}