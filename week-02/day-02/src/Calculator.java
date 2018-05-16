import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type the expression:");
// bekértem egy műveletet
        ArrayList<Integer> usernumber = new ArrayList<Integer>(userInput.nextInt());
        // a megadott művelet a userinput
    }
        public static boolean calculate (ArrayList<Integer> userInput) { // function

        ArrayList<Integer> numbersOfExpression = new ArrayList<Integer>();  // új arraylist

        for (int i = 0; i < userInput.size(); i++) {   // végigmegyek az userinputon
            numbersOfExpression.add(userInput.get(i));  // hozzárendelem az új arrayemhez
            int sum = userInput [1] += [2];    // a sum = az userinput első és második elementjének összegével
            int szor = userInput [1] *= [2];
            if (userInput.contains("+")) {  // ha az userinput tartalmaz + jelet, akkor add össze
                System.out.println(sum);
            }
            return numbersOfExpression;
        }


    }
}


// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations,
// create a method named "calculate()":
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit