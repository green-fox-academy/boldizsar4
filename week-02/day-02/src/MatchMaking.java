import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        System.out.println(makingMatches(girls, boys));
    }
    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> girlsBoys = new ArrayList<String>();
        for (int i = 0; i < girls.size(); i++) {
            girlsBoys.add(girls.get(i));
            girlsBoys.add(boys.get(i));
            }

        return girlsBoys;
    }
}


// Write a method that joins the two lists by matching one girl with one boy into a new list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...

// Write a method that joins the two lists by matching one girl with one boy into a new list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...