package com.cg.cms.ui;

import java.util.HashSet;
import java.util.TreeSet;

import com.cg.cms.dto.Employee;

public class EmployeeUI {
public static void main(String[] args) {
	HashSet<Employee> names=new HashSet<Employee>();
	names.add(new Employee(101,"ishu",3000.0F));
	names.add(new Employee(102,"shubh",5000.0F));
	names.add(new Employee(103,"mittal",8000.0F));
	names.add(new Employee(103,"mittal",8000.0F));
	System.out.println(names);
	System.out.println("*****************");
	TreeSet<String> cities=new TreeSet<String>();
	cities.add("pune");
	cities.add("delhi");
	cities.add("sang");
	cities.add("mumbai");
	cities.add("pune");
	System.out.println(cities);
	System.out.println("*****************");
	TreeSet<Employee> emp =new TreeSet<Employee>();
	emp.add(new Employee(101,"ishu",3000.0F));
	emp.add(new Employee(102,"shubh",5000.0F));
	emp.add(new Employee(103,"mittal",8000.0F));
	emp.add(new Employee(103,"mittal",8000.0F));
	System.out.println(emp);
}
}

