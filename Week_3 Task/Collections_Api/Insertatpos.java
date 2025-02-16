import java.util.LinkedList;

public class Insertatpos{
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>(java.util.List.of("Apple", "Mango", "Grapes"));
        fruits.add(1, "Banana");
        System.out.println("Updated List: " + fruits);
    }
}
