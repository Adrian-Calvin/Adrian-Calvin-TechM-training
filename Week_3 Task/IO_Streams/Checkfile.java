import java.io.File;

public class Checkfile{
    public static void main(String[] args){
        File file = new File("C:/Users/Adrian/Documents/sample.txt");
        if (file.exists()){
            System.out.println("File/Directory exists.");
        }
        else{
            System.out.println("File/Directory does not exist.");
        }
    }
}
