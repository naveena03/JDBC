package com.cg.cms.dao;

public interface QueryMapper {
	public static final String SELECTQRY="SELECT* FROM emp112082";
	public static final String INSERTQRY1="INSERT INTO emp112082 VALUES(3,'Sunil',34000,12-jan-2018)";
	public static final String INSERTQRY2="INSERT INTO emp112082(emp_id,emp_name,emp_sal)" +"VALUES(444,'amit', 6000)";
	public static final String INSERTQRY3="INSERT INTO emp112082(emp_id,emp_name,emp_sal)" +"VALUES(?,?,?)";
	public static final String DELETEQUERY1 = "DELETE FROM emp112082 WHERE emp_id = ?";
	public static final String UPDATEQUERY1 = "UPDATE emp112082 set emp_name=?,emp_sal=? where emp_id=?";

}
