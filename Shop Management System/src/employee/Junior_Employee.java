  
package employee;

import customer.*;
import java.util.ArrayList;

 public class Junior_Employee extends Employee{

	public Junior_Employee(int id, String name, int working_hour, int working_days, int salary, String p,int bonus) {
		super(id, name, working_hour, working_days, salary,p, bonus);
		 
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

	 
	

	 
	 
  
}
