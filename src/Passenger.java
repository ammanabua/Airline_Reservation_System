import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

<<<<<<< HEAD
=======
    public List<Booking> getBookings() {
        return bookings;
    }

    public Booking getBooking(String bookingId){
        Booking booking = null;
        for(Booking b: bookings){
            if(b.getBookingCode().equals(bookingId)){
                return booking = b;
            }
        }
        return booking;
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
>>>>>>> 53ce858ced9187f68a16699565a3f5d6c802ae2c
}
