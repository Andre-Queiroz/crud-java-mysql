/**
 * Dao: Access to objects
 *
 * Implements the CRUD insert, search, change, and delete methods.
 *
 * @author Andre Queiroz
 */
package dao;

import dto.EmployeeDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmployeeDao {

    Connection connection; // Make the connection
    PreparedStatement preparingConnection; // Prepare the connection
    ResultSet rs; // Access database elements to bring back 

    ArrayList<EmployeeDto> employeeList = new ArrayList<>();

    /*
     *   Inserting in the employee table in
     *   field employeeName and employeeAddress.
     *   ? and ? will be entered in these fields. 
     */
    public void registerEmployee(EmployeeDto employeeDto) {

        String sqlQuery = "INSERT INTO employee (employeeName, employeeAddress) values (?,?)";

        connection = new ConnectionDao().conectDataBase();

        try {
            preparingConnection = connection.prepareStatement(sqlQuery);

            preparingConnection.setString(1, employeeDto.getEmployeeName());
            preparingConnection.setString(2, employeeDto.getEmployeeAddress());

            preparingConnection.execute();
            preparingConnection.close();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "EmployeeDao register error: " + error.getMessage());
        }

    }

    public ArrayList<EmployeeDto> searchEmployee() {

        String sqlQuery = "SELECT * FROM employee";
        connection = new ConnectionDao().conectDataBase();

        try {
            preparingConnection = connection.prepareStatement(sqlQuery);
            rs = preparingConnection.executeQuery();

            // Bringing each information from the database, as long as there are lines 
            while (rs.next()) {
                // Instantiates the object 
                EmployeeDto employee = new EmployeeDto();

                // Set atributes according to the database
                employee.setEmployeeId(rs.getInt("id"));
                employee.setEmployeeName(rs.getString("employeeName"));
                employee.setEmployeeAddress(rs.getString("employeeAddress"));

                // Add to list
                employeeList.add(employee);
            }
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "EmployeeDao search error: " + error.getMessage());
        }
        return employeeList;
    }

}
