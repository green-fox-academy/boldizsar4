public class PrintParams {
    public static void main(String[] args) {
        printParams("first", "second");
        printParams("first", "second", "third");
        printParams("first", "second", "third", "fourth");


    }
    public static void printParams(String... string) {
        String print = "";
        for (String string2 : string){
            print += " " + string2;
        }
        System.out.println(print);
    }
}
