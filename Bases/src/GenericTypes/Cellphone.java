package GenericTypes;

public class Cellphone implements CheckPassword{

    private final int pinCode;

    public Cellphone(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public <T> boolean checkPassword(T password) {
        // password is an integer
        return this.pinCode == ((Integer)password);
    }
}
