package Practice.Train;

import java.util.ArrayList;

public class Wagon<T> {

    protected int length;
    protected Wagon wagonInRear;
    protected ArrayList<T> storage;
    protected WagonType wagonType;

    static final int MAX_STORAGE_SIZE = 20;

    public Wagon( int length, Wagon wagonInRear, WagonType wagonType) {
        this.length = length;
        this.wagonInRear = wagonInRear;
        this.storage = new ArrayList<>();
        this.wagonType = wagonType;
    }

    public int GetWeight(){
        return 200;
    }





}
