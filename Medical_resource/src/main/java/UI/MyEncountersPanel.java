/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Encounter;
import Model.EncounterHistory;
import Model.VitalSigns;
import Model.VitalSignsHistory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class MyEncountersPanel extends javax.swing.JPanel {

    /**
     * Creates new form MyEncountersPanel
     */
    EncounterHistory encounterDir;
    VitalSignsHistory vitalSignsDir;
    int loginId;
    public MyEncountersPanel(EncounterHistory encounterDir,VitalSignsHistory vitalSignsDir,int loginId) {
        initComponents();
        this.encounterDir = encounterDir;
        this.vitalSignsDir = vitalSignsDir;
        this.loginId = loginId;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        encHisTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignsTable = new javax.swing.JTable();

        encHisTable.setBackground(new java.awt.Color(204, 255, 204));
        encHisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient name", "Doctor Name", "Doctor Id", "Encounter date", "Description"
            }
        ));
        jScrollPane2.setViewportView(encHisTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Encounter History");

        jButton1.setText("View Vital Signs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        vitalSignsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Blood Pressure", "Heart rate", "Temp (F)", "Breathing rate", "Encounter Id"
            }
        ));
        jScrollPane1.setViewportView(vitalSignsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        vitalSignsTable.setVisible(true);
        populateVitalSignsTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable encHisTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable vitalSignsTable;
    // End of variables declaration//GEN-END:variables

    private void populateEncounterTable() {
        DefaultTableModel model = (DefaultTableModel) encHisTable.getModel();
        model.setRowCount(0);
        
        for(Encounter e : encounterDir.getEncounters()) {
            if(loginId== e.getPatientId()) {
                Object[] row = new Object[4];
                row[0]= e;
                row[2]= e.getDoctorName();
                row[1]= e.getDoctorId();
                row[2]= e.getDate();
                row[3]= e.getIllness();
            
            model.addRow(row);
            }
        }
    }

    private void populateVitalSignsTable() {
        DefaultTableModel model = (DefaultTableModel) vitalSignsTable.getModel();
        model.setRowCount(0);
        
        for(VitalSigns v : vitalSignsDir.getVitalSignsDir()) {
            Object[] row = new Object[6];
            row[0]= v;
            row[1]= v.getBloodPressure();
            row[2]= v.getHeartRate();
            row[3]= v.getBodyTemp();
            row[4]= v.getBreathingRate();
            row[5]= v.getEncounterId();
            
            model.addRow(row);
        }
    }
}
