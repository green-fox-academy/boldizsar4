import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int size = 4;
        int[][] number = new int[size][size];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (j == i) {
                    number[i][j] = 1;
                } else {
                    number[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}