import supermarket.Cashier;
import supermarket.Customer;
import supermarket.Supermarket;

public class main {
    public static void main(String[] args) {

        // 1 - Create a new supermarket
        System.out.println("\n=== 1 ===");
        Supermarket supermarket = new Supermarket();

        // 2 - Add 6 cashiers to the supermarket
        System.out.println("\n=== 2 ===");
        for (int i = 1; i <= 5; i++) {
            supermarket.addCashier(new Cashier(i));
        }

        // 3 - Create a customer and make him choose a cashier
        System.out.println("\n=== 3 ===");
        new Customer().selectCashier(supermarket);

        // 4 - Open 3 cashiers
        System.out.println("\n=== 4 ===");
        for (int i = 1; i <= 3; i++) {
            supermarket.openCashier();
        }

        // 5 - Create 16 customers, and add them to a cashier
        // A customer always choose the cashier with the smallest queue.
        System.out.println("\n=== 5 ===");
        for (int i = 1; i <= 16; i++) {
            Customer customer = new Customer();
            Cashier selectedCashier = customer.selectCashier(supermarket);
            selectedCashier.addCustomerToQueue(customer);
        }

        // 6 - Display all cashier queues
        System.out.println("\n=== 6 ===");
        System.out.println(supermarket);

        // 7 - Close 2 cashiers and reopen 3
        System.out.println("\n=== 7 ===");
        supermarket.closeCashier();
        supermarket.closeCashier();
        for (int i = 1; i <= 3; i++) {
            supermarket.openCashier();
        }

        // 8 - Add 8 customers and make them choose a queue
        System.out.println("\n=== 8 ===");
        for (int i = 1; i <= 8; i++) {
            Customer customer = new Customer();
            Cashier selectedCashier = customer.selectCashier(supermarket);
            selectedCashier.addCustomerToQueue(customer);
        }
        System.out.println(supermarket);

        // 9 - Make the cashier 1 and 3 process 2 customers each
        System.out.println("\n=== 9 ===");
        supermarket.getCashiers().get(0).processOrder();
        supermarket.getCashiers().get(0).processOrder();
        supermarket.getCashiers().get(2).processOrder();
        supermarket.getCashiers().get(2).processOrder();
        System.out.println(supermarket);

        // 10 - Make and angry customer force the queue 3
        // You must use the methods processOrder and addCustomerToQueue
        System.out.println("\n=== 10 ===");
        Customer angryCustomer = new Customer();
        angryCustomer.forceQueue(supermarket.getCashiers().get(1));
        System.out.println(supermarket);
    }
}
