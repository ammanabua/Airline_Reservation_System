public class Ticket {
    private String ticketId;
    private Booking bookingReference;
    private int numOfSeats;
    private Passenger passenger;
    private Flight flightDetails;
    private Category seatClass;
    public Ticket() {}

    public Ticket(String ticketId, Booking bookingReference, int numOfSeats, Passenger passenger, Flight flightDetails, Category seatClass) {
        this.ticketId = ticketId;
        this.bookingReference = bookingReference;
        this.numOfSeats = numOfSeats;
        this.passenger = passenger;
        this.flightDetails = flightDetails;
        this.seatClass = seatClass;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Booking getBookingReference() {
        return bookingReference;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlightDetails() {
        return flightDetails;
    }

    public Category getSeatClass() {
        return seatClass;
    }
}
