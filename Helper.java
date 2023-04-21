package jdbc;

import java.sql.*;

public class Helper {
	static {
		try {
			//register my SQL driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static Connection con() throws SQLException{
		return DriverManager.getConnection //connection build up
				("jdbc:mysql://localhost:3306/JDBCdb","root","root");
	}
	}

