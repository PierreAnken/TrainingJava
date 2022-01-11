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
            System.out.println(animal.getClass());
            System.out.println("instanceof Animal ?n"+ (animal instanceof Animal));
            System.out.println("instanceof InfoInterface ? "+ (animal instanceof InfoInterface));
        }

    }
}
