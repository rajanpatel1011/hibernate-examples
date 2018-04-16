package com;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	private int EmpId;
	private String EmpName;
	private int age;

	public Employee() {
		super();
	}
	
	public Employee(int EmpId, String EmpName, int age) {
		super();
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.age = age;
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
