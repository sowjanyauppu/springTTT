package com.bitlabs.EmployeeTTT;
import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
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
       EmployeeServices employeeService = (EmployeeServices) context.getBean("employeeservices");
       System.out.println("All Employees:");
       employeeService.displayEmployeeDetails();

       System.out.println("Enter the designation of the Employees to search:");
       String designation=sc.nextLine();
       employeeService.displayEmployeesByDesignation(designation);
    }
}
