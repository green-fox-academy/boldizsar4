import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        int km;
        System.out.println("Give a number in km!");
        Scanner userInput = new Scanner(System.in);
        km = userInput.nextInt();
        System.out.println(km + " km = " + (km * 0.62137) + " miles.");
    }

}
