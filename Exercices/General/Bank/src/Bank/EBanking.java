package Bank;

public class EBanking implements BankOperations {

    @Override
    public <T> void transfer(double amount, Account fromAccount, Account toAccount, T password) {

    }

    @Override
    public <T> void withdraw(double amount, Account fromAccount, T password) {

    }

    @Override
    public <T> void deposit(double amount, Account toAccount, T password) {

    }

    @Override
    public <T> void createAccount(Customer c, double balance, String accountName, T password) {

    }

    @Override
    public <T> boolean identifyCustomer(Customer c, T password) {

    }
}