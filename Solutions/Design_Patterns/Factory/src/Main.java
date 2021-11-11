import Factory.CheeseFactory;
import Factory.SandwichFactory;
import Factory.VegetableFactory;
import Sandwiches.Sandwich;

public class Main {
    public static void main(String[] args) {

        SandwichFactory cheese = new CheeseFactory();
        SandwichFactory veggie = new VegetableFactory();

         Sandwich s1 = cheese.orderSandwich();
         System.out.println(s1);

         Sandwich s2 = veggie.orderSandwich();
         System.out.println(s2);
    }
}
