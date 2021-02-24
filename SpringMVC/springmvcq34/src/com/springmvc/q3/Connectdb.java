package com.springmvc.q3;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;




public class Connectdb {
	
	public static ArrayList<User> getDetails(){
		
		ArrayList<User> list= new ArrayList<>();
		
		String url="jdbc:mysql://localhost:3306/first";
		String userName="mani";
		String password="Mysqlmy1@";
		
		
		try {
			java.sql.Connection con= DriverManager.getConnection(url,userName,password);
			java.sql.Statement statement= con.createStatement();
			ResultSet resultSet= statement.executeQuery("SELECT * FROM passs");
			while(resultSet.next()) {
				String str=resultSet.getString("name");
				String st= resultSet.getString("pass");
				
				list.add( new User(str, st));

				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
