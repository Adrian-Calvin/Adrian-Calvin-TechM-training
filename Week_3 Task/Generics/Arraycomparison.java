import java.util.Arrays;

public class Arraycomparison{
    public static <T> boolean ArraysEqual(T[] arr1, T[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4};
        Integer[] array2 = {1, 2, 3, 4};
        Integer[] array3 = {1, 2, 3, 5};

        System.out.println("Arrays are equal: " + ArraysEqual(array1, array2));
        System.out.println("Arrays are equal: " + ArraysEqual(array1, array3)); 
    }
}
