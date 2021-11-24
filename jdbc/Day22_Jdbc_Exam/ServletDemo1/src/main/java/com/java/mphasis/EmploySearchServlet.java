package com.java.mphasis;

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
 * Servlet implementation class EmploySearchServlet
 */
public class EmploySearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmploySearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empno = Integer.parseInt(request.getParameter("empno"));
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		PrintWriter out = response.getWriter();
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				out.println("Employ No  " +rs.getInt("empno") + "<br/>");
				out.println("Employ Name  " +rs.getString("name") + "<br/>");
				out.println("Gender  " +rs.getString("gender") + "<br/>");
				out.println("Department  " +rs.getString("dept") + "<br/>");
				out.println("Designation  " +rs.getString("desig") + "<br/>");
				out.println("Basic  " +rs.getDouble("basic") + "<br/><hr/>");
			} else {
				out.println("*** Record Not Found ***");
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
