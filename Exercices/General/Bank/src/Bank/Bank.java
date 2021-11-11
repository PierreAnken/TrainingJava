package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Customer> customers;
    private final Bancomat bancomat;
    private final EBanking ebanking;

    public Bancomat getBancomat() {
        return bancomat;
    }

    public EBanking getEbanking() {
        return ebanking;
    }


    public Bank(){
        customers = new ArrayList<>();
        bancomat = new Bancomat();
        ebanking = new EBanking();
        System.out.println("New bank created");
    }

    public void addCustomer(Customer c) {

    }

    public String getCustomerList() {

    }
}