import java.util.Arrays;

public class Equalsvsdeepequals {
    public static void main(String[] args) {
        String[] arr1 = {"Java", "Python", "C++"};
        String[] arr2 = {"Java", "Python", "C++"};
        
        System.out.println("Using equals(): " + Arrays.equals(arr1, arr2)); // true
        System.out.println("Using deepEquals(): " + Arrays.deepEquals(arr1, arr2)); // true

        Object[] objArr1 = {arr1};
        Object[] objArr2 = {arr2};

        System.out.println("Using equals() on nested arrays: " + Arrays.equals(objArr1, objArr2)); // false
        System.out.println("Using deepEquals() on nested arrays: " + Arrays.deepEquals(objArr1, objArr2)); // true
    }
}
