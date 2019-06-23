 
package customer;
 
public class Reguler_Customer extends Customer {
    
    public String customer_type;
    
    public Reguler_Customer(int id, String name,String register, String ct,double d) {
        super(id, name,register,d);
        customer_type=ct;
         
    }
    
}
