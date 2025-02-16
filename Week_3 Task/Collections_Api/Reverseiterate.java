import java.util.LinkedList;
import java.util.Collections;

public class Reverseiterate{
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>(java.util.List.of("Apple", "Banana", "Mango"));
        Collections.reverse(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
