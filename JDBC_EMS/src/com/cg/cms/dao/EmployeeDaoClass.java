package com.cg.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;



import com.cg.cms.dto.Employee;
import com.cg.cms.exceptionHandling.UserException;
import com.cg.cms.util.DBUtil;

public class EmployeeDaoClass implements EmployeeDaoInterface{
    
    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    @Override
    public int addEmployee(Employee ee) throws UserException {
        try {
            con = DBUtil.getCon();
            pst = con.prepareStatement(QueryMapper.INSERTQRY3);
            pst.setInt(1, ee.getEmpId());
            pst.setString(2, ee.getEmpName());
            pst.setFloat(3,  ee.getEmpSalary());
            int data = pst.executeUpdate();
            if(data == 1){
                return ee.getEmpId();
            }
            else{
                return 0;
            }
        } 
        catch (Exception e) 
        {
            //e.printStackTrace();
            throw new UserException(e.getMessage());
        }
        finally{
            
        }
    }

    @Override
    public HashSet<Employee> fetchAllEmp() {
       HashSet<Employee> empset=new HashSet<Employee>();
       try{
    	   
    	   con=DBUtil.getCon();
    	   st=con.createStatement();
    	   rs=st.executeQuery(QueryMapper.SELECTQRY);
    	   while(rs.next())
    		   
    	   {
    	   int eid=rs.getInt("emp_id");
    	   String enm=rs.getString("emp_name");
    	   float sl=rs.getFloat("emp_sal");
    	   empset.add(new Employee(eid,enm,sl));
    	   
    	   }
 
    	   
    	   
    	   
       
    }
       
catch (Exception e )
       {
	e.printStackTrace();
	}
	return empset;
       }
     @Override
     public Employee getEmpById(int empId)
        {   
        
            return null;
        }

    @Override
    public Employee searchEmpByName(String name)  {
        
        return null;
    }

   // @Override
//    public int deleteEmp(int empId) {
//        
//        return 0;
//    }

    @Override
    public Employee updateEmp(int empId, String newName, float newSal) {
       
    	try {
            con = DBUtil.getCon();
            pst = con.prepareStatement(QueryMapper.UPDATEQUERY1);
            pst.setString(1, newName);
            pst.setFloat(2, newSal);
            pst.setInt(3, empId);
            int data = pst.executeUpdate();
            if(data>0){
            System.out.println("Updated Succesfully...");
            }
            else{
                System.out.println("Record Not Found");
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
                return null;
    }

@Override
public Employee deleteEmp(int empId) {
	// TODO Auto-generated method stub
	try {
        con = DBUtil.getCon();
        pst = con.prepareStatement(QueryMapper.DELETEQUERY1);
        pst.setInt(1, empId);
        int data = pst.executeUpdate();
        if(data>0){
        System.out.println("Record Deleted....");
        }
        else{
            System.out.println("Record Not Found");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
	return null;
}
    
}