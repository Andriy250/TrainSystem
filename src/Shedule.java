import java.util.ArrayList;


public class Shedule {

    private static ArrayList<Route> route = new ArrayList<Route>();;

    public Shedule(ArrayList<Route> route) {
        this.route = route;
    }

    public void addExactRoute(Route route){
        this.route.add(route);

    }

    public static ArrayList<Route> getRoute() {
        return route;
    }
}
