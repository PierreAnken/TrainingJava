package Equals;

public class Coffee {

    boolean withCoffein;
    String brand;

    public Coffee(boolean withCoffein, String brand) {
        this.withCoffein = withCoffein;
        this.brand = brand;
    }

    public static void main(String[] args) {
        Coffee C1 = new Coffee(true, "Nespresso");
        Coffee C2 = new Coffee(true, "Lavazza");

        System.out.println("Different memory allocation: "+C1 + " " + C2);
        System.out.println(C1.equals(C2));
        System.out.println(C1 == C2);


    }

    @Override
    public boolean equals(Object coffee) {

        // Ensure we check objet from the same class
        if (getClass() != coffee.getClass())
            return false;

        return this.withCoffein == ((Coffee) coffee).withCoffein;
    }
}
