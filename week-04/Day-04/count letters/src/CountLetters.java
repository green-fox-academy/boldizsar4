public class CountLetters {

  public static void main(String[] args) {
    countingLetters("hello");
    }

  public static int[] countingLetters(String string){
    int[] count = new int[255];
    int length = string.length();
    for (int i = 0; i <length; i++) {
      count[string.charAt(i)]++;
    }
    char[] character = new char[length];
    for (int i = 0; i < length; i++) {
      character[i] = string.charAt(i);
      int found = 0;
      for (int j = 0; j <= i; j++) {
        if (string.charAt(i) == character[j]) {
          found++;
        } if (found == 1) {
          System.out.println(string.charAt(i) + " : " + count);
        }
      }
    }
    return count;
  }
}
