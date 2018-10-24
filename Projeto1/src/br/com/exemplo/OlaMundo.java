package br.com.exemplo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OlaMundo")
public class OlaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   @Override
	protected void service(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		
	   PrintWriter out = response.getWriter();
	   
	   out.println("<html>");
	   out.println("<body>");
	   out.println("Ol� mundo!");
	   out.println("</body>");
	   out.println("</html>");
	   
	   
	}

}
