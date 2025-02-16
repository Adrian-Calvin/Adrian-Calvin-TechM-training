import java.io.File;
import java.util.Date;

public class LastModified{
    public static void main(String[] args) {
        File file = new File("C:/Users/Adrian/Documents/sample.txt");
        if (file.exists()) {
            System.out.println("Last Modified: " + new Date(file.lastModified()));
        }
        else {
            System.out.println("File does not exist.");
        }
    }
}
