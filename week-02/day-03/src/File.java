import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
public class File {
    public static void main(String[] args) {
        String fileName = "asd.txt";
        Path path = Paths.get(fileName);

        try {
            int num = 1/0;
            Files.readAllLines(path);
//    throw new Exception("a");
        } catch (IOException(path)){
            System.out.println("valami");
        } catch (Exception e) {
            System.out.println("IO exception volt");
        } finally {
            System.out.println("ez tuti megjelenik");
        }

    }
}
/*
Hibák:
Compile time error: le se tudjuk fordítani gépi kóddá, amit írtunk. ha sikerült lefordítani, nincs benne syntax hiba
amikor lefordítjuk a kódot,
Syntax error :
runtime error: pl nullával való osztás
Semantic error:
*/


