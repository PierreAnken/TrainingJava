import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;
    private Bancomat bancomat;
    private EBanking ebanking;

    public Bank(){
        customers = new ArrayList<>();
        bancomat = new Bancomat();
        ebanking = new EBanking();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }
}
