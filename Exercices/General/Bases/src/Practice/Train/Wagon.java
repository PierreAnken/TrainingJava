package Practice.Train;

public class Wagon {

    protected int weight;
    protected int length;
    protected Wagon wagonInFront;

    public Wagon(int weight, int length, Wagon wagonInFront) {
        this.weight = weight;
        this.length = length;
        this.wagonInFront = wagonInFront;
    }

}
