package ext;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/b13")
public class b13 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public b13() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie ck1=new Cookie("abc","123");
		response.addCookie(ck1);
		Cookie ck2=new Cookie("def","456");
		response.addCookie(ck2);
		Cookie ck3=new Cookie("ghi","789");
		response.addCookie(ck3);
		Cookie ck4=new Cookie("jkl","012");
		ck4.setMaxAge(15);
		response.addCookie(ck4);
		Cookie ck5=new Cookie("mno","345");
		ck5.setMaxAge(15);
		response.addCookie(ck5);
		Cookie ck6=new Cookie("pqr","678");
		ck6.setMaxAge(15);
		response.addCookie(ck6);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
