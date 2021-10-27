package train;

public class Coal implements Thing{
    private int quantity;

    public Coal(int weight) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return quantity;
    }

    @Override
    public String getName() {
        return "Coal";
    }
}
