import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        int i;
        int numbers = 0;
        int value = 0;
        int sum = 0;
        double average;

        System.out.println("Please give five numbers!");

        for (i = 0; i < 5; i++) {
            Scanner userInput = new Scanner(System.in);
            numbers = userInput.nextInt();
            sum = value += numbers;

        }
        average = value / 5;
        System.out.println("The sum of your five numbers: " + sum + " and the average: " + average);
    }

}
