import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {

        String file = "src/copythis.txt";
        String file2 = "src/toanother.txt";
        System.out.println(copyFile(file, file2));
    }

    public static boolean copyFile(String file, String file2) {

        Path filePath = Paths.get(file);
        Path filePath2 = Paths.get(file2);

        try {
            List<String> text = Files.readAllLines(filePath);
            Files.write(filePath2, text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful