package animals;

public class MaineCoon extends Cat{

    public void giveInfo() {
        System.out.println("I like water!");
    }

    public MaineCoon(String name, String hairColor) {
        super(name, hairColor);
    }
}
