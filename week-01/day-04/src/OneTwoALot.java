import java.util.Scanner;
// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot
public class OneTwoALot {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        System.out.println("please give a number!");
        int number = userInput.nextInt();
        if (number == 0 || number < 0) {
            System.out.println("not enough!");
        }
        if (number == 1) {
            System.out.println("one");
        }
        if (number == 2) {
            System.out.println("two");
        }
        if (number > 2) {
            System.out.println("A lot");
        }

    }
}
