package ext;
import java.sql.*;
public class b14 {

	public static void main(String[] args) {
		
Connection con=null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
	System.out.println("connected");
	Statement stmt1=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	String sql="select * from stud where cgpa<9.0";
	ResultSet rs=stmt1.executeQuery(sql);
	while(rs.next()) {
		System.out.println("name:"+rs.getString(1));
		System.out.println("rollno:"+rs.getInt(2));
		System.out.println("cgpa:"+rs.getDouble(3));
	}
	String sql1="select * from stud";
	Statement stmt2=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs1=stmt2.executeQuery(sql1);
	while(rs1.next()) {
		if(rs1.getString("name").equals("John"))
		{
			rs1.updateDouble("cgpa",9.4);
			rs1.updateRow();
		}
	}
	System.out.println("after updating");
	rs1.beforeFirst();
	while(rs1.next()) {
		System.out.println("name:"+rs1.getString(1));
		System.out.println("rollno:"+rs1.getInt(2));
		System.out.println("cgpa:"+rs1.getDouble(3));
	}
}
catch(SQLException e) {e.printStackTrace();} 
catch (ClassNotFoundException e) {
	e.printStackTrace();
}
finally {
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}

}
