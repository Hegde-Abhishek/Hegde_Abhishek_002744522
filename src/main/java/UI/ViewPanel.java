/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Employee;
import Model.EmployeesHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    EmployeesHistory empHistory;
    public ViewPanel(EmployeesHistory empHistory) {
        initComponents();
        this.empHistory = empHistory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        view = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        view.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view.setText("View Employees");

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "TeamInfo", "Position Title", "Phone Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(empTable);
        if (empTable.getColumnModel().getColumnCount() > 0) {
            empTable.getColumnModel().getColumn(0).setHeaderValue("Name");
            empTable.getColumnModel().getColumn(1).setHeaderValue("Employee ID");
            empTable.getColumnModel().getColumn(2).setHeaderValue("Age");
            empTable.getColumnModel().getColumn(3).setHeaderValue("Gender");
            empTable.getColumnModel().getColumn(4).setHeaderValue("Start Date");
            empTable.getColumnModel().getColumn(5).setHeaderValue("Level");
            empTable.getColumnModel().getColumn(6).setHeaderValue("TeamInfo");
            empTable.getColumnModel().getColumn(7).setHeaderValue("Position Title");
            empTable.getColumnModel().getColumn(8).setHeaderValue("Phone Number");
            empTable.getColumnModel().getColumn(9).setHeaderValue("Email");
        }

        viewBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewBtn)
                        .addGap(36, 36, 36)
                        .addComponent(deleteBtn)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(view)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = empTable.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0);
        
        
    }//GEN-LAST:event_viewBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = empTable.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0);
        
        empHistory.deleteEmployee(selectedEmployee);
        JOptionPane.showMessageDialog(this, "Employee record deleted.");
        
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable empTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel view;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        model.setRowCount(0);
        
        for(Employee e : empHistory.getEmpHistory()) {
            Object[] row = new Object[10];
            row[0]= e;
            row[1]= e.getEmpID();
            row[2]= e.getAge();
            row[3]= e.getGender();
            row[4]= e.getStartDate();
            row[5]= e.getLevel();
            row[6]= e.getTeamInfo();
            row[7]= e.getPosTitle();
            row[8]= e.getPhNumber();
            row[9]= e.getEmail();
            
            model.addRow(row);
            
        }

    }
}