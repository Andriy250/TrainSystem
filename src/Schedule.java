import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;


public class Schedule {

    private ArrayList<Route> routes = new ArrayList<Route>();;

    public Schedule(ArrayList<Route> routes) {
        this.routes = routes;
    }

    public Schedule() {
        try{
            initializeSchedule();
        } catch (ParseException ex) {
            System.out.println("Exeption in initializeSchedule()");
        }
    }

    private void initializeSchedule() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

        LinkedList<TrainSchedule> trainSchedules = new LinkedList<>();
        System.out.println(formatter.parse("31-Dec-2018 15:00:00").toString());// + "  " + formatter.parse("31/12/2018 15:15:00"));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(0), formatter.parse("31-Dec-2018 14:00:00"),
                formatter.parse("31-Dec-2018 14:15:00")));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(1), formatter.parse("31-Dec-2018 15:00:00"),
                formatter.parse("31-Dec-2018 15:15:00")));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(2), formatter.parse("31-Dec-2018 16:00:00"),
                formatter.parse("31-Dec-2018 16:15:00")));

        routes.add(new Route(new Train(1), trainSchedules));
        trainSchedules = new LinkedList<>();
        trainSchedules.add(new TrainSchedule(Stations.getStantion(2), formatter.parse("31-Dec-2018 13:00:00"),
                formatter.parse("31-Dec-2018 13:15:00")));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(3), formatter.parse("31-Dec-2018 14:00:00"),
                formatter.parse("31-Dec-2018 14:15:00")));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(4), formatter.parse("31-Dec-2018 15:00:00"),
                formatter.parse("31-Dec-2018 15:15:00")));

        routes.add(new Route(new Train(2), trainSchedules));
        trainSchedules = new LinkedList<>();
        trainSchedules.add(new TrainSchedule(Stations.getStantion(2), formatter.parse("31-Dec-2018 9:00:00"),
                formatter.parse("31-Dec-2018 9:15:00")));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(3), formatter.parse("31-Dec-2018 10:00:00"),
                formatter.parse("31-Dec-2018 10:15:00")));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(4), formatter.parse("31-Dec-2018 11:00:00"),
                formatter.parse("31-Dec-2018 11:15:00")));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(5), formatter.parse("31-Dec-2018 12:00:00"),
                formatter.parse("31-Dec-2018 12:15:00")));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(6), formatter.parse("31-Dec-2018 13:00:00"),
                formatter.parse("31-Dec-2018 13:15:00")));
        trainSchedules.add(new TrainSchedule(Stations.getStantion(7), formatter.parse("31-Dec-2018 14:00:00"),
                formatter.parse("31-Dec-2018 14:15:00")));
        routes.add(new Route(new Train(3), trainSchedules));
    }


    public void addExactRoute(Route route) {
        this.routes.add(route);

    }

    public Route getRoute(int index) {
        return routes.get(index);
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

}
