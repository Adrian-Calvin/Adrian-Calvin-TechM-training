import java.util.Arrays;
import java.util.List;

public class Startingletter{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "mango", "berry");
        char startLetter = 'a';
        long count = words.stream().filter(word -> word.startsWith(String.valueOf(startLetter))).count();
        System.out.println("Count of words starting with '" + startLetter + "': " + count);
    }
}
