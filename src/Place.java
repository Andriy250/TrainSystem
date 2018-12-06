import java.math.BigDecimal;

public class Place {
    private static int number = 0;
    private int trainId;
    private int wagonId;
 //   private String type;
    private boolean isFree;
    private double price;

    public Place(Train train, Wagon wagon, double price){
        this.number +=1;
        this.trainId = train.getTrainId();
        this.wagonId = wagon.getWagonId();
       // this.type = type;
        this.isFree = true;
        this.price = price;
    }

    public void placeIsTaken() {isFree = false;}

    public boolean checkPlase(){return isFree;}

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Number: " + number + " in train " + trainId + ", wagon: " + wagonId + ", price:" + price;
    }
}
