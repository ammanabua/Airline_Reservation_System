import jdk.jfr.FlightRecorder;

public class Booking {
    private String bookingCode;
    private Passenger passenger;
    private String destination;
    private String Origin;
    private FlightManager flightManager;

    public Booking(String bookingCode, Passenger passenger, String destination, String origin, FlightManager flightManager) {
        this.bookingCode = bookingCode;
        this.passenger = passenger;
        this.destination = destination;
        Origin = origin;
        this.flightManager = flightManager;

    }

    public String getBookingCode() {
        return bookingCode;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return Origin;
    }

    public FlightManager getFlightManager() {
        return flightManager;
    }



    private Ticket generateTicket(){

    }

}

