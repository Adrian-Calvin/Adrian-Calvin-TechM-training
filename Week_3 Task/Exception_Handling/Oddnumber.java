public class Oddnumber {
    public static void checkEven(int num) throws Exception {
        if (num % 2 != 0) {
            throw new IllegalArgumentException("Number is odd.");
        }
        System.out.println("Number is even.");
    }
    public static void main(String[] args) throws Exception {
        try {
            checkEven(5);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
