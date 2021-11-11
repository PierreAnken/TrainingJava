package Factory;

import Sandwiches.Sandwich;
import Sandwiches.SandwichCheese;

public class CheeseFactory extends SandwichFactory{

    @Override
    protected Sandwich createSandwich() {
        return new SandwichCheese();
    }


}
