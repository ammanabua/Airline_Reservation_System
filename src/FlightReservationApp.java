import java.time.LocalDate;
import java.time.LocalDateTime;

public class FlightReservationApp {

    public static void main(String[] args) {
        System.out.println("Welcome to BTSUMMAN Airline Reservation App!");
        System.out.println("================================================");

        Passenger amman = new Passenger("Amman", "Abua", "amman@gmail.com", "214-582-2352", LocalDate.of(1970, 4, 27));
        Passenger umar = new Passenger("Umar", "Bunyaminu", "umar@gmail.com", "623-345-3850", LocalDate.of(1980, 5, 9));
        Passenger felix = new Passenger("Felix", "Payne", "fpayne@gmail.com", "353-345-3643", LocalDate.of(19960, 11, 18));

        Passenger sarah = new Passenger("Sarah", "Maxwell", "smaxwell@gmail.com", "835-983-0634", LocalDate.of(19960, 11, 18));



        FlightManager midWestOne = new FlightManager("MW35238");

        midWestOne.createFlight("LF3528", "ORD", "DSM", LocalDateTime.of(2024, 3, 24, 5, 30), LocalDateTime.of(2024, 3, 24, 7,30), Operator.AMERICAN, 500, 250);

        midWestOne.createFlight("MD3853", "PHL", "CDR", LocalDateTime.of(2024, 3, 22, 12, 30), LocalDateTime.of(2024, 3, 22, 14,30), Operator.UNITED, 800, 200);


        //Create Bookings

        amman.addBooking(new Booking("4534GH", amman, "ORD", "DSM"));
        System.out.println(amman.getBookings());


        System.out.println(midWestOne.getFlights());

    }
}
