import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int pinCode;
    private String name;
    private String eBankingPassword;
    private CustomerState state;
    private List<Account> accounts;


    public Customer(String name, String eBankingPassword, int pinCode){
        this.name = name;
        this.pinCode = pinCode;
        this.eBankingPassword = eBankingPassword;
        state = CustomerState.OK;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }
}

