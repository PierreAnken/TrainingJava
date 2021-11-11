package Factory;

import Sandwiches.Sandwich;

public abstract class SandwichFactory {

    public Sandwich orderSandwich(){
        Sandwich s = createSandwich();
        s.mustard();
        s.vegetable();
        s.cheese();
        return s;
    }

    protected abstract Sandwich createSandwich();
}
