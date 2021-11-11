package Decorator;

public class AccountWithBonus extends AccountDecorator{

    private final int bonusAmount;

    public AccountWithBonus(Account decoratedAccount, int bonusAmount) {

    }

    public void changeBalance(int amount) {

    }

    @Override
    public void displayBalance() {

    }

}
