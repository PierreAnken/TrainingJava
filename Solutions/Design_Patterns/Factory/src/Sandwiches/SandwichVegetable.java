package Sandwiches;

import Sandwiches.Sandwich;

public class SandwichVegetable extends Sandwich {

    public SandwichVegetable(){
        name = "Vegetable";
    }

    @Override
    public void vegetable(){
        amountVegetable = Amount.LOT;
    }

    @Override
    public void mustard(){
        amountMustard = Amount.FEW;
    }
}
