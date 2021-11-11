package Factory;

import Sandwiches.Sandwich;
import Sandwiches.SandwichVegetable;

public class VegetableFactory extends SandwichFactory{

    @Override
    protected Sandwich createSandwich() {
        return new SandwichVegetable();
    }
}
