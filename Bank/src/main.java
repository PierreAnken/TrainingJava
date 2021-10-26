public class main {
    public static void main(String[] args) {

        // 1 - Create a bank which contain a bancomat and an ebanking
        System.out.println("\n=== 1 ===");
        Bank bank = new Bank();

        // 2 - Create 3 customers
        System.out.println("\n=== 2 ===");
        Customer c1 = new Customer("Jean", "password1", 1234);
        Customer c2 = new Customer("David", "password2", 3456);
        Customer c3 = new Customer("Paul", "password3", 3333);
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c3);

        // 3 - Add 1 account for each customer with a balance of 100 each
        System.out.println("\n=== 3 ===");
        bank.getEbanking().createAccountWithPartner(c1, 100 ,"Account 1", "password1", "Sophie");
        bank.getEbanking().createAccount(c2, 100 ,"Account 2", "password2");
        bank.getEbanking().createAccount(c3, 100 ,"Account 3", "password3");

        // 4 - Try to create an account for customer 1 with a wrong password
        System.out.println("\n=== 4 ===");
        bank.getEbanking().createAccount(c1, 100 ,"Account 1.2", "wrongpassword");

        // 5 - Transfer 50 from customer 1 to customer 2 with E-banking
        System.out.println("\n=== 5 ===");
        bank.getEbanking().transfer(50, c1.getAccounts().get(0), c2.getAccounts().get(0), "password1");

        // 6 - Transfer 400 from customer 3 to customer 1 with E-banking
        System.out.println("\n=== 6 ===");
        bank.getEbanking().transfer(400, c3.getAccounts().get(0), c1.getAccounts().get(0), "password3");

        // 7 - Lock the Customer 1 with 3 wrong identification
        //     the identification method should not be called directly!
        //     Then try to do another transaction to see the difference
        System.out.println("\n=== 7 ===");
        bank.getEbanking().transfer(50, c1.getAccounts().get(0), c2.getAccounts().get(0), "wrongpassword");
        bank.getEbanking().transfer(50, c1.getAccounts().get(0), c2.getAccounts().get(0), "wrongpassword");
        bank.getEbanking().transfer(50, c1.getAccounts().get(0), c2.getAccounts().get(0), "wrongpassword");
        bank.getEbanking().transfer(50, c1.getAccounts().get(0), c2.getAccounts().get(0), "wrongpassword");

        // 8 - Add 100 to customer 3 with bancomat
        System.out.println("\n=== 8 ===");
        bank.getBancomat().deposit(100, c3.getAccounts().get(0),3333);

        // 9 - Try to withdraw 100 from customer 1 with E-banking
        System.out.println("\n=== 9 ===");
        bank.getEbanking().withdraw(100, c1.getAccounts().get(0),3333);

        // 10 - Transfert 150 from customer 3 to customer 1 with E-banking
        System.out.println("\n=== 10 ===");
        bank.getEbanking().transfer(150, c3.getAccounts().get(0), c1.getAccounts().get(0), "password3");

        // 11 - Display all customer with their account balance
        System.out.println("\n=== 11 ===");
        System.out.println(bank.getCustomerList());

    }
}
