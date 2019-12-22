package ext;

import java.sql.*;


public class sample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","");
		PreparedStatement s=con.prepareStatement("insert into student values(?,?,?,?)");
		s.setString(1, "CS51");
		s.setInt(2,90);
		s.setInt(3,90);
		s.setInt(4,90);
		s.executeUpdate();

	}

}
