

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filenotfound{
    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        sc.close();
    }

    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } 
        catch (FileNotFoundException e) {
            System.out.println("Exception: File not found.");
        }
    }
}
