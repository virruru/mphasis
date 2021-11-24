package mphasis.BankprojectServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchAccounServlet
 */
public class SearchAccounServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAccounServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNo = Integer.parseInt(request.getParameter("accountNo"));
		AccountsDAO dao = new AccountsDAO();
		PrintWriter out = response.getWriter();
		try {
			Accounts accounts = dao.searchAccount(accountNo);
			if (accounts!=null) {
				out.println("First Name  " + accounts.getFirstName() + "<br/>");
				out.println("Last Name  " + accounts.getLastName() + "<br/>");
				out.println("City  " + accounts.getCity() + "<br/>");
				out.println("State  " + accounts.getState() + "<br/>");
				out.println("Amount  " + accounts.getAmount() + "<br/>");
				out.println("Cheq Facility  " + accounts.getCheqFacil() + "<br/>");
				out.println("Account Type  " + accounts.getAccountType() + "<br/>");
			}
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
