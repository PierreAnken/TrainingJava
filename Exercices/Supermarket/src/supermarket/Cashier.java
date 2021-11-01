package supermarket;

import java.util.ArrayList;
import java.util.List;

public class Cashier{
    private List<Customer> customerQueue;
    private final int id;
    private CashierState state;
    private final int MAXQUEUE = 5;

    public Cashier(int id){
        // TODO: Implements
    }

    public boolean addCustomerToQueue(Customer customer){
        // TODO: Implements
    }

    public int getQueueSize(){
        return customerQueue.size();
    }

    public Customer processOrder(){
        // TODO: Implements
    }

    public String toString(){
        // TODO: Implements
    }

    public CashierState getState() {
        return state;
    }

    public void setState(CashierState state) {
        // TODO: Implements
    }

    public int getId() {
        return id;
    }
}
