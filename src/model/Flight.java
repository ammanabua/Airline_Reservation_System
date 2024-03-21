package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightId;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private List<Passenger> passengers;
    private Operator operator;
    private double price;
    private int capacity;
    private int bookedSeats = 0;

    List<TravelPlan> travelPlans = new ArrayList<>();

    Flight(){

    }

    Flight(String flightId, LocalDateTime departure, LocalDateTime arrival, Operator operator, double price, int capacity, String travelPlanId, String origin, String destination, LocalDate travelDate) {
        this.flightId = flightId;
        this.departure = departure;
        this.arrival = arrival;
        this.operator = operator;
        this.price = price;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
        travelPlans.add(new TravelPlan(travelPlanId, origin, destination, travelDate));

    }

    public String getFlightId(){
        return flightId;
    }

    public List<TravelPlan> getTravelPlans(){
        return travelPlans;
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

    @Override
    public String toString(){
        return String.format("{ %s, model.Flight: %s, TravelPlans: %s, Departure: %s, Arrival: %s }\n", operator.getValue(), flightId, travelPlans, departure, arrival);
    }
}
