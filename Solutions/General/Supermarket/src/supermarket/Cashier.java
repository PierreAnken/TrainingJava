package supermarket;

import java.util.ArrayList;
import java.util.List;

public class Cashier{
    private List<Customer> customerQueue;
    private final int id;
    private CashierState state;
    private final int MAXQUEUE = 5;

    public Cashier(int id){
        customerQueue = new ArrayList<>();
        state = CashierState.CLOSED;
        this.id = id;
    }

    public boolean addCustomerToQueue(Customer customer){
        if(customerQueue.size() == MAXQUEUE){
            System.out.println("The cashier queue is full, sorry customer "+ customer.getId());
            return false;
        }
        else{
            customerQueue.add(0, customer);
            return true;
        }
    }

    public int getQueueSize(){
        return customerQueue.size();
    }

    public Customer processOrder(){
        if(customerQueue.isEmpty())
            return null;
        else
            return customerQueue.remove(customerQueue.size()-1);
    }

    public String toString(){
        StringBuilder cashierAsStr = new StringBuilder("C"+id+": ");
        for (Customer c: customerQueue) {
            cashierAsStr.append("o["+ c.getId()+"] ");
        }
        return cashierAsStr.toString();
    }

    public CashierState getState() {
        return state;
    }

    public void setState(CashierState state) {
        this.state = state;
        System.out.println("Cashier "+id+" is now "+state);

        if(state == CashierState.CLOSED){
            customerQueue.clear();
        }
    }

    public int getId() {
        return id;
    }
}
