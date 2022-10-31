/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.DoctorDirectory;
import Model.EncounterHistory;
import Model.HospitalDirectory;
import Model.Person;
import Model.PersonDirectory;
import javax.swing.JOptionPane;
import Model.PatientDirectory;
import Model.VitalSignsHistory;
/**
 *
 * @author Abhishek
 */
public class Medical_resource extends javax.swing.JFrame {

    /**
     * Creates new form Medical_resource
     */
    PersonDirectory personDir;
    PatientDirectory patientDir;
    HospitalDirectory hospitalDir;
    DoctorDirectory docDir;
    EncounterHistory encounterDir;
    VitalSignsHistory vitalSignsDir;
    int loginId;
    public Medical_resource() {
        initComponents();
        personDir = new PersonDirectory();
        patientDir = new PatientDirectory();
        hospitalDir = new HospitalDirectory();
        docDir = new DoctorDirectory();
        encounterDir = new EncounterHistory();
        vitalSignsDir = new VitalSignsHistory();
        registerPanel.setVisible(false);
    }
    
        public Medical_resource(PersonDirectory personDirectory, PatientDirectory patientDirectory, HospitalDirectory hospitalDir,DoctorDirectory docDir,EncounterHistory encounterDir,VitalSignsHistory vitalSignsDir) {
        initComponents();
        this.personDir = personDirectory;
        this.patientDir = patientDirectory;
        this.hospitalDir = hospitalDir;
        this.docDir = docDir;
        this.encounterDir = encounterDir;
        this.vitalSignsDir = vitalSignsDir;
        registerPanel.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        phone = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        pincode = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        pincodeField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        genderPanel = new javax.swing.JPanel();
        gender = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        saveBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("User ID : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Password :");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel3.setText("New User?");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        registerPanel.setPreferredSize(new java.awt.Dimension(385, 301));

        phone.setText("Phone :");

        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        pincode.setText("Pincode :");

        name.setText("Name :");

        age.setText("Age :");

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

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPanelLayout.createSequentialGroup()
                            .addComponent(phone)
                            .addGap(42, 42, 42)
                            .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPanelLayout.createSequentialGroup()
                            .addComponent(age)
                            .addGap(54, 54, 54)
                            .addComponent(ageField)))
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPanelLayout.createSequentialGroup()
                            .addComponent(pincode)
                            .addGap(32, 32, 32)
                            .addComponent(pincodeField))
                        .addComponent(genderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(saveBtn)))
                .addContainerGap())
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pincode)
                    .addComponent(pincodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtn)
                .addGap(54, 54, 54))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Doctor", "Patient", "Hospital Admin", "Community Admin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Role :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(44, 44, 44)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addComponent(login)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
