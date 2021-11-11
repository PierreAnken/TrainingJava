package Sandwiches;

import Sandwiches.Sandwich;

public class SandwichCheese extends Sandwich {

    public SandwichCheese(){
        name = "Cheese";
    }

    @Override
    public void cheese(){
        amountCheese = Amount.LOT;
    }

    @Override
    public void mustard(){
        amountMustard = Amount.NORMAL;
    }

}
