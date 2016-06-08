package chapter32_servlets;

import java.io.*;
import javax.servlet.*;

public class HelloServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<B>Hello!</B>");
		pw.close();
	}
}