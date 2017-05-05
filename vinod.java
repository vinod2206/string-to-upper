import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Vinod extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String str1=req.getParameter("username");
		String str2=req.getParameter("password");
		if(str1.equals("Vinodthelegend")&&str2.equalsIgnoreCase("java"))
		{
			pw.println("<h1>VALID RA BHAI</h1");
		}
		else
		{
			pw.println("<h1>INVALID DENGEY</h1>");
		}
		pw.close();
	}
	
       
}