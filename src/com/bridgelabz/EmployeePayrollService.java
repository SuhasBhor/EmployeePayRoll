package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	//Initialize array list
	List<EmployeePayrollData> employeePayrollList;
	
	//Constructor
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		super();
		this.employeePayrollList = employeePayrollList;
	}
	
	//Method for reading From Console
	public void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.print("Enter Employee ID: ");
		int id = consoleInputReader.nextInt();

		System.out.print("Enter Employee Name:");
		String name = consoleInputReader.next();

		System.out.print("Enter Emplyee Salary: ");
		double salary = consoleInputReader.nextDouble();

		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}
	
	//Method For writing on Condsole
	public void writeEmployeePayrollData() {
		System.out.print("\nWriting Payroll Roaster To Console: " + employeePayrollList);
	}
	//Main Method
	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();

		EmployeePayrollService employeePayroll = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayroll.readEmployeePayrollData(consoleInputReader);
		employeePayroll.writeEmployeePayrollData();
	}
}
