import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEach {
    public static void main(String[] args) {
        try {
            Path filepath = Paths.get("myfile.txt");
            List<String> lines = Files.readAllLines(filepath);
            System.out.println(lines.get(0));
        } catch (Exception e) {
        }
        System.out.println("unable to read file: myfile.txt");
    }
}

// Write a program that opens a file called "my-file.txt", then prints
// each of lines form the file.
// If the program is unable to read the file (for example it does not exists),
// then it should print an error message like: "Unable to read file: my-file.txt"