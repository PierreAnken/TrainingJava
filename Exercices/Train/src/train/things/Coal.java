package train.things;

public class Coal implements Thing {

    private int quantity;

    public Coal(int quantity) {
        this.quantity = quantity;
    }

    public void add(int quantity){
        this.quantity += quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getUnitWeight() {
        return 0.1;
    }

    @Override
    public String getName() {
        return "Coal";
    }
}
