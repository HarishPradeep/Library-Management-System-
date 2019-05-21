/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read.with.us;

/**
 *
 * @author user
 */
public class Members {
    private String name;
    private String address;
    private int phone;
    private String pass;
    private int id;
    
    void update(String name,String address,int phone,String pass,int id)
    {
        //Update Method
    }
    
    void remove(int id)
    {
        this.id = id;
       
    }
    
    public String getName()
    {
        return name;
    }
     public String getAdd()
    {
        return address;
    }
      public String getPass()
    {
        return pass;
    }
      
      public int getPhone()
      {
          return phone;
      }
      
      public int getID()
      {
          return id;
      }
      
      
      
    
      
      
}
