package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Booking {
    private String bookingCode;
    private LocalDateTime bookingDate;
    private Passenger passenger;
    TravelPlan travelPlan;


    Booking(String bookingCode, Passenger passenger, String travelPlanId, String origin, String destination, LocalDate travelDate) {
        this.bookingCode = bookingCode;
        this.passenger = passenger;
        this.bookingDate = LocalDateTime.now();
        this.travelPlan = new TravelPlan(travelPlanId, origin, destination, travelDate);
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public TravelPlan getTravelPlan() {
        return travelPlan;
    }


    @Override
    public String toString() {
        return String.format("Booking: %s, %s, %s, %s, For: %s %s", bookingCode, travelPlan.getOrigin(), travelPlan.getDestination(), travelPlan.getTravelDate(), passenger.getFirstName(), passenger.getLastName());
    }
}

