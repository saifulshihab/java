 
package main;
 
public class Product {
    
    private String pid;
    String p_name,p_catagory,warranty;
    private int p_price,stock;
    
    Product(String id, String n, String pc,int p, String w,int stock){
        pid=id;
        p_name=n;
        p_catagory=pc;
        p_price=p;
        warranty=w;
        this.stock=stock;
    }
    public String getPID(){
        return pid;
    }
    public int getP_Price(){
        return p_price;
    }
    public int get_stock(){
        return stock;
    }
    
}
