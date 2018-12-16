import sun.plugin.javascript.navig.Array;

import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static List<Customer> initializationCustomer() {

        Customer vova = new Customer("Vova");
        List<Customer> customers = new ArrayList<>();
        customers.add(vova);
        return customers;
    }

    public static void main(String[] args) {

        Customer customer = initializationCustomer().get(0);
       UserInterface userInterface = new UserInterface();
       userInterface.setSchedule(new Schedule());
       userInterface.operator(customer);
    }
}
