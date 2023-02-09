/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.employee;

/**
 *
 * @author EL GUARDIAN
 */
public class Employeetest1 extends Employee {
    
    
public static void main(String[] args) {
        
   
  
        
      
       Employee emp1 = new Employee("Jon", "Johnson", 10000.00);
       
        Employee emp2 = new Employee("Jane", "Alonso", 9000.00);
        
        System.out.println("Employee 1 yearly salary: $" + (emp1.getMonthlySalary() * 12));
        System.out.println("Employee 2 yearly salary: $" + (emp2.getMonthlySalary() * 12));
        
        
         System.out.print(emp1.getFirstName());
        
        
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.1);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.1);
        
       System.out.println("\nEmployee 1 new yearly salary: $" + (emp1.getMonthlySalary() * 12) + "\n");
        System.out.println("Employee 2 new yearly salary: $" + (emp2.getMonthlySalary() * 12)+ "\n");
    }
}