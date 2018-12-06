import java.util.List;

public class Train {
    private static int TRAIN_ID = 0;
    private List<Wagon> wagons;

    public Train(List<Wagon> wagons) {
        TRAIN_ID += 1;
        this.wagons = wagons;
    }

    public int getTrainId() {
        return TRAIN_ID;
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
                "trainId=" + TRAIN_ID +
                ", wagons=" + wagons +
                '}';
    }
}
