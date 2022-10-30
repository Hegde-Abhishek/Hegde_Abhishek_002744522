/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Doctor;
import Model.DoctorDirectory;
import Model.EncounterHistory;
import Model.Hospital;
import Model.HospitalDirectory;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Abhishek
 */
public class BookAppointment extends javax.swing.JPanel {

    /**
     * Creates new form bookAppointment
     */
    DoctorDirectory doctorDir;
    HospitalDirectory hosDir;
    EncounterHistory encounterDir;
    public BookAppointment(HospitalDirectory hospitalDir,DoctorDirectory docDir,EncounterHistory encounterDir) {
        initComponents();
        this.hosDir = hospitalDir;
        this.doctorDir = docDir;
        this.encounterDir = encounterDir;
        populateHosTable();
        populateDocTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        hosTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();
        searchTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        hosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hospital", "Community"
            }
        ));
        jScrollPane1.setViewportView(hosTable);

        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doctor Name", "Gender"
            }
        ));
        jScrollPane2.setViewportView(docTable);

        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        jLabel1.setText("Search :");

        jButton1.setText("Fetch Doctors");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Book");

        jLabel2.setText("Description :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(searchTxt)))
                .addGap(0, 104, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(75, 75, 75)))
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = hosTable.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) hosTable.getModel();
        Hospital selectedH = (Hospital) model.getValueAt(selectedRowIndex, 0);
        populateNewTable(selectedH.getHospitalName());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        // TODO add your handling code here:
        String search = searchTxt.getText();
        
        DefaultTableModel modelD = (DefaultTableModel) hosTable.getModel();
        TableRowSorter<DefaultTableModel> searchDoc = new TableRowSorter<>(modelD);
        hosTable.setRowSorter(searchDoc);
        searchDoc.setRowFilter(RowFilter.regexFilter(search));
        
        DefaultTableModel model = (DefaultTableModel) hosTable.getModel();
        TableRowSorter<DefaultTableModel> searchHos = new TableRowSorter<>(model);
        hosTable.setRowSorter(searchHos);
        searchHos.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable docTable;
    private javax.swing.JTable hosTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables

    private void populateHosTable() {
        DefaultTableModel model = (DefaultTableModel) hosTable.getModel();
        model.setRowCount(0);
        
        for(Hospital h : hosDir.getHospitalDir()) {
            Object[] row = new Object[2];
            row[0]= h;
            row[1]= h.getCommunity();
            
            model.addRow(row);
        }
    }

    private void populateDocTable() {
        DefaultTableModel model = (DefaultTableModel) docTable.getModel();
        model.setRowCount(0);
        
        for(Doctor d : doctorDir.getDoctorDir()) {
            Object[] row = new Object[5];
            row[0]= d;
            row[1]= d.getDoctorId();
            row[2]= d.getAge();
            row[3]= d.getGender();
            row[4]= d.getHospitalName();
            
            model.addRow(row);
        }
    }

    private void populateNewTable(String hospital) {
        DefaultTableModel model = (DefaultTableModel) docTable.getModel();
        model.setRowCount(0);
        
        for(Doctor d : doctorDir.getDoctorDir()) {
            if(hospital.equals(d.getHospitalName())){
             Object[] row = new Object[5];
            row[0]= d;
            row[1]= d.getDoctorId();
            row[2]= d.getAge();
            row[3]= d.getGender();
            row[4]= d.getHospitalName();
            
            model.addRow(row);   
            }
        }
    }
}
