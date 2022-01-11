package Base;

import java.util.ArrayList;

public class Variables {

    public static void main(String[] args) {

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean

        String myText = "Hello";     // String
        Object object = new Object();

        System.out.println(myNum);
        System.out.println(object);


        int myNum2 = myNum;
        System.out.println(myNum2);

        Object object2 = new Object();
        System.out.println(object2);
        object2 = object;

        System.out.println(object);
        System.out.println(object2);

        int[] myArray = new int[5];
        myArray[0] = 1;

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);

        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);


    }
}
