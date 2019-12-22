package ext;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/b3")
public class b3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public b3() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void initials(String s,HttpServletResponse response) throws IOException {
    	PrintWriter pw=response.getWriter();
    	for(int i=0;i<s.length();i++) {
    	if(Character.isUpperCase(s.charAt(i))) {
            pw.print(s.charAt(i));
    }}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		initials(name,response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
