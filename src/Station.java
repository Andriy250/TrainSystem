public class Station {
    private String name;

    public Station(String _name){
        name = _name;
    }

    public String getName(){ return name;}

    public void setName(String _name) { name = _name;}

    @Override
    public String toString() {
        return "Station: " + name ;
    }
}
