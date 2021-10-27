import train.Train;
import train.things.Person;
import train.wagons.PassengerWagon;

import java.util.ArrayList;
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

        // 3 - Generate 10 wagons for Merchandise and People
        System.out.println("\n=== 3 ===");
        train.add10Wagons();
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

        // 7 - Try to add 80 passenger to the train
        System.out.println("\n=== 7 ===");
        amountPassenger = 100;
        passengersWithoutSeat = train.loadPassengers(Person.generateListPeople(amountPassenger));
        System.out.println("We loaded "+(amountPassenger-passengersWithoutSeat.size()) +" people over "+amountPassenger);

        // 8 - Add to wagons at the front of the train and get remaining seat and composition
        System.out.println("\n=== 8 ===");
        train.addWagonAtStart(new PassengerWagon());
        train.addWagonAtStart(new PassengerWagon());
        System.out.println("They are "+train.getRemainingSeat()+" free seats in the train.");
        System.out.println("Composition: "+train.getComposition());

    }
}
