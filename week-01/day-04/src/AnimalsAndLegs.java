import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int chickenLegs;
        System.out.println("How many chicken do you have?");
        chickenLegs = userInput.nextInt();

        int pigLegs;
        System.out.println("And how many pig do you have?");
        pigLegs = userInput.nextInt();
        System.out.println("Your animals have " + (chickenLegs * 2 + pigLegs * 4) + " legs altogether.");
    }
}
