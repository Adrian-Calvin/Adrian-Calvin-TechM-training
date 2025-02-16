import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Caseconvert{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("generics", "tasks", "java", "streams");
        List<String> upperCaseList = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lowerCaseList = words.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("In Uppercase: " + upperCaseList);
        System.out.println("In Lowercase: " + lowerCaseList);
    }
}
