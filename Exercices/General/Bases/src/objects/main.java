package objects;

public class main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "Red", 12345);
        Car ford = new Car("Ford", "Blue", 9876);

        System.out.println(audi);
        System.out.println(ford);

        Parking parking = new Parking(10);
        parking.ParkCar(audi);
        System.out.println(parking);

        parking.ParkCar(ford, 5);
        System.out.println(parking);


    }
}
