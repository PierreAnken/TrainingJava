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
        int smallestQueue = Integer.MAX_VALUE;
        Cashier chosenCashier = null;

        for (Cashier cashier: supermarket.getCashiers()) {
            if(cashier.getState() == CashierState.OPEN){
                int queueSize = cashier.getQueueSize();
                if(queueSize < smallestQueue){
                    chosenCashier = cashier;
                    smallestQueue = queueSize;

                    if(queueSize == 0)
                        break;
                }
            }

        }
        if(chosenCashier == null)
            System.out.println("No available cashier");

        return chosenCashier;
    }

    public void forceQueue(Cashier chosenCashier){

        if(chosenCashier != null && chosenCashier.getState() == CashierState.OPEN){
            ArrayList<Customer> customersInQueue = new ArrayList();

            while(true){
                Customer oldCustomer = chosenCashier.processOrder();
                if(oldCustomer == null)
                    break;

                customersInQueue.add(oldCustomer);
            }

            chosenCashier.addCustomerToQueue(this);

            for (Customer customer: customersInQueue) {
                chosenCashier.addCustomerToQueue(customer);
            }
            System.out.println("The angry customer "+ this.getId()+" forced the queue "+chosenCashier.getId());
        }
    }
}
