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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class bookDetails extends javax.swing.JFrame {

    /**
     * Creates new form bookDetails
     */
    public bookDetails() {
        initComponents();
        display();
    }
    void display() // Display Member Details in separate Panel
    {
       
        Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
           
          
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
        try {
            PreparedStatement st = con.prepareStatement("select * from book");
            ResultSet rs = st.executeQuery();
            DefaultTableModel tb = (DefaultTableModel)bookDetails.getModel();
            tb.setRowCount(0);
            
            while(rs.next())
            {
                Object o[] = {rs.getInt("id"),rs.getString("name"),rs.getString("author"),rs.getInt("year")};
               tb.addRow(o);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookDetails = new javax.swing.JTable();
        searchid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        id = new javax.swing.JCheckBox();
        name = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        bookDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Author", "Year"
            }
        ));
        jScrollPane1.setViewportView(bookDetails);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 600, 270);
        jPanel2.add(searchid);
        searchid.setBounds(360, 30, 130, 30);

        jButton1.setIcon(new javax.swing.ImageIcon("M:\\Icons\\search_24px_29037_easyicon.net.png")); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(500, 30, 100, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("M:\\Icons\\resizeApi (2).png")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 0, 90, 110);

        jButton2.setIcon(new javax.swing.ImageIcon("M:\\Icons\\resizeApi.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(570, 400, 40, 40);

        id.setText("ID");
        jPanel2.add(id);
        id.setBounds(230, 30, 37, 23);

        name.setText("Name");
        jPanel2.add(name);
        name.setBounds(280, 30, 70, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon("M:\\Assignments\\3rd Assignments\\JAVA\\Images\\logo3.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 380, 100, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("M:\\Icons\\Wallpaper-Blur-032.jpg")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 460);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          
        
        if(id.isSelected() && name.isSelected())
        {
            //Show Erro MEssage
            ImageIcon icon = new ImageIcon("M:\\Icons/Actions-window-close-icon.png"); 
            JOptionPane.showMessageDialog(null, "Sorry ! Something went wrong","Error",JOptionPane.PLAIN_MESSAGE,icon);
        }
        else if(id.isSelected())
        {
            int id = Integer.parseInt(searchid.getText());
            Connection con = null;
            try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
           
          
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
           
        }
             try {
            PreparedStatement st = con.prepareStatement("select * from book where id=?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            DefaultTableModel tb = (DefaultTableModel)bookDetails.getModel();
            tb.setRowCount(0);
            
            while(rs.next())
            {
                Object o[] = {rs.getInt("id"),rs.getString("name"),rs.getString("author"),rs.getInt("year")};
               tb.addRow(o);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        }
        else if(name.isSelected())
        {
            String bookname= searchid.getText();
            Connection con = null;
            try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
           
          
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
           
        }
             try {
            PreparedStatement st = con.prepareStatement("select * from book where name=?");
            st.setString(1, bookname);
            ResultSet rs = st.executeQuery();
            DefaultTableModel tb = (DefaultTableModel)bookDetails.getModel();
            tb.setRowCount(0);
            
            while(rs.next())
            {
                Object o[] = {rs.getInt("id"),rs.getString("name"),rs.getString("author"),rs.getInt("year")};
               tb.addRow(o);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Books bk = new Books();
        bk.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(bookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookDetails;
    private javax.swing.JCheckBox id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox name;
    private javax.swing.JTextField searchid;
    // End of variables declaration//GEN-END:variables
}
