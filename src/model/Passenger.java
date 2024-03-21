package model;

import java.time.LocalDate;
import java.util.Objects;

public class Passenger{

    private String passengerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private Booking booking;


    public Passenger(String passengerId, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, String bookingCode, String travelPlanId, String origin, String destination, LocalDate travelDate){
        this.passengerId = passengerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.booking = new Booking(bookingCode, this, travelPlanId, origin, destination, travelDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public boolean makePayment(String bookingId, double amount){
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(passengerId, passenger.passengerId) && Objects.equals(firstName, passenger.firstName) && Objects.equals(lastName, passenger.lastName) && Objects.equals(email, passenger.email) && Objects.equals(phoneNumber, passenger.phoneNumber) && Objects.equals(dateOfBirth, passenger.dateOfBirth) && Objects.equals(booking, passenger.booking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerId, firstName, lastName, email, phoneNumber, dateOfBirth, booking);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", passengerId, firstName, lastName, email, phoneNumber, dateOfBirth, booking.getBookingCode(), booking.travelPlan.getPlanId(), booking.travelPlan.getOrigin(), booking.travelPlan.getDestination(), booking.travelPlan.getTravelDate());


    }
}
