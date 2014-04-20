/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;
import java.sql.*;
/**
 *
 * @author modsm_000
 */
public class Connector {
    
    Connection conn;
    public Connector() throws ClassNotFoundException, SQLException{
        String url = "jdbc:sqlserver://localhost;databaseName=Casino";
        String username = "guest";
        String password="secret";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection(url,username,password);
        
        Statement stm = conn.createStatement();
        String query = "Select * from Casino";
        ResultSet rs = stm.executeQuery(query);
        
        if(rs.next())
            System.out.println("found something");
        System.out.println(rs.getString(3));
        
    }
}
