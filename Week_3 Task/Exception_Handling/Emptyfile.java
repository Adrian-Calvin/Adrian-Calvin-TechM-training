import java.io.File;

public class Emptyfile{
    public static void checkFileNotEmpty(String filename) throws Exception{
        File file = new File(filename);
        if (!file.exists() || file.length() == 0){
            throw new Exception("File is empty.");
        }
    }

    public static void main(String[] args){
        try {
            checkFileNotEmpty("empty.txt");
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

