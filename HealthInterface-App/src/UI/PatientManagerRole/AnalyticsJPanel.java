/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.PatientAdvisor.PatientManager;
import Business.Tester.Tester;
import Business.Tester.Tests;
import Business.UserAccount.UserAccount;
import Business.WorkProcess.HealthRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author shantanutyagi
 */
public class AnalyticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private EcoSystem system;
    private Tester tester;
    private Organization org;
    private Tests test;
    private HealthRequest request;
    String ifConsultationRequired;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

    public AnalyticsJPanel(JPanel userProcessContainer, Enterprise ent, UserAccount userAccount, EcoSystem system, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.ent = ent;
        this.org = org;
        createGraphChart();

    }

    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            setBackground(new java.awt.Color(74, 122, 193));
            return this;
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

        barGraphJPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barGraphJPanel.setBackground(new java.awt.Color(255, 255, 255));
        barGraphJPanel.setLayout(new java.awt.BorderLayout());
        add(barGraphJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 1180, 410));

        jLabel5.setFont(new java.awt.Font(".SF NS Text", 1, 16)); // NOI18N
        jLabel5.setText("Bar Graph");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 130, 40));

        jButton3.setBackground(new java.awt.Color(253, 135, 124));
        jButton3.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 22, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setBackground(new java.awt.Color(253, 135, 124));
        jButton3.setContentAreaFilled(true);
        jButton3.setFocusPainted(true);
        jButton3.setBorderPainted(false);
        jButton3.setOpaque(true);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setBorderPainted(true);
    }//GEN-LAST:event_jButton3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barGraphJPanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    public void createGraphChart() {

        PatientManager patman = org.getpManagerDir().findPatientManager(userAccount.getUsername());
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        ArrayList<String> allStatus = new ArrayList<>();
        ArrayList<String> uniqueStatus = new ArrayList<>();
        for (HealthRequest req : patman.getRequestDirectory().getRequestList()) {
            allStatus.add(req.getStatus());
        }

        for (HealthRequest req : patman.getRequestDirectory().getRequestList()) {
            if (!uniqueStatus.contains(req.getStatus())) {
                uniqueStatus.add(req.getStatus());
            }
        }

        for (String str : uniqueStatus) {
            int occurrences = Collections.frequency(allStatus, str);
            data.setValue(occurrences, "Count", str);
        }

        JFreeChart barchart = ChartFactory.createBarChart("Patient Details", "Status", "Count", data, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot brcrt = barchart.getCategoryPlot();
        brcrt.setRangeGridlinePaint(Color.orange);
        ChartPanel barPanel = new ChartPanel(barchart);
        barGraphJPanel.add(barPanel, BorderLayout.CENTER);
        barGraphJPanel.validate();

    }
}
