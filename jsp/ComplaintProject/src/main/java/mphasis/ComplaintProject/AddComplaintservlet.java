package mphasis.ComplaintProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AddComplaintservlet
 */
public class AddComplaintservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddComplaintservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ComplaintDAO dao = new ComplaintDAO();
		Complaint complaint = new Complaint();
		complaint.setComplaintType(request.getParameter("complaintType"));
		complaint.setcDescription(request.getParameter("cDescription"));
		complaint.setComplaintDate(request.getParameter("complaintDate"));
		complaint.setSeverity(request.getParameter("severity"));
		complaint.setStatus(request.getParameter("Status"));
		PrintWriter out = response.getWriter();
		try {
			out.println(dao.addComplaint(complaint));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
