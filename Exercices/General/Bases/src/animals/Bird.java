package animals;

public class Bird extends Animal{
    private double weight;

    void giveInfo(){
        System.out.println("My name is:"+name+", my weight is:" +weight);
    }

    public Bird(double weight, String name){
        this.name = name;
        this.weight = weight;

    }
}

