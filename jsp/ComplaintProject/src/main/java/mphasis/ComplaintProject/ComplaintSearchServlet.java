package mphasis.ComplaintProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ComplaintSearchServlet
 */
public class ComplaintSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplaintSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = String(request.getParameter("complaintId"));
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select * from  complaint where complaintId=?";
		PrintWriter out = response.getWriter();
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, "complaintId");
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				out.println("Complaint ID  " +rs.getString("complaintId") + "<br/>");
				out.println("Complaint Type  " +rs.getString("complaintType") + "<br/>");
				out.println("Complaint Description  " +rs.getString("cDescription") + "<br/>");
				out.println("Complaint Date  " +rs.getDate("compalintDate") + "<br/>");
				out.println("Severity  " +rs.getString("severity") + "<br/>");
				out.println("Status  " +rs.getInt("status") + "<br/><hr/>");
			} else {
				out.println("*** Complaint Not Registered ***");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private String String(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
