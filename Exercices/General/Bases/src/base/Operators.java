package base;

public class Operators {
    public static void main(String[] args) {
        float a = 1+1*2/3-2;

        System.out.println(5%2);
        System.out.println(5/2.0);
        Object obj = 2.0f;
        System.out.println(obj.getClass());

        float b = a;
        b+=3;
        b++;

        System.out.println(3 != 5 && !false);

    }
}
