import java.util.LinkedList;

public class Iteratelinkedlist{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana", "Mango"));
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
