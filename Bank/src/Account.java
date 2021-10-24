public class Account {
    String name;
    private Customer customer;
    private double balance;

    public Account(Customer customer, String name, double balance){
        this.customer = customer;
        this.name = name;
        this.balance = balance;
    }
}
