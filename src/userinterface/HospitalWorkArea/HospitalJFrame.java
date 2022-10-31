/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface.HospitalWorkArea;

import userinterface.SystemWorkArea.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.PersonDirectory;
import userinterface.HospitalWorkArea.Doctors.HospitalDoctorWorkPanel;
import userinterface.HospitalWorkArea.Encounters.HospitalEncountersWorkPanel;
import userinterface.HospitalWorkArea.Hospitals.HospitalHospitalWorkPanel;
import userinterface.HospitalWorkArea.Patients.HospitalPatientWorkPanel;
import userinterface.MainJFrame;


/**
 *
 * @author Ikra*/
public class HospitalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorJFrame
     */
    
    public static String username;
    public static PersonDirectory personDirectory;
    public static DoctorDirectory doctorDirectory;
    public static PatientDirectory patientDirectory;
    public static HospitalDirectory hospitalDirectory;
    
    public HospitalJFrame(String username, PersonDirectory personDirectory, DoctorDirectory doctorDirectory, PatientDirectory patientDirectory, HospitalDirectory hospitalDirectory) {
        initComponents();
        this.username = username;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        
        if(username == null){
            JOptionPane.showMessageDialog(this, "Please login to proceed");
            dispose();
            MainJFrame mainFrame = new MainJFrame();
            mainFrame.main(null);
        }
        
        HospitalHospitalWorkPanel hospitalWorkPanel = new HospitalHospitalWorkPanel(hospitalDirectory);
        jSplitPaneSystem.setRightComponent(hospitalWorkPanel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneSystem = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnHospitals = new javax.swing.JButton();
        btnDoctors = new javax.swing.JButton();
        btnPatients = new javax.swing.JButton();
        btnEncounters = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(100, 92, 170));
        controlPanel.setPreferredSize(new java.awt.Dimension(200, 600));

        btnHospitals.setText("Hospitals");
        btnHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalsActionPerformed(evt);
            }
        });

        btnDoctors.setText("Doctors");
        btnDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorsActionPerformed(evt);
            }
        });

        btnPatients.setText("Patients");
        btnPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientsActionPerformed(evt);
            }
        });

        btnEncounters.setText("Encounters");
        btnEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncountersActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(24, 24, 24))
        );

        jSplitPaneSystem.setLeftComponent(controlPanel);

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jSplitPaneSystem.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneSystem, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneSystem, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalsActionPerformed
        // TODO add your handling code here:
        HospitalHospitalWorkPanel hospitalWorkPanel = new HospitalHospitalWorkPanel(hospitalDirectory);
        jSplitPaneSystem.setRightComponent(hospitalWorkPanel);
    }//GEN-LAST:event_btnHospitalsActionPerformed

    private void btnDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorsActionPerformed
        // TODO add your handling code here:
        HospitalDoctorWorkPanel hospitalDoctor = new HospitalDoctorWorkPanel(personDirectory, doctorDirectory);
        jSplitPaneSystem.setRightComponent(hospitalDoctor);
    }//GEN-LAST:event_btnDoctorsActionPerformed

    private void btnPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientsActionPerformed
        // TODO add your handling code here:
        HospitalPatientWorkPanel hospitalPatient = new HospitalPatientWorkPanel(personDirectory, patientDirectory);
        jSplitPaneSystem.setRightComponent(hospitalPatient);
    }//GEN-LAST:event_btnPatientsActionPerformed

    private void btnEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncountersActionPerformed
        // TODO add your handling code here:
        HospitalEncountersWorkPanel hospitalEncounters = new HospitalEncountersWorkPanel(patientDirectory, doctorDirectory);
        jSplitPaneSystem.setRightComponent(hospitalEncounters);
    }//GEN-LAST:event_btnEncountersActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               HospitalJFrame systemFrame = new HospitalJFrame(username,personDirectory, doctorDirectory, patientDirectory, hospitalDirectory);
               systemFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
               systemFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoctors;
    private javax.swing.JButton btnEncounters;
    private javax.swing.JButton btnHospitals;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPatients;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPaneSystem;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}