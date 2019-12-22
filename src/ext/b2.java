package ext;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/b2")
public class b2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public b2() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ps","root","");
			System.out.println("connected");
			PrintWriter pw=response.getWriter();
			String option=request.getParameter("option");
			if(option.equalsIgnoreCase("phn"))
			{
				String phn=request.getParameter("choice");
				PreparedStatement ps=con.prepareStatement("select * from police where phn=?");
				ps.setString(1,phn);
				ResultSet rs=ps.executeQuery();
				rs.next();
				pw.println(rs.getString(1));
			}
			if(option.equalsIgnoreCase("area")) {
				String area=request.getParameter("choice");
				PreparedStatement ps1=con.prepareStatement("select * from police where area=?");
				ps1.setString(1,area);
				ResultSet rs1=ps1.executeQuery();
				rs1.next();
				pw.println(rs1.getString(1));
			}
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
