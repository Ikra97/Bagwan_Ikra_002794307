package view;

import java.awt.Container;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.EmployeeInfo;
import model.UpdateEmployeeAttribute;

/**
 *
 * @author ikrabagwan
 */
public class CreateEmployee extends javax.swing.JFrame {

    /**
     * Creates new form CreateEmployee
     */
    
    JFileChooser j = new JFileChooser();
    
    EmployeeInfo employee = new EmployeeInfo();
    
    EmployeeInfo emp;
    
    ArrayList<EmployeeInfo> employeeArray;
    
    String imagePath = "";
    String imageName = "";
    
    String specialCharacters = "!@#$%^&*()_+<:;,.'\"";
    
    Boolean show = false;
    String update = "";
    
    Container c;
    
    public CreateEmployee(ArrayList<EmployeeInfo> employeeArray,
            EmployeeInfo emp, 
            Boolean show,
            String update
    )throws IOException{
        
        initComponents();
        this.employeeArray = employeeArray;
        c = getContentPane();
        setVisible(true);
        setSize(1000, 1000);
        this.show = show;
        this.update = update;
        
        if(this.show || this.update.equals("update")){
            
            displayEmployeeProfile(emp);
        }
        
        if(this.show){
            
            saveButton.setText("Close");
        
        }
        
        if(this.update.equals("delete")){
            saveButton.setText("Delete");
        }
        
        if(this.update.equals("update")){
            saveButton.setText("Update");
        }
        
        if(this.show){
        
            Container parent = photo.getParent();
            parent.remove(photo);
            parent.remove(photoField);
            parent.validate();
            parent.repaint();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        employeeId = new javax.swing.JLabel();
        employeeIdTxt = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        genderTxt = new java.awt.Choice();
        level = new javax.swing.JLabel();
        levelTxt = new java.awt.Choice();
        teamInfo = new javax.swing.JLabel();
        teamInfoTxt = new javax.swing.JTextField();
        positiontitle = new javax.swing.JLabel();
        positionTitleTxt = new javax.swing.JTextField();
        telephone = new javax.swing.JLabel();
        telephoneTxt = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        photo = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        photoField = new javax.swing.JButton();
        imagePathLabel = new javax.swing.JLabel();
        startDate = new javax.swing.JLabel();
        startDateTxt = new javax.swing.JTextField();
        employeephoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("Name");

        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFocusLost(evt);
            }
        });
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        employeeId.setText("Employee ID");

        employeeIdTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                employeeIdTxtFocusLost(evt);
            }
        });

        age.setText("Age");

        ageTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageTxtFocusLost(evt);
            }
        });
        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });

        gender.setText("Gender");

        genderTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                genderTxtFocusLost(evt);
            }
        });

        level.setText("Level");

        levelTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                levelTxtFocusLost(evt);
            }
        });

        teamInfo.setText("Team Info");

        teamInfoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                teamInfoTxtFocusLost(evt);
            }
        });
        teamInfoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamInfoTxtActionPerformed(evt);
            }
        });

        positiontitle.setText("Position Title");

        positionTitleTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                positionTitleTxtFocusLost(evt);
            }
        });
        positionTitleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionTitleTxtActionPerformed(evt);
            }
        });

        telephone.setText("Telephone ");

        telephoneTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                telephoneTxtFocusLost(evt);
            }
        });

        email.setText("Email Id");

        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTxtFocusLost(evt);
            }
        });
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        photo.setText("Photo");

        saveButton.setText("SAVE");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        photoField.setText("Upload Photo");
        photoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                photoFieldFocusLost(evt);
            }
        });
        photoField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photoFieldMouseClicked(evt);
            }
        });
        photoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoFieldActionPerformed(evt);
            }
        });

        startDate.setText("Start Date");

        startDateTxt.setText("MM-DD-YYYY");
        startDateTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                startDateTxtFocusLost(evt);
            }
        });
        startDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(employeephoto))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(startDate)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(32, 32, 32))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(employeeId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(employeeIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(gender)
                                                    .addGap(43, 43, 43))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(positiontitle)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(level)
                                                .addGap(55, 55, 55)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(levelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(positionTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(photo)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(photoField)
                                        .addGap(30, 30, 30)
                                        .addComponent(imagePathLabel))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(telephoneTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(teamInfoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))))
                        .addContainerGap(416, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(teamInfo))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(employeeId)
                        .addComponent(employeeIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(startDate)
                        .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age)
                                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(positionTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positiontitle))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(levelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(teamInfo)
                                .addComponent(teamInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(level))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(employeephoto)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(telephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(telephoneTxt)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(imagePathLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(photo)
                            .addComponent(photoField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );

        genderTxt.add("Choose Gender");
        genderTxt.add("Male");
        genderTxt.add("Female");
        levelTxt.add("Choose Level");
        levelTxt.add("Novice");
        levelTxt.add("Intermediate");
        levelTxt.add("Advanced");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void teamInfoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamInfoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamInfoTxtActionPerformed

    private void positionTitleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionTitleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionTitleTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void photoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photoFieldActionPerformed

    private void photoFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoFieldMouseClicked
        // TODO add your handling code here:
        // Open the save dialog
        int image = j.showSaveDialog(null);
        
        // if the user selects a file
           if (image == JFileChooser.APPROVE_OPTION)

           {
               // set the label to the path of the selected file
               imagePath = j.getSelectedFile().getPath();
               imageName = j.getSelectedFile().getName();
               imagePathLabel.setText(imageName);

           }
           // if the user cancelled the operation
           else{
               imagePathLabel.setText("Please upload the file");
           }
           
        validateImageExtension();
    }//GEN-LAST:event_photoFieldMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        // TODO add your handling code here:
        
        if(validateform()){

            employee.setName(nameTxt.getText());
            employee.setEmployeeId( Integer.parseInt(employeeIdTxt.getText()));
            employee.setAge(Integer.parseInt(ageTxt.getText()));
            employee.setGender(genderTxt.getSelectedItem());
            employee.setLevel(levelTxt.getSelectedItem());
            employee.setTeamInfo(teamInfoTxt.getText());
            employee.setPositionTitle(positionTitleTxt.getText());
            employee.setTelephone(Integer.parseInt(telephoneTxt.getText()));
            employee.setEmail(emailTxt.getText());
            employee.setStartDate(startDateTxt.getText());
            employee.setPhoto(imagePath);

            if(!this.show && !this.update.equals("update") &&
                    !this.update.equals("delete")
                    ){
                
            if(UniqueData()){
                 
            this.employeeArray.add(employee);
            JOptionPane.showMessageDialog(this, "Employee was added",
                                              "INFORMATION",
                                              JOptionPane.INFORMATION_MESSAGE);
            }
            }
            else if(this.update.equals("update")){
                UpdateEmployeeAttribute employeeAttributeUpdate = new UpdateEmployeeAttribute(employee, this.employeeArray, false);

                Boolean isUpdated = employeeAttributeUpdate.updateStatus();

                if(isUpdated){

                JOptionPane.showMessageDialog(this, "Employee was updated",
                                              "INFORMATION",
                                              JOptionPane.INFORMATION_MESSAGE);

                }else{

                    // Code To popup an INFORMATION_MESSAGE Dialog.
                JOptionPane.showMessageDialog(this, "Employee was not updated",
                                              "ERROR",
                                              JOptionPane.ERROR_MESSAGE);

                }
            }
            else if(this.update.equals("delete")){
                UpdateEmployeeAttribute EmployeeAttributeDelete =new UpdateEmployeeAttribute(employee, this.employeeArray, true);

                Boolean isDeleted = EmployeeAttributeDelete.deleteStatus();

                if(isDeleted){

                JOptionPane.showMessageDialog(this, "Employee was deleted",
                                              "INFORMATION",
                                              JOptionPane.INFORMATION_MESSAGE);

                }else{

                    // Code To popup an INFORMATION_MESSAGE Dialog.
                JOptionPane.showMessageDialog(this, "Employee was not deleted",
                                              "ERROR",
                                              JOptionPane.ERROR_MESSAGE);

                }
            }

            this.dispose();
        }
        else{
        
        
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void nameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusLost
        // TODO add your handling code here:
        if(nameTxt.getText().length() > 0){
        if(
            nameTxt.getText().length() > 10 ||
            nameTxt.getText().chars().anyMatch(Character::isDigit)
                
          ){
            warningMessage("Name can have only up to 10 Characters");
            nameTxt.setText("");
        }
        

         Boolean validate = validateText(nameTxt.getText());
         if(!validate){
            warningMessage("Name can have only upto 10 Characters");
            nameTxt.setText("");
         }
        }
        
    }//GEN-LAST:event_nameTxtFocusLost

    private void employeeIdTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_employeeIdTxtFocusLost
        // TODO add your handling code here:
        String idText = employeeIdTxt.getText();
        
        if(employeeIdTxt.getText().length() > 0){
        
        if( idText.length() > 10){
            
            warningMessage("Employee Id can have upto 10 numbers only");
            employeeIdTxt.setText("");
        }
        
        else if (!idText.matches("[0-9]+")){
            warningMessage("Employee Id can have upto 10 numbers only");
            employeeIdTxt.setText("");
        }
        }
    }//GEN-LAST:event_employeeIdTxtFocusLost

    private void genderTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genderTxtFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_genderTxtFocusLost

    private void teamInfoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teamInfoTxtFocusLost
        // TODO add your handling code here:
        
        if(teamInfoTxt.getText().length() > 0){
        if(
            teamInfoTxt.getText().length() > 10
                
                
          ){
            warningMessage("Team Info can have only up to 10 Characters");
            teamInfoTxt.setText("");
        }
        

         Boolean validate = validateText(teamInfoTxt.getText());
         if(!validate){
            warningMessage("Team Info cannot have special characters");
            teamInfoTxt.setText("");
         }
         }
    }//GEN-LAST:event_teamInfoTxtFocusLost

    private void positionTitleTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_positionTitleTxtFocusLost
        // TODO add your handling code here:
        

        
        if(positionTitleTxt.getText().length() > 0){
            
        }
        if(
            positionTitleTxt.getText().length() > 10
          ){
            warningMessage("Position Title can have only up to 10 Characters");
            positionTitleTxt.setText("");
        }
         
         Boolean validate = validateText(positionTitleTxt.getText());
         if(!validate){
            warningMessage("Position Title cannot have special characters");
            positionTitleTxt.setText("");
         }
         
    }//GEN-LAST:event_positionTitleTxtFocusLost

    private void telephoneTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telephoneTxtFocusLost
        // TODO add your handling code here:
        
        if(telephoneTxt.getText().length() > 0){
            
        
        String telephoneText = telephoneTxt.getText();
        
        if(
            telephoneText.length() > 11 || telephoneText.length() < 10
          ){
            warningMessage("Please enter 11 digit telephone number");
            telephoneTxt.setText("");
        }
        else if(!telephoneText.chars().allMatch(Character::isDigit)){
        
            warningMessage("Telephone number can have digits only");
            telephoneTxt.setText("");
        }
        }
    }//GEN-LAST:event_telephoneTxtFocusLost

    private void emailTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusLost
        // TODO add your handling code here:
        
        if(emailTxt.getText().length() > 0){
        String emailText = emailTxt.getText();
        String regexPattern = "^(.+)@(\\S+)$";
        Boolean emailPattern;
        emailPattern = Pattern.compile(regexPattern).matcher(emailText).matches();
        
        if(emailText.length() > 0 && !emailPattern){
            warningMessage("Please enter valid email address");
            emailTxt.setText("");
        }
        }
    }
        
    public Boolean validateText(String text){
        
        for(int i =0; i < specialCharacters.length(); i++){
            
            if(text.contains(specialCharacters.charAt(i) +"")){
                return false;
            }
        }
        
        return true;
    
        
    }//GEN-LAST:event_emailTxtFocusLost
    public void warningMessage(String message){
    
    JOptionPane.showMessageDialog(this, message,
               "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void photoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_photoFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_photoFieldFocusLost

    private void ageTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageTxtFocusLost
        // TODO add your handling code here:
        if(ageTxt.getText().length() > 0){
        String ageText = ageTxt.getText();
        
        if(ageText.length() > 0){
        
            if(!ageText.matches("[0-9]+")){

                warningMessage("Age can be numbers only");
                employeeIdTxt.setText("");
            }
            else if(Integer.parseInt(ageText) > 100){
                warningMessage("Please enter age less than 100");
                employeeIdTxt.setText("");
            }
        }
        }
    }//GEN-LAST:event_ageTxtFocusLost

    private void levelTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_levelTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_levelTxtFocusLost

    private void startDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateTxtActionPerformed

    private void startDateTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startDateTxtFocusLost
        // TODO add your handling code here:
        if(startDateTxt.getText().length() > 0){
        String dateText = startDateTxt.getText();
        String regexPattern = "^\\d{2}-\\d{2}-\\d{4}$";
        Boolean datePattern;
        datePattern = Pattern.compile(regexPattern).matcher(dateText).matches();
        if(!datePattern){
            warningMessage("Please enter in MM-DD-YYY format");
            startDateTxt.setText("MM-DD-YYY");
        }
        }
    }//GEN-LAST:event_startDateTxtFocusLost
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel employeeId;
    private javax.swing.JTextField employeeIdTxt;
    private javax.swing.JLabel employeephoto;
    private javax.swing.JLabel gender;
    private java.awt.Choice genderTxt;
    private javax.swing.JLabel imagePathLabel;
    private javax.swing.JLabel level;
    private java.awt.Choice levelTxt;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel photo;
    private javax.swing.JButton photoField;
    private javax.swing.JTextField positionTitleTxt;
    private javax.swing.JLabel positiontitle;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel startDate;
    private javax.swing.JTextField startDateTxt;
    private javax.swing.JLabel teamInfo;
    private javax.swing.JTextField teamInfoTxt;
    private javax.swing.JLabel telephone;
    private javax.swing.JTextField telephoneTxt;
    // End of variables declaration//GEN-END:variables
    
    private void validateImageExtension() {
        
      int index = imageName.lastIndexOf('.');
      
      if(index == -1){
        warningMessage("Please upload jpeg, jpg or png files only");
        imagePathLabel.setText("");
      
      }else{
          
        String extension = imageName.substring(index, imageName.length());
        
        if(!extension.equals(".png") &&
           !extension.equals(".jpg") && 
           !extension.equals(".jpeg")){
            warningMessage("Please upload jpeg, jpg or png files only");
            imagePathLabel.setText("");
        }
        else{
            imagePathLabel.setText(imageName);
        }
      }
      
    }

    private void displayEmployeeProfile(EmployeeInfo emp) {
        nameTxt.setText(emp.getName());
        employeeIdTxt.setText(Integer.toString(emp.getEmployeeId()));
        ageTxt.setText(Integer.toString(emp.getAge()));
        genderTxt.select(1);
        levelTxt.select(1);
        teamInfoTxt.setText(emp.getTeamInfo());
        positionTitleTxt.setText(emp.getPositionTitle());
        telephoneTxt.setText(Integer.toString(emp.getTelephone()));
        emailTxt.setText(emp.getEmail());
        startDateTxt.setText(emp.getStartDate());
        employeephoto.setIcon(new ImageIcon(new ImageIcon(emp.getPhoto())
                .getImage()
                .getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
        employeephoto.setBounds(400, 250, 200, 200);
        c.add(employeephoto);
        
    }
    public Boolean validateform(){
        
        if(
                nameTxt.getText().length() > 0 &&
                employeeIdTxt.getText().length() > 0 &&
                ageTxt.getText().length() > 0 &&
                emailTxt.getText().length() > 0 &&
                (
                    genderTxt.getSelectedItem().equals("Male") ||
                    genderTxt.getSelectedItem().equals("Female")
                ) &&
                (
                    levelTxt.getSelectedItem().equals("Novice") ||
                    levelTxt.getSelectedItem().equals("Intermediate") ||
                    levelTxt.getSelectedItem().equals("Advanced")
                )&&
                teamInfoTxt.getText().length() > 0 &&
                startDateTxt.getText().length() > 0 &&
                positionTitleTxt.getText().length() > 0 &&
                imageName.length() > 0 &&
                telephoneTxt.getText().length()> 0
                ){
        
        return true;
        }
        else{
            return false;
        }
    } 
    
    public Boolean UniqueData(){
    
        Boolean emailUnique = true;
        Boolean telephoneUnique = true;
        Boolean employeeIdUnique = true;
        
        String message = "";
        
        for(int i = 0; i < this.employeeArray.size(); i++){
        
            EmployeeInfo emp = this.employeeArray.get(i);
            
            if(emp.getEmail().equals(emailTxt.getText())){
                    emailUnique = false;
            }
            if(String.valueOf(emp.getEmployeeId()).equals(employeeIdTxt.getText())){
                    employeeIdUnique = false;
            }
            if(String.valueOf(emp.getTelephone()).equals(telephoneTxt.getText())){
                    telephoneUnique = false;
            }
            
        }
        
        if(emailUnique && telephoneUnique && employeeIdUnique){
            return true;
        }
        
        if(!emailUnique){
            emailTxt.setText("");
            message+="Email, ";
        }
        if(!employeeIdUnique){
            employeeIdTxt.setText("");
            message+="Employee Id, ";
        }
        if(!telephoneUnique){
            telephoneTxt.setText("");
            message+="Telephone, ";
        }
        
        message+=" taken already";
        
        warningMessage(message);
        
        return false;
    }
}
