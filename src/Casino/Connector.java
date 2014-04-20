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
    Statement stm;
    public Connector() throws ClassNotFoundException, SQLException{
        String url = "jdbc:sqlserver://localhost;databaseName=Casino";
        String username = "guest";
        String password="secret";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection(url,username,password);
        
        stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//        String query = "Select * from Casino";
//        ResultSet rs = stm.executeQuery(query);
        
//        rs.absolute(1);
//        System.out.println(rs.getString(3));
        
    }
    
    /*
     * Executes a query against a database
     * @param A sting that is an SQL select statement
     * @returns A scroll sensitive result set. Being scroll sensitive means that the pointer can also move backwards or to an absolute location.
     */
    public ResultSet execQuery(String query) throws SQLException{
        return stm.executeQuery(query);
    }
}