//        String username = this.usernameField.getText().trim();
//        String pswd = this.jPasswordField1.getText().trim();
//        Admin_view adminView = new Admin_view(personDir,patientDir,hospitalDir,docDir,encounterDir);
//        Doctor_view docView = new Doctor_view(personDir,patientDir,hospitalDir,docDir,encounterDir,vitalSignsDir);
//        Patient_view patientView = new Patient_view(personDir,patientDir,hospitalDir,docDir,encounterDir,vitalSignsDir);
//        
//        if(username.equals("admin") && pswd.equals("admin")){
//            docView.roleOf("admin");
//            adminView.setVisible(true);
//            setVisible(false);
//        }
//        else if(username.equals("doctor") && pswd.equals("doctor")){
//            docView.roleOf("doctor");
//            docView.setVisible(true);
//            setVisible(false);
//        }
//        else if(username.equals("patient") && pswd.equals("patient")){
////            patientView.roleOf("doctor");
//            patientView.setVisible(true);
//            setVisible(false);
//        }
//        else {
//            JOptionPane.showMessageDialog(null, "Enter valid credentials");
//        }
        int userId = Integer.parseInt(usernameField.getText());
        String password = new String(jPasswordField1.getPassword());
        String role = jComboBox1.getSelectedItem().toString();
        if (role.equals("Patient") || role.equals("Doctor")) {
            if (role.equals("Patient")) {
                Person p = personDir.login(userId, password);
                System.out.println("Person ArrayList : " + p);
                if (p != null) {
                    loginId = userId;
//                    Person s = personDir.find(userId);
//                    int id = s.getPersonId();
//        if (id > 0) {
            Patient_view patientMenu = new Patient_view(loginId,personDir,patientDir,hospitalDir,docDir,encounterDir,vitalSignsDir);
//            patientMenu.assignRole(role);
            patientMenu.setVisible(true);
            setVisible(false);
        } else {
                    JOptionPane.showMessageDialog(null, "User not found");
                }
            } else if(role.equals("Doctor")){
                Person p = personDir.login(userId, password);
                System.out.println("Person ArrayList : " + p);
                if (p != null) {
                    loginId = userId;
                    Doctor_view docMenu = new Doctor_view(personDir,patientDir,hospitalDir,docDir,encounterDir,vitalSignsDir,loginId);
//                  docMenu.assignRole(role);
                    docMenu.setVisible(true);
                    setVisible(false);
            } else {
                    JOptionPane.showMessageDialog(null, "User not found");
                }
            }
        } else if(role.equals("System Admin") && userId == 100 && password.equals("admin")){
//            MainJFrame mainJFrame = new MainJFrame(PersonDirectory, loginID, PatientDirectory, HospitalDirectory, DoctorDirectory, EncounterHistory, VitalSignsHistory, CityDirectory, CommunityDirectory, HouseDirectory);
//            DoctorMenu doctorMenu = new DoctorMenu(PersonDirectory, loginID, PatientDirectory, HospitalDirectory, DoctorDirectory, EncounterHistory, VitalSignsHistory);
//            PatientMenu patientMenu = new PatientMenu(PersonDirectory, loginID, PatientDirectory, HospitalDirectory, DoctorDirectory, EncounterHistory, VitalSignsHistory);
//            HospitalMenu hospitalMenu = new HospitalMenu(PersonDirectory, loginID, PatientDirectory, HospitalDirectory, DoctorDirectory, EncounterHistory, VitalSignsHistory);
//            CommunityMenu communityMenu = new CommunityMenu(PersonDirectory, loginID, PatientDirectory, HospitalDirectory, DoctorDirectory, EncounterHistory, VitalSignsHistory, CityDirectory, CommunityDirectory, HouseDirectory);
//            PersonMenu personMenu = new PersonMenu(PersonDirectory, loginID, PatientDirectory, HospitalDirectory, DoctorDirectory, EncounterHistory, VitalSignsHistory);
            Admin_view adminView = new Admin_view(personDir,patientDir,hospitalDir,docDir,encounterDir,vitalSignsDir,loginId);
            adminView.setVisible(true);
            adminView.assignRole(role);
//            doctorMenu.assignRole(role);
//            patientMenu.assignRole(role);
//            hospitalMenu.assignRole(role);
//            communityMenu.assignRole(role);
//            personMenu.assignRole(role);
            setVisible(false);
        }
        else if(role.equals("Community Admin") && userId == 101 && password.equals("admin")) {
            Admin_view adminView = new Admin_view(personDir,patientDir,hospitalDir,docDir,encounterDir,vitalSignsDir,loginId);
            adminView.setVisible(true);
            adminView.assignRole(role);
            setVisible(false);
        }
        else if(role.equals("Hospital Admin") && userId == 102 && password.equals("admin")) {
            Admin_view adminView = new Admin_view(personDir,patientDir,hospitalDir,docDir,encounterDir,vitalSignsDir,loginId);
            adminView.setVisible(true);
            adminView.assignRole(role);
            setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Account!");
        }
        
    }//GEN-LAST:event_loginActionPerformed

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
        int pincode = Integer.parseInt(pincodeField.getText());

        if(name.isEmpty() || name == null){
            JOptionPane.showMessageDialog(null, "Please enter all fields");
            return;
        }

        Person p = personDir.addNewPerson();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);
        p.setPhone(phone);
//        p.setHouse(house);
        p.setPincode(pincode);

        JOptionPane.showMessageDialog(null, "New person added");
        registerPanel.setVisible(false);
        nameField.setText("");
        ageField.setText("");
        maleRadioButton.setText("");
        phoneField.setText("");
        pincodeField.setText("");
//        populatePersonTable();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        registerPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Medical_resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medical_resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medical_resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medical_resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medical_resource().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel gender;
    private javax.swing.JPanel genderPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton login;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel pincode;
    private javax.swing.JTextField pincodeField;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
