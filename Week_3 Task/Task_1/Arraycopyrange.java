import java.util.Arrays;

public class Arraycopyrange{
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50, 60, 70};
        int[] copiedRange = Arrays.copyOfRange(original, 2, 5); 
        System.out.println("Copied Range: " + Arrays.toString(copiedRange));
    }
}
