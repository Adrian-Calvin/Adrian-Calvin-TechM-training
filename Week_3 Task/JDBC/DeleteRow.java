import java.sql.*;
import java.util.Scanner;

public class DeleteRow {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement("DELETE FROM employees WHERE id = ?");
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Employee ID to delete: ");
            int id = sc.nextInt();

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0) System.out.println("Deleted successfully!");
            else System.out.println("Employee ID not found.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

