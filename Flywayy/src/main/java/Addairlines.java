

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/Addairlines")
public class Addairlines extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private Session session = null;
	@Override
	public void init() throws ServletException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ID = Integer.parseInt(request.getParameter("IDnum"));
		String Name = request.getParameter("NameAirline");
		String Description = request.getParameter("description");
		
		Airlines air = new Airlines();
		air.setID(ID);
		air.setNameA(Name);
		air.setDiscription(Description);
		Transaction transaction = session.beginTransaction();
		try {
			session.save(air);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("Airlines Saved Successfully "+"<br>");
		out.print("<a href='Listairlines'>List Of Airlines</a>");
		out.print("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
@Override
public void destroy() {
	if(session != null) {
		session.close();
	}
}
}
