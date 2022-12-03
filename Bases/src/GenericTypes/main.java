package GenericTypes;

public class main {
    public static void main(String[] args) {

        Dashboard d1 = new Dashboard("Password");
        Cellphone c1 = new Cellphone(1234);

        System.out.println(d1.checkPassword("Password"));
        System.out.println(d1.checkPassword(1234));
        System.out.println(c1.checkPassword(1234));

    }
}
