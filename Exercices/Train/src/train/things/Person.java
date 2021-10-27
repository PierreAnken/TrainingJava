package train.things;

import train.things.Thing;

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

}
