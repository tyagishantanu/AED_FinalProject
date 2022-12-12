/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthinterface.app;

import Business.EcoSystem;
import Business.City.City;
import Business.RegisteredUser.RegisteredUser;
import Business.Role.PatientRole;
import Business.Validation.Validations;
import constants.Utils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jazibjavaid
 */
public class UserRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegistrationJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    String selectedgender;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    
    public UserRegistrationJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        GenderCombobox.setSelectedItem("Male");
        cityJComboBox.removeAllItems();
            for (City city : system.getCityList()) {
            cityJComboBox.addItem(city);
            jDateChooser1.setMaxSelectableDate(new Date());
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtAddress = new javax.swing.JTextField();
        cityJComboBox = new javax.swing.JComboBox();
        lblContactNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        GenderCombobox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPwdconfirm = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        pwdfieldconfirm = new javax.swing.JPasswordField();
        pwdfield = new javax.swing.JPasswordField();
        addJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 218, 207));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 372, -1));

        cityJComboBox.setBackground(new java.awt.Color(153, 153, 153));
        cityJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        cityJComboBox.setBorder(null);
        jPanel2.add(cityJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 45, 372, 30));

        lblContactNo.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblContactNo.setText("CONTACT NUMBER");
        jPanel2.add(lblContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 393, -1, -1));

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        jLabel2.setText("NAME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 83, -1, -1));

        nameJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 105, 372, -1));

        txtZipCode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });
        jPanel2.add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 229, 372, -1));

        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 291, 372, -1));

        lblAddress.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblAddress.setText("ADDRESS");
        jPanel2.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 145, -1, -1));

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        jLabel3.setText("NEAREST CITY");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 23, -1, -1));

        txtContactNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });
        jPanel2.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 416, 372, -1));

        lblZipCode.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblZipCode.setText("ZIP CODE");
        jPanel2.add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 207, -1, -1));

        lblEmail.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblEmail.setText("EMAIL");
        jPanel2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 269, -1, -1));

        lblGender.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblGender.setText("GENDER");
        jPanel2.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 331, -1, -1));

        GenderCombobox.setBackground(new java.awt.Color(153, 153, 153));
        GenderCombobox.setForeground(new java.awt.Color(255, 255, 255));
        GenderCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));
        GenderCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboboxActionPerformed(evt);
            }
        });
        jPanel2.add(GenderCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 353, 372, 30));

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        jLabel1.setText("DATE OF BIRTH");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 450, -1, -1));

        jDateChooser1.setBackground(new java.awt.Color(153, 153, 153));
        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 472, 372, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblUsername.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblUsername.setText("USERNAME");

        lblPwdconfirm.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblPwdconfirm.setText("CONFIRM PASSWORD");

        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        lblPwd.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblPwd.setText("PASSWORD");

        pwdfieldconfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        pwdfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pwdfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPwdconfirm)
                        .addGap(171, 171, 171))
                    .addComponent(pwdfieldconfirm, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPwd)
                    .addComponent(pwdfield)
                    .addComponent(txtusername)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPwd)
                .addGap(12, 12, 12)
                .addComponent(pwdfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPwdconfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdfieldconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, 250));

        addJButton.setBackground(new java.awt.Color(253, 135, 124));
        addJButton.setFont(new java.awt.Font(".SF NS Text", 1, 16)); // NOI18N
        addJButton.setText("REGISTER");
        addJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addJButton.setContentAreaFilled(false);
        addJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addJButtonMouseExited(evt);
            }
        });
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 200, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(178, 178, 178))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
         
        City network = (City) cityJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        String address=txtAddress.getText();
        String zipcode=txtZipCode.getText();
        String contactNumber=txtContactNo.getText();
        String email=txtEmail.getText();

        String username= txtusername.getText();
        String birthDate="";
        if(jDateChooser1.getDate()!=null){
        birthDate  = formatter.format(jDateChooser1.getDate());}
        String password = String.valueOf(this.pwdfield.getPassword());
        String comfirmpassword = String.valueOf(this.pwdfieldconfirm.getPassword()); 
        Validations validation=new Validations();

        if (!password.equals(comfirmpassword)) {
            JOptionPane.showMessageDialog(null, "Passwords does not match. Please try again.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
               
        if(name.equals("")||address.equals("")||email.equals("")||zipcode.equals("")||contactNumber.equals("")||username.equals("")||password.equals("")||birthDate.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter all the fields.", "Error!", JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        Boolean unique=system.checkIfUserIsUnique(username);
        if(!unique){
            JOptionPane.showMessageDialog(null, "Username " + username + " already exists. Please try with different username", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!validation.isValidPassword(password)){
            return;
        }
        if(!validation.isValidZipCode(zipcode)){
            return;
        }
        if(!validation.isValidPhoneNumber(contactNumber)){
            return;
        }
        if(!validation.isValidEmail(email)){
            return;
        }
        
        RegisteredUser p=new RegisteredUser(network,null, null, null, null, null, name, birthDate, selectedgender, address, zipcode, contactNumber, email,username,password,new PatientRole());
        system.getRegisteredUserDirectory().addRegisteredUser(p);
        system.getUserAccountDir().addUserAccount(p);
        Utils utils = new Utils();
            
            String subject = "New user registration";
            String msg = "Welcome to HealthInterface, Thank you for registering with us!";
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I><font color='green'> Registered Successfully </font><></h2></html>"));

          
            nameJTextField.setText("");
            txtAddress.setText("");
            txtZipCode.setText("");
            txtContactNo.setText("");
            GenderCombobox.getSelectedItem();
            txtEmail.setText("");
            txtusername.setText("");
            pwdfield.setText("");
            pwdfieldconfirm.setText(""); 
            
        utils.sendEmail(email, subject, msg);
        utils.setDatabase(system);
          
    }//GEN-LAST:event_addJButtonActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void GenderComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboboxActionPerformed
        // TODO add your handling code here:
        selectedgender = (String) GenderCombobox.getSelectedItem();
    }//GEN-LAST:event_GenderComboboxActionPerformed

    private void pwdfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdfieldActionPerformed

    private void addJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMouseEntered
        // TODO add your handling code here:
        addJButton.setBackground(new java.awt.Color(253,135,124));
        addJButton.setContentAreaFilled(true);
        addJButton.setFocusPainted(true);
        addJButton.setBorderPainted(false);
        addJButton.setOpaque(true);
    }//GEN-LAST:event_addJButtonMouseEntered

    private void addJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMouseExited
        // TODO add your handling code here:
        addJButton.setContentAreaFilled(false);
        addJButton.setFocusPainted(false);
        addJButton.setBorderPainted(true);
    }//GEN-LAST:event_addJButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox GenderCombobox;
    private javax.swing.JButton addJButton;
    private javax.swing.JComboBox cityJComboBox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblPwdconfirm;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField pwdfield;
    private javax.swing.JPasswordField pwdfieldconfirm;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
