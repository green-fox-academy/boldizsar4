import java.util.List;
import java.util.Scanner;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class CountLines {
    public static void main(String[] args) {


        Scanner userinput = new Scanner(System.in);
        System.out.println("Type the filename!");
        String filename = userinput.next();
        System.out.println(numberOfLine(filename));
    }

    public static int numberOfLine(String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);

            return lines.size();

        } catch (Exception e) {
            return 0;

        }
    }
}