package com.bitlabs.DepartmentTTT;

public class Employee {
    private String id;
    private String name;
    private Department department;

    public Employee() {}

    public Employee(String id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

}
 