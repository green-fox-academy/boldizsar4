public class Factorial {
    public static void main(String[] args) {
        int in = 8;
        System.out.println(factorio(in));
        }

        public static int factorio (int in) {
          int factorial = 1;
          for (int i= 1; i <= in; i++) {
            factorial = i * factorial;
          }
          return factorial;
    }
}
