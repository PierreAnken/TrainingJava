package Decorator;

public class Account implements IAccount{
    private int balance = 0;

    public void changeBalance(int amount) {
        
    }

    public void displayBalance(){
        System.out.println("Account balance: "+ balance);
    }
}
