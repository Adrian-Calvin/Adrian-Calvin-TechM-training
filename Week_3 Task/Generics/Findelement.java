import java.util.List;

public class Findelement{
    public static <T> int findFirstOccurrence(List<T> list, T target){
        return list.indexOf(target);
    }
    public static void main(String[] args){
        List<String> words = List.of("apple", "banana", "cherry", "banana");
        System.out.println("Index: " + findFirstOccurrence(words, "banana")); 
        System.out.println("Index: " + findFirstOccurrence(words, "grape")); 
    }
}
