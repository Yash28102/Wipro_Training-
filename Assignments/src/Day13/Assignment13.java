package Day13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Assignment13 {

    static Connection con;
    static Scanner sc = new Scanner(System.in);

    // ✅ SAFE INITIALIZATION
    static {
        con = DBConnection.getConnection();

        if (con == null) {
            System.out.println("❌ DATABASE CONNECTION IS NULL");
            System.out.println("Fix MySQL / password / driver first!");
        }
    }

    public static void main(String[] args) {

        if (con == null) {
            System.out.println("Program stopped due to DB error.");
            return;
        }

        while (true) {

            System.out.println("\n====== MENU ======");
            System.out.println("1. Login Validation");
            System.out.println("2. Last 7 Days Records");
            System.out.println("3. Group By Department");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    loginValidation();
                    break;

                case 2:
                    last7DaysRecords();
                    break;

                case 3:
                    groupByDepartment();
                    break;

                case 4:
                    updateSalary();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ================= LOGIN =================
    public static void loginValidation() {

        try {
            sc.nextLine();

            System.out.print("Username: ");
            String username = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            String sql = "SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid Credentials!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ================= LAST 7 DAYS =================
    public static void last7DaysRecords() {

        try {

            String sql = "SELECT * FROM employees " +
                         "WHERE created_at >= DATE_SUB(CURDATE(), INTERVAL 7 DAY)";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Employees ---");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("department") + " | " +
                    rs.getDouble("salary")
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ================= GROUP BY =================
    public static void groupByDepartment() {

        try {

            String sql = "SELECT department, COUNT(*) AS total FROM employees GROUP BY department";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Department Count ---");

            while (rs.next()) {
                System.out.println(rs.getString("department") + " => " + rs.getInt("total"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ================= UPDATE SALARY =================
    public static void updateSalary() {

        try {
            sc.nextLine();

            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            System.out.print("Enter % increase: ");
            double percent = sc.nextDouble();

            String sql = "UPDATE employees SET salary = salary + (salary * ? / 100) WHERE department=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, percent);
            ps.setString(2, dept);

            int rows = ps.executeUpdate();

            System.out.println(rows + " rows updated!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}