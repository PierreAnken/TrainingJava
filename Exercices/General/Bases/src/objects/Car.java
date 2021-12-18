package objects;

public class Car {

    private String brand;
    private String farbe;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor
    public Car(String brand, String farbe, double price){
        this.brand = brand;
        this.farbe = farbe;
        this.price = price;
    }

    // Called upon print (or any cast to string)
    public String toString(){
        return brand+" "+farbe+" "+price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public double getPrice() {
        return price;
    }

}

