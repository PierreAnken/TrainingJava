package Sandwiches;

public abstract class Sandwich {

    protected String name;
    protected Amount amountMustard;
    protected Amount amountCheese;
    protected Amount amountVegetable;

    public void mustard(){
        amountMustard = Amount.NONE;
    }

    public void vegetable(){
        amountVegetable = Amount.NONE;
    }

    public void cheese(){
        amountCheese = Amount.NONE;
    }


    @Override
    public String toString() {

        String sb = "\nSandwich " + name + " contains:" +
                "\n- mustard: " + amountMustard +
                "\n- vegetable: " + amountVegetable +
                "\n- cheese: " + amountCheese;
        return sb;
    }
}
