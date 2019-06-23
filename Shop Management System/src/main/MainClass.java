 
package main;

 
import customer.*;
import employee.*;
import staff.*;
import manager.*;

import java.util.ArrayList;
import java.util.Scanner;

 
public class MainClass {
    
    public static void main(String [] args){
        
        
        
        
        
    Product p1 = new Product ("p1","iPhone 5s","Mobiles & Tablets",13000,"4 month",50); 
    Product p2 = new Product ("p2","HP Laptop","Computing & Gaming",45000,"1 Year",100); 
    Product p3 = new Product ("p3","Canon 1200D","TVs & Camera",80000,"1 Year",100); 
    Product p4 = new Product ("p4","Bits Earphone","Mobiles & Tablets",1500,"6 month",50); 
     ArrayList<Product> ap = new ArrayList<>();      /////////////////Product
      ap.add(p1);
      ap.add(p2);
      ap.add(p3);
      ap.add(p4);
      
      
      Reguler_Customer rc1 = new Reguler_Customer(1,"Saiful","Yes","Diamond",0);
      Reguler_Customer rc2 = new Reguler_Customer(2,"Shihab","Yes","Golden",0); 
      ArrayList<Reguler_Customer> arc = new ArrayList<>();     //////////////////Reguler Customer
       arc.add(rc1);
       arc.add(rc2);


       
      New_Customer nc1 = new New_Customer(1,"Rahim","Yes",0);
      New_Customer nc2 = new New_Customer(2,"Shamim","No",0);
      ArrayList<New_Customer> anc = new ArrayList<>();   //////////////////////New Customer
      anc.add(nc1);
      anc.add(nc2);
      
      
      
      Senior_Employee se1 = new Senior_Employee(10,"Luka",12,30,30000,2000,"Good",3);
      Senior_Employee se2 = new Senior_Employee(11,"Messi",10,30,25000,3000,"Bad",1);
      ArrayList<Senior_Employee> ase = new ArrayList<>();  //////////////////////////Senior Employee
      ase.add(se1);
      ase.add(se2);
      
      
      Junior_Employee je1 = new Junior_Employee(10,"Luka",12,30,30000,"Good",2000);
      Junior_Employee je2 = new Junior_Employee(11,"Messi",10,30,25000,"Bad",3000);
      ArrayList<Junior_Employee> aje = new ArrayList<>();         ///////////////////////Junior Emplyoee
      aje.add(je1);
      aje.add(je2);
      
      
    
      
      Senior_Staff st1 = new Senior_Staff(1,"Karim",5,2000);
      Senior_Staff st2 = new Senior_Staff(2,"Rahim",4,1500);
      ArrayList<Senior_Staff> ast = new ArrayList<>();        //////////////////////Senior Staff 
      ast.add(st1);
      ast.add(st2);
      

      Junior_Staff jt1 = new Junior_Staff(1,"Alex",3,1000);
      Junior_Staff jt2 = new Junior_Staff(2,"Hale",2,1500);
      ArrayList<Junior_Staff> ajt = new ArrayList<>();       ////////////////////////Junior Staff
      ajt.add(jt1);
      ajt.add(jt2);
 
      
      Senior_Manager sm1 = new Senior_Manager(1, "Manager1", 7, 22,  0,  0, "Good", 4);
      Senior_Manager sm2 = new Senior_Manager(2, "Manager2", 9, 24,  0,  0, "Good", 3);
      ArrayList<Senior_Manager> asm = new ArrayList<>();     ///////////////////////////Senior Manager
      asm.add(sm1);
      asm.add(sm2);

      Junior_Manager jm1 = new Junior_Manager(1, "Junior1", 6, 22,   0, 20000);
      Junior_Manager jm2 = new Junior_Manager(2, "Junior2", 8, 20,  0, 20000);
      ArrayList<Junior_Manager> ajm = new ArrayList<>();           /////////////////////////Junior Manager
      ajm.add(jm1);
      ajm.add(jm2);
      
      
      
      
      Administrator  am = new Administrator();
      
      System.out.println("-----SHOP MANAGEMENT SYSTEM-----\n");
      
      System.out.println("Administrator has 4 task:- Set Senior and Junior Manager Salary and Bonus ");
      
      am.set_Senior_Manager_Salary(asm);
      am.set_Senior_Manager_Bonus(asm);
      am.set_Junior_Manager_Salary(ajm);
      am.set_Junior_Manager_Bonus(ajm);
      
      System.out.println();
      
      System.out.println("Senior Manager has 3 task:- Check Senior Employee Bonus, Check Senior Staff Salary");
      sm1.check_Senior_Employee_Bonus(ase);
      sm1.check_Senior_Staff_Salary(ast);
      sm1.check_Senior_Staff_Salary(st1.getID(), ast);
      
      System.out.println();
      System.out.println("Junior Manager has 2 task:- Check Junior Employee Bonus and Junior Staff salary");
      jm1.check_Junior_Employee_Bonus(aje);
      jm1.check_Junior_Staff_Salary(ajt);
      
      System.out.println();
      System.out.println("Senior Employee has 3 task:- Check Reguler and New Customer Discount, Reguler Customer Discount Rate");
      se1.check_Reguler_Customer_discount(arc);
      se1.check_New_Customer_discount(anc);
      se1.check_Reguler_Customer_Discount_rate(arc);
      System.out.println();
      System.out.println("Junior Employee has 2 task:- Check Reguler and New Customer Discount ");
      je1.check_Reguler_Customer_discount(arc);
      je1.check_New_Customer_discount(anc);
      
      System.out.println();
      System.out.println("Senior Staff has 1 task:- Check product Stock");
      st1.check_product_stock(ap);
      System.out.println();
      System.out.println("Junior Staff has 2 task:- Check Product price & Stock");
      jt1.check_product_price(ap);
      System.out.println();
      jt1.check_product_stock(ap);
      
      System.out.println("\n");
      
      System.out.println("Reguler customer has 1 task:- Buy product ");
      rc1.buy_product(3, "p1", ap);
      System.out.println("New customer has 1 task:- Buy Product");
      nc2.buy_product(3, "p4", ap);
    
 
     
     
    }
    
}
