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
public class updateBook extends books_details{
    books_details bk = new books_details();
    void updateBK(String bk_name,int bk_id,String bk_author,String year)
    {
        super.set_bk_name(bk_name); //Uses of super Keyword
        bk.set_bk_author(bk_author);
        bk.set_bk_id(bk_id);
        bk.set_bk_year(year);
        Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
          
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE book SET name=?,year=?, author=? WHERE id=?");
            ps.setString(1,super.get_bk_name());
            ps.setString(2,bk.get_bk_year());
            ps.setString(3,bk.get_bk_author());
            ps.setInt(4,bk.get_bk_id());
            ps.execute();
            
            ImageIcon icon = new ImageIcon("M:\\Icons/success-icon.png"); 
            JOptionPane.showMessageDialog(null, " Data Successfully Updated !","Success",JOptionPane.PLAIN_MESSAGE,icon);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(updateMem.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
}
