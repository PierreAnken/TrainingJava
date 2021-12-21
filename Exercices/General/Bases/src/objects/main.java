package objects;

import javax.naming.InvalidNameException;
import javax.naming.directory.InvalidAttributeValueException;

public class main {
    public static void main(String[] args) {

        try {

            Car audi = new Car("Audi", "Red", 12345);
            Car ford1 = new Car("Ford", "Blue", 9876);
            Car.outOfOrder();
            Car ford = new Car("Ford", "Blue", 9876);

            System.out.println(audi);
            System.out.println(ford);

            Parking parking = new Parking(10);
            parking.ParkCar(audi);
            System.out.println(parking);

            parking.ParkCar(ford, 5);
            System.out.println(parking);


        } catch (InvalidNameException e) {
            System.out.println("Car can not be solde anymore!");

        }catch (InvalidAttributeValueException e) {
            System.out.println("Invalid price!");
        }



    }
}
