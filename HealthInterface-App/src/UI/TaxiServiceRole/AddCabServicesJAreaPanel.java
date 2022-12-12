/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.TaxiServiceRole;

import Business.TaxiDriver.CabDriver;
import Business.TaxiDriver.CabService;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.Validation.Validations;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuktachikate
 */
public class AddCabServicesJAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCabServicesJAreaPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private EcoSystem system;
    private CabDriver cabProvider;
    private Organization org;
    public AddCabServicesJAreaPanel(JPanel userProcessContainer,Enterprise ent, UserAccount userAccount, EcoSystem system, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.org = org;
        cabProvider=org.getCabDriverDir().findCabProvider(userAccount.getUsername());
        populateTestTable();
        ServiceTable.setRowHeight(25);
        ServiceTable.getTableHeader().setDefaultRenderer(new HeaderColor());
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

    private void populateTestTable(){
        DefaultTableModel model = (DefaultTableModel) ServiceTable.getModel();
        
        model.setRowCount(0);
        for (CabService ambSer : cabProvider.getCabServiceDirectory().getCabServiceList()){          
            Object[] row = new Object[2];
            row[0] = ambSer;
            row[1] = ambSer.getServiceType();
            model.addRow(row);
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
        jPanel2 = new javax.swing.JPanel();
        DoctorScrollPane = new javax.swing.JScrollPane();
        ServiceTable = new javax.swing.JTable();
        lblDoctorslist1 = new javax.swing.JLabel();
        btnRemoveFoodSuppplier = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        CabTypeCombobox = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ServiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Service  Name", "Service Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ServiceTable.setRequestFocusEnabled(false);
        ServiceTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(ServiceTable);

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Taxi Service");

        btnRemoveFoodSuppplier.setBackground(new java.awt.Color(253, 135, 124));
        btnRemoveFoodSuppplier.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnRemoveFoodSuppplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/delete2.png"))); // NOI18N
        btnRemoveFoodSuppplier.setText("Remove Service");
        btnRemoveFoodSuppplier.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRemoveFoodSuppplier.setContentAreaFilled(false);
        btnRemoveFoodSuppplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveFoodSuppplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveFoodSuppplierMouseExited(evt);
            }
        });
        btnRemoveFoodSuppplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFoodSuppplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDoctorslist1)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRemoveFoodSuppplier, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorslist1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveFoodSuppplier, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, -1, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Service Name");

        addJButton.setBackground(new java.awt.Color(253, 135, 124));
        addJButton.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images/add2.png"))); // NOI18N
        addJButton.setText("Add Service");
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

        lblAddress.setText("Service Type:");

        CabTypeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Extended", "Crew Cab" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblAddress)
                        .addGap(18, 18, 18)
                        .addComponent(CabTypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 135, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress)
                    .addComponent(CabTypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 720, 150));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveFoodSuppplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveFoodSuppplierMouseEntered
        // TODO add your handling code here:
        btnRemoveFoodSuppplier.setBackground(new java.awt.Color(253,135,124));
        btnRemoveFoodSuppplier.setContentAreaFilled(true);
        btnRemoveFoodSuppplier.setFocusPainted(true);
        btnRemoveFoodSuppplier.setBorderPainted(false);
        btnRemoveFoodSuppplier.setOpaque(true);
    }//GEN-LAST:event_btnRemoveFoodSuppplierMouseEntered

    private void btnRemoveFoodSuppplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveFoodSuppplierMouseExited
        // TODO add your handling code here:
        btnRemoveFoodSuppplier.setContentAreaFilled(false);
        btnRemoveFoodSuppplier.setFocusPainted(false);
        btnRemoveFoodSuppplier.setBorderPainted(true);
    }//GEN-LAST:event_btnRemoveFoodSuppplierMouseExited

    private void btnRemoveFoodSuppplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFoodSuppplierActionPerformed
        // TODO add your handling code here:
        int row = ServiceTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        CabService cabService=(CabService)ServiceTable.getValueAt(row, 0);;
        cabProvider.getCabServiceDirectory().removeService(cabService);
        JOptionPane.showMessageDialog(null, "Taxi Service removed successfully!");
        populateTestTable();
    }//GEN-LAST:event_btnRemoveFoodSuppplierActionPerformed

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

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Validations validation=new Validations();
        String packageName = txtName.getText();
        String serviceType=CabTypeCombobox.getSelectedItem().toString();
        if(packageName.equals("")||serviceType.equalsIgnoreCase("select")){
            JOptionPane.showMessageDialog(null, "Please enter service name", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{

            CabService cabServce=new CabService(packageName,serviceType);
            cabProvider.getCabServiceDirectory().addService(cabServce);
            JOptionPane.showMessageDialog(null, "Taxi Service added successfully!");
        }
        populateTestTable();
        txtName.setText("");
    }//GEN-LAST:event_addJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CabTypeCombobox;
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JTable ServiceTable;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton btnRemoveFoodSuppplier;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}