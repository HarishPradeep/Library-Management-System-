/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read.with.us;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class reservedBK extends javax.swing.JFrame {

    /**
     * Creates new form reservedBK
     */
    public reservedBK() {
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

        jPanel1 = new javax.swing.JPanel();
        bId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bkid2 = new javax.swing.JTextField();
        memid = new javax.swing.JTextField();
        memname = new javax.swing.JTextField();
        bkid = new javax.swing.JTextField();
        bkname = new javax.swing.JTextField();
        issuedate = new javax.swing.JTextField();
        bkname2 = new javax.swing.JTextField();
        enddate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        today = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        off = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 102), 2), "Reserve Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setLayout(null);
        jPanel1.add(bId);
        bId.setBounds(120, 40, 140, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("M:\\Icons\\search_24px_29037_easyicon.net.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 40, 40, 30);

        bkid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkid2ActionPerformed(evt);
            }
        });
        jPanel1.add(bkid2);
        bkid2.setBounds(120, 340, 140, 30);
        jPanel1.add(memid);
        memid.setBounds(120, 100, 140, 30);
        jPanel1.add(memname);
        memname.setBounds(120, 140, 140, 30);
        jPanel1.add(bkid);
        bkid.setBounds(120, 180, 140, 30);
        jPanel1.add(bkname);
        bkname.setBounds(120, 220, 140, 30);
        jPanel1.add(issuedate);
        issuedate.setBounds(120, 260, 140, 30);
        jPanel1.add(bkname2);
        bkname2.setBounds(120, 380, 140, 30);
        jPanel1.add(enddate);
        enddate.setBounds(120, 300, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("Book Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 380, 70, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("Member ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 70, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setText("Member Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 140, 90, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("Book Id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 180, 60, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setText("Book Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 220, 70, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setText("Issued Date");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 260, 80, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("End Date");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 300, 70, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 0));
        jLabel9.setText("Book Id");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 340, 60, 15);
        jPanel1.add(today);
        today.setBounds(120, 420, 140, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Date");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 430, 34, 14);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(120, 460, 90, 30);

        off.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        off.setForeground(new java.awt.Color(102, 102, 0));
        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });
        jPanel1.add(off);
        off.setBounds(270, 340, 81, 23);

        jButton3.setIcon(new javax.swing.ImageIcon("M:\\Icons\\arrow-back-icon.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(320, 460, 40, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        ResultSet rs;
        String id = bId.getText(); // Get Borrow Book ID
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
          
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
          PreparedStatement ps = con.prepareStatement("select * from borrowbk where borrowID=?");
          ps.setString(1, id);
           rs = ps.executeQuery();
                   
           while(rs.next())
           {
               memid.setText(rs.getString(3));
               memname.setText(rs.getString(4));
               bkid.setText(rs.getString(5));
               bkname.setText(rs.getString(6));
               issuedate.setText(rs.getString(7));
               enddate.setText(rs.getString(8));
               bkid2.setText(rs.getString(9));
               bkname2.setText(rs.getString(10));
               
           }
           
           
        
         }
         catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(reservedBK.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void bkid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bkid2ActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        // TODO add your handling code here:
        if(off.isSelected())
        {
            bkid2.enable(false);
        bkname2.enable(false);
        }
        else
        {
        
        bkname2.disable();
        bkid2.disable();
        }
    }//GEN-LAST:event_offActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(off.isSelected())
        {
              // Date Set For Execution
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());   
            Calendar c = Calendar.getInstance();
            String duedate = enddate.getText();
            String currentDate = sdf.format(today.getDate());  
            
            // Connection Strings
              
        Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");  
        } catch (SQLException ex) 
        {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
            try {
                // Insert
             PreparedStatement ps = con.prepareStatement("INSERT INTO return_bk(borrow_id,mem_id,mem_name,bk_id,bk_name,issue_date,end_date,bk_id_2,bk_name_2,submit_date,charge) values(?,?,?,?,?,?,?,?,?,?,?)");
             ps.setInt(1, Integer.parseInt(bId.getText()));
             ps.setInt(2, Integer.parseInt(memid.getText()));
             ps.setString(3, memname.getText());
             ps.setInt(4, Integer.parseInt(bkid.getText()));
             ps.setString(5, bkname.getText());
             ps.setString(6, issuedate.getText());
             ps.setString(7, enddate.getText());
             ps.setInt(8,0);
             ps.setString(9, "none");
             
         
           String todaydate = sdf.format(today.getDate()); //Today Date
           ps.setString(10, todaydate);
           
           //Do Try-Catch Method
                try {
                    Date dueDate = sdf.parse(duedate); //Due Date
                    Date submitdate = sdf.parse(currentDate); //Submit Date
                    
                    if(dueDate.before(submitdate)) //Check 
                    {
                          int days = daysBetween(dueDate,submitdate); //Count Days
                          double charge = days * 5; //Charge Payments
                          ps.setDouble(11, charge);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(reservedBK.class.getName()).log(Level.SEVERE, null, ex);
                }
           
           ps.execute(); 
           
           ImageIcon icon = new ImageIcon("M:\\Icons/success-icon.png"); 
           JOptionPane.showMessageDialog(null, " Book Successfully Returned !","Success",JOptionPane.PLAIN_MESSAGE,icon);
          
              
                             
            }
            catch (SQLException ex) {
                Logger.getLogger(reservedBK.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try
            {
           PreparedStatement ms = con.prepareStatement("DELETE FROM borrowbk WHERE borrowID = ?");
           ms.setInt(1,Integer.parseInt(bId.getText()));
           ms.execute();
           bId.setText("");
           memid.setText("");
           memname.setText("");
           bkid.setText("");
           bkname.setText("");
           issuedate.setText("");
           enddate.setText("");
           
           
            }
            catch (SQLException ex) {
                Logger.getLogger(reservedBK.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
        }
        else
        {
             // Date Set For Execution
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());   
            Calendar c = Calendar.getInstance();
            String duedate = enddate.getText();
            String currentDate = sdf.format(today.getDate());  
            
            // Connection Strings
              
        Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");  
        } catch (SQLException ex) 
        {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
            try {
                // Insert
             PreparedStatement ps = con.prepareStatement("INSERT INTO return_bk(borrow_id,mem_id,mem_name,bk_id,bk_name,issue_date,end_date,bk_id_2,bk_name_2,submit_date,charge) values(?,?,?,?,?,?,?,?,?,?,?)");
             ps.setInt(1, Integer.parseInt(bId.getText()));
             ps.setInt(2, Integer.parseInt(memid.getText()));
             ps.setString(3, memname.getText());
             ps.setInt(4, Integer.parseInt(bkid.getText()));
             ps.setString(5, bkname.getText());
             ps.setString(6, issuedate.getText());
             ps.setString(7, enddate.getText());
             ps.setInt(8,Integer.parseInt(bkid2.getText()));
             ps.setString(9, bkname2.getText());
             
         
           String todaydate = sdf.format(today.getDate());
           ps.setString(10, todaydate);
           
           
                try {
                    Date dueDate = sdf.parse(duedate);
                    Date submitdate = sdf.parse(currentDate);
                    
                    if(dueDate.before(submitdate))
                    {
                          int days = daysBetween(dueDate,submitdate);
                          double charge = days * 10;
                          ps.setDouble(11, charge);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(reservedBK.class.getName()).log(Level.SEVERE, null, ex);
                }
           
           ps.execute(); 
           
           ImageIcon icon = new ImageIcon("M:\\Icons/success-icon.png"); 
           JOptionPane.showMessageDialog(null, " Book Successfully Returned !","Success",JOptionPane.PLAIN_MESSAGE,icon);
          
              
                             
            }
            catch (SQLException ex) {
                Logger.getLogger(reservedBK.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try
            {
           PreparedStatement ms = con.prepareStatement("DELETE FROM borrowbk WHERE borrowID = ?");
           ms.setInt(1,Integer.parseInt(bId.getText()));
           ms.execute();
           bId.setText("");
           memid.setText("");
           memname.setText("");
           bkid.setText("");
           bkname.setText("");
           issuedate.setText("");
           enddate.setText("");
           bkid2.setText("");
           bkname2.setText("");
           
           
            }
            catch (SQLException ex) {
                Logger.getLogger(reservedBK.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Books bk = new Books();
        bk.show();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(reservedBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservedBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservedBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservedBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservedBK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bId;
    private javax.swing.JTextField bkid;
    private javax.swing.JTextField bkid2;
    private javax.swing.JTextField bkname;
    private javax.swing.JTextField bkname2;
    private javax.swing.JTextField enddate;
    private javax.swing.JTextField issuedate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField memid;
    private javax.swing.JTextField memname;
    private javax.swing.JCheckBox off;
    private com.toedter.calendar.JDateChooser today;
    // End of variables declaration//GEN-END:variables

    private int daysBetween(Date dueDate, Date submitdate) {
        return (int)( (submitdate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24));
        }
}
