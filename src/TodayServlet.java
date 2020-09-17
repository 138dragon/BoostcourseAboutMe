

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeFormatter); 
		
		response.setContentType("text/html;charset=utf-8;");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>" + 
					"<html>" + 
					"<head>\n" + 
					"  <meta charset=\"utf-8\">\n" + 
					"  <meta name=\"viewport\" content=\"width=device-width\">\n" + 
					"  <title>JS Bin</title>\n" + 
					"</head>\n" + 
					"<body>");
		
		out.println("<a href=\"./index.html\">Home 바로가기 </a>");
		out.println("<h1 style=\"text-align:center;margin-top:20%;\">현재시간 : "+nowString+"</h1>");
		
		out.println("</body>\n" + 
					"</html>");
		
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
