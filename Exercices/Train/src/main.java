import train.Train;

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


    }
}
