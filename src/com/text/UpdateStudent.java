package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent {

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/01testing", "root", "root");
			
			String sql = "UPDATE student SET college = ? WHERE studId = ?";
			
			PreparedStatement prepStatement = connection.prepareStatement(sql);
			
			prepStatement.setString(1, "YCCE");
			prepStatement.setInt(2, 1);
			
			prepStatement.executeUpdate();
			
			System.out.println("Student record updated");
			connection.close();
			prepStatement.close();
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
