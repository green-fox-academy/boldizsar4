import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

        int i;
        int girls = 0;
        int boys = 0;
        System.out.println("please give me two number");

        for (i = 0; i < 2; i++) {
            Scanner userInput1 = new Scanner(System.in);
            Scanner userInput2 = new Scanner(System.in);
            girls = userInput1.nextInt();
            boys = userInput2.nextInt();

            if (girls == boys && (girls += boys) > 20) {
                System.out.println("The party is excellent!");
            } else if ((girls += boys) > 20 && girls > boys) {
                System.out.println("Quite cool party!");
            } else if ((girls += boys) < 20) {
                System.out.println("Average party.");
            }
            if (girls == 0) {
                System.out.println("Sausage party..");

            }
        }
    }
}