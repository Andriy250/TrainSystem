import java.util.List;

public class Train {
    private int TRAIN_ID;
    private List<Wagon> wagons;

    public Train(int TRAIN_ID) {
        this.TRAIN_ID = TRAIN_ID;
        //this.wagons = wagons;
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
