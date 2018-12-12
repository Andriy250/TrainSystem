import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {

    private Schedule schedule;

    public Ticket createTicket(Trip trip, Route route, Schedule schedule){

        this.schedule = schedule;

        if (route.checkRoute(trip.getStartRoute().getName(),trip.getEndRoute().getName(),trip.getArrivalTime())) {

            Ticket ticket = new Ticket(1);
            ticket.setCustomerName(trip.getCustomer().get(0).getName());
            ticket.setArrivalStation(trip.getStartRoute());
            ticket.setArrivalDate(ticket.getArrivalDate());
            ticket.setDepartureStation(trip.getEndRoute());
            ticket.setDepartureDate(trip.getDepartureTime());

            return ticket;

        }else return null;

    }

    public String offer(Ticket ticket){

        if (ticket != null) {

            return "Ticket № " + ticket.getId() + "\n" +
                    "Name " + ticket.getCustomerName() + "\n" +
                    "Arrive station :" + ticket.getArrivalStation().getName() + "\n" +
                    "Date arrive :" + ticket.getArrivalDate().toString() + "\n" +
                    "Depart station :" + ticket.getDepartureStation().getName() + "\n" +
                    "Date depart :" + ticket.getDepartureStation().toString() + "\n" +
                    "Route :" + schedule.getRoute(0).showPathToStation(ticket.getArrivalStation().getName(), ticket.getDepartureStation().getName()) + "\n" +
                    "Train №" + ticket.getTrainId()+"\n";
                    //"Price :" + ticket..getWagons().get(0).getPlaces()[0].getPrice();

        }else return "No tickets available";
    }

    public void operator(Customer user){
        Scanner sc = new Scanner(System.in);
        while(true){
            if (sc.nextLine().equals("get ticket")){
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
                    r.checkRoute(arrivalStation,departStation,dateArrival);
                    i++;
                    System.out.println("number " + i + " route: " + r.toString());
                }

                System.out.println("choose route: ");
                int chosenRoute = sc.nextInt() - 1;
                Ticket ticket = new Ticket(user.getName(), schedule.getRoute(chosenRoute).getTrain().getTrainId(),
                        Stations.findStationByName(arrivalStation),
                        Stations.findStationByName(departStation),
                        schedule.getRoute(chosenRoute).findDeparturTimeFromStartStation(Stations.findStationByName(departStation)),
                        schedule.getRoute(chosenRoute ).findDeparturTimeFromStartStation(Stations.findStationByName(arrivalStation)));
                System.out.println("Yor ticket: \n" + ticket.toString());
            }
            if (sc.nextLine().equals("ESC")) break;
        }
    }

    public void setSchedule(Schedule _schedule){
        schedule = _schedule;
    }
}
