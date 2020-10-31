package com.nibm.model;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	private static Employees list = new Employees();

	static {
		list.getEmployeeList().add(new Employee(1, "Darshana", "Prasad", "abc@gmail.com"));
		list.getEmployeeList().add(new Employee(2, "Alex", "Hale", "cde@gmail.com"));
		list.getEmployeeList().add(new Employee(3, "David", "Kameron", "fgh@gmail.com"));
	}
	public Employees getAllEmployees()
	{
		return list;
	}
	public void addEmployee(Employee employee)
	{
		list.getEmployeeList().add(employee);
	}
}
