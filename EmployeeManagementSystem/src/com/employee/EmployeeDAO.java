// ========================== EmployeeDAO.java ==========================

package com.employee;

import java.sql.*;
import java.util.Scanner;

public class EmployeeDAO {

    Connection con = DBConnection.getConnection();

    // ========================== INSERT EMPLOYEE ==========================

    public void insertEmployee(Employee e) {

        try {

            String query = "INSERT INTO employee VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, e.getId());
            ps.setString(2, e.getName());
            ps.setString(3, e.getDepartment());
            ps.setDouble(4, e.getSalary());
            ps.setInt(5, e.getRating());
            ps.setInt(6, e.getExperience());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("\n==============================================================");
                System.out.println("              EMPLOYEE ADDED SUCCESSFULLY");
                System.out.println("==============================================================\n");
            }

        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    // ========================== TABLE FORMAT ==========================

    public void printTable(ResultSet rs) throws Exception {

        System.out.println("\n========================================================================================================");

        System.out.printf("%-8s %-25s %-18s %-12s %-10s %-12s\n",
                "ID", "NAME", "DEPARTMENT", "SALARY", "RATING", "EXPERIENCE");

        System.out.println("========================================================================================================");

        boolean found = false;

        while (rs.next()) {

            found = true;

            System.out.printf("%-8d %-25s %-18s %-12.2f %-10d %-12d\n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("department"),
                    rs.getDouble("salary"),
                    rs.getInt("rating"),
                    rs.getInt("experience"));
        }

        if (!found) {
            System.out.println("No Employee Found");
        }

        System.out.println("========================================================================================================\n");
    }

    // ========================== VIEW EMPLOYEE ==========================

    public void viewEmployee(int id) {

        try {

            String query = "SELECT * FROM employee WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                double salary = rs.getDouble("salary");

                double annualSalary = salary * 12;
                double bonus = salary * 0.10;
                double hra = salary * 0.20;
                double tax = salary * 0.05;
                double netSalary = salary + hra + bonus - tax;

                int rating = rs.getInt("rating");

                String performance;

                if (rating >= 5) performance = "Outstanding";
                else if (rating >= 4) performance = "Excellent";
                else if (rating >= 3) performance = "Good";
                else performance = "Needs Improvement";

                System.out.println("\n=================================================================");
                System.out.println("                    EMPLOYEE FULL DETAILS");
                System.out.println("=================================================================");

                System.out.printf("%-30s : %d\n", "Employee ID", rs.getInt("id"));
                System.out.printf("%-30s : %s\n", "Employee Name", rs.getString("name"));
                System.out.printf("%-30s : %s\n", "Department", rs.getString("department"));
                System.out.printf("%-30s : %.2f\n", "Salary", salary);
                System.out.printf("%-30s : %d / 5\n", "Rating", rating);
                System.out.printf("%-30s : %d Years\n", "Experience", rs.getInt("experience"));
                System.out.printf("%-30s : %s\n", "Performance", performance);

                System.out.println("-----------------------------------------------------------------");

                System.out.printf("%-30s : %.2f\n", "Annual Salary", annualSalary);
                System.out.printf("%-30s : %.2f\n", "Bonus", bonus);
                System.out.printf("%-30s : %.2f\n", "HRA", hra);
                System.out.printf("%-30s : %.2f\n", "Tax", tax);
                System.out.printf("%-30s : %.2f\n", "Net Salary", netSalary);

                System.out.println("=================================================================\n");

            } else {
                System.out.println("\nEmployee Not Found\n");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== VIEW ALL ==========================

    public void viewAllEmployees() {

        try {

            String query = "SELECT * FROM employee";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            printTable(rs);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== SEARCH BY NAME ==========================

    public void searchByName(String name) {

        try {

            String query = "SELECT * FROM employee WHERE name LIKE ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "%" + name + "%");

            ResultSet rs = ps.executeQuery();

            printTable(rs);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== SEARCH BY DEPT ==========================

    public void searchByDepartment(String dept) {

        try {

            String query = "SELECT * FROM employee WHERE department=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dept);

            ResultSet rs = ps.executeQuery();

            printTable(rs);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== SEARCH BY SALARY ==========================

    public void searchBySalary(double min, double max) {

        try {

            String query = "SELECT * FROM employee WHERE salary BETWEEN ? AND ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setDouble(1, min);
            ps.setDouble(2, max);

            ResultSet rs = ps.executeQuery();

            printTable(rs);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== SEARCH BY RATING ==========================

    public void searchByRating(int rating) {

        try {

            String query = "SELECT * FROM employee WHERE rating=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, rating);

            ResultSet rs = ps.executeQuery();

            printTable(rs);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== SEARCH BY EXPERIENCE ==========================

    public void searchByExperience(int exp) {

        try {

            String query = "SELECT * FROM employee WHERE experience>=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, exp);

            ResultSet rs = ps.executeQuery();

            printTable(rs);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== SMART SEARCH ==========================

    public void smartSearch() {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("\n1. ID\n2. Name\n3. Department\n4. Salary\n5. Rating\n6. Experience");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter ID: ");
                    viewEmployee(sc.nextInt());
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    searchByName(sc.nextLine());
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Dept: ");
                    searchByDepartment(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Min Salary: ");
                    double min = sc.nextDouble();
                    System.out.print("Max Salary: ");
                    double max = sc.nextDouble();
                    searchBySalary(min, max);
                    break;

                case 5:
                    System.out.print("Rating: ");
                    searchByRating(sc.nextInt());
                    break;

                case 6:
                    System.out.print("Experience: ");
                    searchByExperience(sc.nextInt());
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== UPDATE ==========================

    public void updateEmployee(int id) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Dept: ");
            String dept = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Rating: ");
            int rating = sc.nextInt();

            System.out.print("Exp: ");
            int exp = sc.nextInt();

            String query = "UPDATE employee SET name=?, department=?, salary=?, rating=?, experience=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);
            ps.setInt(4, rating);
            ps.setInt(5, exp);
            ps.setInt(6, id);

            int rows = ps.executeUpdate();

            System.out.println(rows > 0 ? "Updated Successfully" : "Not Found");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== DELETE ==========================

    public void deleteEmployee(int id) {

        try {

            String query = "DELETE FROM employee WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            System.out.println(rows > 0 ? "Deleted Successfully" : "Not Found");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== NEW METHODS (FIX FOR ERROR) ==========================

    public int employeeCount() {

        int count = 0;

        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT COUNT(*) FROM employee");
            if (rs.next()) count = rs.getInt(1);
            System.out.println("Total Employees: " + count);
        } catch (Exception e) {
            System.out.println(e);
        }

        return count;
    }

    public void highestSalaryEmployee() {

        try {

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM employee ORDER BY salary DESC LIMIT 1");

            printTable(rs);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void incrementSalary(int id, double percent) {

        try {

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE employee SET salary = salary + (salary * ? / 100) WHERE id=?");

            ps.setDouble(1, percent);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Salary Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void sortBySalary() {

        try {

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM employee ORDER BY salary DESC");

            printTable(rs);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void employeePerformance(int id) {

        try {

            PreparedStatement ps = con.prepareStatement("SELECT rating FROM employee WHERE id=?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Rating: " + rs.getInt(1));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void generateSalarySlip(int id) {

        viewEmployee(id);
    }
}