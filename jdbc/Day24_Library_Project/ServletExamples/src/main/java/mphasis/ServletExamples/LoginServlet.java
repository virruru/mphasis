package mphasis.ServletExamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		PrintWriter out = response.getWriter();
		if (user.equals("Aseem") && pwd.equals("Suri")) {
//			out.println("Correct Credentials...");
			RequestDispatcher disp = request.getRequestDispatcher("menu.html");
			disp.forward(request, response);
		} else {
			RequestDispatcher disp = request.getRequestDispatcher("login.html");
			disp.include(request, response);
			out.println("Invalid Credentials...");
		}
	}

}
