 
package employee;
 import java.util.ArrayList;

import customer.*;
 

   abstract public class Employee {
    
    private int id;
    public int working_hour,working_days;
    private int salary,bonus;
    String name;
    public String performance;
    
     Employee(int id,String name,int working_hour,int working_days, int salary, String p,int bonus){
        
        this.id=id;
        this.name=name;
        this.working_hour=working_hour;
        this.working_days=working_days;
        this.salary=salary;
        this.bonus=bonus;
        performance=p;
    }
    
   public int getID(){
        return id;
    }
    public int getSalary() {
    	return salary;
    }
    public int getBonus() {
    	return bonus;
    }
    public void setSalary(int x) {
    	salary=x;
    }
    public void setBonus(int x) {
    	bonus=x;
    }
    
    abstract void check_Reguler_Customer_discount(ArrayList<Reguler_Customer> arc); 
    abstract void check_New_Customer_discount(ArrayList<New_Customer> anc);
    
    
    
    
    
}
