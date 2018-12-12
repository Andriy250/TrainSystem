import java.util.List;

public class Wagon {

    private int WAGON_ID;
    private int trainId;
    private WagonType type;
    private Place[] places;

    public Wagon(int trainId, WagonType type, int WAGON_ID) {
        this.WAGON_ID = WAGON_ID;
        this.trainId = trainId;
        this.type = type;
        places = new Place[20];
        for (int i = 0; i < 20; ++i){
            if (this.type == WagonType.PLATZKART) places[i] = new Place(trainId , WAGON_ID,20.0, i);
            else if (this.type == WagonType.COUPE) places[i] = new Place(trainId , WAGON_ID,100.0, i);
            else if (this.type == WagonType.SV) places[i] = new Place(trainId , WAGON_ID,200.0, i);
        }
    }

    public Place[] getPlaces() {
        return places;
    }

    public WagonType getType() {
        return type;
    }

    public void setType(WagonType type) {
        this.type = type;
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
