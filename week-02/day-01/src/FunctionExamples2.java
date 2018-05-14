import java.util.Arrays;

public class FunctionExamples2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        float average = average(numbers);

        int n = 3;
        n = increaseNumber(n);
        System.out.println(n);

        increaseElements(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static String appendA(String text){
        return text + "a";
    }
    public static int[] increaseElements(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]++;
        }
        return numbers;
    }
    public static int increaseNumber(int number) {
        return number + 1;
    }
    public static float average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / (float) numbers.length;
    }
}
