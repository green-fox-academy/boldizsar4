import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {

    public static void main(String... args) {
        Path filePath = Paths.get("src/myfileWML.txt");
        writeWords(filePath,"apple", 5);
    }

    public static void writeWords(Path path, String w, int lineNumber) {
        ArrayList<String> word = new ArrayList<>();
        for (int i = 0; i < lineNumber; i++) {
            word.add(w);
        }
        try {
            Files.write(path, word);
        } catch (Exception e) {
            System.out.println("try again");
        }
    }
}

// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.