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
        customers.add(c);
        System.out.println("New customer joining the bank. Welcome "+c.getName());
    }

    public String getCustomerList(){
        StringBuilder customerList = new StringBuilder("Customer List");
        for (Customer customer: customers) {
            customerList.append("\n").append(customer.getName());
            for (Account account: customer.getAccounts()) {
                customerList.append("\n ").append(account.getName()).append(" - ").append(account.getBalance());
            }
        }
        return customerList.toString();
    }

}
