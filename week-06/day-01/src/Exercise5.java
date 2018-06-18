public class Exercise5 {
  public static void main(String[] args) {
    String tempString = "SjfdkUkdCCffslEkdlSS";
    tempString.chars()
            .mapToObj(s -> (char) s)
            .filter(Character::isUpperCase)
            .forEach(System.out::print);
  }
}

//Write a Stream Expression to find the uppercase characters in a string!
