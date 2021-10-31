package supermarket;

import java.util.ArrayList;
import java.util.List;

public class Cashier{
    private List<Customer> customerQueue;
    private int id;

    public Cashier(int id){
        customerQueue = new ArrayList<>();
        this.id = id;
    }

    public void enQueueCustomer(Customer customer){
        customerQueue.add(0, customer);
    }

    public int getQueueSize(){
        return customerQueue.size();
    }

    public Customer deQueueCustomer(){
        return customerQueue.remove(customerQueue.size()-1);
    }

    public String toString(){
        StringBuilder cashierAsStr = new StringBuilder("C"+id+": ");
        for (Customer c: customerQueue) {
            cashierAsStr.append("o["+ c.getId()+"] ");
        }
        return cashierAsStr.toString();
    }

    public int getId() {
        return id;
    }
}
