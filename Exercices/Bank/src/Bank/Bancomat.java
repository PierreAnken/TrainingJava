package Bank;

public class Bancomat implements BankOperations {


    @Override
    public <T> void transfer(double amount, Account fromAccount, Account toAccount, T pincode) {

    }

    @Override
    public <T> void withdraw(double amount, Account fromAccount, T pincode) {

    }

    @Override
    public <T> void deposit(double amount, Account toAccount, T pincode) {

    }

    @Override
    public <T> void createAccount(Customer c, double balance, String accountName, T pincode) {

    }

    @Override
    public <T> boolean identifyCustomer(Customer c, T pincode) {

    }

}