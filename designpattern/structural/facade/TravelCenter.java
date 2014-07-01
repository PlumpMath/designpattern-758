package designpattern.structural.facade;

/**
 * The facade that combines multiple classes to an interface.
 * @author Christian Kusan
 */
public class TravelCenter {
    
    
    // attributes
    
    /** Books an aeroplane. */
    final private FlightBooking _FLIGHT_BOOKING;
    
    /** Books a hotel. */
    final private HotelBooking _HOTEL_BOOKING;
    
    
    // initializer
    
    /**
     * The default constructor.
     */
    public TravelCenter() {
        
        _HOTEL_BOOKING = new HotelBooking();
        _FLIGHT_BOOKING = new FlightBooking();
        
        // example
        TravelCenter.this.getAeroplanesAndHotels(100813, 120813);
    }
    
    
    // getter and setter
    
    /**
     * Gets all avaiable hotels and aeroplanes of a certain time interval.
     * @param from the start date
     * @param to the end date
     */
    public void getAeroplanesAndHotels(int from, int to) {
        
        _FLIGHT_BOOKING.getAeroplanesFor(from, to).stream().filter((plane) -> (null != plane)).forEach((plane) -> {
            System.out.println(plane.toString());
        });
        
        _HOTEL_BOOKING.getHotelnamenFuer(from, to).stream().filter((hotel) -> (null != hotel)).forEach((hotel) -> {
            System.out.println(hotel.toString());
        });
    }
    
}