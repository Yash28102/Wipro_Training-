package Day13;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            System.out.println("DB Connected Successfully!");

        } catch (Exception e) {
            System.out.println("DB CONNECTION FAILED");
            e.printStackTrace();
        }

        return con;
    }
}