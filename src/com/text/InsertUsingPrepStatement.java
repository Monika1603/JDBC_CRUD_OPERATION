package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUsingPrepStatement {

	public static void main(String[] args)
	{

		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:3306/01testing", "root", "root");
		
	    PreparedStatement prepStatement = connection.prepareStatement("insert into student(studId, Name, Age, college)values(?,?,?,?)");//positional parameter
	    prepStatement.setInt(1, 101);
	    prepStatement.setString(2, "Rashmi");
	    prepStatement.setInt(3, 12);
	    prepStatement.setString(4, "KDK");
	    
	    boolean execute = prepStatement.execute();
	    
	    System.out.println("Record Executed :" + execute);
	    
	    connection.close();
	    prepStatement.close();
	    
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
