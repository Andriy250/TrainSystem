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

    public Trip(Route startRoute,Route endRoute, List<Customer> customer, List<Place> places, int tripID) {
        this.tripID = tripID;
        this.startRoute = startRoute.getTrainSchedules().get(0).getStation();
        this.endRoute = endRoute.getTrainSchedules().get(1).getStation();
        this.arrivalTime = startRoute.getTrainSchedules().get(0).getArrivalTime();
        this.departureTime = endRoute.getTrainSchedules().get(1).getDepartureTime();
        Customer = customer;
        this.places = places;
    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
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
                ", Customer=" + Customer +
                ", places=" + places +
                '}';
    }
}
