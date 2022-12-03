package Practice.Restaurant;

public class Pizzaiolo extends KitchenWorker{

    public Pizzaiolo(String name) {
        super(name);
    }

    @Override
    void giveName() {
        System.out.println("Pizzaiolo: "+ name);
    }

    @Override
    public void receiveOrder(String order) {
        currentOrder=order;
    }

    @Override
    public void deliverOrder() {
        System.out.println("Hola! Order ready: "+currentOrder);
        currentOrder = null;
    }
}