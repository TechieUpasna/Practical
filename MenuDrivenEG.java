package jdbc;
import java.util.*;
import java.sql.*;
public class MenuDrivenEG {

	
		Scanner sc=new Scanner(System.in);
		int emp_id,working_hours,salary;
		String ename,designation,dept;
		public void saveMenudriven() throws SQLException{
			System.out.println("Enter emp_id: ");
			String emp_id=sc.next();
			System.out.println("Enter name: ");
			String ename=sc.next();
			System.out.println("Enter designation: ");
			String designation=sc.next();
			System.out.println("Enter dept: ");
			String dept=sc.next();
			System.out.println("Enter working hours: ");
			String working_hours=sc.next();
			System.out.println("Enter salary: ");
			String salary=sc.next();
			
			Connection conn= Helper.con();
			PreparedStatement smt=conn.prepareStatement
					("Insert into future_emp values(?,?,?,?,?,?)");
	
			smt.setString(1, emp_id);
			smt.setString(2, ename);
			smt.setString(3, designation);
			smt.setString(4,dept);
			smt.setString(5,working_hours);
			smt.setString(6,salary);
			smt.execute();

	}
		public void fetchMenuDriven() throws SQLException{
			Connection conn=Helper.con();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("Select*from future_emp");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
			}
		}
		public void updateMenuDriver() throws SQLException{
			Connection conn=Helper.con();
			Statement stmt=conn.createStatement();
			System.out.println("Enter employee dept: ");
			dept=sc.nextLine();
			stmt.executeUpdate("Update future_emp set dept= "+dept+"where emp_id= "+emp_id);
			
		}
		public void deleteMenuDriven() throws SQLException{
			Connection conn=Helper.con();
			Statement stmt=conn.createStatement();
			System.out.println("Enter employee id: ");
			emp_id=sc.nextInt();
			
			stmt.executeUpdate("delete from future_emp where emp_id= "+emp_id);
		}
		

}
