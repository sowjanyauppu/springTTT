package com.bitlabs.EmployeeTTT;
import java.util.*;
public class EmployeeServices {
private List<Employee> employees;
public EmployeeServices(List<Employee> employees) {
	super();
	this.employees = employees;
}
public void setEmployees(List<Employee> employees) {
    this.employees = employees;
}
public void displayEmployeeDetails() {
    for (Employee employee : employees) {
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println();
    }
}
    
    public void displayEmployeesByDesignation(String designation) {
        for (Employee employee : employees) {
            if (employee.getDesignation().equals(designation)) {
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Designation: " + employee.getDesignation());
                System.out.println();
            }
            else
            	System.out.println("there are no employee found with that designation");
            	
}
}
}

