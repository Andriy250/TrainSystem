

public class UserInterface {

    private Route route;

    public Ticket createTicket(Trip trip, Route route){

        this.route = route;

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
                    "Route :" + route.showPathToStation(ticket.getArrivalStation().getName(), ticket.getDepartureStation().getName()) + "\n" +
                    "Train №" + ticket.getTrain().getTrainId()+"\n"+
                    "Price :" + ticket.getTrain().getWagons().get(0).getPlaces().get(0).getPrice();

        }else return "No tickets available";
    }

}
