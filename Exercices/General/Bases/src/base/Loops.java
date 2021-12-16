package base;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4};
        System.out.println("Array length:"+numbers.length);

        for (int number:numbers){
            System.out.print(number+" ");
        }

        System.out.println();
        for (int number = 1; number <5; number++){
            System.out.print(number+" ");
        }

        System.out.println("\n\nWhile");
        int numberWhile = 0;
        while(numberWhile<5){
            System.out.print(numberWhile+" ");
            numberWhile++;
        }

        System.out.println("\n\nDoWhile");
        int numberDoWhile = 0;
        do{
            System.out.print(numberDoWhile+" ");
            numberDoWhile++;
        }while(numberDoWhile<5);

    }
}
