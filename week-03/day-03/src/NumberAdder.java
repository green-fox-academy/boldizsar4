// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
public class NumberAdder {
    public static void main(String[] args) {
        int sum = addNumbers(20);
        System.out.println(sum);
    }

    private static int addNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + addNumbers(n - 1);
        }
    }
}
