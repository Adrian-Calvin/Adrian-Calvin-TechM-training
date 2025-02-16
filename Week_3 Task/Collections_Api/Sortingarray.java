import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortingarray{
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Blue", "Yellow", "Green", "Red"));
        Collections.sort(colors);
        System.out.println("Sorted List: " + colors);
    }
}
