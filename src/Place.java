import java.math.BigDecimal;

public class Place {
    private int number;
    private int trainId;
    private int wagonId;
    private String type;
    private boolean isFree;
    private BigDecimal price;

    public Place(int id, int _trainId, int _wagonId, String _class, BigDecimal _price){
        number = id;
        trainId = _trainId;
        wagonId = _wagonId;
        type = _class;
        isFree = true;
        price = new BigDecimal(_price.floatValue());
    }

    public void placeIsTaken() {isFree = false;}

    public boolean checkPlase(){return isFree;}

    public void setPrice(BigDecimal _price){
        price = new BigDecimal(_price.floatValue());
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Number: " + number + " in train " + trainId + ", wagon: " + wagonId + ", type " + type + ", price:" + price.toString();
    }
}
