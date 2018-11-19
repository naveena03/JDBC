package com.cg.cms.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;




import com.cg.cms.dto.Employee;
import com.cg.cms.exceptionHandling.UserException;
import com.cg.cms.service.EmployeeServiceClass;
import com.cg.cms.service.EmployeeServiceInterface;

public class EmployeeClient {
	static Scanner sc=null;
	static EmployeeServiceInterface empSer=null;
public static void main(String[] args) {
	sc=new Scanner(System.in);
	empSer=new EmployeeServiceClass();
	int choice=0;
	
	while(true)
	{ 
		
		System.out.println("What you wan to do?");
		System.out.println("1:Add Emp \t2:Fetch All");
		System.out.println("3:Delete Emp \t4:Search Emp By Id");
		System.out.println("5:Search Emp By Name \t6:Update Emp");
		System.out.println("7:Exit");
		System.out.println("enter ur choice");
		choice=sc.nextInt();
switch(choice)
{
case 1:addEmp();
break;
case 2:showEmpInfo();break;
case 3:deleteEmp();break;
case 4:searchEmpById();break;
case 5:searchEmployeeByName();
break;
case 6:updateEmp();break;
}


	}
}
private static void updateEmp() {
	System.out.println("enter id to update");
	int d=sc.nextInt();
	System.out.println("enter name to update");
	String n=sc.next();
	System.out.println("enter salary to update");
	float f=sc.nextFloat();
	Employee e=empSer.updateEmp(d,n,f);
	
	
}
private static void deleteEmp() {
	System.out.println("Enter the empId");
	int n=sc.nextInt();
	Employee e=empSer.deleteEmp(n);
	System.out.println(e);
	
	
}
private static void searchEmployeeByName() {
	
	System.out.println("Enter emp Name");
	String n=sc.next();
	Employee e=empSer.searchEmpByName(n);
	
}
private static void searchEmpById() {
	System.out.println("Enter emp Id");
	int n=sc.nextInt();
	Employee e=empSer.getEmpById(n);
	System.out.println(e);
	
}
private static void showEmpInfo() {
	HashSet<Employee> empSet=empSer.fetchAllEmp();
	System.out.println("------------------");
	Iterator<Employee> it=empSet.iterator();
	System.out.println("-----------------");
	System.out.println("empId\tempNmae\tEmpSal");
	while(it.hasNext())
	{
		Employee ee=it.next();
		System.out.println(ee.getEmpId()+"\t\t"+ee.getEmpName()+"\t\t"+ee.getEmpSalary());
	}
	System.out.println("-------------------");
}
private static void addEmp() {
	System.out.println("enter empId");
	int eid=sc.nextInt();
	try {
		if(empSer.validateDigit(eid))
		{
			System.out.println("enter name");
			String name=sc.next();
			if(empSer.ValidateName(name))
			{
				System.out.println("enter Salary");
				float sal=sc.nextFloat();
				Employee ee=new Employee(eid,name,sal);
				int empId=empSer.addEmployee(ee);
				System.out.println(empId+"Added Successfully");
						
			}
		}
	} catch (UserException e) {
		
		e.printStackTrace();
	}
	
}
}
