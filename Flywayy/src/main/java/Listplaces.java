

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


@WebServlet("/Listplaces")
public class Listplaces extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Listplaces() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		out.print("<a href='AddPlaces.html'>Add Places</a>");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession()  ;
	 if (session!=null) {
		 List<Places> list = session.createQuery("from Places").list();
		for (Places places : list) {
			out.print("<br>"+places.getID()+"\t"+places.getName()+"\t"+"\t"+places.getDescription()+"\t"+"\t"+"\t"
		+places.getFrom()+"\t"+"\t"+"\t"+places.getDestination());
		}
		}
			session.close();
		 }
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
