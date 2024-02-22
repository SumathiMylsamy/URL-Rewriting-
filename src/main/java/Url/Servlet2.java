package Url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String pass=request.getParameter("pswd");
		
		
		
		out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Info Page </title>");
        out.println("<style>");
        out.println("body { background-color: yellow; font-size:30px; text-align:center; margin-top:20%;}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("Username: "+name);
		out.println("<br>");
		out.println("<br>");
		out.println("Password: "+pass);
        out.println("</body>");
        out.println("</html>");
		
	}

}
