import java.util.ArrayList;
import java.util.List;

public class Firstpos{
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Green", "Blue", "Yellow"));
        colors.add(0, "Red");
        System.out.println(colors);
    }
}
