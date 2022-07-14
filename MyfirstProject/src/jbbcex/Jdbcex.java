package jbbcex;
import java.sql.*;
public class Jdbcex {
	public static void main(String[] args) {
		Connection conn;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sandeep1234");
		System.out.println("connection established");
		
		}
		
		
		catch(SQLException | ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
	}
}


