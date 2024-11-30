package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveStudentData {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/01testing","root","root");
		
		PreparedStatement prepStatement = connection.prepareStatement("select * from student");
	
		ResultSet fechedData = prepStatement.executeQuery();
		
		while(fechedData.next())
		{
			System.out.println("Id : " + fechedData.getInt(1));
			System.out.println("Name : " + fechedData.getString(2));
			System.out.println("Age : " + fechedData.getInt(3));
			System.out.println("College : " + fechedData.getString(4));
		}
		
		connection.close();
		prepStatement.close();
	}
	}


