public class String1 {
    public static void main(String[] args) {
        String sentence = "xelling xellow bells";
        char from = 'x';
        char to = 'y';
        System.out.println(changingChar(sentence,from,to));
    }
    private static String changingChar(String s, char from, char to) {
        if (s.length() < 1){
            return s;
        } else {
            char empty = from == s.charAt(0) ? to : s.charAt(0);
            return empty + changingChar(s.substring(1),from, to);
        }
    }
}


// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.