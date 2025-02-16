import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removeduplicate{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 7, 13, 33);
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique numbers are: " + uniqueNumbers);
    }
}
