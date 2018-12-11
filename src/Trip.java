import java.util.Date;
import java.util.List;

public class Trip {

    private int tripID ;
    private Station startRoute;
    private Station endRoute;
    private Date arrivalTime;
    private Date departureTime;
    private List<Customer> Customer;
    private List<Place> places;

    public Trip(TrainSchedule startRoute,TrainSchedule endRoute, List<Customer> customer, List<Place> places, int tripID) {
        this.tripID = tripID;
        this.startRoute = startRoute.getStation();
        this.endRoute = endRoute.getStation();
        this.arrivalTime = startRoute.getArrivalTime();
        this.departureTime = endRoute.getDepartureTime();
        Customer = customer;
        this.places = places;
    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Station getStartRoute() {
        return startRoute;
    }

    public void setStartRoute(Station route) {
        this.startRoute = route;
    }

    public Station getEndRoute() {
        return endRoute;
    }

    public void setEndRoute(Station endRoute) {
        this.endRoute = endRoute;
    }

    public List<Customer> getCustomer() {
        return Customer;
    }

    public void setCustomer(List<Customer> customer) {
        Customer = customer;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "startRoute=" + startRoute +
                ", endRoute=" + endRoute +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                    Customer +
                ", places=" + places +
                '}';
    }
}
