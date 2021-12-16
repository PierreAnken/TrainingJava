package classes;

public class Car {

    private String brand;
    private String farbe;
    private double price;

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

}

