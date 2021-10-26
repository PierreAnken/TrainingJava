import java.util.ArrayList;
import java.util.List;

public interface BankOperations {

    <T> void transfer (double amount, IAccount fromAccount, IAccount toAccount, T password);
    <T> void withdraw (double amount, IAccount fromAccount, T password);
    <T> void deposit(double amount, IAccount toAccount, T password);
    <T> void createAccount(Customer c, double balance, String accountName, T password);
    <T> void createAccountWithPartner(Customer c, double balance, String accountName, T password, String partner);
    <T> boolean identifyCustomer(Customer c, T password);
}
