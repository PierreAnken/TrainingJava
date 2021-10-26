public interface IAccount {

    public double getBalance();

    public String getName();

    public Customer getCustomer();

    public boolean changeBalance(double amount);

    public String getPartner();
}
