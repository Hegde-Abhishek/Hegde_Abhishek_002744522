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
        vieww = new javax.swing.JPanel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        empID = new javax.swing.JLabel();
        startDate = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        positionTitle = new javax.swing.JLabel();
        teamInfo = new javax.swing.JLabel();
        contactInfo = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phNumber = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtPhNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();

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
        viewBtn.setText("View / Edit");
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

        age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        age.setText("Age");

        gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender.setText("Gender");

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIDActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setText("Name");

        empID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        empID.setText("Employee ID");

        startDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        startDate.setText("Start Date");

        level.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        level.setText("Level");

        positionTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        positionTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        positionTitle.setText("Position Title");

        teamInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teamInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        teamInfo.setText("Team Info");

        contactInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contactInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contactInfo.setText("Contact Info :");

        email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email.setText("Email");

        phNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phNumber.setText("Cell phone No");

        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        txtPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionTitleActionPerformed(evt);
            }
        });

        txtPhNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhNumberActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewwLayout = new javax.swing.GroupLayout(vieww);
        vieww.setLayout(viewwLayout);
        viewwLayout.setHorizontalGroup(
            viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewwLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewwLayout.createSequentialGroup()
                        .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewwLayout.createSequentialGroup()
                                    .addComponent(name)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewwLayout.createSequentialGroup()
                                    .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(empID)
                                        .addComponent(age)
                                        .addComponent(gender))
                                    .addGap(19, 19, 19)
                                    .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtGender, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(txtEmpID)
                                        .addComponent(txtAge))))
                            .addComponent(contactInfo))
                        .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(viewwLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(viewwLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(startDate)
                                            .addComponent(level))
                                        .addGap(18, 18, 18)
                                        .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(viewwLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(teamInfo)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(viewwLayout.createSequentialGroup()
                                        .addComponent(positionTitle)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPositionTitle))))
                            .addGroup(viewwLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(phNumber)
                                    .addComponent(email))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPhNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(txtEmail))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewwLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(updateBtn))))
        );
        viewwLayout.setVerticalGroup(
            viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewwLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(viewwLayout.createSequentialGroup()
                        .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(age))
                    .addGroup(viewwLayout.createSequentialGroup()
                        .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewwLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(viewwLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(gender)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phNumber)
                    .addComponent(contactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(viewwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(updateBtn))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(view, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(viewBtn)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn))
                            .addComponent(vieww, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(view)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vieww, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        
        txtName.setText(selectedEmployee.getName());
        txtEmpID.setText(String.valueOf(selectedEmployee.getEmpID()));
        txtAge.setText(String.valueOf(selectedEmployee.getAge()));
        txtGender.setText(selectedEmployee.getGender());
        txtStartDate.setText(selectedEmployee.getStartDate());
        txtLevel.setText(selectedEmployee.getLevel());
        txtTeamInfo.setText(selectedEmployee.getTeamInfo());
        txtPositionTitle.setText(selectedEmployee.getPosTitle());
        txtPhNumber.setText(String.valueOf(selectedEmployee.getPhNumber()));
        txtEmail.setText(selectedEmployee.getEmail());
        
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

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionTitleActionPerformed

    private void txtPhNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhNumberActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = empTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0);
        
        selectedEmployee.setName(txtName.getText());
        selectedEmployee.setGender(txtGender.getText());
        selectedEmployee.setStartDate(txtStartDate.getText());
        selectedEmployee.setLevel(txtLevel.getText());
        selectedEmployee.setTeamInfo(txtTeamInfo.getText());
        selectedEmployee.setPosTitle(txtPositionTitle.getText());
        selectedEmployee.setEmail(txtEmail.getText());
        
        JOptionPane.showMessageDialog(this, "Record updated successfully!");
        populateTable();
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel contactInfo;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel email;
    private javax.swing.JLabel empID;
    private javax.swing.JTable empTable;
    private javax.swing.JLabel gender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel level;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phNumber;
    private javax.swing.JLabel positionTitle;
    private javax.swing.JLabel startDate;
    private javax.swing.JLabel teamInfo;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhNumber;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel view;
    private javax.swing.JButton viewBtn;
    private javax.swing.JPanel vieww;
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
