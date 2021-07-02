/**
 * Makes the connection to the database
 *
 * @author Andre Queiroz
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDao {

    public Connection conectDataBase() {
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/employeeregister?user=root&password=";
            connection = DriverManager.getConnection(url);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Error in connectionDao: " + error.getMessage());
        }
        return connection;
    }
}
/*
 *   jdbc:mysql://           -> Connection driver
 *   localhost:3306/         -> Database location 
 *   employeeregister        -> Database name
 *   ?user=root&password=    -> Username and password
 */