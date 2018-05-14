import java.util.Arrays;

public class FunctionExamples2 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        float average = average(numbers);

        int n = 3;
        n = increaseNumber(n);
        //increaseElements(numbers);

        int sum = n + increaseNumber(n) + increaseNumber(n);
        System.out.println(sum);

        String appl = "alm";
        appl = appendA(appl);

        //helloUser("Pisti");

        printUntil3(numbers);
    }

    public static void printUntil3(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
            if (number == 3) {
                break;
            }
        }
        System.out.println("Ez volt mind");
    }

    public static void helloUser(String userName) {
        System.out.println("Hello " + userName);
    }

    public static String appendA(String text) {
        text += "a";
        return text;
    }

    public static int[] increaseElements(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            ++numbers[i];
        }
        return numbers;
    }

    public static int increaseNumber(int number) {
        return ++number;
    }

    public static float average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / (float) numbers.length;
    }

}