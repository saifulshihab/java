 
package employee;
 
import customer.*;
import java.util.ArrayList;

public class Senior_Employee extends Employee implements IseniorEmployee{
    
     
    public int experience;
    
     public Senior_Employee(int id,String name,int working_hour,int working_days, int salary, int bonus,String p,int e){
        super(id,name,working_hour,working_days,salary,p,bonus);
         
        experience=e;
    }

	@Override
	public void check_Reguler_Customer_discount(ArrayList<Reguler_Customer> arc) {
		 for(Reguler_Customer a : arc) {
			 if(a.register.equals("Yes")) {
				 a.setDiscount(10);
				 System.out.println("Customer(reguler) "+a.getID()+" wil get 10% Discount");
			 }else {
				 System.out.println("Customer(reguler)"+a.getID()+ " is not valid for Discount");
			 }
		 }
		
	}

	@Override
	public void check_New_Customer_discount(ArrayList<New_Customer> anc) {
		 for(New_Customer a : anc) {
			 if(a.register.equals("Yes")) {
				  a.setDiscount(5);
				 System.out.println("Customer(new) "+a.getID()+" wil get 5% Discount");
			 }else {
				 System.out.println("Customer(new)"+a.getID()+ " is not valid for Discount");
			 }
		 }
		
	}

	@Override
	public void check_Reguler_Customer_Discount_rate(ArrayList<Reguler_Customer> arc) {
		for(Reguler_Customer a : arc) {
			if(a.customer_type.equals("Diamond")) {
				double x = a.getDiscount()+30;
				a.setDiscount(x);
				System.out.println("Customer(Reguler)"+"("+a.getID()+")"+" will get extra 30% discount");
			}else {
				double x = a.getDiscount()+15;
				a.setDiscount(x);
				System.out.println("Customer(Reguler)"+"("+a.getID()+")"+" will get extra 15% discount");
			}
		}
		
	}

 
   

     
}
