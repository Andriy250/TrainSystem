import java.sql.Date;

public class TrainSchedule {
    private Station station;
    private Date arrivalTime;
    private Date departureTime;

    public TrainSchedule(Station station, Date arrivalTime, Date departureTime){
        this.station = station;
        this.arrivalTime = (Date)arrivalTime.clone();
        this.departureTime = (Date)departureTime.clone();
    }

    @Override
    public String toString() {
        return station.toString() + " Arrival time: " + arrivalTime.toString() + " | Departure time: " + departureTime.toString();
    }
}
