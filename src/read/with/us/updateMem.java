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

/**
 *
 * @author user
 */
public class updateMem extends Members{

    @Override
    void update(String name,String add,int phone,String pass,int id)
    {
        //Initalize Connection
        Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
          
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Try-Catch Method
        try {
            //Insert Query
            PreparedStatement ps = con.prepareStatement("UPDATE mem SET nam=?,address=?, phone=?, pass=? WHERE id=?");
            ps.setString(1,name);
            ps.setString(2,add);
            ps.setInt(3,phone);
            ps.setString(4,pass);
            ps.setInt(5,id);
            ResultSet rs;
            ps.execute();
           
            ImageIcon icon = new ImageIcon("M:\\Icons/success-icon.png"); 
            JOptionPane.showMessageDialog(null, " Data Successfully Updated !","Success",JOptionPane.PLAIN_MESSAGE,icon);
            
        } catch (SQLException ex) {
            Logger.getLogger(updateMem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
