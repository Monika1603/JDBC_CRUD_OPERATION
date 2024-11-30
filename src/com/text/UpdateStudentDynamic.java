package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class UpdateStudentDynamic {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/01testing", "root", "root");
			
			String sql = "UPDATE student SET college = ? WHERE studId = ?";
			
			PreparedStatement prepStatement = connection.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the college name : ");
			prepStatement.setString(1, sc.next());
			
			System.out.println("Enter the stud Id : ");
			prepStatement.setInt(2, sc.nextInt());
			
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

