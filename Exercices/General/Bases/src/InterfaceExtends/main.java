package InterfaceExtends;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<InfoInterface> animals = new ArrayList<>();

        animals.add(new Cat("Maou", "Black"));
        animals.add(new Dog("Rex", "Short"));
        animals.add(new Bird(123, "Birdie"));
        animals.add(new MaineCoon("MainCoonie", "pink"));

        for (InfoInterface animal: animals) {
            animal.giveInfo();
            ((SayHello)animal).sayHello();
            System.out.println(animal.getClass());
            System.out.println("instanceof Animal ?"+ (animal.getClass().getSimpleName().equals("Animal")));
            System.out.println("instanceof InfoInterface ? "+ (animal instanceof InfoInterface));
            System.out.println("instanceof SayHello ? "+ (animal instanceof Cat));
            System.out.println();
        }

    }
}
