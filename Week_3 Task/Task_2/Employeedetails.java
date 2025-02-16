import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double salary;
    private int yearsWorked;

    public void setEmployeeDetails(int empId, String empName, double salary, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public void getEmployeeDetails() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Years Worked: " + yearsWorked);
        System.out.println("Loan Eligibility: " + getLoanEligibility());
    }

    public double getLoanEligibility() {
        if (yearsWorked > 5) {
            if (salary >= 15_00_000) 
            return 7_00_000;
            else if (salary >= 10_00_000) 
            return 5_00_000;
            else if (salary >= 6_00_000) 
            return 2_00_000;
        }
        return 0;
    }
}

public class Employeedetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Years Worked: ");
        int years = sc.nextInt();

        emp.setEmployeeDetails(id, name, salary, years);
        emp.getEmployeeDetails();
        sc.close();
    }
}
