
public class IfExample {

    public static void main(String[] args) {

        int number = 3;

        System.out.println(number / 2.0);

        if (number % 2 == 0) {
            System.out.println("Paros");
        } else {
            System.out.println("Paratlan");
        }

        if (number == 1) {
            System.out.println("Szuper");
        } else if (number == 2) {
            System.out.println("Majdnem szuper");
        } else {
            System.out.println("Nem szuper");
        }


    }

}
