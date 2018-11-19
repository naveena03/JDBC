package com.cg.cms.junit;

import junit.framework.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.cms.dao.EmployeeDaoClass;
import com.cg.cms.dto.Employee;
import com.cg.cms.exceptionHandling.UserException;

public class EmployeeDaoImp1Test {

	    static EmployeeDaoClass empdao=null;
	    @Before
	    
	    public static void setup()
	    {
	    	
	    	empdao=new EmployeeDaoClass();
	    	
	    	
	    }
	    @Test
	    public void addEmpTest() throws UserException
	    {
	    	Assert.assertEquals(111,empdao.addEmployee(new Employee(111,"aaa",1111.0F)));
	    	
	    	
	    	
	    }
}
