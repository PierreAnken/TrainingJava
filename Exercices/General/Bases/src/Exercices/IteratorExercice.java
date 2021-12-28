package Exercices;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExercice {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 == 1) {
                numberIterator.remove();
            }

        }

        numbers.forEach(System.out::println);
    }


}
