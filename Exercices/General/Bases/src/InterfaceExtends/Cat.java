package InterfaceExtends;

public class Cat extends Animal{
    private String hairColor;


    public void giveInfo(){
        System.out.println("My name is: "+name+", my hair color is: "+hairColor);
    }

    public Cat(String name, String hairColor) {
        this.name = name;
        this.hairColor = hairColor;
    }
}
