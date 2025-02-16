import java.util.ArrayList;
import java.util.List;

public class Getelement {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue", "Yellow"));
        String color = colors.get(2);
        System.out.println("Element at index 2 is: " + color);
    }
}
