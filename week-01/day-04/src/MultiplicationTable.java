import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the Number: ");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }
}



// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0