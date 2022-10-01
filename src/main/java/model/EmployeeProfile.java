package model;

import java.util.ArrayList;

/**
 *
 * @author ikrabagwan
 */
public class EmployeeProfile {
    
    ArrayList<EmployeeInfo> employeeArray;

    public EmployeeProfile() {
        this.employeeArray = new ArrayList<>();
    }
    
    
    public void createEmployee(EmployeeInfo employeeAttributes){
    
        this.employeeArray.add(employeeAttributes);
    }
    
    
    
}
