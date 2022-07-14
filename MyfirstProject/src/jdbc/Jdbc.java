package jdbc;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
	public static void main(String[] args) {
		Connection conn;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sandeep1234");
		System.out.println("connection established");
//		Statement st=conn.createStatement();
//		st.execute("insert into employe values(4,'rishi',3400)");
////		st.executeQuery("update employe set salary=100 where id=1");
//		
//		
//		PreparedStatement ps=conn.prepareStatement("insert into )
//		ResultSet rs=st.executeQuery("Select * from employe");
		CallableStatement c=conn.prepareCall("{call pro1(?,?)}");
		
		int sal;
		c.setInt(1,100);
		c.registerOutParameter(2,java.sql.Types.INTEGER);
		c.executeUpdate();
		sal=c.getInt(2);
		System.out.println(sal);
		}
		
		
		
		catch(SQLException | ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
	}

}
