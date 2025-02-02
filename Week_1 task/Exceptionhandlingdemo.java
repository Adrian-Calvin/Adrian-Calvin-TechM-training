import java.util.*;

public class Exceptionhandlingdemo {
    public static void main() throws ArithmeticException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try 
        {
            double number = Double.parseDouble(sc.nextLine());
            if (number == 0) 
            {
                throw new ArithmeticException("Cannot divide by zero");
            }
            System.out.println("Reciprocal: " + (1/number));
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid input! Please enter a number other than 0");
        } 
        finally 
        {
            sc.close();
        }
    }

}
