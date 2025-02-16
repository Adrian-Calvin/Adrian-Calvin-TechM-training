import java.io.File;
import java.io.FilenameFilter;

public class Extensionfiles{
    public static void main(String[] args) {
        File directory = new File("C:/Users/Adrian/Documents");
        String extension = ".txt";
        FilenameFilter filter = (dir, name) -> name.endsWith(extension);
        String[] files = directory.list(filter);
        if (files != null){
            for (String file : files){
                System.out.println(file);
            }
        }
        else {
            System.out.println("No matching files found.");
        }
    }
}
