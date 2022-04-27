

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;


@WebServlet("/ChangePasswordDB")
public class ChangePasswordDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ChangePasswordDB() {
        super();
        // TODO Auto-generated constructor stub
    }
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("t3");
		String pswd = request.getParameter("t2");
		
		ChangePassword change = new ChangePassword();
		change.setPass(pswd);
		change.setUser(user);
	
	
		out.print("Password Change Successfully");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
