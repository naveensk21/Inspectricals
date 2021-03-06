package forms;

import Data.User;
import Data.Work;
import Data.WorkDetails;
import Data.Customer;
import Database.Customer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.text.DateFormatter;
import javax.swing.text.MaskFormatter;
import java.util.*;
import Database.Users;
import Database.OrderDetails;
import Database.Orders;
import common.MessageBox;
import java.awt.Color;
import java.awt.Component;
/**
 *
 * @author Naveen
 */
public class NewOrder extends javax.swing.JFrame {

    
    public NewOrder() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(109,197,209));
        
        Customer dbHandler=new Customer();
        List<Customer> list=dbHandler.getlistOrders();
        if(list!=null){
        for(Customer c:list){
            customerList.addItem(c.getcustomerId()+" - "+c.getFirstName()+" "+c.getLastName());
        }
        customerList.setSelectedIndex(0);
        }
        
        Users userDbHandler=new Users();
        List<User> engineersList=userDbHandler.getListOfUsers();
        if(engineersList!=null){
        for(User u: engineersList){
            if(u.getUserType().equals("Engineer")){
                engineerList.addItem(u.getId()+" - "+u.getFirstName()+" "+u.getLastName());
            }
        }
        engineerList.setSelectedIndex(0);
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

        jLabel3 = new javax.swing.JLabel();
        workDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        workType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        customerList = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        engineerList = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        appliances = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Work Order");
        setResizable(false);

        jLabel3.setText("Date");

        workDate.setPreferredSize(new java.awt.Dimension(150, 23));
        workDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workDateActionPerformed(evt);
            }
        });

        jLabel7.setText("Customer");

        jLabel1.setText("Work Type");

        workType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Installation", "Inspection" }));
        workType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Address");

        jButton1.setText("Create Work Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        customerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerListActionPerformed(evt);
            }
        });

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jLabel8.setText("Assigned To");

        engineerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engineerListActionPerformed(evt);
            }
        });

        jLabel5.setText("Appliances");

        appliances.setColumns(20);
        appliances.setRows(5);
        jScrollPane2.setViewportView(appliances);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel6.setText("New Order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(engineerList, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(107, 107, 107)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(workDate, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(80, 80, 80)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel1)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(93, 93, 93)
                                            .addComponent(jLabel2)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(workType, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(customerList, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel6)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(customerList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(workType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(workDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engineerList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void workTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           Work workDetails=new Work();
       workDetails.setAddress(address.getText());
       
       Long engineer=Long.valueOf(engineerList.getSelectedItem().toString().split("-")[0].trim());
              
       workDetails.setEngineerId(engineer);
      
       SimpleDateFormat format=null;
       Date date=null;
       try{
            format = new SimpleDateFormat("MM-dd-yyyy hh:mm");
            format.setLenient(false);
            date = format.parse(workDate.getText().trim());
            workDetails.setWorkDate(date);
       }catch(Exception e){
           MessageBox.showMessage("Wrong Date Format", "Error");
       }
       workDetails.setWorkStatus("PENDING");
       workDetails.setCustomerId(Long.valueOf(customerList.getSelectedItem().toString().split("-")[0].trim()));
       workDetails.setWorkType(workType.getSelectedItem().toString());
 
       
       
       
       WorkDetails details=new WorkDetails();
      
       details.setStatus("PENDING");
       String str[]=appliances.getText().trim().split("\n");
       List<String> appliancesList=new ArrayList<String>();
       
       if(str.length>=1 && !str[0].trim().equals(""))
       { 
           for(String st:str)
            appliancesList.add(st.trim());
           details.setAppliances(appliancesList);
            Orders workDbHandler=new Orders();
            Long workId= workDbHandler.createNewWorkOrder(workDetails);
            if(workId !=null){
             details.setWorkId(workId); 
             OrderDetails workDetailsDbHandler=new OrderDetails();
             if(workDetailsDbHandler.createNewWorkDetails(details)){
                    MessageBox.showMessage("Work Order created !!\n Word Id: "+workId, "Work Order");
                    this.dispose();
             }else{
                    MessageBox.showMessage("Unable To Create New Order !!", "Work Order");
             }
            }else{
                 MessageBox.showMessage("Unable To Create New Order !!", "Work Order");
            }
           
        }
       else{
          MessageBox.showMessage("Invalid Appliances", "Error");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerListActionPerformed

    private void engineerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engineerListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engineerListActionPerformed

    private void workDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workDateActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextArea appliances;
    private javax.swing.JComboBox<String> customerList;
    private javax.swing.JComboBox<String> engineerList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField workDate;
    private javax.swing.JComboBox<String> workType;
    // End of variables declaration//GEN-END:variables
}
