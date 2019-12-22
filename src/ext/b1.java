package ext;
import java.sql.*;
public class b1 {
public static void main(String args[]) throws ClassNotFoundException {
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dept","root","");
		System.out.println("connected");
		Statement stmt=con.createStatement();
		String sql="create table if not exists department(deptid int,name varchar(45),year int,head varchar(45),num int)";
		stmt.execute(sql);
		stmt.executeUpdate("insert into department values(1,'cse',2010,'h1',25)");
		stmt.executeUpdate("insert into department values(2,'ece',2012,'h2',25)");
		stmt.executeUpdate("insert into department values(3,'eee',2010,'h3',25)");
		stmt.executeUpdate("insert into department values(4,'mec',2011,'h4',25)");
		stmt.executeUpdate("insert into department values(5,'ise',2010,'h5',25)");
		String sql1="select num from department where name='cse'";
		ResultSet rs=stmt.executeQuery(sql1);
			rs.next();
			System.out.println("num:"+rs.getInt(1));
		
		String sql2="select name,deptid from department where year=2010";
		ResultSet rs2=stmt.executeQuery(sql2);
		while(rs2.next()) {
			System.out.println("name:"+rs2.getString(1));
			System.out.println("deptid:"+rs2.getInt(2));
		}
	}
	catch(SQLException e) {e.printStackTrace();};
	
	
}
}
