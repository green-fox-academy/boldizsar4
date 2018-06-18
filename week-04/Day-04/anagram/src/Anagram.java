import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("abc","bac"));
  }
  public static boolean isAnagram(String string1, String string2) {
      boolean isAnagram;
      if (string1.length() == 0 && string2.length() == 0){
      return false;
      }
      string1 = string1.toLowerCase();
      string2 = string2.toLowerCase();
      char[] string11 = string1.toCharArray();
      char[] string22 = string2.toCharArray();
      Arrays.sort(string11);
      Arrays.sort(string22);
      String string3 = new String(string11);
      String string4 = new String(string22);
      isAnagram = string3.equals(string4);
     return isAnagram;
    }
  }

 /*
    if (string1.length() != string2.length()) {
      return false;
    }
    if (string1.length() == 0 && string2.length() == 0){
      return false;
    }*/
