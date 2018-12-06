import java.util.List;

public class Train {
    private int trainId;
    private List<Wagon> wagons;

    public Train(int trainId, List<Wagon> wagons) {
        this.trainId = trainId;
        this.wagons = wagons;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId=" + trainId +
                ", wagons=" + wagons +
                '}';
    }
}
