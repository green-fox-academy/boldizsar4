import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {

  public static void main(String[] args) {

    countingLetters("helloHHHHH123");
    }

  public static int[] countingLetters(String string){
    int count[] = new int[255];
    int length = string.length();

    for (int i = 0; i < length; i++)
      count[string.charAt(i)]++;
    char ch[] = new char[string.length()];

    for (int i = 0; i < length; i++) {
      ch[i] = string.charAt(i);
      int found = 0;
      for (int j = 0; j <= i; j++) {
        if (string.charAt(i) == ch[j])
          found++;
      } if (found == 1)
        System.out.println(string.charAt(i) + ": " + count[string.charAt(i)]);
    }

    return count;
  }
}
