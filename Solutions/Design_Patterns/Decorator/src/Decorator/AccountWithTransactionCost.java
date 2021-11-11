package Decorator;

public class AccountWithTransactionCost extends AccountDecorator{

    private int transactionCost;

    public AccountWithTransactionCost(IAccount decoratedAccount, int transactionCost) {
        super(decoratedAccount);
        this.transactionCost = transactionCost;
    }

    public void changeBalance(int amount) {
        account.changeBalance(amount-transactionCost);
        System.out.println("This includes transaction fee of: "+ transactionCost);
    }

    @Override
    public void displayBalance() {
        account.displayBalance();
    }

}
