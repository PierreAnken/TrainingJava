package train.things;

import train.things.Thing;

import java.util.ArrayList;
import java.util.List;

public class Person implements Thing {
    private final String name;
    private final int age;
    private final double unitWeight;

    public Person(String name, int unitWeight, int age) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public double getUnitWeight() {
        return unitWeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return 1;
    }

    public static List<Person> generateListPeople(int amount){
        List<Person> passengers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Person person = new Person("person"+i, 70, 35);
            passengers.add(person);
        }
        return passengers;
    }
}
