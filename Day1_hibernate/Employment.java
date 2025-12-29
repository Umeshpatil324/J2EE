package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // ----> automatically generate table
@Table(name = "empData")   //   --->provide name for table
public class Employment {
	@Id     //  ---->mark as primary key
	int empID;
	String empName;
	String email;
	long number;
	String department;
	String salary;
	String city;
	
	
	public Employment() {
		
	}


	public Employment(int empID, String empName, String email, long number, String department, String salary,
			String city) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.email = email;
		this.number = number;
		this.department = department;
		this.salary = salary;
		this.city = city;
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getNumber() {
		return number;
	}


	public void setNumber(long number) {
		this.number = number;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Employment [empID=" + empID + ", empName=" + empName + ", email=" + email + ", number=" + number
				+ ", department=" + department + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
	

}
