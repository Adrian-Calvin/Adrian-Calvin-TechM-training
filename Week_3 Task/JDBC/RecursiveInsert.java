import java.sql.*;
import java.util.Scanner;

public class RecursiveInsert {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void insertRecords(Connection conn, PreparedStatement ps, Scanner sc, int count) throws SQLException {
        if (count == 0) return;

        System.out.print("Enter Employee Name: ");
        String name = sc.next();
        System.out.print("Enter Department: ");
        String dept = sc.next();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        ps.setString(1, name);
        ps.setString(2, dept);
        ps.setDouble(3, salary);
        ps.executeUpdate();

        System.out.println("Inserted successfully!");
        insertRecords(conn, ps, sc, count - 1);
    }

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement("INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)");
             Scanner sc = new Scanner(System.in)) {

            System.out.print("How many rows to insert? ");
            int numRows = sc.nextInt();
            insertRecords(conn, ps, sc, numRows);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
