package com.bitlabs.DepartmentTTT;
import java.util.List;
public class Department {
private String id;
private String name;
private List<Employee> employees;

public Department()
{
	
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Employee> getEmployees() {
	return employees;
}

public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}

public Department(String id, String name, List<Employee> employees) {
	this.id = id;
	this.name = name;
	this.employees = employees;
}
public void addEmployee(List<Employee> employee)
{
	this.employees=(List<Employee>) employee;
}

@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
}

}
