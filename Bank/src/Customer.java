import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int pinCode;
    private String name;
    private String eBankingPassword;
    private int invalidLogins;
    private CustomerState state;
    private List<IAccount> accounts;


    public Customer(String name, String eBankingPassword, int pinCode){
        this.name = name;
        this.pinCode = pinCode;
        this.eBankingPassword = eBankingPassword;
        invalidLogins = 0;
        state = CustomerState.OK;
        accounts = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public boolean checkStateActive() {
        if(state == CustomerState.OK){
            return true;
        }
        else{
            System.out.println("Account is locked, please contact your representative.");
            return false;
        }
    }

    public List<IAccount> getAccounts() {
        return accounts;
    }

    public void lockAccount(){
        state = CustomerState.LOCKED;
        System.out.println("Account locked because too many wrong logins.");
    }

    public boolean identifyWithPin(int pinCode){
        if(pinCode == this.pinCode){
            invalidLogins = 0;
            return true;
        }
        else{
            invalidLogins += 1;
            if(invalidLogins == 3){
                lockAccount();
            }
            return false;
        }
    }

    public boolean identifyWithPassword(String password){
        if(password == eBankingPassword){
            invalidLogins = 0;
            return true;
        }
        else{
            invalidLogins += 1;
            if(invalidLogins == 3){
                lockAccount();
            }
            return false;
        }
    }

}

