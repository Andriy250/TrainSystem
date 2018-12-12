import java.util.ArrayList;

public class Stations {
    private static ArrayList<Station> stations;
    static {
        stations.add(new Station("Lviv"));
        stations.add(new Station("Gorodok"));
        stations.add(new Station("Sambir"));
        stations.add(new Station("Chop"));
        stations.add(new Station("Rivne"));
        stations.add(new Station("Zhytomyr"));
        stations.add(new Station("Kyiv"));
        stations.add(new Station("Poltava"));
        stations.add(new Station("Harkiv"));
    }

    public static ArrayList<Station> getStations() {return stations;}

    public static Station getStantion(int index) {return stations.get(index);}

    public static void printStations(){
        int i = 0;
        for (Station st : stations) {
            i++;
            System.out.println(i + ". " + st.toString());
        }
    }

    public static Station findStationByName(String _name){
        for (Station st : stations) {
            if (st.getName().equals(_name)) return st;
        }
        return  null;
    }
}
