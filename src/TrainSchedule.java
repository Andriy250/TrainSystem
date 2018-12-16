import java.util.Date;

public class TrainSchedule {
    private Station station;
    private Date arrivalTime;
    private Date departureTime;

    public TrainSchedule(Station station, Date arrivalTime, Date departureTime){
        this.station = station;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
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

    @Override
    public String toString() {
        return station.toString() + " Arrival time: " + arrivalTime.toString() + "  Departure time: " + departureTime.toString();
    }
}
