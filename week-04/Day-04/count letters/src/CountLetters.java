public class CountLetters {
public int[] countingLetters(String string){
  String string = "aandjfnslvdsékf";
  int[] count = new int[255];
  int found = 0;
  for (int i = 0; i <string.length(); i++) {
    count[string.charAt(i)]++;

    char[] character = new char[string.length()];
    for (int j = 0; j < string.length(); j++) {
      character[i] = string.charAt(i);
      
    }
  }
}
}
