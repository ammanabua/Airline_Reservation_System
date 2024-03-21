import model.FlightManager;
import model.Operator;
import model.Passenger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class FlightReservationApp {

    public static void main(String[] args) {
        System.out.println("Welcome to BTSUMMARN Airline Reservation App!");
        System.out.println("================================================");


        Passenger amman = new Passenger("2345KB", "Amman", "Abua", "amman@gmail.com", "214-582-2352", LocalDate.of(1970, 4, 27), "AE573453", "354536DF","ORD", "DSM", LocalDate.of(2024, 3, 24));

        Passenger umar = new Passenger("68346LM", "Umar", "Bunyaminu", "umar@gmail.com", "623-345-3850", LocalDate.of(1980, 5, 9), "ID235894", "34734GD", "PHL", "CDR", LocalDate.of(2024, 3, 24));

        Passenger felix = new Passenger("85345HE", "Felix", "Payne", "fpayne@gmail.com", "353-345-3643", LocalDate.of(1990, 11, 18), "GE97345", "37985DB", "TUS", "ONT", LocalDate.of(2024, 9, 20));

        Passenger sarah = new Passenger("83435HD", "Sarah", "Maxwell", "smaxwell@gmail.com", "835-983-0634", LocalDate.of(19960, 11, 18), "BS38532", "54387EI", "LIT", "LAX", LocalDate.of(2023, 8, 2));

        System.out.println("Passengers");
        System.out.println("======================");
        var passengers = List.of(amman, umar, felix, sarah);

        FlightManager midWestOne = new FlightManager("MW35238");

        midWestOne.createFlight("LF3528", LocalDateTime.of(2024, 9, 20, 10, 25),LocalDateTime.of(2024, 9, 20, 12, 45), Operator.AMERICAN,500, 250,"32584KH", "ORD", "DSM", LocalDate.of(2024, 3, 24));

        midWestOne.createFlight("MD3853", LocalDateTime.of(2024, 3, 22, 12, 30),LocalDateTime.of(2024, 3, 22, 14,30), Operator.AMERICAN,800, 200,"274359VD", "PHL", "CDR", LocalDate.of(2024, 3, 26));



        //Create Bookings

//        amman.addBooking(new model.Booking("4534GH", amman, "ORD", "DSM"));
//        System.out.println(amman.getBookings());


        passengers.forEach(System.out::println);

    }
}
