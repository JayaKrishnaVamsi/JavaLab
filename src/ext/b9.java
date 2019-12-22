package ext;
import java.sql.*;
public class b9 {
	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		System.out.println("connected");
		con.setAutoCommit(false);
		Statement stmt=con.createStatement();
		stmt.executeUpdate("update bank set balance=10000 where id=1");
		Savepoint sp=con.setSavepoint();
		stmt.executeUpdate("update bank set balance=10000 where id=2");
		con.rollback(sp);
		con.releaseSavepoint(sp);
		con.commit();
		}
		catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
