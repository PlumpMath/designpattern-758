package designpattern.structural.facade;

import java.util.ArrayList;

/**
 * Books a seat in an aeroplane.
 * @author Christian Kusan
 */
public class FlightBooking {

    
    // attributes
    
    /** Contains each bookable aeroplane. */
    final private ArrayList<Aeroplane> _PLANES;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public FlightBooking() { 
        _PLANES = new ArrayList<>(); 
        
        Aeroplane plane1 = new Aeroplane();
        plane1.setAvaiable(100813, 120813);
        
        Aeroplane plane2 = new Aeroplane();
        plane2.setAvaiable(100813, 110813);
        
        _PLANES.add(plane1);
        _PLANES.add(plane2);
    }
    
    
    // getter and setter
    
    /**
     * Gets a list of each bookable aeroplanes.
     * @param from the start date
     * @param to the end date
     * @return a list of aeroplanes
     */
    public ArrayList<Aeroplane> getAeroplanesFor(int from, int to) {
        
        ArrayList<Aeroplane> avaiableAeroplanes = new ArrayList<>();
        
        if(!_PLANES.isEmpty())
            _PLANES.stream().filter((plane) -> (from >= plane.getAvaiableFrom() && to <= plane.getAvaiableTo())).forEach((plane) -> {
                avaiableAeroplanes.add(plane);
        });
        
        return avaiableAeroplanes;
    }
   
}