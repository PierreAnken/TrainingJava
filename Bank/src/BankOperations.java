import java.util.ArrayList;
import java.util.List;

public interface BankOperations {

    void transfer (double amount, Account fromAccount, Account toAccount);
    void withdraw (double amount, Account fromAccount);
    void deposit(double amount, Account toAccount);

}
