package main;
import java.util.ArrayList;
import manager.*;

public class Administrator {

	
	public void set_Senior_Manager_Salary( ArrayList<Senior_Manager> asm) {
		for(Senior_Manager a : asm) {
			 
			if(a.working_hour>8 && a.working_days>20) {
				a.setSalary(50000);
			}else {
				a.setSalary(30000);
			}
			System.out.println("Senior Manager "+"("+a.getID()+")"+ " salary is :"+a.getSalary());
		}
	
 
	}
	public void set_Senior_Manager_Bonus( ArrayList<Senior_Manager> asm) {
		for(Senior_Manager a : asm) {
			 
			if(a.experience>3 && a.performance.equals("Good")) {
				a.setBonus(5000);			
			}else {
				a.setBonus(2000);
			}
			System.out.println("Senior Manager "+"("+a.getID()+")"+ " Bonus is :"+a.getBonus());
			
		}
 
	}
	
	
	
	public void set_Junior_Manager_Salary( ArrayList<Junior_Manager> ajm) {
		for(Junior_Manager a : ajm) {
			 
			if(a.working_hour>5 && a.working_days>15) {
				a.setSalary(40000);
				
			}else {
				a.setSalary(20000);
			}
			System.out.println("Junior Manager "+"("+a.getID()+")"+ " salary is :"+a.getSalary());
 
		}
	 
	}
	public void set_Junior_Manager_Bonus( ArrayList<Junior_Manager> ajm) {
		for(Junior_Manager a : ajm) {
		 
			if(a.getID()>=1 && a.getID()<=3) {
				a.setBonus(3000);				
			}else {
				a.setBonus(1000);		
			}
			System.out.println("Junior Manager "+"("+a.getID()+")"+ " bonus is :"+a.getBonus());
 
		}
	}
	
	
	
	
	
}
