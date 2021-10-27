package Decorator;

public class AccountWithTransactionCost extends AccountDecorator{

    private int transactionCost;

    public AccountWithTransactionCost(IAccount decoratedAccount, int transactionCost) {

    }

    public void changeBalance(int amount) {

    }

    @Override
    public void displayBalance() {
    }

}
