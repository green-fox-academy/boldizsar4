public class Counter {

    public static void main(String[] args) {
        int count = countDown(10);
        System.out.println(count);
    }

    public static int countDown(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println(n);
            return countDown(n - 1);
        }
    }
}
