package session_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/jspm_02", "root", "Teju@1234");
		System.out.println("Connection Established");
		
		PreparedStatement pstmt = con.prepareStatement
				("insert into employee(name,salary)"+ "values(?,?)");
		Scanner s = new Scanner(System.in);
		String nm;
		double sal;
		
		System.out.println("Enter employee name =");
		nm = s.next();
		System.out.println("Enter employee salary =");
		sal = s.nextDouble();
		
		pstmt.setString(1, nm);
		pstmt.setDouble(2, sal);
		
		int i= pstmt.executeUpdate();
		System.out.println("i=" +i);
		
		ResultSet rs = pstmt.executeQuery("select *from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+ ""+rs.getString(2)+" "+rs.getDouble(3));
		}
		
//		int j = pstmt.executeUpdate("delete from employee where id = 4");
//		int k = pstmt.executeUpdate("update employee set id=3 where id=5");

	}

}