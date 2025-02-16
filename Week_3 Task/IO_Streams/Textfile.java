import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class Textfile{
    public static void main(String[] args) {
        String filePath = "C:/Users/Adrian/Documents/sample.txt";
        try{
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
