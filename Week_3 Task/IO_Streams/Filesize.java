import java.io.File;

public class Filesize{
    public static void main(String[] args) {
        File file = new File("C:/Users/Adrian/Documents/sample.txt");
        if (file.exists()) {
            long bytes = file.length();
            double kilobytes = bytes / 1024.0;
            double megabytes = kilobytes / 1024.0;
            System.out.println("File size is: " + bytes + " Bytes");
            System.out.println("File size is: " + kilobytes + " KB");
            System.out.println("File size is: " + megabytes + " MB");
        }
    }
}
