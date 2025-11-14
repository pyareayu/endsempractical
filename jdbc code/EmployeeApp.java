// the employee table contains three column named eid,name of employee and salary of employee
package employeeapp;

import java.sql.*;

public class EmployeeApp {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/ayushdb";
        String user = "root";
        String password = "Ayu@12345";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()
        ) {
            String query = "SELECT id, name, salary FROM employees";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Employee Table:");
            System.out.println("-----------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println(id + " | " + name + " | ₹" + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




