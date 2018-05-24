public class Bunny1 {
    public static void main(String[] args) {
        int bunnyEars = countingEars(5);
        System.out.println(bunnyEars);
    }

    private static int countingEars(int bunnies) {
        int ears = 2;
        if (bunnies == 0) {
            return 0;
        } else {
            return ears + countingEars(bunnies - 1);
        }
    }
}
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).