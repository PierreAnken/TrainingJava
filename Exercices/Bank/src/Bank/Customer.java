package Bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int pinCode;
    private String name;
    private String eBankingPassword;
    private int invalidLogins;
    private CustomerState state;
    private List<Account> accounts;


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

    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void lockAccount(){

    }

    public boolean identifyWithPin(int pinCode){

    }

    public boolean identifyWithPassword(String password){

    }

}
