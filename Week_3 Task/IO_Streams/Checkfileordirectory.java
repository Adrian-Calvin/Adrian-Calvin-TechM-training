import java.io.File;

public class Checkfileordirectory {
    public static void main(String[] args) {
        File file = new File("C:/Users/Adrian/Documents");
        if (file.isDirectory()) {
            System.out.println("It is a directory.");
        } 
        else if (file.isFile()) {
            System.out.println("It is a file.");
        } 
        else {
            System.out.println("It is neither a file nor a directory.");
        }
    }
}
