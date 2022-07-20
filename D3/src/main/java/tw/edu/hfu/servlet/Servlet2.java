package tw.edu.hfu.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7887L;
	public Servlet2() {
		System.out.println("s2");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("s2");
		req.setAttribute("NMSG", "This is not a msg test.");
		System.out.println(req.getAttribute("NMSG"));
		
	}

}
