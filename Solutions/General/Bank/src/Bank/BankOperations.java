package Bank;

public interface BankOperations {

    <T> void transfer (double amount, Account fromAccount, Account toAccount, T password);
    <T> void withdraw (double amount, Account fromAccount, T password);
    <T> void deposit(double amount, Account toAccount, T password);
    <T> void  createAccount(Customer c, double balance, String accountName, T password);
    <T> boolean identifyCustomer(Customer c, T password);
}
