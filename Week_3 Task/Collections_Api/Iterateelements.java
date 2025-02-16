import java.util.ArrayList;
import java.util.List;

public class Iterateelements {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue", "Yellow"));
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
