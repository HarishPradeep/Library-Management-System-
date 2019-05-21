/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read.with.us;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class removeMem extends Members{
    
   @Override 
   void remove(int id) //Class Name
   {
       //Connection
        Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
          
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Try-Catch Method
       try {
           PreparedStatement ps = con.prepareStatement("delete from mem where id=?"); //Statement
           ps.setInt(1, id);
            ps.execute();
            ImageIcon icon = new ImageIcon("M:\\Icons/success-icon.png"); 
            JOptionPane.showMessageDialog(null, " Data Successfully Deleted !","Success",JOptionPane.PLAIN_MESSAGE,icon);
       } catch (SQLException ex) {
           Logger.getLogger(removeMem.class.getName()).log(Level.SEVERE, null, ex);
       }
       finally
        {
            try {
                con.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(addMem.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        
   }
}
