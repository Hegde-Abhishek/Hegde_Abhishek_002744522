/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.City;
import Model.Community;
import Model.Patient;
import Model.Person;
import Model.PersonDirectory;
import Model.PatientDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class PersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonPanel
     */
    ArrayList<Person> person;
    PersonDirectory personDir;
    PatientDirectory patientDir;
    Person addPatient;
//    City cityName;
//    Community communityName;
    
    public PersonPanel(PersonDirectory personDir, PatientDirectory patientDir) {
        initComponents();
        detailPanel.setVisible(false);
        this.personDir = personDir;
        this.patientDir = patientDir;
//        this.communityName = communityName;
//        this.cityName = cityName;
        populatePersonTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        addPersonBtn = new javax.swing.JButton();
        detailPanel = new javax.swing.JPanel();
        city = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        community = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        pincode = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        communityField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        pincodeField = new javax.swing.JTextField();
        houseField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        house = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        genderPanel = new javax.swing.JPanel();
        gender = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        updatePersonBtn = new javax.swing.JButton();
        deletePersonBtn = new javax.swing.JButton();
        addAsPatientBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("Person Directory");

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 204));

        personTable.setBackground(new java.awt.Color(204, 255, 204));
        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Phone", "City", "Community", "House", "Pincode"
            }
        ));
        jScrollPane1.setViewportView(personTable);

        addPersonBtn.setText("Add a person");
        addPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonBtnActionPerformed(evt);
            }
        });

        detailPanel.setPreferredSize(new java.awt.Dimension(385, 301));

        city.setText("City :");

        phone.setText("Phone :");

        community.setText("Community :");

        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        pincode.setText("Pincode :");

        name.setText("Name :");

        age.setText("Age :");

        house.setText("House :");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        gender.setText("Gender :");

        maleRadioButton.setText("Male");

        femaleRadioButton.setText("Female");

        javax.swing.GroupLayout genderPanelLayout = new javax.swing.GroupLayout(genderPanel);
        genderPanel.setLayout(genderPanelLayout);
        genderPanelLayout.setHorizontalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gender)
                .addGap(31, 31, 31)
                .addComponent(maleRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(femaleRadioButton)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        genderPanelLayout.setVerticalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genderPanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailPanelLayout.createSequentialGroup()
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone)
                            .addComponent(city))
                        .addGap(42, 42, 42)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneField)
                            .addComponent(cityField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailPanelLayout.createSequentialGroup()
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelLayout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(detailPanelLayout.createSequentialGroup()
                                .addComponent(age)
                                .addGap(54, 54, 54)))
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ageField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(nameField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailPanelLayout.createSequentialGroup()
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(community)
                            .addComponent(house)
                            .addComponent(pincode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(communityField)
                            .addComponent(houseField)
                            .addComponent(pincodeField)))
                    .addComponent(genderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(city)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(community)
                    .addComponent(communityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(house)
                        .addGap(12, 12, 12)
                        .addComponent(pincode))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pincodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveBtn)
                .addGap(18, 18, 18))
        );

        updatePersonBtn.setText("Update a person");
        updatePersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePersonBtnActionPerformed(evt);
            }
        });

        deletePersonBtn.setText("Delete person");
        deletePersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonBtnActionPerformed(evt);
            }
        });

        addAsPatientBtn.setText("Add as patient");
        addAsPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAsPatientBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(addPersonBtn)
                        .addGap(44, 44, 44)
                        .addComponent(updatePersonBtn)
                        .addGap(44, 44, 44)
                        .addComponent(deletePersonBtn)
                        .addGap(44, 44, 44)
                        .addComponent(addAsPatientBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)))
                .addGap(131, 164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPersonBtn)
                    .addComponent(updatePersonBtn)
                    .addComponent(deletePersonBtn)
                    .addComponent(addAsPatientBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonBtnActionPerformed
        // TODO add your handling code here:
        detailPanel.setVisible(true);
        updateBtn.setVisible(false);
    }//GEN-LAST:event_addPersonBtnActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String gender = "";
        if(maleRadioButton.isSelected())
        {
            gender="male";
        }
        else if(femaleRadioButton.isSelected())
        {
            gender="female";
        }
        Long phone = Long.parseLong(phoneField.getText());
