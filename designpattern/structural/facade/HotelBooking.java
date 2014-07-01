package designpattern.structural.facade;

import java.util.ArrayList;

/**
 * Books a hotel room.
 * @author Christian Kusan
 */
public class HotelBooking {
    
    
    // attributes
    
    /** Contains each bookable hotel. */
    private final ArrayList<Hotel> _HOTEL;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public HotelBooking() { 
        _HOTEL = new ArrayList<>(); 
        
        Hotel h1 = new Hotel();
        h1.setAvaiable(100813, 120813);
        
        Hotel h2 = new Hotel();
        h2.setAvaiable(041013, 071013);
        
        _HOTEL.add(h1);
        _HOTEL.add(h2);
    }
    
    
    // getter and setter
    
    /**
     * Gets a list of each bookable hotel.
     * @param from the start date
     * @param to the end date
     * @return a list of hotels
     */
    public ArrayList<Hotel> getHotelnamenFuer(int from, int to) {
        
        ArrayList<Hotel> avaiableHotels = new ArrayList<>();
        
        if(!_HOTEL.isEmpty())
            _HOTEL.stream().filter((h) -> (from >= h.getAvaiableFrom() && to <= h.getAvaiableTo())).forEach((h) -> {
                avaiableHotels.add(h);
            });
        return avaiableHotels;
    }
    
}