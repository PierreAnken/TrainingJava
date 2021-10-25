public class Bancomat implements BankOperations {


    @Override
    public <T> void transfer(double amount, Account fromAccount, Account toAccount, T pincode) {
        System.out.println("Please use your e-banking to create an transfer.");
    }

    @Override
    public <T> void withdraw(double amount, Account fromAccount, T pincode) {
        if(amount<=0){
            System.out.println("Please enter a valid amount.");
        }
        else if(fromAccount.getCustomer().identifyWithPin((Integer) pincode)){
            if(fromAccount.changeBalance(-amount)){
                System.out.println(amount + "removed from account"+", new balance is " +fromAccount.getBalance());
            }
        }
    }

    @Override
    public <T> void deposit(double amount, Account toAccount, T pincode) {
        if(amount<=0){
            System.out.println("Please enter a valid amount.");
        }
        else if(toAccount.getCustomer().identifyWithPin((Integer) pincode)){
            if(toAccount.changeBalance(amount)){
                System.out.println(amount + " added to account "+ toAccount.getName()+", new balance is " +toAccount.getBalance());
            }
        }
    }

    @Override
    public <T> void createAccount(Customer c, double balance, String accountName, T pincode) {
        System.out.println("Please use your e-banking to create an account.");
    }

    @Override
    public <T> boolean identifyCustomer(Customer c, T pincode) {
        boolean result = false;
        if(c.checkStateActive()) {
            result = c.identifyWithPin((Integer) pincode);
            if (!result) {
                System.out.println(c.getName() + " identity not validated, operation refused.");
            }
        }
        return result;
    }

}
