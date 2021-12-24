package Store;

public class Customer {
    // 0 => Chocolate
    // 1 => Chips
    // 2 => Vegetables
    private PreferenceType foodPreference;
    private int age;

    public Customer(PreferenceType foodPreference, int age) throws InvalidAgeException {
        this.foodPreference = foodPreference;
       if(age < 18 || age > 120){
           throw new InvalidAgeException("Age "+age+" is invalid");
       }
        this.age = age;

    }
    public String toString(){
        return "My food preference is "+foodPreference+", my age is:"+age;

    }

}
