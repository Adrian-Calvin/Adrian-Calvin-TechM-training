import java.sql.*;
import java.util.Scanner;

public class UpdateRow {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement("UPDATE employees SET name = ?, department = ?, salary = ? WHERE id = ?");
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Employee ID to update: ");
            int id = sc.nextInt();
            System.out.print("Enter New Name: ");
            String name = sc.next();
            System.out.print("Enter New Department: ");
            String dept = sc.next();
            System.out.print("Enter New Salary: ");
            double salary = sc.nextDouble();

            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Updated successfully!");
            else System.out.println("Employee ID not found.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
