import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int [] numbers = new int [4];
        String [] texts = new String [4];
        boolean [] truth = new boolean[4];
        Object[] objects = { 2, "alma", true};

        int [] [] map = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
        };


        numbers [0] = 1;
        numbers [1] = 5;
        numbers [2] = 8;
        numbers [3] = 4;

        int [] numbers2 = {3, 6, 9, 2};
        int [] numbers3;

        numbers3 = new int[] {9, 8, 7, 6, 4};
        System.out.println(Arrays.toString(numbers2));
    }
}
