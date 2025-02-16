import java.io.File;

public class Directoryfiles {
    public static void main(String[] args) {
        File directory = new File("C:/Users/Adrian/Documents/java1"); 
        String[] files = directory.list();
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } 
        else {
            System.out.println("No files found.");
        }
    }
}
