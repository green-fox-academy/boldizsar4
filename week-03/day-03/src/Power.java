public class Power {
    public static void main(String[] args) {
        int square = power(5,5);
        System.out.println(square);

    }

    private static int power(int b, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
             return (power(b, n/2) * power(b, n/2));
        } else {
           return (power(b,(n-1)/2) * power(b,(n-1)/2)*b);
        }
    }
}

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).