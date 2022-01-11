package Practice.DancingClub;

abstract class Person {
    private GenderType genderType;


    public Person(GenderType genderType){
        this.genderType = genderType;
    }

    public String toString(){
        return genderType.toString();
    }

    public GenderType getGenderType(){
        return genderType;
    }

}
