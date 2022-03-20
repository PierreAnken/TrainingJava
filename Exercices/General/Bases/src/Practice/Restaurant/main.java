package Practice.Restaurant;

public class main {
    public static void main(String[] args) {

        KitchenWorker K1 = new Cook("Ratatouille");
        KitchenWorker K2 = new Pizzaiolo("Peppon");

        K1.receiveOrder("Pasta");
        K1.deliverOrder();

        K2.receiveOrder("Pizza");
        K2.deliverOrder();

        K1.giveName();
        K2.giveName();

    }
}
