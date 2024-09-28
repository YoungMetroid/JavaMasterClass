package Java8;


import lombok.Data;

@Data
public class Car {

    public int year;
    public String make;
    public String model;
    public String trim;
    public String body;
    public String transmission;
    public String vin;
    public String state;
    public String condition;
    public String odometer;
    public String color;
    public String interior;
    public String seller;
    public String mmr;
    public String sellingPricePoint;
    public String saleDate;

     public  Car(int year, String make, String model, String trim, String body, String transmission, String vin, String state, String condition, String odometer, String color, String interior, String seller, String mmr, String sellingPricePoint, String saleDate) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.body = body;
        this.transmission = transmission;
        this.vin = vin;
        this.state = state;
        this.condition = condition;
        this.odometer = odometer;
        this.color = color;
        this.interior = interior;
        this.seller = seller;
        this.mmr = mmr;
        this.sellingPricePoint = sellingPricePoint;
        this.saleDate = saleDate;
    }

    protected void print(){
        System.out.println("protected");
    }
}

