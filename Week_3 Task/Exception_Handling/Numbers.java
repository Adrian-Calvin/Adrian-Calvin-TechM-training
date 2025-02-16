import java.io.File;
import java.util.Scanner;

public class Numbers {
    public static void checkNumbers(String filename) throws Exception {
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number > 0) {
                throw new Exception("Positive number found: " + number);
            }
            sc.close();
        }
    }

    public static void main(String[] args) {
        try {
            checkNumbers("numbers.txt");
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

