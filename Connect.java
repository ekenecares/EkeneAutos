package Classes;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {
    
     public static Connection connect;
     public static PreparedStatement ps;  // Converts code into sql queries in the sql enviroment 
     public static ResultSet rs; // Select ALL from... this is responsible for returning results in the sql enviroment
     public static Statement st; // classes in SQL
    
     public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/users?usess1=false";
        String user = "root";
        String pass = "Patrick12_.";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return connect;
    }
     
}
