/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Hospital.UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gayatri
 */
public class HospitalSendRequest extends javax.swing.JPanel {

    /**
     * Creates new form HospitalPatientTable
     */
    
    String huser;
    String pass;
    Connection con;
    String reqstatus;
    String hname ="";
    String selectedpname;
    String selectedentitytype ;
    String selectedentityvalue;
    String puname;
    Statement stmt;
    public HospitalSendRequest(String username, String password) throws SQLException {
        initComponents();
        huser = username;
        pass = password;
        
          try{  
                Class.forName("com.mysql.jdbc.Driver");  
                 this.con=(Connection) DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/AED_DB","root","Snehal1&");  
                
                
            }
        catch(Exception e){ 
                System.out.println(e);
                
        }  
             stmt = con.createStatement();
            String queryString = "SELECT hospital_name FROM hospital where hospital_username = '" + huser + "'" ;
            ResultSet results = stmt.executeQuery(queryString);

            while (results.next()) {
             hname = results.getString(1);

         
            }
          loadtable(stmt);
            
        
        
    }
    public void loadtable(Statement stmt) throws SQLException{
        String queryString2 = "SELECT patient_name, patient_requesttype, patient_requestvalue, request_status FROM patientrequests where hospital_username = '" + hname + "'";
            ResultSet results2 = stmt.executeQuery(queryString2);
            String pname;
            String retype;
            String reqvalue;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             while (model.getRowCount()>0)
          {
             model.removeRow(0);
          }
            while (results2.next()) {
             pname = results2.getString(1);
             retype = results2.getString(2);
             reqvalue = results2.getString(3);
             reqstatus = results2.getString(4);
             model = (DefaultTableModel) jTable1.getModel();
             
             String data1[] = {pname, retype,reqvalue,reqstatus};
             
             model.addRow(data1);
         
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Send Request To Blood/Organ Bank");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Blood/Organ", "Entity Type", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton12.setBackground(new java.awt.Color(0, 102, 102));
        jButton12.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButton12.setText("Sent Request");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            // TODO add your handling code here:
            System.out.println("send request to bank button clicked");
                reqstatus = "Sent to Bank";
                Statement stmt = con.createStatement();
            
                String queryString = "SELECT patient_username FROM patient where patient_name = '" + selectedpname + "'" ;
                ResultSet results = stmt.executeQuery(queryString);
            while (results.next()) {
             puname = results.getString(1);

         
            }
                String sql = "update patientrequests set request_status = '" + reqstatus +"' where patient_username ='" + puname+"' and patient_requesttype ='"+  selectedentitytype + "' and patient_requestvalue='" + selectedentityvalue +"' and request_status = 'Open'" ;  
                
                PreparedStatement statement = con.prepareStatement(sql);
                
                
                int i = statement.executeUpdate();
                
        System.out.println("inserted into request" + i);
        } catch (SQLException ex) {
            Logger.getLogger(HospitalSendRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
          System.out.println("in button end"+selectedpname+ selectedentitytype+selectedentityvalue);
         
        try {
            //again retrive from patient request
            //insert into jtable
            loadtable(this.stmt);
        } catch (SQLException ex) {
            Logger.getLogger(HospitalSendRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Request sent to Bank");
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        
        DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
        
         selectedpname = tblmodel.getValueAt(jTable1.getSelectedRow(),0).toString();
         selectedentitytype = tblmodel.getValueAt(jTable1.getSelectedRow(),1).toString();
         selectedentityvalue = tblmodel.getValueAt(jTable1.getSelectedRow(),2).toString();
         reqstatus = tblmodel.getValueAt(jTable1.getSelectedRow(),3).toString();
        System.out.println(selectedpname+ selectedentitytype+selectedentityvalue);
        
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
