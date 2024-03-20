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
                return null;
            }
        }
        return flight;
    }
}
