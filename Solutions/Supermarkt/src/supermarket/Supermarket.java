package supermarket;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private List<Cashier> cashiers;
    public Supermarket(){
        cashiers = new ArrayList<>();
        System.out.println("A new supermarket opened");
    }

    public void addCashier(Cashier cashier){
        cashiers.add(cashier);
        System.out.println("A new cashier was installed");
    }

    public List<Cashier> getCashiers(){
        return cashiers;
    }

    public void openCashier(){
        Cashier opened = null;
        for (Cashier cashier: cashiers) {
            if(cashier.getState() == CashierState.CLOSED){
                cashier.setState(CashierState.OPEN);
                opened = cashier;
                break;
            }
        }
        if(opened == null)
            System.out.println("No more cashier available");
    }

    public void closeCashier(){
        Cashier closed = null;
        for (Cashier cashier: cashiers) {
            if(cashier.getState() == CashierState.OPEN){
                cashier.setState(CashierState.CLOSED);
                closed = cashier;
                break;
            }
        }
        if(closed == null)
            System.out.println("No cashier is open");
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Cashier cashier: getCashiers()) {
            stringBuilder.append(cashier).append("\n");
        }
        return stringBuilder.toString();
    }

}
