/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemWorkArea.Doctor;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.Doctor;
import model.DoctorDirectory;
import model.DoctorSpecialization;
import model.House;
import model.Person;
import model.PersonDirectory;
import userinterface.SystemWorkArea.Patient.*;

/**
 *
 * @author Ikra*/
public class SystemCreateDoctor extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    public SystemCreateDoctor(PersonDirectory personDirectory, DoctorDirectory doctorDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.doctorDirectory = doctorDirectory;
        initSpecializationCmbx();
        initCityCmbx();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblDoctorInfo = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblSpecialization = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox<>();
        lblGender = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHouseNo = new javax.swing.JLabel();
        txtHouseNo = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        lblStreet = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        comboCommunity = new javax.swing.JComboBox<>();
        comboCity = new javax.swing.JComboBox<>();
        lblCellPhoneNo = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox<>();
        txtCellPhoneNo = new javax.swing.JTextField();
        btnCreateDoctor = new javax.swing.JButton();
        comboSpecialization = new javax.swing.JComboBox<>();
        lblPractsingFrom = new javax.swing.JLabel();
        txtPractisingFrom = new javax.swing.JFormattedTextField();
        lblHosp = new javax.swing.JLabel();
        txtHospId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(191, 172, 224));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Doctor");

        lblDoctorInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDoctorInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctorInfo.setText("Doctor Information");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name :");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age :");

        lblSpecialization.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSpecialization.setText("Specialization");

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGender.setText("Gender :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contact Information");

        lblHouseNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHouseNo.setText("House No :");

        txtStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetActionPerformed(evt);
            }
        });

        lblStreet.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblStreet.setText("Street :");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCity.setText("City :");

        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCommunity.setText("Community :");

        lblEmailID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmailID.setText("Email ID :");

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        comboCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCityItemStateChanged(evt);
            }
        });

        lblCellPhoneNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCellPhoneNo.setText("Cell Phone Number :");

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblState.setText("State :");

        comboState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NY", "MA", "CA", "TX" }));

        txtCellPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNoActionPerformed(evt);
            }
        });

        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        lblPractsingFrom.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPractsingFrom.setText("Practising From :");

        txtPractisingFrom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));

        lblHosp.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHosp.setText("Hospital Id :");

        txtHospId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDoctorInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblEmailID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboCity, 0, 171, Short.MAX_VALUE)
                                        .addComponent(txtHouseNo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtStreet)
                                        .addComponent(comboState, 0, 169, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSpecialization, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPractsingFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(comboSpecialization, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPractisingFrom))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(lblHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAge)
                                .addComponent(comboGender, 0, 155, Short.MAX_VALUE)
                                .addComponent(txtHospId)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateDoctor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblDoctorInfo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecialization)
                    .addComponent(lblGender)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPractisingFrom)
                        .addComponent(lblHosp)
                        .addComponent(txtHospId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPractsingFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHouseNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHouseNo)
                        .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStreet)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCity)
                        .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblState)
                        .addComponent(comboState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCellPhoneNo)
                    .addComponent(txtCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailID))
                .addGap(18, 18, 18)
                .addComponent(btnCreateDoctor)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void comboCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCityItemStateChanged
        // TODO add your handling code here:
        initCommunityCmbx();
    }//GEN-LAST:event_comboCityItemStateChanged

    private void txtCellPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNoActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:

        try{
            if(EmpytyFieldValidation()){

                if(RegexValidation()){

                    String name = txtName.getText();
                    long cellPhoneNumber = Long.parseLong(txtCellPhoneNo.getText());
                    String emailId = txtEmailID.getText();
                    int age = Integer.parseInt( txtAge.getText());
                    String gender = comboGender.getSelectedItem().toString();

                    House house = new House();
                    Community community = new Community();

                    house.setHouseNum(Integer.parseInt(txtHouseNo.getText()));
                    house.setStreet(txtStreet.getText());

                    Map<String,String> communities=new HashMap<>();
                    communities.put(comboCity.getSelectedItem().toString(),comboCommunity.getSelectedItem().toString());
                    community.setCommunity(communities);
                    house.setCommunity(community);


                    Random random=new Random();
                    int doctorID=random.nextInt((9999 - 100) + 1) + 10;
                    
                    String password = name + String.valueOf(random.nextInt((9999 - 100) + 1)+ 10);
                    
                    Date practisingDate = (Date) txtPractisingFrom.getValue();
                    
                    int hospId = Integer.parseInt(txtHospId.getText());
                            
//                    Date practisingFrom = null;  
//                        try {
//                            practisingFrom = new SimpleDateFormat("MM/dd/yyyy").parse(practisingDate);
//                        } catch (ParseException ex) {
//                            Logger.getLogger(SystemCreateDoctor.class.getName()).log(Level.SEVERE, null, ex);
//                        }
                        
                    DoctorSpecialization specialization = DoctorSpecialization.valueOf(comboSpecialization.getSelectedItem().toString() );

                    Person doctor = new Doctor(name,cellPhoneNumber,emailId,age,gender,house,doctorID,practisingDate,specialization,hospId,password);
         
                    personDirectory.addNewPerson(doctor);
                    doctorDirectory.addNewDoctor(doctor);

                    JOptionPane.showMessageDialog(this,"Doctor Registered Successfully.Your New Doctor Id is:"+doctorID+" and password: "+password+",Please save this Doctor Id for furture reference.");

                }
                else{
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Some Error in entered data. Please check over the red fields to know more.");
                emptyValidationStatus=true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Doctor not registered, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
            if(personDirectory.getPersonDirectory().size()>0)
            personDirectory.getPersonDirectory().remove(personDirectory.getPersonDirectory().size() - 1);
            if(doctorDirectory.getDoctors().size()>0)
            doctorDirectory.getDoctors().remove(doctorDirectory.getDoctors().size() - 1);
        }

    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void txtHospIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospIdActionPerformed

    private boolean RegexValidation() {
        if(!txtName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtName.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
        }
        
        
        if(!txtAge.getText().matches("\\b\\d+\\b"))
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAge.setToolTipText("Pleae enter only numbers");
            validationCheck=false;
        }
        
        if(txtAge.getText().matches("\\b\\d+\\b"))
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtHospId.getText().matches("\\b\\d+\\b"))
        {
            txtHospId.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospId.setToolTipText("Pleae enter only numbers");
            validationCheck=false;
        }
        
        if(txtHospId.getText().matches("\\b\\d+\\b"))
        {
            txtHospId.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        
        if(!txtEmailID.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            txtEmailID.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtEmailID.setToolTipText("Please enter a valid Email Address in the form abc@xyy.com");
            validationCheck=false;
        }
        
        if(txtEmailID.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            txtEmailID.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtCellPhoneNo.getText().matches("^[0-9]{10}$"))
        {
            txtCellPhoneNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCellPhoneNo.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }
        
        if(txtCellPhoneNo.getText().matches("^[0-9]{10}$"))
        {
            txtCellPhoneNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        
        if(!txtPractisingFrom.getText().matches("^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$")){
            txtPractisingFrom.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPractisingFrom.setToolTipText("Please enter date in format mm/dd/yyyy");
            validationCheck=false;
        }
        
        if(txtPractisingFrom.getText().matches("^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$"))
        {
            txtPractisingFrom.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return validationCheck;
    }
    
    private boolean EmpytyFieldValidation() {
        if(txtName.getText().equals(null) || txtName.getText().trim().isEmpty() )
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtName.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtName.getText().equals(null) && !txtName.getText().trim().isEmpty() )
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
       
        if(txtAge.getText().equals(null) || txtAge.getText().trim().isEmpty())
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAge.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtAge.getText().equals(null) && !txtAge.getText().trim().isEmpty())
        {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(txtHospId.getText().equals(null) || txtHospId.getText().trim().isEmpty())
        {
            txtHospId.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospId.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtHospId.getText().equals(null) && !txtHospId.getText().trim().isEmpty())
        {
            txtHospId.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
         
        if(txtHouseNo.getText().equals(null) || txtHouseNo.getText().trim().isEmpty())
        {
            txtHouseNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHouseNo.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtHouseNo.getText().equals(null) && !txtHouseNo.getText().trim().isEmpty())
        {
            txtHouseNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        
        if(txtStreet.getText().equals(null)|| txtStreet.getText().trim().isEmpty())
        {
            txtStreet.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtStreet.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtStreet.getText().equals(null) && !txtStreet.getText().trim().isEmpty())
        {
            txtStreet.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
           
        }
        
        if(txtCellPhoneNo.getText().equals(null) || txtCellPhoneNo.getText().trim().isEmpty())
        {
            txtCellPhoneNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCellPhoneNo.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus=false;
        }
        if(!txtCellPhoneNo.getText().equals(null) && !txtCellPhoneNo.getText().trim().isEmpty())
        {
            txtCellPhoneNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return emptyValidationStatus;
    }
    
    private void initSpecializationCmbx() {
        comboSpecialization.removeAllItems();
        int count = 0;
        DoctorSpecialization[] specializations = DoctorSpecialization.values();
        for (DoctorSpecialization specialization : specializations) {
            comboSpecialization.addItem(specializations[count++].toString());
        }
    }
    
    private void initCommunityCmbx() {
        comboCommunity.removeAllItems();
        int count = 0;
        var selectedCity=comboCity.getSelectedItem().toString();
        City city=City.valueOf(selectedCity);
        Community community=new Community();
        community.setLstCommunity();
        String[] communities=community.getLstCommunity().get(city);
            for (String community_ : communities) {
                comboCommunity.addItem(communities[count++]);
            }
    }
    
    private void initCityCmbx() {
       comboCity.removeAllItems();
       int count = 0;
        City[] cities = City.values();
        for (City city_ : cities) {
            comboCity.addItem(cities[count++].toString());
        }
       initCommunityCmbx();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JComboBox<String> comboSpecialization;
    private javax.swing.JComboBox<String> comboState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhoneNo;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDoctorInfo;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHosp;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPractsingFrom;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhoneNo;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtHospId;
    private javax.swing.JTextField txtHouseNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JFormattedTextField txtPractisingFrom;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
