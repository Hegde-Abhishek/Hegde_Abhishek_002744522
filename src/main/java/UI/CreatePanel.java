/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Employee;
import Model.EmployeesHistory;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    EmployeesHistory empHistory;
    
    public CreatePanel(EmployeesHistory empHistory) {
        initComponents();
        this.empHistory = empHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        create = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        empID = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        startDate = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        positionTitle = new javax.swing.JLabel();
        teamInfo = new javax.swing.JLabel();
        contactInfo = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phNumber = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtPhNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        create.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        create.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create.setText("Create / Add an Employee");

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setText("Name");

        empID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        empID.setText("Employee ID");

        age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        age.setText("Age");

        gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender.setText("Gender");

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

        contactInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contactInfo.setText("Contact Info");

        photo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        photo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        photo.setText("Photo");

        email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email.setText("Email :");

        phNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phNumber.setText("Cell phone No :");

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
        txtEmpID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpIDKeyReleased(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

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
        txtPhNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhNumberKeyPressed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(photo)
                            .addComponent(contactInfo)
                            .addComponent(teamInfo)
                            .addComponent(positionTitle)
                            .addComponent(level)
                            .addComponent(startDate)
                            .addComponent(empID)
                            .addComponent(name)
                            .addComponent(age)
                            .addComponent(gender))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(email)
                                        .addGap(106, 106, 106))
                                    .addComponent(phNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtEmpID)
                            .addComponent(txtAge)
                            .addComponent(txtStartDate)
                            .addComponent(txtLevel)
                            .addComponent(txtTeamInfo)
                            .addComponent(txtPositionTitle)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(create)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(age))
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactInfo)
                    .addComponent(phNumber)
                    .addComponent(txtPhNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(saveButton)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        int empID = Integer.parseInt(txtEmpID.getText());
        int age = Integer.parseInt(txtAge.getText());
        String gender = txtGender.getText();
        String startDate = txtStartDate.getText();
        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String posTitle = txtPositionTitle.getText();
        int phNumber = Integer.parseInt(txtPhNumber.getText());
        String email = txtEmail.getText();
        
        if(name == null || name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Name.");
            txtName.requestFocus();
            return;
        }
        if(gender == null || gender.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter gender.");
            txtName.requestFocus();
            return;
        }
        if(startDate == null || startDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter start date.");
            txtName.requestFocus();
            return;
        }
        if(email == null || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter email.");
            txtName.requestFocus();
            return;
        }
        
        Employee e = empHistory.addNewEmployees();
        e.setName(name);
        e.setEmpID(empID);
        e.setAge(age);
        e.setGender(gender);
        e.setStartDate(startDate);
        e.setLevel(level);
        e.setTeamInfo(teamInfo);
        e.setPosTitle(posTitle);
        e.setPhNumber(phNumber);
        e.setEmail(email);
        
        JOptionPane.showMessageDialog(this, "New Employee added.");
        
        txtName.setText("");
        txtEmpID.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPositionTitle.setText("");
        txtPhNumber.setText("");
        txtEmail.setText("");
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtEmpIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIDKeyReleased

    private void txtPhNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhNumberKeyPressed
        // TODO add your handling code here:
        String phNumber = txtPhNumber.getText();
        int length = phNumber.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<10){
                txtPhNumber.setEditable(true);
            } else{
                txtPhNumber.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                txtPhNumber.setEditable(true);
            } else {
                txtPhNumber.setEditable(false);
            }
        }
        
        
    }//GEN-LAST:event_txtPhNumberKeyPressed

    private void txtEmpIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIDKeyPressed
        // TODO add your handling code here:
        String empID = txtEmpID.getText();
        int length = empID.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
                txtEmpID.setEditable(true);
        } else {
            if (evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                txtEmpID.setEditable(true);
            } else {
                txtEmpID.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtEmpIDKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
        String age = txtAge.getText();
        int length = age.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<3){
                txtAge.setEditable(true);
            } else{
                txtAge.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                txtAge.setEditable(true);
            } else {
                txtAge.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtAgeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel contactInfo;
    private javax.swing.JLabel create;
    private javax.swing.JLabel email;
    private javax.swing.JLabel empID;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel level;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phNumber;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel positionTitle;
    private javax.swing.JButton saveButton;
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
    // End of variables declaration//GEN-END:variables
}
