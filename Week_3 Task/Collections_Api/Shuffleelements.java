import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffleelements{
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue", "Yellow"));
        Collections.shuffle(colors);
        System.out.println("The shuffled list is: " + colors);
    }
}

