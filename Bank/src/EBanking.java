

public class EBanking implements BankOperations {

    @Override
    public <T> void transfer(double amount, Account fromAccount, Account toAccount, T password) {

        if(identifyCustomer(fromAccount.getCustomer(), password)){

            if(amount < 0){
                System.out.println("Invalid negative amount.");
            }
            else if(fromAccount == toAccount){
                System.out.println("From and to accounts must be different.");
            }
            else if(fromAccount.getCustomer().checkStateActive()){
                if(fromAccount.changeBalance(-amount)){
                    toAccount.changeBalance(amount);
                    System.out.println("Transfert from "+fromAccount.getName()+" to "+toAccount.getName()+" with "+amount+" done.");
                    System.out.println("new balances "+fromAccount.getBalance()+" - "+toAccount.getBalance());
                }
            }
        }
    }

    @Override
    public <T> void withdraw(double amount, Account fromAccount, T password) {
        System.out.println("To withdraw money, please come to our bancomat.");
    }

    @Override
    public <T> void deposit(double amount, Account toAccount, T password) {
        System.out.println("To deposit money, please come to our bancomat.");
    }

    @Override
    public <T> void createAccount(Customer c, double balance, String accountName, T password) {
        if(identifyCustomer(c, password)){
            if(c.checkStateActive()){
                Account newAccount = new Account(c, accountName, balance);
                c.getAccounts().add(newAccount);
                System.out.println("New account '"+accountName+"' created for "+c.getName()+".");
            }
        }
    }

    @Override
    public <T> boolean identifyCustomer(Customer c, T password) {
        boolean result = false;
        if(c.checkStateActive()) {
            result = c.identifyWithPassword((String) password);
            if (!result) {
                System.out.println(c.getName() + " identity not validated, operation refused.");
            }
        }
        return result;
    }
}
