/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientManagerRole;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.PatientManager.PatientManager;
import Business.RegisteredUser.RegisteredUser;
import Business.UserAccount.UserAccount;
import Business.WorkProcess.HealthRequest;
import Business.WorkProcess.ServiceRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shantanutyagi
 */
public class ManageAmbulanceBookingPMJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientManagerAssignDocJPanel
     */
     private UserAccount useraccount;
       private EcoSystem system;
       private Enterprise enterprise;
       private Organization organization;
       private JPanel userProcessContainer;
       private HealthRequest req;
//       private FoodSupplier foodSupplier;
    public ManageAmbulanceBookingPMJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system, Organization organization) {
        initComponents();
        this.useraccount=account;
        this.system=system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        SubmittedrequestsJTable.setRowHeight(25);
        SubmittedrequestsJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
        populateRequestTable();
    }
     public class HeaderColor extends DefaultTableCellRenderer {
        public HeaderColor() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);         
           setBackground(new java.awt.Color(18,102,153));
            return this;
        }
    }
  public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) SubmittedrequestsJTable.getModel();
        model.setRowCount(0);
            PatientManager pMan = organization.getpManagerDir().findPatientManager(useraccount.getUsername());
           for(ServiceRequest serReq : pMan.getServicerequestDirectoryAmb().getServiceRequestList()){
            Object[] row = new Object[6];
               RegisteredUser user = serReq.getUser();
            row[0] = serReq;
            row[1] = user.getName();
            row[2] = user.getContactNumber();
            row[3] = user.getAddress();
            row[4] = user.getZipcode();
            row[5] = serReq.getStatus();
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

        DoctorScrollPane = new javax.swing.JScrollPane();
        SubmittedrequestsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Approved = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        SubmittedrequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Patient's Name", "Contact Number", "Address", "Zipcode", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SubmittedrequestsJTable.setRequestFocusEnabled(false);
        SubmittedrequestsJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(SubmittedrequestsJTable);

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel1.setText("Ambulance Requests");

        Approved.setBackground(new java.awt.Color(18, 102, 153));
        Approved.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        Approved.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/add2.png"))); // NOI18N
        Approved.setText("Add New");
        Approved.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Approved.setContentAreaFilled(false);
        Approved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ApprovedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ApprovedMouseExited(evt);
            }
        });
        Approved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApprovedActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(18, 102, 153));
        jButton1.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/delete2.png"))); // NOI18N
        jButton1.setText("Remove request");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Approved, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Approved, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addContainerGap(309, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApprovedActionPerformed
        // TODO add your handling code here:
        BookAmbulancePMJPanel bookAmbulanceJPanel=new BookAmbulancePMJPanel(userProcessContainer,enterprise,useraccount,system,organization);
        userProcessContainer.add("bookAmbulanceForPatients", bookAmbulanceJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_ApprovedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       PatientManager pMan = organization.getpManagerDir().findPatientManager(useraccount.getUsername());
        int row = SubmittedrequestsJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ServiceRequest serviceSheet=(ServiceRequest)SubmittedrequestsJTable.getValueAt(row, 0);
        serviceSheet.setStatus("Cancelled");
        pMan.getServicerequestDirectoryAmb().removeRequest(serviceSheet);
         JOptionPane.showMessageDialog(null, "Request removed successfully");
        populateRequestTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ApprovedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApprovedMouseEntered
        // TODO add your handling code here:
         Approved.setBackground(new java.awt.Color(18,102,153));
        Approved.setContentAreaFilled(true);
        Approved.setFocusPainted(true);
        Approved.setBorderPainted(false);
         Approved.setOpaque(true);
    }//GEN-LAST:event_ApprovedMouseEntered

    private void ApprovedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApprovedMouseExited
        // TODO add your handling code here:
         Approved.setContentAreaFilled(false);
        Approved.setFocusPainted(false);
        Approved.setBorderPainted(true);
    }//GEN-LAST:event_ApprovedMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
          jButton1.setBackground(new java.awt.Color(18,102,153));
        jButton1.setContentAreaFilled(true);
        jButton1.setFocusPainted(true);
        jButton1.setBorderPainted(false);
         jButton1.setOpaque(true);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
         jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setBorderPainted(true);
    }//GEN-LAST:event_jButton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Approved;
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JTable SubmittedrequestsJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}