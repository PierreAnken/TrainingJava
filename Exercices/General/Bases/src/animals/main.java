package animals;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Object> animals = new ArrayList<>();

        animals.add(new Cat("Maou", "Black"));
        animals.add(new Dog("Rex", "Short"));
        animals.add(new Bird(123, "Birdie"));
        animals.add(new MaineCoon("MainCoonie", "pink"));

        for (Object animal: animals) {
            ((Animal)animal).giveInfo();
            System.out.println(animal.getClass());
            System.out.println(animal instanceof Cat);
        }

    }
}
