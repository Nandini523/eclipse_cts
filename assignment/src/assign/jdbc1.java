package assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"," hr","hr");
		PreparedStatement ps= con.prepareStatement("Insert into regions values(?,?)");
		ps.setInt(1, 501);
		ps.setString(2, "kurnool");
		int i=ps.executeUpdate();
		System.out.println(i+" records updated");
		con.close();
		}catch (Exception e)
		{System.out.println(e);}
	}
}
