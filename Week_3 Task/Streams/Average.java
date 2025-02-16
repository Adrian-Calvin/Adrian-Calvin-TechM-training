import java.util.Arrays;
import java.util.List;
//import java.util.OptionalDouble;

public class Average{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average: " + average);
    }
}
