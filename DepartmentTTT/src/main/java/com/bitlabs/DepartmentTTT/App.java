package com.bitlabs.DepartmentTTT;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      //  Department dept=(Department)context.getBean("department1");
        DepartmentService departmentService =(DepartmentService) context.getBean("departmentService");

        // Display details of all departments and their employees
        departmentService.displayDepartmentDetails();

        System.out.println("\nAdding a new employee to Department 2:");
        Employee newEmployee = new Employee("7", "Alex Turner", context.getBean("department2", Department.class));
        departmentService.addEmployeeToDepartment("2", newEmployee);
        
        //Display details of employees by department Id
        System.out.println("enter department Id to search");
        String deptId=sc.next();
        departmentService.displayEmployeesByDepartment(deptId);
        
        DepartmentService departmentService1 = context.getBean("departmentService", DepartmentService.class);
        departmentService1.addEmployeeToDepartment("2", departmentService.getNewEmployee());
    }
}
