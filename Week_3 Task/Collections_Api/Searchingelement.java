import java.util.ArrayList;
import java.util.List;

public class Searchingelement{
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue", "Yellow"));
        String search = "Green";
        if (colors.contains(search)) {
            System.out.println(search + " is in the list.");
        } 
        else {
            System.out.println(search + " is not in the list.");
        }
    }
}
