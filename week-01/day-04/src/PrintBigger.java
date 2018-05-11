import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        int i;
        int number1 = 0;
        int number2 = 0;
        System.out.println("please give me two number");

        for (i = 0; i < 2; i++) {
            Scanner userInput = new Scanner(System.in);
            number1 = userInput.nextInt();
            number2 = userInput.nextInt();

            if (number1 > number2) {
                System.out.println(number1 + " is bigger.");
            } else {
                System.out.println(number2 + " is bigger.");
            }
        }

    }
}
