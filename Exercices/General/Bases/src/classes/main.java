package classes;

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

        } catch (InvalidNameException e) {
            System.out.println("Car can not be solde anymore!");

        }catch (InvalidAttributeValueException e) {
            System.out.println("Invalid price!");
        }
    }
}
