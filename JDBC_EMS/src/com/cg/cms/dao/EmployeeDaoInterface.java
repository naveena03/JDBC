package com.cg.cms.dao;

import java.util.HashSet;

import com.cg.cms.dto.Employee;
import com.cg.cms.exceptionHandling.UserException;

public interface EmployeeDaoInterface {
public  int addEmployee(Employee ee) throws UserException;
public HashSet<Employee> fetchAllEmp();
public Employee getEmpById(int empId);
public Employee searchEmpByName(String name);
public Employee deleteEmp(int empId);
public Employee updateEmp(int empId,String newName,float newSal);

}
