import sun.security.krb5.internal.Ticket;

import java.util.Date;
import java.util.List;

public class UserInterface {

    private Customer customer;
    private Ticket tickets;


    public String offer(Customer customer, Ticket ticket){



        return "Ticket № " + tickets.getId() + "\n" +
                "Name " + customer.getName() + "\n" +
                "Arrive station :" + ticket.arriveStatione().getName()+ "\n"+
                "Date arrive" + "" + "\n" +
                "Depart station :" + ticket.departStation.getName() + "\n"+
                "Date depart" + ""+ "\n";
    }

}
