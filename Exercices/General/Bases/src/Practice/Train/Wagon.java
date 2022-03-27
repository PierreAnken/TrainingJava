package Practice.Train;

import java.util.ArrayList;

public class Wagon<T> {

    protected int weight;
    protected int length;
    protected Wagon wagonInRear;
    protected ArrayList<T> storage;
    protected WagonType wagonType;
    static float passenger_by_wagon = 20;

    public Wagon(int weight, int length, Wagon wagonInRear, WagonType wagonType) {
        this.weight = weight;
        this.length = length;
        this.wagonInRear = wagonInRear;
        this.storage = new ArrayList<>();
        this.wagonType = wagonType;
    }





}
