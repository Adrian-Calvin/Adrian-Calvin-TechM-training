import java.util.LinkedList;

public class Linkedlist{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.addLast("Orange");
        System.out.println("Updated List: " + list);
    }
}
