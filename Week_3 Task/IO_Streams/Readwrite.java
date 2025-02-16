import java.io.File;

public class Readwrite{
    public static void main(String[] args) {
        File file = new File("C:/Users/Adrian/Documents/sample.txt");
        System.out.println("Is the file readable: " + file.canRead());
        System.out.println("Is the file writable: " + file.canWrite());
    }
}
