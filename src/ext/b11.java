package ext;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/b11")
public class b11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public b11() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty","root","");
			System.out.println("connected");
			PrintWriter pw=response.getWriter();
			PreparedStatement pst=con.prepareStatement("select subname from subjects where facultyid=?");
			pst.setInt(1,4);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				pw.println("subjects:"+rs.getString(1));
			}
			Statement stmt=con.createStatement();
			int count=stmt.executeUpdate("update subjects set facultyid=4 where facultyid=2");
			pw.print("count:"+count);
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
