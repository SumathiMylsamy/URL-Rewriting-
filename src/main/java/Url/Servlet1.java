package Url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		String pswd=request.getParameter("password");
		
		
		out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome Page </title>");
        out.println("<style>");
        out.println("body { background-color: yellow; font-size:20px; text-align:center; margin-top:20%;}");
        out.println("a {text-decoration:none; font-size:30px;}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome  </h1>"+name);
        out.println("<p><a href='Servlet2?name="+name+"&pswd="+pswd+"'>Visit Here!</a></p>");
        out.println("</body>");
        out.println("</html>");
	}

}
