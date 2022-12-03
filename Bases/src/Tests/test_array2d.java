package Tests;

public class test_array2d {
    public static void main(String[] args) {

        int[][] matrice = new int[5][5];

        int number = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrice[i][j] = number;
                number++;
            }
        }

        for (int[] line:matrice) {
            for (int cell:line) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
