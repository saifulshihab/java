 
package manager;

import java.util.ArrayList;

import employee.Junior_Employee;
import staff.Junior_Staff;

public class Junior_Manager extends Manager implements IjuniorManager {
    
    public Junior_Manager(int id, String name, int working_hour, int working_days, int salary, int bonus) {
        super(id, name, working_hour, working_days, salary, bonus);
    }

	@Override
	public void check_Junior_Employee_Bonus(ArrayList<Junior_Employee> aje) {
		for(Junior_Employee a : aje) {
			if(a.performance.equals("Good")) {
				a.setBonus(5000);
			}else {
				a.setBonus(3000);
			}
			System.out.println("Junior Employee "+"("+a.getID()+")"+ " bonus is :"+a.getBonus());
		}
		
	}
    
	public void check_Junior_Staff_Salary(ArrayList<Junior_Staff> ajs) {
    	for(Junior_Staff a : ajs) {
    		if(a.work_hour>4) {
    			a.setSalary(4000);
    		}else {
    			a.setSalary(2000);
    		}
    		System.out.println("Junior Staff "+"("+a.getID()+")"+ " salary is :"+a.getSalary());
    	}	                                                  
    }     
    
    
    
}
