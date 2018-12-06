import java.sql.Date;

public class TrainSchedule {
    private Station station;
    private Date arrivalTime;
    private Date departureTime;

    public TrainSchedule(Station _station, Date _arrivalTime, Date _departureTime){
        station = _station;
        arrivalTime = (Date)_arrivalTime.clone();
        departureTime = (Date)_departureTime.clone();
    }

    @Override
    public String toString() {
        return station.toString() + " Arrival time: " + arrivalTime.toString() + " | Departure time: " + departureTime.toString();
    }
}
