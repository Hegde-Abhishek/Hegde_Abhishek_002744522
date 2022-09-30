/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class EmployeesHistory {
    
    private ArrayList<Employee> empHistory;
    
    public EmployeesHistory() {
        this.empHistory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmpHistory() {
        return empHistory;
    }

    public void setEmpHistory(ArrayList<Employee> empHistory) {
        this.empHistory = empHistory;
    }
    
    
    
}
