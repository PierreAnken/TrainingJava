package DancingClub;

abstract class Person {
    private GenderType genderType;
    private String firstName;
    private String lastName;


    public Person(GenderType genderType, String firstName, String lastName){
        this.genderType = genderType;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return firstName+" "+lastName+" "+genderType;
    }

    public GenderType getGenderType(){
        return genderType;
    }

    abstract void describeMyself();
}
