/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Encounter;
import Model.EncounterHistory;
import Model.Person;
import Model.VitalSigns;
import Model.VitalSignsHistory;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class EncounterHis extends javax.swing.JPanel {

    /**
     * Creates new form Encounter_History
     */
    VitalSignsHistory vitalSignsDir;
    EncounterHistory encounterDir;
    public EncounterHis(EncounterHistory encounterDir,VitalSignsHistory vitalSignsDir) {
        initComponents();
        this.encounterDir = encounterDir;
        this.vitalSignsDir = vitalSignsDir;
        updateEncPanel.setVisible(false);
        createVitalSignsPanel.setVisible(false);
        populateEncounterTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        encHisTable = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        updateEncPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        updateSaveBtn = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        bpLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        createVitalSignsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bloodPressure = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        heartRateField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        temperature = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        breathingRate = new javax.swing.JTextField();
        saveBtn1 = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        createVitalSignsBtn = new javax.swing.JButton();

        header.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        header.setText("Encounter History");

        encHisTable.setBackground(new java.awt.Color(204, 255, 204));
        encHisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient Id", "Doctor Name", "Doctor Id", "Encounter date", "Description"
            }
        ));
        jScrollPane2.setViewportView(encHisTable);

        updateBtn.setText("Update encounter details");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        updateEncPanel.setPreferredSize(new java.awt.Dimension(350, 252));

        jLabel1.setText("Date");

        updateSaveBtn.setText("Save");
        updateSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSaveBtnActionPerformed(evt);
            }
        });

        bpLabel1.setText("Description");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout updateEncPanelLayout = new javax.swing.GroupLayout(updateEncPanel);
        updateEncPanel.setLayout(updateEncPanelLayout);
        updateEncPanelLayout.setHorizontalGroup(
            updateEncPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEncPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(updateEncPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(updateEncPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(updateEncPanelLayout.createSequentialGroup()
                        .addComponent(bpLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateEncPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateSaveBtn))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        updateEncPanelLayout.setVerticalGroup(
            updateEncPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEncPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(updateEncPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(updateEncPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bpLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(updateSaveBtn)
                .addContainerGap())
        );

        jLabel2.setText("Blood Pressure :");

        bloodPressure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bloodPressureKeyReleased(evt);
            }
        });

        jLabel3.setText("Heart Rate :");

        jLabel4.setText("Temperature (deg F) :");

        jLabel5.setText("Breathing rate :");

        saveBtn1.setText("Save");
        saveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createVitalSignsPanelLayout = new javax.swing.GroupLayout(createVitalSignsPanel);
        createVitalSignsPanel.setLayout(createVitalSignsPanelLayout);
        createVitalSignsPanelLayout.setHorizontalGroup(
            createVitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createVitalSignsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createVitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(createVitalSignsPanelLayout.createSequentialGroup()
                        .addComponent(error)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBtn1))
                    .addGroup(createVitalSignsPanelLayout.createSequentialGroup()
                        .addGroup(createVitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(createVitalSignsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addComponent(bloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createVitalSignsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(heartRateField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createVitalSignsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createVitalSignsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(breathingRate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        createVitalSignsPanelLayout.setVerticalGroup(
            createVitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createVitalSignsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(createVitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createVitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heartRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(createVitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createVitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(breathingRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(createVitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn1)
                    .addComponent(error))
                .addContainerGap())
        );

        createVitalSignsBtn.setText("Create Vital Signs");
        createVitalSignsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVitalSignsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(header)
                .addContainerGap(302, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(createVitalSignsBtn))
                    .addComponent(createVitalSignsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateBtn)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(updateEncPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateBtn)
                        .addGap(30, 30, 30)
                        .addComponent(updateEncPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createVitalSignsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(createVitalSignsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = encHisTable.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        updateEncPanel.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) encHisTable.getModel();
        Encounter selectedE = (Encounter) model.getValueAt(selectedRowIndex, 0);
        jDateChooser1.setDate(selectedE.getDate());
        jTextArea1.setText(selectedE.getIllness());
    }//GEN-LAST:event_updateBtnActionPerformed

    private void createVitalSignsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVitalSignsBtnActionPerformed
        // TODO add your handling code here:
        createVitalSignsPanel.setVisible(true);
    }//GEN-LAST:event_createVitalSignsBtnActionPerformed

    private void saveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn1ActionPerformed
        // TODO add your handling code here:
        int selectedPatient = encHisTable.getSelectedRow();
        if (selectedPatient < 0 || selectedPatient>1) {
            JOptionPane.showMessageDialog(null, "Please select an encounter first!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) encHisTable.getModel();
        Encounter selectedPerson = (Encounter) model.getValueAt(selectedPatient, 0);
        String name = selectedPerson.getPatientName();
        int patientId = selectedPerson.getPatientId();
        String docName = selectedPerson.getDoctorName();
        int doctorId = selectedPerson.getDoctorId();
        int encounterId = selectedPerson.getEncounterId();
        int bp = Integer.parseInt(bloodPressure.getText());
        int heartRate = Integer.parseInt(this.heartRateField.getText());
        double bodyTemp = Double.parseDouble(temperature.getText());
        int breathRate = Integer.parseInt(breathingRate.getText());
        
        VitalSigns v = vitalSignsDir.addVitalSign();
        v.setPatientName(name);
        v.setPatientId(patientId);
        v.setDoctorId(doctorId);
        v.setEncounterId(encounterId);
        v.setBloodPressure(bp);
        v.setHeartRate(heartRate);
        v.setBodyTemp(bodyTemp);
        v.setBreathingRate(breathRate);
        JOptionPane.showMessageDialog(null, "Vital Signs added");
    }//GEN-LAST:event_saveBtn1ActionPerformed

    private void updateSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSaveBtnActionPerformed
        // TODO add your handling code here:
        Date date = jDateChooser1.getDate();
        String description = jTextArea1.getText();
        if(date == null){
            JOptionPane.showMessageDialog(null, "Please select date");
        }
        int selectedRowIndex = encHisTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) encHisTable.getModel();
        Encounter selectedE = (Encounter) model.getValueAt(selectedRowIndex, 0);
        selectedE.setDate(date);
        selectedE.setIllness(description);
    }//GEN-LAST:event_updateSaveBtnActionPerformed

    private void bloodPressureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bloodPressureKeyReleased
        // TODO add your handling code here:
        String Allowed="^[0-9]{1,2}$";
        Pattern patt = Pattern.compile(Allowed);
        Matcher same = patt.matcher(bloodPressure.getText());
        if(!same.matches()){
            error.setText("Only Numbers allowed. Max 99");
            saveBtn1.setEnabled(false);
        }
        else{
            error.setText("");
            saveBtn1.setEnabled(true);
        }
    }//GEN-LAST:event_bloodPressureKeyReleased

    private void populateEncounterTable() {
        DefaultTableModel model = (DefaultTableModel) encHisTable.getModel();
        model.setRowCount(0);
        
        for(Encounter e : encounterDir.getEncounters()) {
            Object[] row = new Object[6];
            row[0]= e;
            row[1]= e.getPatientId();
            row[2]= e.getDoctorName();
            row[3]= e.getDoctorId();
            row[4]= e.getDate();
            row[5]= e.getIllness();
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPressure;
    private javax.swing.JLabel bpLabel1;
    private javax.swing.JTextField breathingRate;
    private javax.swing.JButton createVitalSignsBtn;
    private javax.swing.JPanel createVitalSignsPanel;
    private javax.swing.JTable encHisTable;
    private javax.swing.JLabel error;
    private javax.swing.JLabel header;
    private javax.swing.JTextField heartRateField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton saveBtn1;
    private javax.swing.JTextField temperature;
    private javax.swing.JButton updateBtn;
    private javax.swing.JPanel updateEncPanel;
    private javax.swing.JButton updateSaveBtn;
    // End of variables declaration//GEN-END:variables
}
