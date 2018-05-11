import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please give an integer!");
        int userInput = scan.nextInt();
        if (userInput % 2 == 0) {
            System.out.println("Thats an even number.");
        }
        if (userInput % 2 > 0) {
            System.out.println("Thats an odd number.");
        }

    }
}
