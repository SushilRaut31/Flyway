

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebServlet("/Listairlines")
public class Listairlines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Listairlines() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<a href='AddAirlines.html'>Add Airlines</a>"+"<br>");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession()  ;
	 if (session!=null) {
		 List<Airlines> list = session.createQuery("from Airlines").list();
		 for (Airlines airlines : list) {
			out.print("<br>"+airlines.getID()+"\t"+"\t"+airlines.getNameA()+"\t"+"\t"+"\t"+airlines.getDiscription()+"<br>");
		}
			session.close();
		 }}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
