package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudentData {

	public static void main(String[] args) throws Exception 
	{
     Class.forName("com.mysql.jdbc.Driver");
     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/01testing", "root","root");
     
     PreparedStatement prepStatement = connection.prepareStatement("Delete from student where studId =?");
     prepStatement.setInt(1, 101);
     prepStatement.execute();
     
     System.out.println("Deleted the data");
     
     connection.close();
     prepStatement.close();
     
	}

}
