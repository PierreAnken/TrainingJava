import Decorator.*;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<IAccount> accounts = new ArrayList<>();

        System.out.println("== Decorator.Account 1 - normal ==");
        Account accountNormal = new Account();
        accountNormal.changeBalance(50);
        accounts.add(accountNormal);

        System.out.println("\n== Decorator.Account 2 - with bonus ==");
        AccountWithBonus accountWithBonus = new AccountWithBonus(new Account(), 5);
        accountWithBonus.changeBalance(50);
        accounts.add(accountWithBonus);

        System.out.println("\n == Decorator.Account 3 - with cafe ==");
        AccountWithCafe accountWithCafe = new AccountWithCafe(new Account());
        accountWithCafe.changeBalance(50);
        accounts.add(accountWithCafe);

        System.out.println("\n == Decorator.Account 4 - with transaction fees ==");
        AccountWithTransactionCost accountWithTransactionCost = new AccountWithTransactionCost(new Account(), 2);
        accountWithTransactionCost.changeBalance(50);
        accounts.add(accountWithTransactionCost);

        System.out.println("\n== Decorator.Account 5 - with cafe and bonus ==");
        AccountWithBonus accountWithBonus2 = new AccountWithBonus(new Account(), 7);
        AccountWithCafe accountWithCafeAndBonus = new AccountWithCafe(accountWithBonus2);
        accountWithCafeAndBonus.changeBalance(50);
        accounts.add(accountWithCafeAndBonus);


        System.out.println("\n== Decorator.Account 6 - with cafe and bonus and transaction fees ==");
        AccountWithBonus accountWithBonus3 = new AccountWithBonus(new Account(), 9);
        AccountWithCafe accountWithCafeAndBonus2 = new AccountWithCafe(accountWithBonus3);
        AccountWithTransactionCost accountWithTransactionCost2 = new AccountWithTransactionCost(accountWithCafeAndBonus2, 3);
        accountWithTransactionCost2.changeBalance(50);
        accounts.add(accountWithTransactionCost2);

        System.out.println("\n== Accounts ==");
        for(IAccount account : accounts) {
            account.displayBalance();
        }


    }
}
