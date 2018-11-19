package com.cg.cms.dto;

public class Employee implements Comparable<Employee> {
private int empId;
private String empName;
private float empSalary;
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary="
			+ empSalary + "]";
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}
public float getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(float empSalary) {
	this.empSalary = empSalary;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public boolean equals(Object obj)
{Employee emp=(Employee)obj;
if(emp.empId==this.empId)
{
	return true;}
else
	return false;
	
}
@Override
public int hashCode()
{return empId;
	}
public Employee(int empId, String empName, float empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
}
@Override
public int compareTo(Employee emp) {
	if(emp.empId<this.empId)
	{
		return 1;
	}
	if(emp.empId==this.empId)
	return 0;
	else
		return -1;
}

}
