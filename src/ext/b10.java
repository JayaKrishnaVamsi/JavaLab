package ext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/b10")
public class b10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public b10() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("clientname");
		String panid=request.getParameter("pan");
		int flag=0;
		Cookie mycks[]=request.getCookies();
		PrintWriter pw=response.getWriter();
		for(int i=0;i<mycks.length;i++)
		{
			if(mycks[i].getName().equals(name) && mycks[i].getValue().equals(panid)) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			pw.println("welcome back"+name);
		}
		else {
			Cookie ck=new Cookie(name,panid);
			response.addCookie(ck);
			pw.println("welcome"+name);
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
