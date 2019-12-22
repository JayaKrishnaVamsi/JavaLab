package ext;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/b6")
public class b6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public b6() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/em","root","");
			System.out.println("connected");
			PrintWriter pw=response.getWriter();
			PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?)");
			/*pst.setInt(1,1);
			pst.setString(2,"vamsi");
			pst.setString(3,"anantapur");
			pst.setString(4,"2000-03-30");
			pst.executeUpdate();*/
		
			//response.sendRedirect("b6.jsp");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				//Print one row          
				for(int i = 1 ; i <= columnsNumber; i++){
				      pw.print(rs.getString(i) + " "); 
				}
				  pw.println();
				    }

			}
		catch(SQLException e) {e.printStackTrace();}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
