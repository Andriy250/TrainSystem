import java.math.BigDecimal;

public class Place {
    private int number;
    private int trainId;
    private int wagonId;
    private String type;
    private boolean isFree;
    private BigDecimal price;

    public Place(int id, Train train, Wagon wagon, String type, BigDecimal price){
        this.number = id;
        this.trainId = train.getTrainId();
        this.wagonId = wagon.getWagonId();
        this.type = type;
        this.isFree = true;
        this.price = new BigDecimal(price.floatValue());
    }

    public void placeIsTaken() {isFree = false;}

    public boolean checkPlase(){return isFree;}

    public void setPrice(BigDecimal price){
        this.price = new BigDecimal(price.floatValue());
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Number: " + number + " in train " + trainId + ", wagon: " + wagonId + ", type " + type + ", price:" + price.toString();
    }
}
