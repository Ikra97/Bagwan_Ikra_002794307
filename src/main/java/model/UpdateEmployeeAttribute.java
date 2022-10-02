/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ikrabagwan
 */
public class UpdateEmployeeAttribute {
    
    EmployeeInfo employee;
    ArrayList<EmployeeInfo> employeeArray;
    
    EmployeeInfo matchedEmployee;
    Boolean delete;
    
    
    public UpdateEmployeeAttribute(EmployeeInfo employee, ArrayList<EmployeeInfo> employeeArray, Boolean delete){
        
        this.employee = employee;
        this.employeeArray = employeeArray;
        matchedEmployee = getProfile();
        this.delete = delete;
        UpdateProfile();
    
    }
    
    public EmployeeInfo getProfile(){
        
        for(int i = 0; i < employeeArray.size(); i++){
            
            EmployeeInfo emp = employeeArray.get(i);
            
            if(emp.getEmployeeId() == this.employee.getEmployeeId() ){
                
                if(this.delete){
                
                    employeeArray.remove(i);
                    return null;
                }else{
                    return emp;
                }
                
            }
        }
        return null;
    }
    
    public void UpdateProfile(){
    
        this.matchedEmployee.setName(this.employee.getName());
        this.matchedEmployee.setAge(this.employee.getAge());
        this.matchedEmployee.setGender(this.employee.getGender());
        this.matchedEmployee.setLevel(this.employee.getLevel());
        this.matchedEmployee.setTeamInfo(this.employee.getTeamInfo());
        this.matchedEmployee.setPositionTitle(this.employee.getPositionTitle());
        this.matchedEmployee.setTelephone(this.employee.getTelephone());
        this.matchedEmployee.setEmail(this.employee.getEmail());
        this.matchedEmployee.setStartDate(this.employee.getStartDate());
        this.matchedEmployee.setPhoto(this.employee.getPhoto());
        
        
    }
    
}
