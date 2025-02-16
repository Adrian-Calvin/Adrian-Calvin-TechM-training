import java.util.Arrays;

class Sortthread extends Thread{
     int[] arr;

    public Sortthread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

public class Multithreadsort{
    public static void main(String[] args){
        int[] numbers = {9, 5, 2, 8, 1, 7};
        Sortthread thread = new Sortthread(numbers);
        thread.start();
    }
}

