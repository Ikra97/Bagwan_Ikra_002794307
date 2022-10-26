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
 * @author ikra
 */
public class SystemUpdateDoctor extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    
    public SystemUpdateDoctor(PersonDirectory personDirectory, DoctorDirectory doctorDirectory) {
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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblSpecialization = new javax.swing.JLabel();
        comboSpecialization = new javax.swing.JComboBox<>();
        lblPractsingFrom = new javax.swing.JLabel();
        txtPractisingFrom = new javax.swing.JFormattedTextField();
        comboGender = new javax.swing.JComboBox<>();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHouseNo = new javax.swing.JLabel();
        txtHouseNo = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        comboCommunity = new javax.swing.JComboBox<>();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        btnUpdateDoctor = new javax.swing.JButton();
        lblCellPhoneNo = new javax.swing.JLabel();
        txtCellPhoneNo = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox<>();
        lblStreet = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblSearchDoctor = new javax.swing.JLabel();
        txtSearchDoctor = new javax.swing.JTextField();
        btnSearchDoctor = new javax.swing.JButton();
        lblHosp = new javax.swing.JLabel();
        txtHospId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(191, 172, 224));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Update Doctor");

        lblDoctorInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDoctorInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctorInfo.setText("Doctor Information");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name :");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblSpecialization.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSpecialization.setText("Specialization");

        lblPractsingFrom.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPractsingFrom.setText("Practising From :");

        txtPractisingFrom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGender.setText("Gender :");

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contact Information");

        lblHouseNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHouseNo.setText("House No :");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCity.setText("City :");

        comboCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCityItemStateChanged(evt);
            }
        });

        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCommunity.setText("Community :");

        lblEmailID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmailID.setText("Email ID :");

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        btnUpdateDoctor.setText("Update Doctor");
        btnUpdateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDoctorActionPerformed(evt);
            }
        });

        lblCellPhoneNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCellPhoneNo.setText("Cell Phone Number :");

        txtCellPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNoActionPerformed(evt);
            }
        });

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblState.setText("State :");

        comboState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NY", "MA", "CA", "TX" }));

        lblStreet.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblStreet.setText("Street :");

        txtStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetActionPerformed(evt);
            }
        });

        lblSearchDoctor.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchDoctor.setText("Search Doctor by ID:");

        txtSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDoctorActionPerformed(evt);
            }
        });

        btnSearchDoctor.setText("Search");
        btnSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoctorActionPerformed(evt);
            }
        });

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
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDoctorInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdateDoctor)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblEmailID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(comboCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(comboState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtStreet)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblSpecialization, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPractsingFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(comboSpecialization, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPractisingFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtHospId, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(txtAge)
                                        .addComponent(comboGender, 0, 155, Short.MAX_VALUE)))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDoctor))
                .addGap(18, 18, 18)
                .addComponent(lblDoctorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecialization)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHosp)
                        .addComponent(txtHospId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPractisingFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPractsingFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(btnUpdateDoctor)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void comboCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCityItemStateChanged
        // TODO add your handling code here:
        initCommunityCmbx();
    }//GEN-LAST:event_comboCityItemStateChanged

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void btnUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDoctorActionPerformed
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
                    
                    Map<String,String>communities=new HashMap<>();
                    communities.put(comboCity.getSelectedItem().toString(),comboCommunity.getSelectedItem().toString());
                    community.setCommunity(communities);
                    house.setCommunity(community);
                    
                    DoctorSpecialization specialization = DoctorSpecialization.valueOf(comboSpecialization.getSelectedItem().toString() );
                    
                    String practisingDate = txtPractisingFrom.getText();
                    int hospId = Integer.parseInt(txtHospId.getText());
                    
                    Date practisingFrom = null;  
                        try {
                            practisingFrom = new SimpleDateFormat("MM/dd/yyyy").parse(practisingDate);
                        } catch (ParseException ex) {
                            Logger.getLogger(SystemCreateDoctor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                    int doctorId = Integer.parseInt( txtSearchDoctor.getText());
                    
                    for(Doctor d: doctorDirectory.getDoctors()){
                        
                        if(doctorId == d.getDoctorId()){
                            d.setName(name);
                            d.setAge(age);
                            d.setCellPhoneNumber(cellPhoneNumber);
                            d.setEmailId(emailId);
                            d.setGender(gender);
                            d.setHouse(house);
                            d.setDoctorSpecialization(specialization);
                            d.setPracticingFrom(practisingFrom);
                            d.setHospitalId(hospId);
                        }
                    }
                    
                    
                    JOptionPane.showMessageDialog(this,"Doctor Info Updated Successfully for Doctor with Id is:"+ doctorId);
                  
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
        }
    }//GEN-LAST:event_btnUpdateDoctorActionPerformed

    private void txtCellPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNoActionPerformed

    private void txtStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetActionPerformed

    private void txtSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchDoctorActionPerformed

    private void btnSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoctorActionPerformed
        // TODO add your handling code here:

        int doctorId = Integer.parseInt( txtSearchDoctor.getText());

        for(Doctor d: doctorDirectory.getDoctors()){

            if(doctorId == d.getDoctorId()){
                txtName.setText(d.getName());
                txtAge.setText(String.valueOf(d.getAge()));
                comboGender.setSelectedItem(d.getGender());
                comboSpecialization.setSelectedItem(d.getDoctorSpecialization());
                
                String practisingFromDate = null;
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                    practisingFromDate = simpleDateFormat.format(d.getPracticingFrom());
                } catch (Exception ex) {
                    System.out.println("Date is null");
                }
                
                txtPractisingFrom.setText(practisingFromDate);
                txtHospId.setText(String.valueOf(d.getHospitalId()));

                txtHouseNo.setText(String.valueOf(d.getHouse().getHouseNum()));
                txtStreet.setText(String.valueOf(d.getHouse().getStreet()));

                String city = null;
                String community = null;
                Map<String, String> communityMap = d.getHouse().getCommunity().getCommunity();
                for(Map.Entry m: communityMap.entrySet()){
                    city = m.getKey().toString();
                    community = m.getValue().toString();
                }

                comboCity.setSelectedItem(city);
                comboCommunity.setSelectedItem(community);

                txtEmailID.setText(d.getEmailId());
                txtCellPhoneNo.setText(String.valueOf(d.getCellPhoneNumber()));

            }

        }
    }//GEN-LAST:event_btnSearchDoctorActionPerformed

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
    private javax.swing.JButton btnSearchDoctor;
    private javax.swing.JButton btnUpdateDoctor;
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
    private javax.swing.JLabel lblSearchDoctor;
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
    private javax.swing.JTextField txtSearchDoctor;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
