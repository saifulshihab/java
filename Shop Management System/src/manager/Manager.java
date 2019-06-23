package manager;
import java.util.ArrayList;
import employee.*;
 
public class Manager {
    private int id;
    public int working_hour,working_days;
    private int salary,bonus;
    String name;
    
    Manager(int id,String name, int working_hour,int working_days, int salary, int bonus){
        
        this.id=id;
        this.name=name;
        this.working_hour=working_hour;
        this.working_days=working_days;
        this.salary=salary;
        this.bonus=bonus;
    }
    
    public int getID(){
        return id;
    }
    public int getSalary() {
    	return salary;
    }
    public void setSalary(int a) {
    	salary=a;
    }
    
    public void setBonus(int a) {
    	bonus=a;
    }
    public int getBonus() {
    	return bonus;
    }
    
    
    
    public void set_Senior_Employee_Salary(ArrayList<Senior_Employee> sem) {
    	for(Senior_Employee a : sem) {
    		if(a.working_hour>8 && a.working_days >20) {
    			a.setSalary(30000);
    		}
    	}
    }
    
    public void set_Junior_Employee_Salary(ArrayList<Junior_Employee> jem) {
    	for(Junior_Employee a : jem) {
    		if(a.working_hour>6  &&  a.working_days >15) {
    			a.setSalary(18000);
    		}
    	}
    }
    
    
    
    
    
    
    
}
