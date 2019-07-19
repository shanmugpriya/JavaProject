
import java.sql.*;  

class DatabaseConnection{  
	
	static Connection con;
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/buspass","root","");  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		} 
		return con;
	}
	}
	

		

