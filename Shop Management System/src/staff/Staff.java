 
package staff;
 
import java.util.ArrayList;

import main.Product;

public class Staff {
    
    private int sid;
    String name;
   public int work_hour;
   private int salary; 
    
    public Staff(int si, String n, int wh, int s){
        sid=si;
        name=n;
        work_hour=wh;
        salary=s;
        
    }
    
    public void check_product_stock( ArrayList<Product> ap){  
        for(Product a : ap){
                System.out.println("There are "+a.get_stock()+" "+ a.getPID()+ " Product");
            }
        
    
    }
    
    public int getID() {
    	return sid;
    }
    public int getSalary() {
    	return salary;
    }
    public void setSalary(int a ) {
    	salary=a;
    }
    
    
    
}
