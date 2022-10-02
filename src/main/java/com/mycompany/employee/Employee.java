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
        employee.setPhoto("https://tinyjpg.com/images/social/website.jpg");
        employeeArray.add(employee);
        
        FirstPage firstpage = new FirstPage(employeeArray);
        firstpage.setDefaultCloseOperation(3);
    }
}
