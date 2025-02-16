import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Minimummaximum{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(14, 22, 59, 33, 5, 12, 7, 22, 30, 1, 15);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println("Maximum value: " + max.orElse(null));
        System.out.println("Minimum value: " + min.orElse(null));
    }
}
