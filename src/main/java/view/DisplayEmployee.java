/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.EmployeeProfile;
import model.EmployeeInfo;



/**
 *
 * @author ikrabagwan
 */
public class DisplayEmployee extends javax.swing.JFrame {
    
    String dataOfEmployee = "";
    
    ArrayList<EmployeeInfo> employeeArray;
    String update = "";
    

    /**
     * Creates new form Display
     */
    public DisplayEmployee(ArrayList<EmployeeInfo> employeeArray, String update) {
        initComponents();
        this.employeeArray = employeeArray;
        this.update = update;
        setVisible(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search using emp name, Id etc");

        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });

        SearchButton.setText("search");
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(SearchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(SearchButton)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        // TODO add your handling code here:
        
        if(searchTxt.getText().length() > 0){
        
            dataOfEmployee = searchTxt.getText();
            
            EmployeeInfo emp = searchEmployee();
            
            if(emp != null){
                
                CreateEmployee createEmp;
                try {
                    createEmp = new CreateEmployee(employeeArray, emp, true, this.update);
                    createEmp.setDefaultCloseOperation(1);
                } catch (IOException ex) {
                    Logger.getLogger(DisplayEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }else{
            
            JOptionPane.showMessageDialog(this, "Employee data doesn't exist",
               "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SearchButtonMouseClicked
    
    public EmployeeInfo searchEmployee(){
    
        for(int i = 0; i < this.employeeArray.size(); i++){
        
           EmployeeInfo emp = this.employeeArray.get(i);
           
           if(
                emp.getName().equals(dataOfEmployee) ||
                emp.getEmail().equals(dataOfEmployee) ||
                Integer.toString(emp.getTelephone()).equals(dataOfEmployee) ||
                emp.getTeamInfo().equals(dataOfEmployee) ||
                Integer.toString(emp.getEmployeeId()).equals(dataOfEmployee)
                ){
           
           return emp;
           }
           
        }
       return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
