import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    public void createFlight(String flightId, String origin, String destination, LocalDateTime departure, LocalDateTime arrival, Operator operator, double price, int capacity){
        var newFlight = new Flight(flightId, origin, destination, departure, arrival, operator, price, capacity);

        flights.add(newFlight);
    }

    public void addFlight(Flight f) {
        flights.add(f);
    }

    public Flight getFlight(String flightId){
        Flight flight = null;
        for(Flight f: flights){
            if(f.getFlightId().equals(flightId)){
                flight = f;
            }
            else {
                System.out.println("Flight doesn't exist in the logs");
                return flight;
            }
        }
        return flight;
    }

    public double getFlightPrice(String flightId){
        return flights.stream()
                .filter(t -> t.getFlightId().equals(flightId))
                .mapToDouble(Flight::getPrice)
                .sum();
    }

    public boolean cancelFlight(String flightId){
        for(Flight f: flights){
            if(f.getFlightId().equals(flightId)){
                flights.remove(f);
            }
            System.out.println("Flight Removed");
            return true;
        }
        System.out.println("Flight not found");
        return false;
    }

    public List<Flight> getAvailableFlights(String origin, String destination, LocalDateTime departure){
        return flights.stream()
                .filter(f -> f.getOrigin().equals(origin) && f.getDestination().equals(destination) && f.getDeparture().equals(departure))
                .toList();
    }

    public boolean bookSeat(){
        return false;
    }
}
