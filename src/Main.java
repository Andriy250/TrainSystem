import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Date time = new Date();

        Train train = new Train();
        Wagon wagon = new Wagon(train,WagonType.PLATZKART);
        Place place = new Place(train,wagon,220);
        Station station = new Station("Lviv");
        Station station2 = new Station("Kyiv");
        TrainSchedule trainSchedule = new TrainSchedule(station,new Date(time.getTime()),new Date(time.getTime()));
        TrainSchedule trainSchedule2 = new TrainSchedule(station2,new Date(time.getTime()),new Date(time.getTime()));
        Customer customerVova = new Customer("Vova");

        List<Customer>  customers = new ArrayList<>();
        List<Place> places = new ArrayList<>();
        List<TrainSchedule> trainSchedules = new ArrayList<>();

        customers.add(customerVova);
        places.add(place);
        trainSchedules.add(trainSchedule);
        trainSchedules.add(trainSchedule2);

        Trip trip = new Trip(new Route(train,trainSchedules),new Route(train,trainSchedules),customers,places);
        System.out.println(trip);

    }
}
