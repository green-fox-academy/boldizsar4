import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        for (int i = 0; i < abc.length; i++) {
            if (i == 0) {
                String temp = abc[2];
                abc[2] = abc[0];
                abc[0] = temp;

            }

        }

        System.out.println(Arrays.toString(abc));
    }
}
