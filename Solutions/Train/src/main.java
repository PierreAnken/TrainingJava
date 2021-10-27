import train.Train;

public class main {
    public static void main(String[] args) {

        Train train = new Train();
        train.add10Wagons();

        System.out.println("Le train a "+train.countWagon()+" wagons.");
    }
}
