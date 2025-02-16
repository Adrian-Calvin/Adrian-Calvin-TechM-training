import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortingstrings{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "mango", "berry");
        List<String> ascendingOrder = words.stream().sorted().collect(Collectors.toList());
        List<String> descendingOrder = words.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Ascending order: " + ascendingOrder);
        System.out.println("Descending order: " + descendingOrder);
    }
}
