package TryCatchThrow;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String,Customer> customers = new HashMap<>();
        Customer vegetableCustomer = null;
        try{
            vegetableCustomer = new Customer(PreferenceType.VEGETABLE, 456);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
        customers.put("V",vegetableCustomer);

        System.out.println(customers.get("V"));
    }
}
