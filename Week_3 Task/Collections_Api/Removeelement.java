import java.util.ArrayList;
import java.util.List;

public class Removeelement {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue", "Yellow"));
        colors.remove(2);
        System.out.println("After removing third element: " + colors);
    }
}
