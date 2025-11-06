
package my_pos_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
 public Connection con;
    String url = "jdbc:mysql://localhost:3306/mypos";
    String username = "root";
    String password = "";
    
    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection is ok");
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(DBConnection.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } 
        
    }

    
    void closeConnection() {
if (con != null) {
            try {
                con.close();
                System.out.println("Database connection closed.");
            } catch (SQLException ex) {
                System.out.println("Error closing database connection: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
        
    
}