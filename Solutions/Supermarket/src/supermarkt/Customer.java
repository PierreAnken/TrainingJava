package supermarket;

public class Customer {
    private int id;

    public Customer(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Cashier selectCashier(Supermarket supermarket){
        int smallestQueue = Integer.MAX_VALUE;
        Cashier chosenCashier = null;

        for (Cashier cashier: supermarket.getCashiers()) {
            int queueSize = cashier.getQueueSize();
            if(queueSize < smallestQueue){
                chosenCashier = cashier;
                smallestQueue = queueSize;

                if(queueSize == 0)
                    break;
            }
        }
        return chosenCashier;
    }
}
