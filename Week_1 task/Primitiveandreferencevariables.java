public class Primitiveandreferencevariables{
    public static void modified(int num,int[] arr){
        num = 20;
        arr[0] = 99;
    }

    public static void main(String[] args){
        int number = 10;
        int[] array = {1,2,3};

        modified(number,array);

        System.out.println("Number after method call : " + number); // before changing
        System.out.println("Array after method call : " + array[0]); // after changing
    }
}

