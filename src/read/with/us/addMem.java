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
public class addMem {
    private int id;
    private String name;
    private String address;
    private int phone;
    private String pass;
    
    public void insert(int id,String name,String add,int phone,String pass)
    {
        this.id = id;
        this.name = name;
        this.address = add;
        this.phone = phone;
        this.pass = pass;
        
         Connection con = null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
           
          
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
        
       //Try-Catch Method
        try {
            //Insert Query
            PreparedStatement ps = con.prepareStatement("INSERT INTO mem(id,nam,address,phone,pass) values(?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, add);
            ps.setInt(4, phone);
            ps.setString(5, pass);
            ps.execute();
            
            ImageIcon icon = new ImageIcon("M:\\Icons/success-icon.png"); //Set Image Icon
            JOptionPane.showMessageDialog(null, " Data Successfully Inserted !","Success",JOptionPane.PLAIN_MESSAGE,icon);
            
          
              
        } catch (SQLException ex) {
            Logger.getLogger(Memeber.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public int getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAdd()
    {
        return address;
    }
    public int getPhone()
    {
        return phone;
    }
    
    public String getPass()
    {
        return pass;
    }
    
}
