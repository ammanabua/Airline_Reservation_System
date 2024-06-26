package model;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;

public class FlightManager {
    String flightManagerId;

    private List<Flight> flights;
    private List<Booking> bookedTravellers;

    public FlightManager(String flightManagerId){
        this.flightManagerId = flightManagerId;
        flights = new ArrayList<Flight>();
        bookedTravellers = new ArrayList<Booking>();
    }

    public String getFlightManagerId() {
        return flightManagerId;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Booking> getBookedTravellers() {
        return bookedTravellers;
    }

    public void addBookedTravellers(){

    }

    public void createFlight(String flightId, LocalDateTime departure, LocalDateTime arrival, Operator operator, double price, int capacity, String travelPlanId, String origin, String destination, LocalDate travelDate){
        var newFlight = new Flight(flightId, departure, arrival, operator, price, capacity, travelPlanId, origin, destination, travelDate);

        flights.add(newFlight);
    }

    public void addFlight(Flight f) {
        flights.add(f);
    }

    public Optional<Flight> getFlight(String flightId){
        return flights.stream()
                .filter(f -> f.getFlightId().equals(flightId))
                .findAny();
    }

    public OptionalDouble getFlightPrice(String flightId){
        return flights.stream()
                .filter(f -> f.getFlightId().equals(flightId))
                .mapToDouble(Flight::getPrice)
                .findAny();
    }

    public boolean cancelFlight(String flightId){
        for(Flight f: flights){
            if(f.getFlightId().equals(flightId)){
                flights.remove(f);
            }
            System.out.println("model.Flight Removed");
            return true;
        }
        System.out.println("model.Flight not found");
        return false;
    }

    public List<Flight> getAvailableFlights(String origin, String destination, LocalDate travelDate){
        List<Flight> availableFlights = new ArrayList<>();

        for(Flight f: flights){
            for(TravelPlan tp: f.getTravelPlans()){
                if (tp.getOrigin().equals(origin) && tp.getDestination().equals(destination) && tp.getTravelDate().equals(travelDate)){
                    availableFlights.add(f);
                }
            }
        }

        return availableFlights;
    }

    public boolean bookSeat(){
        return false;
    }

    Ticket generateTicket(String bookingCode, double amount, Passenger passenger, String flightId){
        Ticket ticket = null;
        for(Booking b: bookedTravellers){
            for(Flight f: flights){
                if(b.getBookingCode().equals(bookingCode) && b.getPassenger().equals(passenger) && f.getFlightId().equals(flightId) && f.getPrice() == amount){
                    ticket = new Ticket("3587DF", bookingCode, passenger, f, Category.FIRST_CLASS);
                } else {
                    System.out.println("Ticket Cannot be generated");
                }
            }
        }

        return ticket;
    }
}
