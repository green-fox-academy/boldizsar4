import java.util.Arrays;

public class FunctionExamples2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        float average = average(numbers);

        int n = 3;
        n = increaseNumber(n);
       //ncreaseElements(numbers);

        // helloUser("Pisti");

        String appl = "alm";
        appendA(appl);
         printUntil3(numbers);

        if (appl + "a" == "alm"){
            System.out.println("yepp");
        } else {
            System.out.println("nope");
        }

    }
    public static void printUntil3(int[] numbers){
        for (int number : numbers){
            System.out.println(number);
            if (number == 3) {
            return;
        }
    }
    public static void helloUser(String userName){
        System.out.println("Hello " + userName);
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
