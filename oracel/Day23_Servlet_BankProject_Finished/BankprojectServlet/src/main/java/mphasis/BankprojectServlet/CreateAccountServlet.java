package mphasis.BankprojectServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccountServlet
 */
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CreateAccountServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountsDAO dao = new AccountsDAO();
		Accounts accounts = new Accounts();
		accounts.setFirstName(request.getParameter("firstName"));
		accounts.setLastName(request.getParameter("lastName"));
		accounts.setCity(request.getParameter("city"));
		accounts.setState(request.getParameter("state"));
		accounts.setAmount(Double.parseDouble(request.getParameter("amount")));
		accounts.setAccountType(request.getParameter("accountType"));
		accounts.setCheqFacil(request.getParameter("cheqFacil"));
		
		PrintWriter out = response.getWriter();
		try {
			out.println(dao.createAccount(accounts));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
