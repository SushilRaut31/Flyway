

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
    	PrintWriter out = response.getWriter();
		String Name =request.getParameter("username");
		String Pass =request.getParameter("password");
		
		session.setAttribute("name", Name);
		out.print("<html><body>");
			out.print("<a href ='Listflights'>List Of Flights</a>"+"<br>"+"<br>");
			out.print("<a href ='Listairlines'>List Of Airlines</a>"+"<br>"+"<br>");
			out.print("<a href ='Listplaces'>List Of places</a>"+"<br>"+"<br>");
			out.print("<br><br><br><br><br>");
			out.print("<a href='ChangePassword.jsp'>Change PassWord</a>");
			
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
