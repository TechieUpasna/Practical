package jdbc;
import java.sql.*;
public class Insertjdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection driver manager
			Connection conn=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/student","root","root"); //step 2
			Statement stmt=conn.createStatement();  //create statement step3
			//inserting data into database table//step 4
			stmt.executeUpdate
			("insert into Studentdemo values(10,'Upasna','opt_MGR','Ghaziabad',12,200000)");
			System.out.println("Inserted successfully");
			conn.close(); //step 5
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}


}
