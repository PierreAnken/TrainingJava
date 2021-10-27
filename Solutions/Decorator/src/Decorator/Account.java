package Decorator;

public class Account implements IAccount{
    private int balance = 0;

    public void changeBalance(int amount) {
        balance += amount;
        System.out.println("New balance: "+ balance);
    }

    public void displayBalance(){
        System.out.println("Decorator.Account balance: "+ balance);
    }
}
