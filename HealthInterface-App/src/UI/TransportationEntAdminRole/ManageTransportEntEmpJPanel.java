/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.TransportationEntAdminRole;

import Business.AmbulanceDriver.AmbulanceDriver;
import Business.TaxiDriver.CabDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Role.AmbulanceServiceRole;
import Business.Role.CabServiceRole;
import Business.Validation.Validations;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author yuktachikate
 */
public class ManageTransportEntEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTransportEntEmpJPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    private EcoSystem system;

    public ManageTransportEntEmpJPanel(EcoSystem system,JPanel userProcessContainer,OrganizationDirectory organizationDir,Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.ent=ent;
        this.system=system;
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
        populateCabServiceTable();
        populateAmbulanceServiceTable();
        organizationCabJTable.setRowHeight(25);
        organizationCabJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
        organizationAmbulanceJTable.setRowHeight(25);
        organizationAmbulanceJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
    }
    
    public class HeaderColor extends DefaultTableCellRenderer {
        public HeaderColor() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);         
            setBackground(new java.awt.Color(253,217,208));
            return this;
        }

    }
    
     public void populateOrganizationComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrgList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrgList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }
    
    private void populateCabServiceTable(){
        DefaultTableModel model = (DefaultTableModel) organizationCabJTable.getModel();
        
        model.setRowCount(0);
        for(Organization org:organizationDir.getOrgList()){
        for (CabDriver cd : org.getCabDriverDir().getCabDriverDirectory()){
            Object[] row = new Object[6];
            row[0] = cd;         
            row[1] = cd.getAddress();
            row[2] = cd.getZipcode();
            row[3] = cd.getContactNumber();
            row[4] = cd.getEmail();
            row[5] = cd.getLicenseNumber();
            model.addRow(row);
        }
        }
    }
     private void populateAmbulanceServiceTable(){
        DefaultTableModel model = (DefaultTableModel) organizationAmbulanceJTable.getModel();
        
        model.setRowCount(0);
        for(Organization org:organizationDir.getOrgList()){
        for (AmbulanceDriver amb : org.getAmbulanceDriverDir().getambulanceDriverDirectory()){
            Object[] row = new Object[6];
            row[0] = amb;          
            row[1] = amb.getAddress();
            row[2] = amb.getZipcode();
            row[3] = amb.getContactNumber();
            row[4] = amb.getEmail();
            row[5] = amb.getLicenseNumber();
            model.addRow(row);
        }
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

        jPanel1 = new javax.swing.JPanel();
        lblAmbulance = new javax.swing.JLabel();
        DoctorScrollPane = new javax.swing.JScrollPane();
        organizationCabJTable = new javax.swing.JTable();
        NurseScrollPane = new javax.swing.JScrollPane();
        organizationAmbulanceJTable = new javax.swing.JTable();
        btnRemoveAmbulanceService = new javax.swing.JButton();
        lblDoctorslist1 = new javax.swing.JLabel();
        btnRemoveCabService = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtAddress = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        lblContactNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtlicenseno = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lbllicense = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        lblContactNo1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        GenderCombobox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtuserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        addJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblAmbulance.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblAmbulance.setText("Ambulance Providers");

        organizationCabJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "ZipCode", "Contact Number", "Email", "License Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationCabJTable.setRequestFocusEnabled(false);
        organizationCabJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(organizationCabJTable);

        organizationAmbulanceJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "ZipCode", "Contact Number", "Email", "License Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationAmbulanceJTable.setRequestFocusEnabled(false);
        organizationAmbulanceJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        NurseScrollPane.setViewportView(organizationAmbulanceJTable);

        btnRemoveAmbulanceService.setBackground(new java.awt.Color(253, 135, 124));
        btnRemoveAmbulanceService.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnRemoveAmbulanceService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/delete2.png"))); // NOI18N
        btnRemoveAmbulanceService.setText("Remove Ambulance Provider");
        btnRemoveAmbulanceService.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRemoveAmbulanceService.setContentAreaFilled(false);
        btnRemoveAmbulanceService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveAmbulanceServiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveAmbulanceServiceMouseExited(evt);
            }
        });
        btnRemoveAmbulanceService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAmbulanceServiceActionPerformed(evt);
            }
        });

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Taxi Providers");

        btnRemoveCabService.setBackground(new java.awt.Color(253, 135, 124));
        btnRemoveCabService.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnRemoveCabService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/delete2.png"))); // NOI18N
        btnRemoveCabService.setText("Remove Taxi Provider");
        btnRemoveCabService.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRemoveCabService.setContentAreaFilled(false);
        btnRemoveCabService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveCabServiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveCabServiceMouseExited(evt);
            }
        });
        btnRemoveCabService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveCabServiceActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblContactNo.setText("Contact Number");

        jLabel2.setText("Name");

        txtlicenseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlicensenoActionPerformed(evt);
            }
        });

        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblAddress.setText("Address");

        lbllicense.setText("License Number");

        jLabel3.setText("Organization");

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        lblZipCode.setText("Zip Code");

        lblContactNo1.setText("Email");

        jLabel10.setText("Gender:");

        GenderCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));
        GenderCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboboxActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel4.setText("Password");

        addJButton.setBackground(new java.awt.Color(253, 135, 124));
        addJButton.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/add2.png"))); // NOI18N
        addJButton.setText("Create Provider");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipCode)
                    .addComponent(lblContactNo)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(408, 408, 408))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(GenderCombobox, 0, 126, Short.MAX_VALUE)
                            .addComponent(nameJTextField)
                            .addComponent(txtZipCode)
                            .addComponent(txtContactNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbllicense)
                                .addGap(29, 29, 29)
                                .addComponent(txtlicenseno, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContactNo1)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(txtuserName)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllicense)
                    .addComponent(txtlicenseno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactNo1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtuserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(433, 433, 433)
                            .addComponent(lblDoctorslist1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NurseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveCabService, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveAmbulanceService, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblAmbulance)
                            .addGap(352, 352, 352)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorslist1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveCabService)
                .addGap(3, 3, 3)
                .addComponent(lblAmbulance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NurseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveAmbulanceService, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, 1000, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveAmbulanceServiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveAmbulanceServiceMouseEntered
        // TODO add your handling code here:
        btnRemoveAmbulanceService.setBackground(new java.awt.Color(253,135,124));
        btnRemoveAmbulanceService.setContentAreaFilled(true);
        btnRemoveAmbulanceService.setFocusPainted(true);
        btnRemoveAmbulanceService.setBorderPainted(false);
        btnRemoveAmbulanceService.setOpaque(true);
    }//GEN-LAST:event_btnRemoveAmbulanceServiceMouseEntered

    private void btnRemoveAmbulanceServiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveAmbulanceServiceMouseExited
        // TODO add your handling code here:
        btnRemoveAmbulanceService.setContentAreaFilled(false);
        btnRemoveAmbulanceService.setFocusPainted(false);
        btnRemoveAmbulanceService.setBorderPainted(true);
    }//GEN-LAST:event_btnRemoveAmbulanceServiceMouseExited

    private void btnRemoveAmbulanceServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAmbulanceServiceActionPerformed
        // TODO add your handling code here:
        int row = organizationAmbulanceJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        AmbulanceDriver ad=(AmbulanceDriver)organizationAmbulanceJTable.getValueAt(row, 0);
        
       for(int i=0;i<organizationDir.getOrgList().size();i++){
           Organization o= organizationDir.getOrgList().get(i);
           Boolean success=o.getAmbulanceDriverDir().removeambulanceDriver(ad);
           if(success){
               o.getEmpDir().removeEmpByName(ad.getFullName());
               o.getUserAccountDir().removeUserAccountByUserName(ad.getFullName());
           }
       }      
        populateAmbulanceServiceTable();
    }//GEN-LAST:event_btnRemoveAmbulanceServiceActionPerformed

    private void btnRemoveCabServiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveCabServiceMouseEntered
        // TODO add your handling code here:
        btnRemoveCabService.setBackground(new java.awt.Color(253,135,124));
        btnRemoveCabService.setContentAreaFilled(true);
        btnRemoveCabService.setFocusPainted(true);
        btnRemoveCabService.setBorderPainted(false);
        btnRemoveCabService.setOpaque(true);
    }//GEN-LAST:event_btnRemoveCabServiceMouseEntered

    private void btnRemoveCabServiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveCabServiceMouseExited
        // TODO add your handling code here:
        btnRemoveCabService.setContentAreaFilled(false);
        btnRemoveCabService.setFocusPainted(false);
        btnRemoveCabService.setBorderPainted(true);
    }//GEN-LAST:event_btnRemoveCabServiceMouseExited

    private void btnRemoveCabServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCabServiceActionPerformed
        // TODO add your handling code here:
        int row = organizationCabJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        CabDriver cd=(CabDriver)organizationCabJTable.getValueAt(row, 0);
        
       for(int i=0;i<organizationDir.getOrgList().size();i++){
           Organization o= organizationDir.getOrgList().get(i);
           Boolean success=o.getCabDriverDir().removeCabDriver(cd);
           if(success){
               o.getEmpDir().removeEmpByName(cd.getFullName());
               o.getUserAccountDir().removeUserAccountByUserName(cd.getFullName());
           }
       }    
       
        populateCabServiceTable();
    }//GEN-LAST:event_btnRemoveCabServiceActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtlicensenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlicensenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlicensenoActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void GenderComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboboxActionPerformed

    private void addJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMouseEntered
        // TODO add your handling code here:
        addJButton.setBackground(new java.awt.Color(18,102,153));
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

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        Validations validation=new Validations();
        String name = nameJTextField.getText();
        String license=txtlicenseno.getText();
        String address=txtAddress.getText();
        String zipcode=txtZipCode.getText();
        String contactNumber=txtContactNo.getText();
        String gender = (String) GenderCombobox.getSelectedItem();
        String email=txtEmail.getText();
        String username = txtuserName.getText();
        char[] passwordCharArray = txtpassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        if(name.equals("")||address.equals("")||email.equals("")||zipcode.equals("")||contactNumber.equals("")||username.equals("")||password.equals("")){
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
        
        if(organization.getOrgType().getValue().equals("Cab Provider Organization")){
            CabDriver cd=new CabDriver(license, name, null, gender, address, zipcode, contactNumber, email,username,password,new CabServiceRole());
            organization.getCabDriverDir().addCabDriver(cd);
            organization.getUserAccountDir().addUserAccount(cd);
            populateCabServiceTable();
            nameJTextField.setText("");
            txtlicenseno.setText("");
            txtAddress.setText("");
            txtZipCode.setText("");
            txtContactNo.setText("");
            txtEmail.setText("");
            txtuserName.setText("");
            txtpassword.setText("");
        }
        if(organization.getOrgType().getValue().equals("Ambulance Provider Organization")){
            AmbulanceDriver cd=new AmbulanceDriver(license, name, null, gender, address, zipcode, contactNumber, email,username,password,new AmbulanceServiceRole());
            organization.getAmbulanceDriverDir().addambulanceDriver(cd);
            organization.getUserAccountDir().addUserAccount(cd);
            populateAmbulanceServiceTable();
            nameJTextField.setText("");
            txtlicenseno.setText("");
            txtAddress.setText("");
            txtZipCode.setText("");
            txtContactNo.setText("");
            txtEmail.setText("");
            txtuserName.setText("");
            txtpassword.setText("");
        }
    }//GEN-LAST:event_addJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JComboBox GenderCombobox;
    private javax.swing.JScrollPane NurseScrollPane;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton btnRemoveAmbulanceService;
    private javax.swing.JButton btnRemoveCabService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAmbulance;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblContactNo1;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel lbllicense;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationAmbulanceJTable;
    private javax.swing.JTable organizationCabJTable;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTextField txtlicenseno;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuserName;
    // End of variables declaration//GEN-END:variables
}
