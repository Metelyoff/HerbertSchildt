package chapter32_servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ColorPostServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String color = request.getParameter("color");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<B>The selected color is:  ");
		pw.println(color);
		pw.close();
	}
}