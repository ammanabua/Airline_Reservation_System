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



    private Ticket generateTicket(String bookingCode, double amount, Passenger passenger, String flightId){

        if(!passenger.makePayment(amount, bookingCode, flightId)){
            System.out.println("Payment Incomplete");
            return null;
        }
        System.out.println("Payment Successful\nGenerating Ticket...");
        return new Ticket("GKER358", bookingCode, passenger, flightManager.getFlight(flightId), Category.FIRST_CLASS);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", bookingDate=" + bookingDate +
                ", passenger=" + passenger +
                ", destination='" + destination + '\'' +
                ", origin='" + origin + '\'' +
                ", flightManager=" + flightManager +
                '}';
    }
}

