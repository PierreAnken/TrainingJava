package Bank;

public class Account {
    private final String name;
    private final Customer customer;
    private double balance;

    public Account(Customer customer, String name, double balance){
        this.customer = customer;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean changeBalance(double amount){

    }
}