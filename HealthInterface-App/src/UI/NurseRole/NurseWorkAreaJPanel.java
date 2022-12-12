/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.NurseRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author jazibjavaid
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalEntAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Organization org;
    EcoSystem system;

    public NurseWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {

        try {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.enterprise = enterprise;
            this.useraccount = useraccount;
            this.org = org;
            this.system = system;

            ManageNurseProfile profileJPanel = new ManageNurseProfile(workAreaJPanel, enterprise, useraccount, system);
            workAreaJPanel.add("cabServiceDashboard", profileJPanel);
            CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
            layout.next(workAreaJPanel);
        } catch (ParseException ex) {
            Logger.getLogger(NurseWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(253, 135, 124));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(253, 218, 207));
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
        btnAmbulance_JPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAmbulance = new javax.swing.JLabel();
        btnAssignedRequest_JPanel = new javax.swing.JPanel();
        btnRequestsAssigned = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnProfile_Panel = new javax.swing.JPanel();
        btnProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCabService_JPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnCabService = new javax.swing.JLabel();
        workAreaJPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(253, 218, 207));

        btnAmbulance_JPanel.setBackground(new java.awt.Color(253, 218, 207));
        btnAmbulance_JPanel.setToolTipText("");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/ambulance.png"))); // NOI18N

        btnAmbulance.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAmbulance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAmbulance.setText("Manage Ambulance");
        btnAmbulance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAmbulanceMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnAmbulance_JPanelLayout = new javax.swing.GroupLayout(btnAmbulance_JPanel);
        btnAmbulance_JPanel.setLayout(btnAmbulance_JPanelLayout);
        btnAmbulance_JPanelLayout.setHorizontalGroup(
            btnAmbulance_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAmbulance_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAmbulance_JPanelLayout.setVerticalGroup(
            btnAmbulance_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAmbulance_JPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(btnAmbulance_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btnAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAssignedRequest_JPanel.setBackground(new java.awt.Color(253, 218, 207));
        btnAssignedRequest_JPanel.setToolTipText("");
        btnAssignedRequest_JPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAssignedRequest_JPanelMousePressed(evt);
            }
        });

        btnRequestsAssigned.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnRequestsAssigned.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRequestsAssigned.setText("Assigned Requests");
        btnRequestsAssigned.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRequestsAssignedMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/doc1.png"))); // NOI18N

        javax.swing.GroupLayout btnAssignedRequest_JPanelLayout = new javax.swing.GroupLayout(btnAssignedRequest_JPanel);
        btnAssignedRequest_JPanel.setLayout(btnAssignedRequest_JPanelLayout);
        btnAssignedRequest_JPanelLayout.setHorizontalGroup(
            btnAssignedRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAssignedRequest_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRequestsAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        btnAssignedRequest_JPanelLayout.setVerticalGroup(
            btnAssignedRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAssignedRequest_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAssignedRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRequestsAssigned, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnProfile_Panel.setBackground(new java.awt.Color(253, 135, 124));
        btnProfile_Panel.setToolTipText("");

        btnProfile.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProfile.setText("Manage Profile");
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProfileMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/userp.png"))); // NOI18N

        javax.swing.GroupLayout btnProfile_PanelLayout = new javax.swing.GroupLayout(btnProfile_Panel);
        btnProfile_Panel.setLayout(btnProfile_PanelLayout);
        btnProfile_PanelLayout.setHorizontalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnProfile_PanelLayout.setVerticalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnCabService_JPanel.setBackground(new java.awt.Color(253, 218, 207));
        btnCabService_JPanel.setToolTipText("");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/cab.png"))); // NOI18N

        btnCabService.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnCabService.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCabService.setText("Manage Taxi");
        btnCabService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCabServiceMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnCabService_JPanelLayout = new javax.swing.GroupLayout(btnCabService_JPanel);
        btnCabService_JPanel.setLayout(btnCabService_JPanelLayout);
        btnCabService_JPanelLayout.setHorizontalGroup(
            btnCabService_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCabService_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCabService, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCabService_JPanelLayout.setVerticalGroup(
            btnCabService_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCabService_JPanelLayout.createSequentialGroup()
                .addGroup(btnCabService_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCabService, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCabService_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProfile_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAssignedRequest_JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAmbulance_JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnProfile_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssignedRequest_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAmbulance_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCabService_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(675, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 880));

        workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        add(workAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1180, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmbulanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmbulanceMousePressed
        // TODO add your handling code here:
        setColor(btnAmbulance_JPanel);
        resetColor(btnAssignedRequest_JPanel);
        resetColor(btnProfile_Panel);
        resetColor(btnCabService_JPanel);
        ManageAmbulanceBookingJPanel bookAmbulanceJPanel = new ManageAmbulanceBookingJPanel(workAreaJPanel, enterprise, useraccount, system, org);
        workAreaJPanel.add("bookAmbulanceForPatients", bookAmbulanceJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnAmbulanceMousePressed

    private void btnRequestsAssignedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRequestsAssignedMousePressed
        // TODO add your handling code here:
        setColor(btnAssignedRequest_JPanel);
        resetColor(btnAmbulance_JPanel);
        resetColor(btnProfile_Panel);
        resetColor(btnCabService_JPanel);
        NurseAssignedRequest nurseAssignedRequests = new NurseAssignedRequest(workAreaJPanel, enterprise, useraccount, system, org);
        workAreaJPanel.add("viewAllRequestJPanel", nurseAssignedRequests);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnRequestsAssignedMousePressed

    private void btnAssignedRequest_JPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignedRequest_JPanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAssignedRequest_JPanelMousePressed

    private void btnProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMousePressed
        // TODO add your handling code here:
        setColor(btnProfile_Panel);
        resetColor(btnAmbulance_JPanel);
        resetColor(btnAssignedRequest_JPanel);
        resetColor(btnCabService_JPanel);
        try {
            ManageNurseProfile managenurseProfileJPanel = new ManageNurseProfile(workAreaJPanel, enterprise, useraccount, system);
            workAreaJPanel.add("NurseProfileJPanel", managenurseProfileJPanel);
            CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
            layout.next(workAreaJPanel);
        } catch (ParseException ex) {
            Logger.getLogger(NurseWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnProfileMousePressed

    private void btnCabServiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCabServiceMousePressed
        // TODO add your handling code here:
        setColor(btnCabService_JPanel);

        resetColor(btnAmbulance_JPanel);

        resetColor(btnAssignedRequest_JPanel);
        resetColor(btnProfile_Panel);
        ManageCabBookingJPanel bookCabPanel = new ManageCabBookingJPanel(workAreaJPanel, enterprise, useraccount, system, org);
        workAreaJPanel.add("bookCabForNurse", bookCabPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);

    }//GEN-LAST:event_btnCabServiceMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAmbulance;
    private javax.swing.JPanel btnAmbulance_JPanel;
    private javax.swing.JPanel btnAssignedRequest_JPanel;
    private javax.swing.JLabel btnCabService;
    private javax.swing.JPanel btnCabService_JPanel;
    private javax.swing.JLabel btnProfile;
    private javax.swing.JPanel btnProfile_Panel;
    private javax.swing.JLabel btnRequestsAssigned;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
