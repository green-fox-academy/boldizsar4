import java.util.Arrays;

public class AppendA2 {
    public static void main(String[] args) {
        String[] animals = {"kuty", "macsk", "cic"};
        for (int i = 0; i < animals.length; i++) {
            animals[i] = animals[i] + "a";
        }
        System.out.println(Arrays.toString(animals));
    }

}
