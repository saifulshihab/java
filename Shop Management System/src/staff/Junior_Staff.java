package staff;

import java.util.ArrayList;

import main.Product;

public class Junior_Staff extends Staff{

	public Junior_Staff(int si, String n, int wh, int s) {
		super(si, n, wh, s);
		 
	}
	public void check_product_price( ArrayList<Product> ap){  
        for(Product a : ap){
                System.out.println("Product "+"("+a.getPID()+")"+" price is :"+ a.getP_Price());
            }
        
         
    } 

}
