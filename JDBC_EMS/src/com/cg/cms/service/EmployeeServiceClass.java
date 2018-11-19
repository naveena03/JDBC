package com.cg.cms.service;

import java.util.HashSet;
import java.util.regex.Pattern;

import com.cg.cms.dao.EmployeeDaoClass;
import com.cg.cms.dao.EmployeeDaoInterface;
import com.cg.cms.dto.Employee;
import com.cg.cms.exceptionHandling.UserException;
//import com.cg.cms.util.CollectionUtil;

public class EmployeeServiceClass implements EmployeeServiceInterface{
EmployeeDaoInterface dao=null;
public EmployeeServiceClass()
{
dao=new EmployeeDaoClass();	
}
	@Override
	public int addEmployee(Employee ee) throws UserException {
		return dao.addEmployee(ee);
		
	}

	@Override
	public HashSet<Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		return dao.fetchAllEmp();
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return dao.getEmpById(empId);
	}

	@Override
	public Employee searchEmpByName(String name) {
		// TODO Auto-generated method stub
		return dao.searchEmpByName(name);
	}

	@Override
	public Employee deleteEmp(int empId) {
		
		
		return dao.deleteEmp(empId);
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		return dao.updateEmp(empId, newName, newSal);
	
	}

	@Override
	public boolean validateDigit(int num) throws UserException {
		Integer input=new Integer(num);
		String inputStr=input.toString();
		String digitPattern="[0-9]+";
		if(Pattern.matches(digitPattern, inputStr))
		{
			return true;
		}
				
		else
		{
			throw new UserException("Invalid Input"+"Only Digits are allowed ex 4567");
		}
	}

	@Override
	public boolean ValidateName(String name) throws UserException {
		String namePattern="[A-Z][a-z]+";
		if(Pattern.matches(namePattern, name))
		{
			return true;
		}
		else
		{
			throw new UserException("Invalid Input");
		}
		
	}

}
