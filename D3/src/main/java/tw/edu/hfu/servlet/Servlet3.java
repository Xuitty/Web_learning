package tw.edu.hfu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		System.out.println(req.getContentType());
//	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
//		System.out.println(req.getMethod());
//		System.out.println(req.getRequestURI());
//		System.out.println(req.getRequestURL());
//		System.out.println("asdasdasd");
		
		if(req.getMethod().equalsIgnoreCase("post")) {
			System.out.println("post");
		}else if(req.getMethod().equalsIgnoreCase("get")) {
			System.out.println("get");
		}
	}
	
	

	
	
}
