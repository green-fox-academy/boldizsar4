import java.util.Arrays;

public class Anagram {

  public static boolean isAnagram(String string1, String string2) {
    if (string1.length() != string2.length()) {
      return false;
    }
    if (string1.length() == 0 && string2.length() == 0){
      return false;
    }
      string1 = string1.toLowerCase();
      string2 = string2.toLowerCase();

      char[] s12 = string1.toCharArray();
      char[] s22 = string2.toCharArray();

      Arrays.sort(s12);
      Arrays.sort(s22);

     String string3 = new String(s12);
     String string4 = new String(s22);

      return string3.equals(string4);
    }
  }

