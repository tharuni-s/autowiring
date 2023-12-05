package com.autowiring;

public class Employee {
	int empId;
	String empName;
	String empEmail;
	Pancard pancard;
	public Employee(int empId, String empName, String empEmail, Pancard pancard) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.pancard = pancard;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public Pancard getPancard() {
		return pancard;
	}


}
