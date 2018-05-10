public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 8;
        System.out.println(a);
//
        int b = 100;
        b -= 95;
        System.out.println(b);
//
        int c = 44;
        c *= 2;
        System.out.println(c);
//
        int d = 125;
        d /= 5;
        System.out.println(d);
//
        int e = 8;
        int i = 8;
        int j = 8;
        e = e * i * j;
        System.out.println(e);
//
        int f1 = 123;
        int f2 = 345;
        boolean bigger = false;
        boolean smaller = true;

        if (f1 < f2) {
            f1 = 123;
            f2 = 345;
            System.out.println(bigger);
        } else {
            System.out.println(smaller);
        }
//
        int g1 = 350;
        int g2 = 200;
        boolean biggerNumber = true;
        boolean smallerNumber = false;

        if (g2 * 2 > g1) {
            g2 *= 2;
            System.out.println(biggerNumber);
        } else {
            System.out.println(smallerNumber);
        }
//
        int h = 135798745;
        boolean divise = true;
        boolean notDivise = false;

        if (h % 11 != 0) {
            h %= 11;
            System.out.println(divise);
        } else {
            System.out.println(notDivise);
        }

// tell if i1 is higher than i2 squared and smaller than i2 cubed
        int i1 = 10;
        int i2 = 3;
        boolean higher = true;
        boolean lower = false;

        if (i1 > i2) {
            i2 *= i2;
            System.out.println(higher);
        } else {
            System.out.println(lower);
        }

        double number = Math.pow(i2,3);
        if (i1 < 12) {
            number = i2;
            System.out.println(higher);
        } else {
            System.out.println(lower);
        }
// tell if j is dividable by 3 or 5 (print as a boolean)

        int j = 1521;
    }
}
