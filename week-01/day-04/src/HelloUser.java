import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = userInput.next();

        System.out.println("Hello " + name + "!");

    }
}
