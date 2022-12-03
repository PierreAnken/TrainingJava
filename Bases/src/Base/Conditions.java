package Base;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        //int alte = 17;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alter?");
        int alte = scanner.nextInt();

        if ( alte > 18) {
            System.out.println("Alte > 18");
        } else if(alte == 18){
            System.out.println("Alte == 18");
        }
        else{
            System.out.println("Alte < 18");
        }

        switch (alte){
            case 18:
                System.out.println("Alte == 18");
                break;
            case 17:
                System.out.println("Alte == 17");
                break;
            default:
                System.out.println("Alte xxx");
        }

        switch (alte) {
            case 18 -> System.out.println("Alte == 18");
            case 17 -> System.out.println("Alte == 17");
            default -> System.out.println("Alte xxx");
        }

    }
}
