package Day12;

import java.sql.*;
import java.util.Scanner;

// ========================== DB CONNECTION ==========================
class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            // Optional in modern JDBC (can be removed)
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "root"
            );
        } catch (Exception e) {
            System.out.println("Connection Error: " + e);
        }
        return con;
    }
}

// ========================== MAIN CLASS ==========================
public class Assignment12 {

    static Connection con = DBConnection.getConnection();
    static Scanner sc = new Scanner(System.in);

    // ========================== 1. INSERT USER DATA ==========================
    public static void insertUserData() {
        try {
            System.out.println("Enter ID:");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter City:");
            String city = sc.nextLine();

            String sql = "INSERT INTO students VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, city);

            int i = ps.executeUpdate();
            System.out.println(i + " record inserted successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== 2. LOGIN VALIDATION ==========================
    public static void loginValidation() {
        try {
            System.out.println("Enter Username:");
            String user = sc.nextLine();

            System.out.println("Enter Password:");
            String pass = sc.nextLine();

            String sql = "SELECT * FROM login WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Credentials");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== 3. INSERT MULTIPLE RECORDS ==========================
    public static void insertMultipleRecords() {
        try {
            System.out.println("How many records?");
            int n = Integer.parseInt(sc.nextLine());

            String sql = "INSERT INTO students VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter ID:");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println("Enter Name:");
                String name = sc.nextLine();

                System.out.println("Enter City:");
                String city = sc.nextLine();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, city);

                ps.executeUpdate();
                System.out.println("Record " + i + " inserted");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== 4. DISPLAY ALL RECORDS ==========================
    public static void displayRecords() {
        try {
            String sql = "SELECT * FROM students";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("ID\tName\tCity");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ========================== MAIN MENU ==========================
    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("\n===== DAY12 JDBC MENU =====");
                System.out.println("1. Insert User Data");
                System.out.println("2. Login Validation");
                System.out.println("3. Insert Multiple Records");
                System.out.println("4. Display All Records");
                System.out.println("5. Exit");

                System.out.println("Enter choice:");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        insertUserData();
                        System.out.println("Output: Data inserted");
                        break;

                    case 2:
                        loginValidation();
                        System.out.println("Output: Login checked");
                        break;

                    case 3:
                        insertMultipleRecords();
                        System.out.println("Output: Multiple records inserted");
                        break;

                    case 4:
                        displayRecords();
                        System.out.println("Output: Records displayed");
                        break;

                    case 5:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}


/*		Output :

1.

===== DAY12 JDBC MENU =====
1. Insert User Data
2. Login Validation
3. Insert Multiple Records
4. Display All Records
5. Exit
Enter choice:
1
Enter ID:
11
Enter Name:
Daksh
Enter City:
Meerut
1 record inserted successfully
Output: Data inserted

2.

===== DAY12 JDBC MENU =====
1. Insert User Data
2. Login Validation
3. Insert Multiple Records
4. Display All Records
5. Exit
Enter choice:
2
Enter Username:
user1
Enter Password:
pass1
Login Successful
Output: Login checked

3.

===== DAY12 JDBC MENU =====
1. Insert User Data
2. Login Validation
3. Insert Multiple Records
4. Display All Records
5. Exit
Enter choice:
3
How many records?
2
Enter ID:
12
Enter Name:
Laksh
Enter City:
Meerut
Record 1 inserted
Enter ID:
13
Enter Name:
Parth
Enter City:
Bajpur
Record 2 inserted
Output: Multiple records inserted

4.

===== DAY12 JDBC MENU =====
1. Insert User Data
2. Login Validation
3. Insert Multiple Records
4. Display All Records
5. Exit
Enter choice:
4
ID	Name	City
1	Aman	Meerut
2	Rahul	Delhi
3	Sonia	Noida
4	Vikas	Ghaziabad
5	Neha	Lucknow
6	Rohit	Agra
7	Priya	Kanpur
8	Karan	Pune
9	Simran	Jaipur
10	Arjun	Chandigarh
11	Daksh	Meerut
12	Laksh	Meerut
13	Parth	Bajpur
101	Pandey	Prayagraj
102	Nishant	Kanpur
Output: Records displayed

*/
