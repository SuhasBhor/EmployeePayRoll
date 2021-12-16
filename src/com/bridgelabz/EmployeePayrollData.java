package com.bridgelabz;

public class EmployeePayrollData {
	//Initialize Variable
	int id;
	String name;
	double salary;
	
	//Parameterized Constructor
	public EmployeePayrollData(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayroll [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
