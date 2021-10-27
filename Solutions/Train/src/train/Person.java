package train;

public class Person implements Thing{
    private final String name;
    private final int weight, age;

    public Person(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

}
