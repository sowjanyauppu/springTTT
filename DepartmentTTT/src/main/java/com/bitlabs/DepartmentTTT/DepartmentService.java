package com.bitlabs.DepartmentTTT;
import java.util.List;

public class DepartmentService {
    private List<Department> departments;
    public DepartmentService() {}

    public DepartmentService(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public void displayDepartmentDetails() {
        for (Department department : departments) {
            System.out.println("Department ID: " + department.getId());
            System.out.println("Department Name: " + department.getName());
            System.out.println("Employees:");

            List<Employee> employees = department.getEmployees();
                        
            for (Employee employee : department.getEmployees()) {
                System.out.println("Employee ID: " + employee.getId());
                System.out.println("Employee Name: " + employee.getName());
            }

            System.out.println();
        }
    }
	public void addEmployeeToDepartment(String departmentId, Employee employee) {
        for (Department department : departments) {
            if (department.getId().equals(departmentId)) {
                department.getEmployees().add(employee);
                return;
            }
        }
        System.out.println("Department with ID " + departmentId + " does not exist.");
    }

	private Employee newEmployee;

    public void setNewEmployee(Employee newEmployee) {
        this.newEmployee = newEmployee;
    }
    public Employee getNewEmployee()
    {
    	return newEmployee;
    }
    public void displayEmployeesByDepartment(String departmentId) {
        for (Department department : departments) {
            if (department.getId().equals(departmentId)) {
                List<Employee> employees = department.getEmployees();
                System.out.println("Employees in Department with ID " + departmentId + ":");
                for (Employee employee : employees) {
                    System.out.println("  Employee ID: " + employee.getId());
                    System.out.println("  Employee Name: " + employee.getName());
                    System.out.println("---------------------------");
                }
                return;
            }
        }
        System.out.println("Department with ID " + departmentId + " does not exist.");
    }
    
}
