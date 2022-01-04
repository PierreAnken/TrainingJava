package compare_objects;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {

    boolean withCoffein;
    String brand;

    public Coffee(boolean withCoffein, String brand) {
        this.withCoffein = withCoffein;
        this.brand = brand;
    }

    public static void displayAllCoffee(Coffee[] coffees){
        for (Coffee coffee: coffees) {
            System.out.println(coffee.brand);
        }
    }

    public static void main(String[] args) {
        Coffee C1 = new Coffee(true, "Nespresso");
        Coffee C2 = new Coffee(true, "Lavazza");
        Coffee C3 = new Coffee(true, "Melitta");
        Coffee C4 = new Coffee(true, "Just Bright");

        System.out.println(C1 + "" + C2);
        System.out.println(C1.equals(C2));
        System.out.println(C1 == C2);

        ArrayList<Coffee> coffeeList = new ArrayList();
        coffeeList.add(C1);
        coffeeList.add(C2);
        coffeeList.add(C3);
        coffeeList.add(C4);

        // Wrong way, lead to error
        /* for (Coffee coffee: coffeeList) {
            if(coffee.brand.equals("Lavazza")){
                coffeeList.remove(coffee);
            }
        } */

        System.out.println("=== Iterator ===");
        Iterator<Coffee> coffeeIterator = coffeeList.iterator();

        while(coffeeIterator.hasNext()) {
            String brand = coffeeIterator.next().brand;
            if(brand.equals("Lavazza")){
                coffeeIterator.remove();
            }
        }

        for (Coffee coffee: coffeeList) {
            System.out.println(coffee.brand );
        }

    }

    @Override
    public boolean equals(Object coffee) {
        return this.withCoffein == ((Coffee)coffee).withCoffein;
    }
}
