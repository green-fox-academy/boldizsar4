import java.util.Arrays;

public class Anagram {

  public boolean isAnagram(String s1, String s2){
    if (s1.length() != s2.length()){
      return false;
    }
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    char[] s12 = s1.toCharArray();
    char[] s22 = s2.toCharArray();

    Arrays.sort(s12);
    Arrays.sort(s22);

    String s3 = new String(s12);
    String s4 = new String(s22);
    return s3.equals(s4);
  }
}
