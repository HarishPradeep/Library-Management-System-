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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class availableBK extends javax.swing.JFrame {

    /**
     * Creates new form availableBK
     */
    public availableBK() {
        initComponents();
        p1();
        p2();
        p3();
    }
    
    void p1()
    {
         Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
          
        } catch (SQLException ex) {
            Logger.getLogger(fine.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PreparedStatement ps = con.prepareStatement("select count(*) from book");
            ResultSet result = ps.executeQuery();
            result.next();
            String count = result.getString(1);
            p1.setText(count);
            
        } catch (SQLException ex) {
            Logger.getLogger(fine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     void p2()
    {
         Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
          
        } catch (SQLException ex) {
            Logger.getLogger(fine.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PreparedStatement ps = con.prepareStatement("select count(*) from borrowbk");
            ResultSet result = ps.executeQuery();
            result.next();
            String count = result.getString(1);
            int a = Integer.parseInt(count);
            int num = a *2;
            String cou = String.valueOf(num);
            p2.setText(cou);
            
        } catch (SQLException ex) {
            Logger.getLogger(fine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      void p3()
    {
         Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
          
        } catch (SQLException ex) {
            Logger.getLogger(fine.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PreparedStatement ps = con.prepareStatement("select count(*) from return_bk");
            ResultSet result = ps.executeQuery();
            result.next();
            String count = result.getString(1);
            int a = Integer.parseInt(count);
            int num = a *2;
            String cou = String.valueOf(num);
            p3.setText(cou);
            
        } catch (SQLException ex) {
            Logger.getLogger(fine.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        p1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        p2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        p3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("M:\\Assignments\\3rd Assignments\\JAVA\\Images\\logo3.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 20, 90, 60);

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/read/with/us/Book-icon.png"))); // NOI18N
        jLabel2.setText("RETURN BOOKS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 120, 140, 30);

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        p1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        p1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(p1)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(p1)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(60, 160, 120, 120);

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("M:\\Icons\\Marvel-Book-icon.png")); // NOI18N
        jLabel3.setText("AVAILABLE BOOKS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 120, 140, 30);

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        p2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        p2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(p2)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(p2)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(220, 160, 120, 120);

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/read/with/us/book-icon (1).png"))); // NOI18N
        jLabel4.setText("BORROW BOOKS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 110, 150, 40);

        jPanel5.setBackground(new java.awt.Color(51, 0, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        p3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        p3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(p3)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(p3)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(390, 160, 120, 120);

        jButton1.setIcon(new javax.swing.ImageIcon("M:\\Icons\\arrow-back-icon.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 290, 40, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Books().show();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(availableBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(availableBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(availableBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(availableBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new availableBK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    // End of variables declaration//GEN-END:variables
}
