package GenericTypes;

public class Dashboard implements CheckPassword{

    private final String password;

    public Dashboard(String password) {
        this.password = password;
    }

    @Override
    public <T> boolean checkPassword(T password) {
        // password is a string!
        return this.password.equals(password);
    }
}
