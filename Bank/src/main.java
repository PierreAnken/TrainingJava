public class main {
    public static void main(String[] args) {

        // 1 - Create a bank which contain a bancomat and an ebanking
        Bank bank = new Bank();

        // 2 - Create 3 customers
        Customer c1 = new Customer("Jean", "password1", 1234);
        Customer c2 = new Customer("David", "password2", 3456);
        Customer c3 = new Customer("Paul", "password3", 3333);

        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c3);

        // 3 - Add 1 account for each customer with a balance of 100 each
        Account a1 = new Account(c1, "Compte 1", 100.0);
        c1.addAccount(a1);

        Account a2 = new Account(c1, "Compte 2", 100.0);
        c2.addAccount(a2);

        Account a3 = new Account(c1, "Compte 3", 100.0);
        c3.addAccount(a3);

        // 4 - Try to create an account for customer 1 with a wrong password

        // 5 - Transfer 50 from customer 1 to customer 2

        // 6 - Try to transfer 400 from customer 3 to customer 1

        // 7 - Lock the Customer 1 with 3 wrong identification
        //     the identification method should not be called directly!
        //     Then try to do another transaction to see the difference

        // 8 - Add 100 to customer 3 from a bancomat

        // 9 - Transfert 150 from customer 3 to customer 1

        // 10 - Display all customer with their account balance


    }
}
