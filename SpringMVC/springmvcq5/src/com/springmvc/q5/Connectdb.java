package com.springmvc.q5;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;




public class Connectdb {

public static ArrayList<EmployeeDtails> getDetails(String s){
		
		ArrayList<EmployeeDtails> list= new ArrayList<>();
		
		String url="jdbc:mysql://localhost:3306/second";
		String userName="mani";
		String password="Mysqlmy1@";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			java.sql.Connection con= DriverManager.getConnection(url,userName,password);
			java.sql.Statement statement= con.createStatement();
			ResultSet resultSet= statement.executeQuery(s);
			while(resultSet.next()) {
				String st=resultSet.getString("employee_id");
				String st1= resultSet.getString("employee_name");
				String st2= resultSet.getString("employee_department");
				String st3= resultSet.getString("employee_designation");
				int st4= resultSet.getInt("employee_salary");
				
				list.add( new EmployeeDtails(st, st1,st2,st3,st4));

				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
