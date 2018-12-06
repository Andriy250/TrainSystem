import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Date time = new Date();

        Train train = new Train();
        Wagon wagon = new Wagon();
        Place place = new Place(train,wagon,"CUPE",220);
        Station station = new Station("Lviv");
        TrainSchedule trainSchedule = new TrainSchedule(station,new Date(time.getTime()),new Date(time.getTime()));

        Customer customerVova = new Customer("Vova");

        List<Customer>  customers = new ArrayList<>();
        List<Place> places = new ArrayList<>();
        List<TrainSchedule> trainSchedules = new ArrayList<>();
        customers.add(customerVova);
        places.add(place);
        trainSchedules.add(trainSchedule);

        Trip trip = new Trip(new Route(train,trainSchedules),customers,places);
        System.out.println(trip);

    }
}
