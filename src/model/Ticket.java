package model;

public class Ticket {
    private String ticketId;
    private String bookingReference;
    private String seatNo;
    private Passenger passenger;
    private Flight flightDetails;
    private Category seatClass;

    Ticket() {

    }

    Ticket(String ticketId, String bookingReference , Passenger passenger, Flight flightDetails, Category seatClass) {
        this.ticketId = ticketId;
        this.bookingReference = bookingReference;
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

    @Override
    public String toString() {
        return String.format("===============================================\n TICKET INFORMATION %s \n Passenger: %s %s, \n FlightDetails: %s \n Seat: %s \n We are glad to server you at BTSUMMARN Reservations.", ticketId, passenger.getFirstName(), passenger.getLastName(), flightDetails.travelPlans, "24A");
    }
}
