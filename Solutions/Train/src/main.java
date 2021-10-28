import train.Train;
import train.things.Person;
import train.wagons.PassengerWagon;
import train.wagons.WagonType;

import java.util.List;

public class main {
    public static void main(String[] args) {

        // 1 - Create a train with only a locomotive
        System.out.println("\n=== 1 ===");
        Train train = new Train();

        // 2 - Refuel the locomotive
        System.out.println("\n=== 2 ===");
        train.getLocomotive().refuel(500);
        System.out.println("The locomotive has "+train.getLocomotive().getRemainingCoal()+" coal remaining.");

        // 3 - Add 5 wagons, 2 for merchandise and 3 for passengers
        System.out.println("\n=== 3 ===");
        train.addWagons(3,2);
        System.out.println("The train has "+train.countWagon()+" wagons.");

        // 4 - Get train composition
        System.out.println("\n=== 4 ===");
        System.out.println("Composition: "+train.getComposition());

        // 5 - Add 45 passenger to train
        System.out.println("\n=== 5 ===");
        int amountPassenger = 45;
        List<Person> passengersWithoutSeat = train.loadPassengers(Person.generateListPeople(amountPassenger));
        System.out.println("We loaded "+(amountPassenger-passengersWithoutSeat.size()) +" people over "+amountPassenger);

        // 6 - Get empty seat amount
        System.out.println("\n=== 6 ===");
        System.out.println("They are "+train.getRemainingSeat()+" free seats in the train.");

        // 7 - Try to add 20 passengers to the train
        System.out.println("\n=== 7 ===");
        amountPassenger = 20;
        passengersWithoutSeat = train.loadPassengers(Person.generateListPeople(amountPassenger));
        System.out.println("We loaded "+(amountPassenger-passengersWithoutSeat.size()) +" people over "+amountPassenger);

        // 8 - Add to wagons at the front of the train and get remaining seat and composition
        System.out.println("\n=== 8 ===");
        train.addWagonInFront(new PassengerWagon());
        train.addWagonInFront(new PassengerWagon());
        System.out.println("They are "+train.getRemainingSeat()+" free seats in the train.");
        System.out.println("Composition: "+train.getComposition());

        // 9 - Get weight of transported merchandises and passengers
        System.out.println("\n=== 9 ===");
        System.out.println("The total weight of merchandises is: "+train.getThingsWeight(WagonType.MERCHANDISES));
        System.out.println("The total weight of passengers is: "+train.getThingsWeight(WagonType.PASSENGER));


    }
}
