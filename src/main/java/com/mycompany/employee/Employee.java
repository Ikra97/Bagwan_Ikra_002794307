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
        
        FirstPage firstpage = new FirstPage(employeeArray);
        firstpage.setDefaultCloseOperation(3);
    }
}
