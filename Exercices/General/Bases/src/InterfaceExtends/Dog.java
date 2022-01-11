package InterfaceExtends;

public class Dog extends Animal{
    private String hairLenght;


    public void giveInfo(){
        System.out.println("My name is: "+name+", my hair length is: "+hairLenght);
    }

    public Dog(String name, String hairLenght) {
        this.name = name;
        this.hairLenght = hairLenght;
    }
}
