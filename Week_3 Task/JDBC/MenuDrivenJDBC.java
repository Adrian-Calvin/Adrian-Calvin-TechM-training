import java.sql.*;
import java.util.Scanner;

public class MenuDrivenJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("\nMENU:");
                System.out.println("1. Insert a new Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select a Row");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> insertRow(conn, sc);
                    case 2 -> updateRow(conn, sc);
                    case 3 -> deleteRow(conn, sc);
                    case 4 -> selectRow(conn, sc);
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid option! Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertRow(Connection conn, Scanner sc) throws SQLException {
        String query = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Department: ");
            String dept = sc.next();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);

            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Row Inserted Successfully!");
        }
    }

    private static void updateRow(Connection conn, Scanner sc) throws SQLException {
        String query = "UPDATE employees SET name = ?, department = ?, salary = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
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
            if (rows > 0) System.out.println("Updated Successfully!");
            else System.out.println("Employee ID not found.");
        }
    }

    private static void deleteRow(Connection conn, Scanner sc) throws SQLException {
        String query = "DELETE FROM employees WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            System.out.print("Enter Employee ID to delete: ");
            int id = sc.nextInt();

            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Deleted Successfully!");
            else System.out.println("Employee ID not found.");
        }
    }

    private static void selectRow(Connection conn, Scanner sc) throws SQLException {
        String query = "SELECT * FROM employees WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            System.out.print("Enter Employee ID to retrieve: ");
            int id = sc.nextInt();

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
                        ", Dept: " + rs.getString("department") + ", Salary: " + rs.getDouble("salary"));
            } else {
                System.out.println("Employee ID not found.");
            }
        }
    }
}
