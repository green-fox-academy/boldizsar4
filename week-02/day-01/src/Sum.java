public class Sum {
    public static void main(String[] args) {
        int number = 3;

        System.out.println(sum(number));
        }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
           sum += i;
            
            }
        return sum;
    }

    }
