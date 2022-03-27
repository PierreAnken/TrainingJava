package Practice.Train;

public class main {

    public static void main(String[] args) {
        Wagon w3 = new Wagon(80, 140, null, WagonType.PASSENGER);
        Wagon w2 = new Wagon(80, 140, w3, WagonType.PASSENGER);
        Wagon w1 = new Wagon(80, 140, w2, WagonType.MERCHANDISE);
        Locomotive l1 = new Locomotive(100, 150, w1);

        l1.Travel(100);
        l1.Refuel(5000);
        l1.Travel(100);
        l1.Travel(200);

    }
}
