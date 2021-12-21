package objects;

import javax.naming.InvalidNameException;
import javax.naming.directory.InvalidAttributeValueException;

public class Car {

    private String brand;
    private String farbe;
    private double price;
    private static boolean canBeOrdered = true;


    // Constructor
    public Car(String brand, String farbe, double price) throws InvalidNameException, InvalidAttributeValueException {

        if(!canBeOrdered){
            throw new InvalidNameException();
        }

        if(price < 0){
            throw new InvalidAttributeValueException();
        }


        this.brand = brand;
        this.farbe = farbe;
        this.price = price;

        System.out.println("New car ordered");
    }

    // Called upon print (or any cast to string)
    public String toString(){
        return brand+" "+farbe+" "+price;
    }

    public static boolean orderState(){
        return canBeOrdered;
    }

    public static void outOfOrder(){
        canBeOrdered = false;
    }

}

