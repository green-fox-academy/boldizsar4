import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    System.out.println(getDemandedString(cities));
  }
  private static List<String> getDemandedString(ArrayList<String> cities){
   return cities.stream()
            .filter(c -> c.startsWith("A") && c.endsWith("I"))
            .collect(Collectors.toList());
  }
}

   // Write a Stream Expression to find the strings which starts with A and ends with I in the following array:
