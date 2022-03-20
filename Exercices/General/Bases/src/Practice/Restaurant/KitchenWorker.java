package Practice.Restaurant;

abstract class KitchenWorker implements PrepareMenu {

    protected String name;
    protected String currentOrder;

    public KitchenWorker(String name) {
        this.name = name;
    }

    abstract void giveName();

}
