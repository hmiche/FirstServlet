package test.hello;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date ;
/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Login = request.getParameter("textLogin");
		String Password = request.getParameter("textPassword");
		if(Login == null) Login="";
		if(Password == null) Password="";
		HttpSession session = request.getSession(true);
		session.setAttribute("login", Login);
		session.setAttribute("password", Password);
		
		request.getRequestDispatcher("/Login.jsp").forward(request, response);
		
			
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ana Hna ") ;
		
		String Login = request.getParameter("txtlogin");
		String Password = request.getParameter("textPassword");
		
		
		 System.out.println("le LogIn Est "+Login) ;
		 System.out.println("le Password Est "+Password) ;
		if( Login.equals("Mehdi") && Password.equals("111")) {
			
			response.setContentType("text/html") ;
			try (PrintWriter out = response.getWriter()){
				
				out.print("</h1> Connected </h1>\n");
				
				
			}
			
			
		}else {
			response.setContentType("text/html") ;
			try (PrintWriter out = response.getWriter()){
				
				out.print("</h1> Not connected </h1>\n");
				
				
			}

			
		}
		}

}
