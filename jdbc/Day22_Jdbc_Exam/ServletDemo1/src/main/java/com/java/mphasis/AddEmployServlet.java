package com.java.mphasis;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployServlet
 */
public class AddEmployServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "insert into Employ(empno,name,gender,dept,desig,basic)  "
				+ " values(?,?,?,?,?,?)";
		PrintWriter out = response.getWriter();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, Integer.parseInt(request.getParameter("empno")));
			pst.setString(2,request.getParameter("name"));
			pst.setString(3, request.getParameter("gender"));
			pst.setString(4, request.getParameter("dept"));
			pst.setString(5, request.getParameter("desig"));
			pst.setDouble(6, Double.parseDouble(request.getParameter("basic")));
			pst.executeUpdate();
			out.println("*** Record Inserted ***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
