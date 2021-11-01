package supermarket;

import java.util.ArrayList;

public class Customer {
    private final int id;
    private static int nextId = 1;

    public Customer(){
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public Cashier selectCashier(Supermarket supermarket){
        // TODO: Implements
        return chosenCashier;
    }

    public void forceQueue(Cashier chosenCashier){

        // TODO: Implements
    }
}
