/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employess;

import java.sql.*;

/**
 *
 * @author anish
 */
public class DBUtilities {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rslt = null;
    
    public DBUtilities() throws SQLException {
        try  {
            conn = DriverManager.getConnection(Config.connection_url, Config.DATABASE_USER_ID, Config.DATABASE_PASSWORD);
        }
        catch(SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    public void ExecuteSQLStatement(String sql_stmt) {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql_stmt);
        }
        catch(SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    } 
}
