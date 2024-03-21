public class Ticket {
    private String ticketId;
    private String bookingReference;
    private String seatNo;
    private Passenger passenger;
    private Flight flightDetails;
    private Category seatClass;
    public Ticket() {}

    public Ticket(String ticketId, String bookingReference, String seatNo , Passenger passenger, Flight flightDetails, Category seatClass) {
        this.ticketId = ticketId;
        this.bookingReference = bookingReference;
        this.seatNo = seatNo;
        this.passenger = passenger;
        this.flightDetails = flightDetails;
        this.seatClass = seatClass;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public String getSeatNo() {
        return seatNo;
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
