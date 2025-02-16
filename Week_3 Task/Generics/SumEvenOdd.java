import java.util.List;

public class SumEvenOdd{
    public static <T extends Number> int[] sumEvenOdd(List<T> numbers){
        int evenSum = 0, oddSum = 0;

        for (T num : numbers){
            if (num.intValue() % 2 == 0){
                evenSum += num.intValue();
            } 
            else {
                oddSum += num.intValue();
            }
        }

        return new int[]{evenSum, oddSum};
    }

    public static void main(String[] args){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int[] result = sumEvenOdd(numbers);
        System.out.println("Even Sum: " + result[0] + ", Odd Sum: " + result[1]);
    }
}
