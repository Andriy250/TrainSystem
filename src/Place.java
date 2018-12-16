import java.math.BigDecimal;

public class Place {
    private int number;
    private int trainId;
    private int wagonId;
    private boolean isFree;
    private double price;

    public Place(int trainId, int wagonId, double price, int number){
        this.number = number;
        this.trainId = trainId;
        this.wagonId = wagonId;
        this.isFree = true;
        this.price = price;
    }

    public void placeIsTaken() {isFree = false;}


    public boolean checkPlace(){return isFree;}

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void printFreePlace(){
        if (isFree) System.out.println(number + " is free, price " + price);
    }

    @Override
    public String toString() {
        return "Number: " + number + " in train " + trainId + ", wagon: " + wagonId + ", price:" + price;
    }
}
