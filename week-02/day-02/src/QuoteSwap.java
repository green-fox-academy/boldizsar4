import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println(quoteSwap(list));
    }
    public static String quoteSwap(ArrayList list){
        ArrayList newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).toString());
        }
            list.set(2, list.get(5));
            list.set(5, newList.get(2));
            String string = "";
        for (int i = 0; i < list.size(); i++) {
            string = string + list.get(i) + " ";
        }
            return string;
        }
    }
// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Create a method called quoteSwap().

// Also, print the sentence to the output with spaces in between.
// Expected output: "What I cannot create I do not understand."