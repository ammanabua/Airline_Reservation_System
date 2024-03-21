import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Passenger{

    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    LocalDate dateOfBirth;
    List<Booking> bookings;
    public Passenger(String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.bookings = new ArrayList<>();

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

    public List<Booking> getBookings() {
        return bookings;
    }

    public Booking getBooking(String bookingCode){
        Object Supplier;
        return bookings.stream()
                .filter(b -> b.getBookingCode().equals(bookingCode))
                .findAny().orElseThrow();
    }

    public boolean makePayment(double amount, String bookingId, String flightId){
        if (getBooking(bookingId).getFlightManager().getFlightPrice(flightId) == amount){
            return true;
        }

        return false;
    }

    public Booking createBooking(String bookingCode, Passenger p, String origin, String destination){

        var newBooking = new Booking(bookingCode, this, origin, destination);
        bookings.add(newBooking);
        System.out.println("Booking Created");
        return newBooking;
    }

    public void addBooking(Booking b){
        if(b == null){
            System.out.println("Booking cannot be null");
        }
        bookings.add(b);
        System.out.println("Booking Added");
    }

    public void cancelBooking(String bookingCode){

    }

    public void modifyBooking(String bookingCode){

    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
