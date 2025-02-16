import java.util.LinkedList;
import java.util.ListIterator;

public class Iteratestarting{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana", "Mango", "Grapes"));
        ListIterator<String> iterator = list.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
