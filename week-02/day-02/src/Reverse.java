public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(reversed));
    }

    public static String reverse(String reversed) {

        int reverseL = reversed.length();
        String reverseString = "";

        for (int i = reverseL - 1; i > -1; --i) {
            reverseString = reverseString + reversed.charAt(i);
        }
        return reverseString;

    }
}
//".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI"
// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.