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
public class add_Book extends books_details {
    @Override
    protected void add_bk(String bk_name,int bk_id,String bk_author,String year)
    {
        Connection con = null;
        
        try 
        {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");  
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);  
        }
        
        try
        {
            PreparedStatement ps = con.prepareStatement("INSERT INTO book(id,name,year,author) values(?,?,?,?)");
            
            if(bk_name.equals(null) && bk_author.equals(null)) //If-else Statement
            {
            ImageIcon icon = new ImageIcon("M:\\Icons/danger-icon.png"); 
            JOptionPane.showMessageDialog(null, " Fill out the form ","Alert",JOptionPane.PLAIN_MESSAGE,icon);
           
            } 
            else
            {
            ps.setInt(1, bk_id);
            ps.setString(2, bk_name);
            ps.setString(3, year);
            ps.setString(4, bk_author);
            ps.execute();
            
            ImageIcon icon = new ImageIcon("M:\\Icons/success-icon.png"); 
            JOptionPane.showMessageDialog(null, " Data Successfully Inserted !","Success",JOptionPane.PLAIN_MESSAGE,icon);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(add_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                con.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(add_Book.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
         
        
    }
    
}
