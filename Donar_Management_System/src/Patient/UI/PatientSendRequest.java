/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patient.UI;

import javax.swing.JOptionPane;

/**
 *
 * @author Gayatri
 */
public class PatientSendRequest extends javax.swing.JPanel {

    /**
     * Creates new form PatientSendRequest
     */
    public PatientSendRequest() {
        initComponents();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Send Request For Organ");

        PatientSendRequestBtn.setBackground(new java.awt.Color(0, 204, 204));
        PatientSendRequestBtn.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        PatientSendRequestBtn.setText("Send Request");
        PatientSendRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientSendRequestBtnActionPerformed(evt);
            }
        });

        KidneyRequestBtn.setText("KIDNEY");

        EyesRequestBtn.setText("EYES");
        EyesRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EyesRequestBtnActionPerformed(evt);
            }
        });

        LiverRequestBtn.setText("LIVER");

        PancreasRequestBtn.setText("PANCREAS");

        IntestineRequestBtn.setText("INTESTINE");
        IntestineRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntestineRequestBtnActionPerformed(evt);
            }
        });

        LungRequestBtn.setText("LUNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PatientSendRequestBtn)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(IntestineRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LiverRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KidneyRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EyesRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PancreasRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LungRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KidneyRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EyesRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PancreasRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LiverRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LungRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IntestineRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(PatientSendRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PatientSendRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientSendRequestBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this," Request Submitted!");
    }//GEN-LAST:event_PatientSendRequestBtnActionPerformed

    private void EyesRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EyesRequestBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EyesRequestBtnActionPerformed

    private void IntestineRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntestineRequestBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntestineRequestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EyesRequestBtn;
    private javax.swing.JButton IntestineRequestBtn;
    private javax.swing.JButton KidneyRequestBtn;
    private javax.swing.JButton LiverRequestBtn;
    private javax.swing.JButton LungRequestBtn;
    private javax.swing.JButton PancreasRequestBtn;
    private javax.swing.JButton PatientSendRequestBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
