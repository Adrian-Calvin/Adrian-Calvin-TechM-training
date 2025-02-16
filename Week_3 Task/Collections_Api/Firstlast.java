import java.util.LinkedList;

public class Firstlast{
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>(java.util.List.of("Apple", "Mango", "Grapes"));
        fruits.addFirst("First");
        fruits.addLast("Last");
        System.out.println("Updated List: " + fruits);
    }
}
