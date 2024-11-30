package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement
{
	public static void main(String[]args) throws Exception
	{
		//create the query
		String sql = "insert into student(studId, Name, Age, college)values(1,'Monika',29,'Raisoni College')";
		
		//Load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//establish the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/01testing", "root", "root");
        
        //Create the statement
        Statement stmt = connection.createStatement();
        
        //execute the sql statement
        stmt.execute(sql);

        System.out.println("Data Inserted");
        
        //close the connection
        connection.close();
        stmt.close();
	}
}
