import jdk.jfr.FlightRecorder;

import java.time.LocalDateTime;

public class Booking {
    private String bookingCode;
    private LocalDateTime bookingDate;
    private Passenger passenger;
    private String destination;
    private String origin;
//    String flighManager;
    private FlightManager flightManager;

    Booking(String bookingCode, Passenger passenger, String origin, String destination) {
        this.bookingCode = bookingCode;
        this.passenger = passenger;
        this.bookingDate = LocalDateTime.now();
        this.origin = origin;
        this.destination = destination;


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
        return origin;
    }

    public FlightManager getFlightManager() {
        return flightManager;
    }



<<<<<<< HEAD
    private Ticket generateTicket() {
=======
    private Ticket generateTicket(String bookingCode, double amount, Passenger passenger, String flightId){
>>>>>>> 53ce858ced9187f68a16699565a3f5d6c802ae2c

        if(!passenger.makePayment(amount, bookingCode, flightId)){
            System.out.println("Payment Incomplete");
            return null;
        }
        System.out.println("Payment Successful\nGenerating Ticket...");
        return new Ticket("GKER358", bookingCode, "18A", passenger, flightManager.getFlight(flightId), Category.FIRST_CLASS);
    }

}

