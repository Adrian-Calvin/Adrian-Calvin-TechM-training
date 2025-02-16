import java.util.Arrays;

public class alternative {
    public static int[] copyAlternativeElements(int[] arr) {
        int[] result = new int[(arr.length + 1) / 2];
        int index = 0;

        for (int i = 0; i < arr.length; i += 2) {
            result[index++] = arr[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Alternative Elements: " + Arrays.toString(copyAlternativeElements(input)));
    }
}
