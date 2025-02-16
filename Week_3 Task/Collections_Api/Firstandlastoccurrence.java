import java.util.LinkedList;

public class Firstandlastoccurrence{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Banana");
        list.add("Grapes");
        list.add("Banana");

        String searchElement = "Banana";
        int firstOccurrence = list.indexOf(searchElement);
        int lastOccurrence = list.lastIndexOf(searchElement);
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + searchElement + "' is at index: " + firstOccurrence);
            System.out.println("Last occurrence of '" + searchElement + "' is at index: " + lastOccurrence);
        } 
        else {
            System.out.println("'" + searchElement + "' is not in the list.");
        }
    }
}
