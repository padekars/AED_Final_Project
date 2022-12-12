/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patient.UI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ServicePatient;

/**
 *
 * @author Gayatri
 */
public class PatientSendRequest extends javax.swing.JPanel {
        String organ = "";
        
    /**
     * Creates new form PatientSendRequest
     */
        
    String puser;
    String pass;
    public PatientSendRequest(String username, String password) {
        initComponents();
        
         puser = username;
         pass = password;
         
        System.out.println("logged in patient "+puser+ pass);
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
        PatientSendRequestBtn = new javax.swing.JButton();
        KidneyRequestBtn = new javax.swing.JButton();
        EyesRequestBtn = new javax.swing.JButton();
        LiverRequestBtn = new javax.swing.JButton();
        PancreasRequestBtn = new javax.swing.JButton();
        IntestineRequestBtn = new javax.swing.JButton();
        LungRequestBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Send Request For Organ");

        PatientSendRequestBtn.setBackground(new java.awt.Color(0, 102, 102));
        PatientSendRequestBtn.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        PatientSendRequestBtn.setText("Send Request");
        PatientSendRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientSendRequestBtnActionPerformed(evt);
            }
        });

        KidneyRequestBtn.setBackground(new java.awt.Color(255, 102, 102));
        KidneyRequestBtn.setText("KIDNEY");
        KidneyRequestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KidneyRequestBtnMouseClicked(evt);
            }
        });
        KidneyRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KidneyRequestBtnActionPerformed(evt);
            }
        });

        EyesRequestBtn.setBackground(new java.awt.Color(102, 255, 51));
        EyesRequestBtn.setText("EYES");
        EyesRequestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EyesRequestBtnMouseClicked(evt);
            }
        });
        EyesRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EyesRequestBtnActionPerformed(evt);
            }
        });

        LiverRequestBtn.setBackground(new java.awt.Color(255, 0, 255));
        LiverRequestBtn.setText("LIVER");
        LiverRequestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LiverRequestBtnMouseClicked(evt);
            }
        });

        PancreasRequestBtn.setBackground(new java.awt.Color(0, 153, 204));
        PancreasRequestBtn.setText("PANCREAS");
        PancreasRequestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PancreasRequestBtnMouseClicked(evt);
            }
        });

        IntestineRequestBtn.setBackground(new java.awt.Color(255, 255, 0));
        IntestineRequestBtn.setText("INTESTINE");
        IntestineRequestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IntestineRequestBtnMouseClicked(evt);
            }
        });
        IntestineRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntestineRequestBtnActionPerformed(evt);
            }
        });

        LungRequestBtn.setBackground(new java.awt.Color(51, 51, 255));
        LungRequestBtn.setText("LUNG");
        LungRequestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LungRequestBtnMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock-vector-kidney-vector-illustration-754700143 (2).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock-vector-human-eye-isolated-on-white-photo-realistic-vector-illustration-250674166 (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock-vector-realistic-liver-anatomy-structure-vector-hepatic-system-organ-digestive-gallbladder-organ-human-1794723994 (1).jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock-vector-pancreas-isolated-on-white-background-medicine-concept-flat-vector-cartoon-illustration-1911536488 (1).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock-vector-human-intestines-organ-anatomy-medicine-concept-healthcare-internal-organs-of-the-human-design-1384580939 (1).jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock-vector-lung-cancer-diagram-in-detail-illustration-308751308 (1).jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(KidneyRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(171, 171, 171)
                                        .addComponent(EyesRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addGap(165, 165, 165)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LiverRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IntestineRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(170, 170, 170)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PancreasRequestBtn)
                                    .addComponent(LungRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(PatientSendRequestBtn)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(KidneyRequestBtn)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LiverRequestBtn)
                            .addComponent(PancreasRequestBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(EyesRequestBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IntestineRequestBtn)
                            .addComponent(LungRequestBtn))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(PatientSendRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PatientSendRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientSendRequestBtnActionPerformed
        // TODO add your handling code here:
        if(this.organ.equals("")){
            
        JOptionPane.showMessageDialog(this," Please select a organ");
        }
        else{
            try {
                ServicePatient s1 = new ServicePatient();
                s1.sendOrganRequest(puser,pass,organ);
            } catch (SQLException ex) {
                Logger.getLogger(PatientSendRequest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        JOptionPane.showMessageDialog(this," Request Submitted!");
    }//GEN-LAST:event_PatientSendRequestBtnActionPerformed

    private void EyesRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EyesRequestBtnActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_EyesRequestBtnActionPerformed

    private void IntestineRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntestineRequestBtnActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_IntestineRequestBtnActionPerformed

    private void KidneyRequestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KidneyRequestBtnMouseClicked
        // TODO add your handling code here:
        
        this.organ = "Kidney";
        
        
        
        
    }//GEN-LAST:event_KidneyRequestBtnMouseClicked

    private void KidneyRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KidneyRequestBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KidneyRequestBtnActionPerformed

    private void EyesRequestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EyesRequestBtnMouseClicked
        // TODO add your handling code here:
        this.organ = "Eyes";
    }//GEN-LAST:event_EyesRequestBtnMouseClicked

    private void LiverRequestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiverRequestBtnMouseClicked
        // TODO add your handling code here:
        this.organ = "Liver";
    }//GEN-LAST:event_LiverRequestBtnMouseClicked

    private void PancreasRequestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PancreasRequestBtnMouseClicked
        // TODO add your handling code here:
        this.organ = "Pancreas";
    }//GEN-LAST:event_PancreasRequestBtnMouseClicked

    private void IntestineRequestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IntestineRequestBtnMouseClicked
        // TODO add your handling code here:
        this.organ = "Intestine";
    }//GEN-LAST:event_IntestineRequestBtnMouseClicked

    private void LungRequestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LungRequestBtnMouseClicked
        // TODO add your handling code here:
        this.organ = "Lungs";
    }//GEN-LAST:event_LungRequestBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EyesRequestBtn;
    private javax.swing.JButton IntestineRequestBtn;
    private javax.swing.JButton KidneyRequestBtn;
    private javax.swing.JButton LiverRequestBtn;
    private javax.swing.JButton LungRequestBtn;
    private javax.swing.JButton PancreasRequestBtn;
    private javax.swing.JButton PatientSendRequestBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
