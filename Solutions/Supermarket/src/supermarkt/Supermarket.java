package supermarket;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private List<Cashier> cashiers;
    public Supermarket(){
        cashiers = new ArrayList<>();
        System.out.println("A new supermarkt openend");
    }

    public void addCashier(Cashier cashier){
        cashiers.add(cashier);
    }

    public List<Cashier> getCashiers(){
        return cashiers;
    }

}
