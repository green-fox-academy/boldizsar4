import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/myfile2.txt");
        List<String> file = new ArrayList();
        file.add("Kiss Boldizsár");
        try {
            Files.write(filePath, file);
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("unable to write file: myfile.txt");
        }
    }
}

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"