package Decorator;

public abstract class AccountDecorator implements IAccount{
    protected IAccount account;

    public AccountDecorator(IAccount account){
        this.account = account;
    }

}
