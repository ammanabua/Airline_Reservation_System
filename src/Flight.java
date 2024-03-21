import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightId;
    private String origin;
    private String destination;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private List<Passenger> passengers;
    private Operator operator;
    private double price;
    private int capacity;
    private int bookedSeats = 0;

    Flight(String flightId, String origin, String destination, LocalDateTime departure, LocalDateTime arrival, Operator operator, double price, int capacity) {
        this.flightId = flightId;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.operator = operator;
        this.price = price;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getFlightId() {
        return flightId;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Operator getOperator() {
        return operator;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }
}
