package train.things;

import train.things.Thing;

public class Merchandise implements Thing {
    private final String name;
    private double unitWeight;
    private int quantity;


    public Merchandise(String name, int unitWeight, int quantity) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public double getUnitWeight() {
        return unitWeight;
    }
}
