package Decorator;

public class AccountWithCafe extends AccountDecorator{

    public AccountWithCafe(IAccount decoratedAccount) {
        super(decoratedAccount);
    }

    public void changeBalance(int amount) {

        account.changeBalance(amount);
        System.out.println("Here is a cafe for you for free.");
    }

    @Override
    public void displayBalance() {
        account.displayBalance();
    }

}
