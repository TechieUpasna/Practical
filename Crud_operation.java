package jdbc;
import java.sql.*;
import java.util.*;
public class Crud_operation {

	public static void main(String[] args)throws SQLException {
		MenuDrivenEG e=new MenuDrivenEG();
		Scanner s=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.INSERT\n 2.DISPLAY\n 3.UPDATE\n 4.DELETE\n 5.EXIT");
			System.out.println("Enter your choise from 1-5");
			ch=Integer.parseInt(s.nextLine());
			System.out.println("----------------");
			switch(ch) {
			case 1:
				e.saveMenudriven();
				break;
			case 2:
				e.fetchMenuDriven();
				break;
			case 3:
				e.updateMenuDriver();
				break;
			case 4:
				e.deleteMenuDriven();
				break;
			case 5:
				System.exit(0);
			
			}
		}while(true);
		
	}

}
