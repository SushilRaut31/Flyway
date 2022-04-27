

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebServlet("/Listflights")
public class Listflights extends HttpServlet {
	private static final long serialVersionUID = 1L;

    


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		try{
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
		if (session!=null) {
			 List<flights> list = session.createQuery("from flights").list();
			 for (flights flightss : list) {
				out.print("<br>"+flightss.getID()+"\t"+flightss.getFromto()+"\t"+flightss.getDeparture()+"\t"+flightss.getAirline()+"\t"+
			 flightss.getTicket()+"<br>");
				session.close();
			}
			
			}
	
	}catch(Exception e) {
		
		out.print("Session");
		e.printStackTrace();
	}
		out.print("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
