package mphasis.BankprojectServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MinistatementServlet
 */
public class MinistatementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MinistatementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountsDAO dao = new AccountsDAO();
		int accountNo = Integer.parseInt(request.getParameter("accountNo"));
		PrintWriter out = response.getWriter();
		try {
			List<Trans> transList = dao.miniStatement(accountNo);
			for(Trans t : transList) {
				out.println("Account No  " +t.getAccountNo() + "<br/>");
				out.println("Tran Amount  " +t.getTranAmount() + "<br/>");
				out.println("Tran Type  " +t.getTranType() + "<br/>");
				out.println("Tran Date  " +t.getTranDate() + "<br/><hr/>");
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
