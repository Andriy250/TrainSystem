import java.util.List;

public class Wagon {

    private int wagonId;
    private int trainId;
    private WagonType type;
    private List<Place> places;

    public Wagon(int wagonId, int trainId, WagonType type, List<Place> places) {
        this.wagonId = wagonId;
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

    public Wagon(int wagonId, int trainId, List<Place> places) {
        this.wagonId = wagonId;
        this.trainId = trainId;
        this.places = places;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public int getWagonId() {
        return wagonId;
    }

    public void setWagonId(int wagonId) {
        this.wagonId = wagonId;
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
                "wagonId=" + wagonId +
                ", trainId=" + trainId +
                ", type=" + type +
                ", places=" + places +
                '}';
    }
}
