import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static Train intialisationPlace() {


        Train train = new Train(1);
        Wagon wagon = new Wagon(train, WagonType.PLATZKART, 1);
        Place place = new Place(train.getTrainId(), wagon.getWagonId(), 220, 1);

        List<Place> places = new ArrayList<>();
        places.add(place);

        return train;
    }

    public static LinkedList<TrainSchedule> intialisationTrainSchedule() {
        Date time = new Date();
        Station station = new Station("Lviv");
        Station station2 = new Station("Kyiv");

        TrainSchedule trainSchedule = new TrainSchedule(station,new Date(time.getTime()),new Date(time.getTime()));
        TrainSchedule trainSchedule2 = new TrainSchedule(station2,new Date(time.getTime()),new Date(time.getTime()));

        LinkedList<TrainSchedule> trainSchedules = new LinkedList<>();
        trainSchedules.add(trainSchedule);
        trainSchedules.add(trainSchedule2);
        return trainSchedules;
    }

    public static List<Customer> intialisationCustomer() {

        Customer vova = new Customer("Vova");
        List<Customer> customers = new ArrayList<>();
        customers.add(vova);
        return customers;
    }

    public static Route intialisationRoute() {
        Route route = new Route(intialisationPlace(), intialisationTrainSchedule());
       return route;
    }

    public static Trip intialisationTrip() {
        Trip trip = new Trip(intialisationRoute().getTrainSchedules().get(0),
                             intialisationRoute().getTrainSchedules().get(1),
                             intialisationCustomer(),
                              intialisationPlace().getWagons().get(0).getPlaces(),
                       1);
        return trip;
    }

    public static void main(String[] args) {
	// write your code here

      Trip trip =  intialisationTrip();
      Route route =  intialisationRoute();

       UserInterface userInterface = new UserInterface();

       Ticket ticket = userInterface.createTicket(trip,route);

       System.out.println(userInterface.offer(ticket));

    }
}
