import java.util.Date;

public class Ticket {

    private int id;
    private String customerName;
    private int trainid;
    private int placeNumber;
    private int wagonId;
    private Station arrivalStation;
    private Station departureStation;
    private Date arrivalDate;
    private Date departureDate;

    public Ticket(String customerName, int trainid, Station arrivalStation, Station departureStation, Date arDate, Date depDate
    , int placeNumber, int wagonId){
        this.id = hashCode();
        this.customerName = customerName;
        this.trainid = trainid;
        this.arrivalStation = arrivalStation;
        this.departureStation = departureStation;
        arrivalDate = arDate;
        departureDate = depDate;
        this.placeNumber = placeNumber;
        this.wagonId = wagonId;
    }

    public Ticket(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTrainId() {
        return trainid;
    }

    public Station getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(Station arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public Station getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(Station departureStation) {
        this.departureStation = departureStation;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getTrainid() {
        return trainid;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public int getWagonId() {
        return wagonId;
    }

    @Override
    public String toString() {
        return "Ticket #" + id + "  Customer: " + customerName + "  train #" + trainid +
                "  departure station: " + departureStation.toString() + "  arrival station: " +arrivalStation.toString() +
                " deprture time: " + departureDate.toString() + " arrival date: " + arrivalDate.toString() +
                "\n Wagon number: " + wagonId + "|Place number: " + placeNumber;
    }
}
