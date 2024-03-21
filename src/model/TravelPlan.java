package model;

import java.time.LocalDate;
import java.util.Objects;

public class TravelPlan {

    private String planId;

    private String origin;
    private String destination;
    private LocalDate travelDate;

    TravelPlan(){

    }

    TravelPlan(String planId, String origin, String destination, LocalDate travelDate){
        this.planId = planId;
        this.origin = origin;
        this.destination = destination;
        this.travelDate = travelDate;
    }

    public String getPlanId() {
        return planId;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDate getTravelDate() {
        return travelDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelPlan that = (TravelPlan) o;
        return Objects.equals(planId, that.planId) && Objects.equals(origin, that.origin) && Objects.equals(destination, that.destination) && Objects.equals(travelDate, that.travelDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, origin, destination, travelDate);
    }
}
