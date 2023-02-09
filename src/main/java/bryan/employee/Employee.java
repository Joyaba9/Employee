/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bryan.employee;

/**
 *
 * @author EL GUARDIAN
 */
public class Employee {

    


    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    public Employee() {
        this.firstName = "None";
        this.lastName = "None";
        this.monthlySalary = 0.0;
    }
    
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public double getMonthlySalary() {
        return monthlySalary;
    }
}
