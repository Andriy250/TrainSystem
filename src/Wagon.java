import java.util.List;

public class Wagon {

    private static int WAGON_ID = 0;
    private int trainId;
    private WagonType type;
    private List<Place> places;

    public Wagon(int trainId, WagonType type, List<Place> places) {
        WAGON_ID +=1;
        this.trainId = trainId;
        this.type = type;
        this.places = places;
    }

    public WagonType getType() {
        return type;
    }

    public void setType(WagonType type) {
        this.type = type;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public int getWagonId() {
        return WAGON_ID;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "wagonId=" + WAGON_ID +
                ", trainId=" + trainId +
                ", type=" + type +
                ", places=" + places +
                '}';
    }
}
