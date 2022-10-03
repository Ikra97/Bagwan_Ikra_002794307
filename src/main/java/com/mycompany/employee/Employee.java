package com.mycompany.employee;

import java.util.ArrayList;
import model.EmployeeInfo;
import view.FirstPage;

/**
 *
 * @author ikrabagwan
 */
public class Employee {
    

    public static void main(String[] args) {
        ArrayList<EmployeeInfo> employeeArray = new ArrayList<>();
        
        EmployeeInfo employee = new EmployeeInfo();
        
        employee.setName("IKRA");
        employee.setEmployeeId( 7625746);
        employee.setAge(25);
        employee.setGender("Female");
        employee.setLevel("Intermediate");
        employee.setTeamInfo("Marvel");
        employee.setPositionTitle("SDE1");
        employee.setTelephone(1542367890);
        employee.setEmail("ib@gmailcom");
        employee.setStartDate("12-20-2022");
        employee.setPhoto("/Users/ikrabagwan/downloads/cat.png");
        employeeArray.add(employee);
        
        EmployeeInfo employee1 = new EmployeeInfo();
        
        employee1.setName("GARY");
        employee1.setEmployeeId( 7625756);
        employee1.setAge(24);
        employee1.setGender("Male");
        employee1.setLevel("Novice");
        employee1.setTeamInfo("xyz");
        employee1.setPositionTitle("DA");
        employee1.setTelephone(1542367654);
        employee1.setEmail("ga@gmailcom");
        employee1.setStartDate("12-20-2002");
        employee1.setPhoto("/Users/ikrabagwan/downloads/cat.png");
        employeeArray.add(employee1);
        
        FirstPage firstpage = new FirstPage(employeeArray);
        firstpage.setDefaultCloseOperation(3);
    }
}
