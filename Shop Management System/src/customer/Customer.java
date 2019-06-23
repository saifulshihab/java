 
package customer;
 
import java.util.ArrayList;
import main.Product;

public class Customer {
     
    double total_price;
    private int id;
    public String name,register;
    private double discount;
    public Customer (int id, String name,String register,double d){
        this.id=id;
       this.name=name;
       this.register=register;
       discount=d;
    }
    
    public int getID(){
        return id;
    }
    public double getDiscount() {
    	return discount;
    }
    public void setDiscount(double x) {
    	  discount=x;
    }
    
    public void buy_product(int q, String id, ArrayList<Product> ap){
        for(Product p : ap){
        if(p.getPID()  == id){
            if(q<p.get_stock()){
            	 
            	discount=(q*p.getP_Price())* getDiscount()/100;
            	System.out.println("Discount :"+ discount);
            total_price = (int) (q*p.getP_Price()-discount); 
            System.out.println("Your total price: "+total_price);
        }else {
            System.out.println("Product is not available");
        }
    } 
    }
    
}
   
    
}
