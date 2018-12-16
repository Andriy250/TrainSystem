import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {

    private Schedule schedule;


    public void operator(Customer user){
        Scanner sc = new Scanner(System.in);
        while(true){
            String command =sc.nextLine();
            if (command.equals("get ticket")){
                System.out.println("Pls, enter depart station: ");
                String departStation = sc.nextLine();
                System.out.println("arrival station: ");
                String arrivalStation = sc.nextLine();
                System.out.println("Arrival time, sir: ");
                String time = sc.nextLine();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
                Date dateArrival = null;
                try {
                    dateArrival = formatter.parse(time);
                } catch (Exception ex) {
                    System.out.println("Parse Exception in operator method");
                }
                int i = 0;
                for (Route r : schedule.getRoutes()){
                    if (r.checkRoute(departStation,arrivalStation, dateArrival)) {
                        i++;
                        System.out.println("number " + i + " route: " + r.toString());
                    }
                }
                if (i == 0) {
                    System.out.println("Sorry, there are no routes you wanted. You will be alone on the holidays.");
                    continue;
                }
                System.out.println("choose route: ");
                int chosenRoute = sc.nextInt() - 1;
                System.out.println("\nchoose wagon: ");
                for (Wagon w : schedule.getRoute(chosenRoute).getTrain().getWagons()) System.out.println(w);
                int chosenWagon = sc.nextInt();
                System.out.println("\nchoose place: ");
                for (Place p : schedule.getRoute(chosenRoute).getTrain().getWagons().get(chosenWagon).getPlaces()) p.printFreePlace();
                int chosenPlace = sc.nextInt();
                if (!schedule.getRoute(chosenRoute).getTrain().getWagons().get(chosenWagon).getPlaces()[chosenPlace].checkPlace()) {
                    System.out.println("Sorry, compadre, you late. Somebody already bought it(");
                    continue;
                }
                Ticket ticket = new Ticket(user.getName(), schedule.getRoute(chosenRoute).getTrain().getTrainId(),
                        Stations.findStationByName(arrivalStation),
                        Stations.findStationByName(departStation),
                        schedule.getRoute(chosenRoute).findDeparturTimeFromStartStation(Stations.findStationByName(departStation)),
                        schedule.getRoute(chosenRoute ).findDeparturTimeFromStartStation(Stations.findStationByName(arrivalStation)),
                        chosenPlace,
                        chosenWagon);
                schedule.getRoute(chosenRoute).getTrain().getWagons().get(chosenWagon).getPlaces()[chosenPlace].placeIsTaken();
                System.out.println("Yor ticket: \n" + ticket.toString());
            }
            if (command.equals("schedule")) schedule.printSchedule();
            if (command.equals("ESC")) break;
        }
    }

    public void setSchedule(Schedule _schedule){
        schedule = _schedule;
    }
}
