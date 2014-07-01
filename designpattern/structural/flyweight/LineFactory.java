package designpattern.structural.flyweight;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Flyweight factory.
 * @author Christian Kusan
 */
public class LineFactory {
    
    
    // attributes
    
    /** Contains the lines. */
    final private List<Line> _LINES; 
	
    
    // initializer
    
    /**
     * The default constructor.
     */
    public LineFactory(){
        _LINES = new ArrayList<>();
    }
    
    
    // methods
    
    /**
     * Gets a line.
     * @param color the line color
     * @return the line
     */
    public Line getLine(Color color){
		
        // return line if already exists
        for(Line line: _LINES)
            if(line.getColor().equals(color))
		return line;
		
        // otherwise: draw
        Line line = new Line(color);
        _LINES.add(line);
        
        return line;
    }
}