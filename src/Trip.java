import java.util.List;

public class Trip {

    private static int tripID  = 0;
    private Route route;
    private List<Customer> Customer;
    private List<Place> places;

    public Trip(Route route, List<Customer> customer, List<Place> places) {
        this.tripID +=1;
        this.route = route;
        Customer = customer;
        this.places = places;
    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
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
                "route=" + route +
                ", Customer=" + Customer +
                ", places=" + places +
                '}';
    }
}
