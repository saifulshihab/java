 
package manager;

import java.util.ArrayList;

import employee.Senior_Employee;
import staff.Senior_Staff;

public class Senior_Manager extends Manager implements IseniorManager{
    
   public String performance;
    public int experience;
    
    public Senior_Manager(int id, String name, int working_hour, int working_days, int salary, int bonus,String p, int ex) {
        super(id, name, working_hour, working_days, salary, bonus);
        performance=p;
        experience=ex;
    }

	@Override
	public void check_Senior_Employee_Bonus(ArrayList<Senior_Employee> ase) {
		for(Senior_Employee a : ase) {
			if(a.experience>3 && a.performance.equals("Good")) {
				a.setBonus(10000);
			}else {
				a.setBonus(5000);
			}
			System.out.println("Senior Employee "+"("+a.getID()+")"+ " bonus is :"+a.getBonus());
		}
		
	}
	 
    public void check_Senior_Staff_Salary(ArrayList<Senior_Staff> ass) {
    	for(Senior_Staff a : ass) {
    		if(a.work_hour>4) {
    			a.setSalary(5000);
    		}else {
    			a.setSalary(2000);
    		}
    		System.out.println("Senior Staff "+"("+a.getID()+")"+ " salary is :"+a.getSalary());
    	}	                                                     ///////////////////////// overload
    }
    public void check_Senior_Staff_Salary(int id, ArrayList<Senior_Staff> ass) {
    	for(Senior_Staff a : ass) {
    		if(id>=1 && id <=5) {
    		if(a.work_hour>4) {
    			a.setSalary(6000);
    		}else {
    			a.setSalary(3000);
    		}
    		System.out.println("Senior Staff "+"("+a.getID()+")"+ " salary is :"+a.getSalary());
    	}	
    }
  }
    
    
}
 
 
