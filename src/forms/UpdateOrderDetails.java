package forms;

import Data.User;
import Data.WorkDetails;
import Database.Users;
import Database.OrderDetails;
import common.MessageBox;
import java.awt.Color;
import java.util.*;

/**
 *
 * @author Naveen
 */
public class UpdateOrderDetails extends javax.swing.JFrame {

    private List<WorkDetails> workList=null;
    public UpdateOrderDetails() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(109,197,209));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateStatus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        applianceList = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        statusList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Work Details");
        setResizable(false);

        updateStatus.setText("Update Status");
        updateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStatusActionPerformed(evt);
            }
        });

        jLabel7.setText("Appliance");

        applianceList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applianceListActionPerformed(evt);
            }
        });

        jLabel8.setText("Status");

        statusList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "COMPLETED" }));
        statusList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusListActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("Order Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(statusList, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(applianceList, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(updateStatus)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(applianceList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(statusList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(updateStatus)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStatusActionPerformed
       
       for(WorkDetails dd:workList){
             if(dd.getAppliances().get(0).equals(applianceList.getSelectedItem().toString())){
                 dd.setStatus(statusList.getSelectedItem().toString());
                 OrderDetails dbHandler=new OrderDetails();
                 if(dbHandler.updateUser(dd)){
                        MessageBox.showMessage("Successful !!!", "Order Status Update");
                        
                 }else{
                        MessageBox.showMessage("Unable To Update!!", "Order Status Update");
                    }
                 
                 
             } 
       }
       
    }//GEN-LAST:event_updateStatusActionPerformed

    private void applianceListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applianceListActionPerformed
        for(WorkDetails dd:workList){
             if(dd.getAppliances().get(0).equals(applianceList.getSelectedItem().toString())){
                 statusList.setSelectedItem(dd.getStatus());
             }
         }
        
        
    }//GEN-LAST:event_applianceListActionPerformed

    private void statusListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusListActionPerformed
       
        
        
    }//GEN-LAST:event_statusListActionPerformed

    public void setUserDetails(List<WorkDetails> workList){  
        
        this.workList=workList;
        
        for(WorkDetails dd:workList){
            applianceList.addItem(dd.getAppliances().get(0));
        }
        
        applianceList.setSelectedIndex(0);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateOrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateOrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateOrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateOrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateOrderDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> applianceList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> statusList;
    private javax.swing.JButton updateStatus;
    // End of variables declaration//GEN-END:variables
}
