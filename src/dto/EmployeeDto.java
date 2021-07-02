/**
 * Dto: Transfer of objects
 * 
 * Implements an employee
 *
 * @author Andre Queiroz
 */
package dto;

public class EmployeeDto {

    private String employeeName;
    private String employeeAddress;
    private int employeeId;
    
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
}
