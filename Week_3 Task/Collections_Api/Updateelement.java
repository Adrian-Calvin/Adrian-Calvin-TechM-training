import java.util.ArrayList;
import java.util.List;

public class Updateelement{
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue", "Yellow"));
        colors.set(1, "Orange");
        System.out.println("Updated List: " + colors);
    }
}
