import sun.plugin.javascript.navig.Array;

import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static Train initializationPlace() {

        Train train = new Train(1);

        return train;
    }

    public static LinkedList<TrainSchedule> initializationTrainSchedule() throws Exception{
        Date time = new Date();
        Station station = new Station("Lviv");
        Station station2 = new Station("Kyiv");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        TrainSchedule trainSchedule = new TrainSchedule(station,
                    formatter.parse("31/12/2018 14:00:00"),  formatter.parse("31/12/2018 14:15:00"));
        TrainSchedule trainSchedule2 = new TrainSchedule(station2, new Date(time.getTime()), new Date(time.getTime()));
        LinkedList<TrainSchedule> trainSchedules = new LinkedList<>();
        trainSchedules.add(trainSchedule);
        trainSchedules.add(trainSchedule2);
        return trainSchedules;
    }

    public static List<Customer> initializationCustomer() {

        Customer vova = new Customer("Vova");
        List<Customer> customers = new ArrayList<>();
        customers.add(vova);
        return customers;
    }

    public static Route initializationRoute() {
        try{
            Route route = new Route(initializationPlace(), initializationTrainSchedule());
            return route;
        } catch (Exception ex) {}
        return null;
    }

    public static Trip initializationTrip() {
        Trip trip = new Trip(initializationRoute().getTrainSchedules().get(0),
                initializationRoute().getTrainSchedules().get(1),
                initializationCustomer(),
                Arrays.asList(initializationPlace().getWagons().get(0).getPlaces()),
                       1);
        return trip;
    }

    public static void main(String[] args) {
        initializationPlace();
        try {
            initializationTrainSchedule();
        } catch (Exception ex) {
            System.out.println("exeption in trainSchedule initialization");
        }
        Customer customer = initializationCustomer().get(0);
        //Schedule schedule = new Schedule();
        Route route = initializationRoute();
        Trip trip = initializationTrip();


       UserInterface userInterface = new UserInterface();
       userInterface.setSchedule(new Schedule());
       userInterface.operator(customer);

    }
}
