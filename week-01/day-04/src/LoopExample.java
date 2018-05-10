import java.util.Scanner;

public class LoopExample {

    public static void main(String[] args) {

        // int hungerCounter = 10;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int hungerCounter = userInput.nextInt();

        while (hungerCounter > 0) {
            System.out.println("[" + hungerCounter + "] Ehes vagyok");
            hungerCounter--;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

    }

}
