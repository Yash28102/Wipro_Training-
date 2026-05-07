
package com.employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Login login = new Login();

        System.out.println("\n==================================================");
        System.out.println("         EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("==================================================\n");

        System.out.print("Enter Username : ");
        String username = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        boolean status =
                login.authenticate(username, password);

        if(status) {

            EmployeeDAO dao =
                    new EmployeeDAO();

            while(true) {

                System.out.println("\n==================================================");
                System.out.println("                   MAIN MENU");
                System.out.println("==================================================");

                System.out.println("1. Add Employee");
                System.out.println("2. Search / View Employee");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. View All Employees");
                System.out.println("6. Employee Count");
                System.out.println("7. Highest Salary Employee");
                System.out.println("8. Increment Salary");
                System.out.println("9. Sort By Salary");
                System.out.println("10. Employee Performance");
                System.out.println("11. Salary Slip Generator");
                System.out.println("12. Exit");

                System.out.println("==================================================");

                System.out.print("Choose Option : ");

                int choice = sc.nextInt();

                switch(choice) {

                case 1:

                    System.out.print("\nEnter Employee ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department : ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary : ");
                    double salary = sc.nextDouble();

                    System.out.print("Enter Rating (1-5) : ");
                    int rating = sc.nextInt();

                    System.out.print("Enter Experience : ");
                    int exp = sc.nextInt();

                    Employee e =
                            new Employee(
                                    id,
                                    name,
                                    dept,
                                    salary,
                                    rating,
                                    exp);

                    dao.insertEmployee(e);

                    break;

                case 2:

                    dao.smartSearch();

                    break;

                case 3:

                    System.out.print("\nEnter Employee ID : ");

                    int updateId = sc.nextInt();

                    sc.nextLine();

                    dao.updateEmployee(updateId);

                    break;

                case 4:

                    System.out.print("\nEnter Employee ID : ");

                    int deleteId = sc.nextInt();

                    dao.deleteEmployee(deleteId);

                    break;

                case 5:

                    dao.viewAllEmployees();

                    break;

                case 6:

                    dao.employeeCount();

                    break;

                case 7:

                    dao.highestSalaryEmployee();

                    break;

                case 8:

                    System.out.print("\nEnter Employee ID : ");

                    int empid = sc.nextInt();

                    System.out.print("Enter Increment Amount : ");

                    double increment = sc.nextDouble();

                    dao.incrementSalary(empid,
                            increment);

                    break;

                case 9:

                    dao.sortBySalary();

                    break;

                case 10:

                    System.out.print("\nEnter Employee ID : ");

                    int performanceId = sc.nextInt();

                    dao.employeePerformance(performanceId);

                    break;

                case 11:

                    System.out.print("\nEnter Employee ID : ");

                    int slipId = sc.nextInt();

                    dao.generateSalarySlip(slipId);

                    break;

                case 12:

                    System.out.println("\nTHANK YOU");

                    System.exit(0);

                default:

                    System.out.println("\nInvalid Choice\n");
                }
            }

        } else {

            System.out.println("\nInvalid Username or Password\n");
        }
    }
}