//        City cityName = cityField.getText();
//        Community communityName = communityField.getText();
        String house = houseField.getText();
        int pincode = Integer.parseInt(pincodeField.getText());
        
        if((name.isEmpty() || name == null) && (house.isEmpty() || house == null)){
            JOptionPane.showMessageDialog(null, "Please enter all fields");
            return;
        }
        
        Person p = personDir.addNewPerson();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);
        p.setPhone(phone);
        p.setHouse(house);
        p.setPincode(pincode);
        
        
        
        JOptionPane.showMessageDialog(null, "New person added");
        detailPanel.setVisible(false);
        nameField.setText("");
        ageField.setText("");
        maleRadioButton.setText("");
        phoneField.setText("");
        houseField.setText("");
        pincodeField.setText("");
        populatePersonTable();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void updatePersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePersonBtnActionPerformed
        // TODO add your handling code here:
        genderPanel.setVisible(false);
        detailPanel.setVisible(true);
        saveBtn.setVisible(false);
        updateBtn.setVisible(true);
        int selectedRowIndex = personTable.getSelectedRow();
        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
        nameField.setText(selectedPerson.getName());
        ageField.setText(String.valueOf(selectedPerson.getAge()));
        phoneField.setText(String.valueOf(selectedPerson.getPhone()));
        houseField.setText(String.valueOf(selectedPerson.getHouse()));
        pincodeField.setText(String.valueOf(selectedPerson.getPincode()));
        
        
    }//GEN-LAST:event_updatePersonBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        Long phone = Long.parseLong(phoneField.getText());
//        City cityName = cityField.getText();
//        Community communityName = communityField.getText();
        String house = houseField.getText();
        int pincode = Integer.parseInt(pincodeField.getText());
        
        
        if((name.isEmpty() || name == null) && (house.isEmpty() || house == null)){
            JOptionPane.showMessageDialog(null, "Please enter all fields");
            return;
        }
        
        int selectedRowIndex = personTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
        selectedPerson.setName(nameField.getText());
        selectedPerson.setAge(Integer.parseInt(ageField.getText()));
        selectedPerson.setPhone(Long.parseLong(phoneField.getText()));
        selectedPerson.setHouse(houseField.getText());
        selectedPerson.setPincode(Integer.parseInt(pincodeField.getText()));
        
        
        JOptionPane.showMessageDialog(null, "Person updated successfully");
        populatePersonTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deletePersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = personTable.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
        personDir.deletePerson(selectedPerson);
        JOptionPane.showMessageDialog(null, "Person record deleted");
        populatePersonTable();
    }//GEN-LAST:event_deletePersonBtnActionPerformed

    private void addAsPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAsPatientBtnActionPerformed
        // TODO add your handling code here:
        int selectedPerson = personTable.getSelectedRow();
        if (selectedPerson < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row you want to add as patient!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            addPatient=this.personDir.getPersonDir().get(selectedPerson);
            int uniqueID=addPatient.getPersonId();
            Patient patient=new Patient (addPatient);
            patientDir.addPatient(patient);
            populatePersonTable();
            
        }
    }//GEN-LAST:event_addAsPatientBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAsPatientBtn;
    private javax.swing.JButton addPersonBtn;
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel city;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel community;
    private javax.swing.JTextField communityField;
    private javax.swing.JButton deletePersonBtn;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel gender;
    private javax.swing.JPanel genderPanel;
    private javax.swing.JLabel house;
    private javax.swing.JTextField houseField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JTable personTable;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel pincode;
    private javax.swing.JTextField pincodeField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updatePersonBtn;
    // End of variables declaration//GEN-END:variables

    private void populatePersonTable() {
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        model.setRowCount(0);
        
        for(Person p : personDir.getPersonDir()) {
            Object[] row = new Object[8];
            row[0]= p;
            row[1]= p.getAge();
            row[2]= p.getGender();
            row[3]= p.getPhone();
            row[4]= p.getCity();
            row[5]= p.getCommunity();
            row[6]= p.getHouse();
            row[7]= p.getPincode();
            
            model.addRow(row);
        }
    }

}
