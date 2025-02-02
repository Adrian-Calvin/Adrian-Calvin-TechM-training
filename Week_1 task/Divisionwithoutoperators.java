import java.util.*;

public class Divisionwithoutoperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dividend = 0, divisor = 0, quotient = 0, remainder = dividend;
        System.out.println("Enter Dividend : ");
        dividend=sc.nextInt();

        System.out.println("Enter Divisor : ");
        divisor=sc.nextInt();



        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        sc.close();
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);
    }
}

