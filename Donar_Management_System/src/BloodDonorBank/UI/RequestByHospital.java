/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BloodDonorBank.UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ServiceHospital;

import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Gayatri
 */
public class RequestByHospital extends javax.swing.JPanel {

    /**
     * Creates new form RequestByHospital
     */
    Connection con;
    String pname;
            String retype;
            String reqvalue;
            String huname;
            String restatus;
            
            ServiceHospital sh;
    String selectedhname, selectedpname  ,selectedentitytype,selectedentityvalue,reqstatus;
    public RequestByHospital() throws SQLException {
        initComponents();
        String temp[]= null;
        
        sh = new ServiceHospital();
           ArrayList<String> temp1 = sh.displayhtable();
            for (int i =0; i< temp1.size();i++){
                
        DefaultTableModel tblmodel = (DefaultTableModel) RequestByHospitalTable.getModel();

            temp = temp1.get(i).split(",");
             tblmodel.addRow(temp);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        RequestByHospitalTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        RequestByHospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name", "Patient Name", "Blood/Organ", "Entity Type", "Status"
            }
        ));
        RequestByHospitalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RequestByHospitalTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(RequestByHospitalTable);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Check for Match in Blood/Organ Bank");
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
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(338, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            String temp[]= null;
            sh.checkForMatch(selectedhname,selectedpname,selectedentitytype,selectedentityvalue,reqstatus);
            
            ArrayList<String> temp1 = sh.displayhtable();
            DefaultTableModel model = (DefaultTableModel) RequestByHospitalTable.getModel();
             while (model.getRowCount()>0)
          {
             model.removeRow(0);
          }
            for (int i =0; i< temp1.size();i++){
                
                model = (DefaultTableModel) RequestByHospitalTable.getModel();
                temp = temp1.get(i).split(",");
                model.addRow(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestByHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RequestByHospitalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestByHospitalTableMouseClicked
        // TODO add your handling code here:
        
        
        
        
        DefaultTableModel tblmodel = (DefaultTableModel) RequestByHospitalTable.getModel();
        
         selectedhname = tblmodel.getValueAt(RequestByHospitalTable.getSelectedRow(),0).toString();
         selectedpname = tblmodel.getValueAt(RequestByHospitalTable.getSelectedRow(),1).toString();
         selectedentitytype = tblmodel.getValueAt(RequestByHospitalTable.getSelectedRow(),2).toString();
         selectedentityvalue = tblmodel.getValueAt(RequestByHospitalTable.getSelectedRow(),3).toString();
         reqstatus = tblmodel.getValueAt(RequestByHospitalTable.getSelectedRow(),4).toString();
        System.out.println(selectedpname+ selectedentitytype+selectedentityvalue);
        
        
        
    }//GEN-LAST:event_RequestByHospitalTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RequestByHospitalTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
