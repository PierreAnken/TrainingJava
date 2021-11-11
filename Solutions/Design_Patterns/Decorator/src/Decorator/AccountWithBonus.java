package Decorator;

public class AccountWithBonus extends AccountDecorator{

    private final int bonusAmount;

    public AccountWithBonus(Account decoratedAccount, int bonusAmount) {
        super(decoratedAccount);
        this.bonusAmount = bonusAmount;
    }

    public void changeBalance(int amount) {
        account.changeBalance(amount+bonusAmount);
        System.out.println("This includes a bonus of: "+ bonusAmount);
    }

    @Override
    public void displayBalance() {
        account.displayBalance();
    }

}
