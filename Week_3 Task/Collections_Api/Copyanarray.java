import java.util.ArrayList;
import java.util.List;

public class Copyanarray{
    public static void main(String[] args) {
        List<String> original = new ArrayList<>(List.of("Red", "Green", "Blue"));
        List<String> copy = new ArrayList<>(original);
        System.out.println("Copied List: " + copy);
    }
}
