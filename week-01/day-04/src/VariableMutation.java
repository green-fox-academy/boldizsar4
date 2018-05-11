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
        System.out.println(e * e * e);
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
        boolean yes = true;
        boolean no = false;

        if (h % 11 != 0) {
            System.out.println(no);
        } else {
            System.out.println(yes);
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
        boolean okay = true;
        boolean notOkay = false;

        if (j % 3 ==0) {
            System.out.println(okay);
        } else {
            System.out.println(notOkay);
        }
        if (j % 5 == 0) {
            System.out.println(okay);
        } else {
            System.out.println(notOkay);
        }

    }
}
