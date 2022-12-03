package Practice.Restaurant;

public class Cook extends KitchenWorker{

    public Cook(String name) {
        super(name);
    }

    @Override
    void giveName() {
        System.out.println("Cook: "+ name);
    }

    @Override
    public void receiveOrder(String order) {
        currentOrder=order;
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order ready: "+currentOrder);
        currentOrder = null;
    }
}
