package tw.edu.hfu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet6
 */
@WebServlet("/s6")
public class Servlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
//		response.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		Integer a = Integer.parseInt(request.getParameter("amount"));
		Integer b = Integer.parseInt(request.getParameter("price"));
//		System.out.println(a * b);
//		System.out.println(name);
		response.getWriter().write("你的產品是 " + name + " 總價是" + a * b);
		int c=a*b;
		request.setAttribute("name", name);
		request.setAttribute("amount", a);
		request.setAttribute("total", c);
		request.getRequestDispatcher("s7").forward(request, response);
		
		
//		getServletContext().setAttribute("name", name);
//		getServletContext().setAttribute("amount", a);
//		getServletContext().setAttribute("price", b);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
