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
public class books_details {
    
    private String bk_name;
    private int bk_id;
    private String bk_author;
    private String bk_year;
    
    protected void add_bk(String bk_name,int bk_id,String bk_author,String year)
    {
        //Override in add_Book 
    }
    
    //Form a Encapsulation
    //Getter Method
    protected String get_bk_name()
    {
        return bk_name; //Return Book Name
    }
    
    protected String get_bk_author()
    {
        return bk_author;//Return Book Author
    }
    
    protected String get_bk_year()
    {
        return bk_year;//Return Book Year
    }
    
    protected int get_bk_id()
    {
        return bk_id;//Return Book ID
    }
    
    //Set Values
    //Setter Method
    protected void  set_bk_name(String bk_name)
    {
        this.bk_name = bk_name;//Set Value to Book Name
    }
    
    protected void set_bk_author(String bk_author)
    {
        this.bk_author = bk_author;//Set Value to Book Author
    }
    
    protected void set_bk_year(String bk_year)
    {
        this.bk_year = bk_year;//Set Value to Book Year
    }
    
    protected void set_bk_id(int bk_id)
    {
        this.bk_id = bk_id;//Set Value to Book ID
    }
    
    
    
}
