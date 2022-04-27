

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

@WebServlet("/Addplaces")
public class Addplaces extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	   
		private Session session = null;
		@Override
		public void init() throws ServletException {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ID = Integer.parseInt(request.getParameter("IDplace"));
		String Name = request.getParameter("nameplace");
		String Description = request.getParameter("decplace");
		String From = request.getParameter("Fromplace");
		String Destination = request.getParameter("desplace");
		
		Places place =new Places();
		place.setID(ID);
		place.setName(Name);
		place.setDescription(Description);
		place.setFrom(From);
		place.setDestination(Destination);
		Transaction transaction = session.beginTransaction();
		try {
			session.save(place);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("Places Saved Successfully "+"<br>");
		out.print("<a href='Listplaces'>List Of Places</a>");
		out.print("</body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
