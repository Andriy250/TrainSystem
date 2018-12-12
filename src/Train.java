import java.util.ArrayList;
import java.util.List;

public class Train {
    private int TRAIN_ID;
    private List<Wagon> wagons;

    public Train(int TRAIN_ID) {
        this.TRAIN_ID = TRAIN_ID;
        //this.wagons = wagons;
        wagons =new ArrayList<>();
        for (int i = 0 ;i < 3; ++i){
            wagons.add(new Wagon(TRAIN_ID, WagonType.PLATZKART, i));
        }
    }



    public int getTrainId() {
        return TRAIN_ID;
    }

    public void addWagon(Wagon wagon){ wagons.add(wagon); }

    public void removeWagon(int index){wagons.remove(index);}

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
