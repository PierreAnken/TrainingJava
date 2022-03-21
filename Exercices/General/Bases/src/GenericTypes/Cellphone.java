package GenericTypes;

public class Cellphone implements CheckPassword{

    private final int pincode;

    public Cellphone(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public <T> boolean checkPassword(T password) {
        // password is an integer
        return this.pincode == ((Integer)password);
    }
}
