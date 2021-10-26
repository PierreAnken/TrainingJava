public class AccountWithPartner extends AccountDecorator{
    private final String partner;

    public AccountWithPartner(String partner, IAccount account){
        super(account);
        this.partner = partner;
    }

    @Override
    public String getPartner(){
        return partner;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public String getName() {
        return account.getName();
    }

    @Override
    public Customer getCustomer() {
        return account.getCustomer();
    }

    @Override
    public boolean changeBalance(double amount) {
        return account.changeBalance(amount);
    }
}
