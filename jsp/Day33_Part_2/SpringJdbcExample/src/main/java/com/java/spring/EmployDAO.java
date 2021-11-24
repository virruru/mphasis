package com.java.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import oracle.net.aso.c;

public class EmployDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public String deleteEmploy(int empno) {
		String cmd = "delete from Employ where empno=?";
		jdbcTemplate.update(cmd,new Object[] {empno});
		return "Record Deleted...";
	}

	public String updateEmploy(Employ employ) {
		String cmd = "Update Employ set Name=?,Gender=?, Dept=?, Desig=?,"
				+ " Basic=? Where Empno=?";
		
		jdbcTemplate.update(cmd,new Object[] { 
				 employ.getName(),employ.getGender(),employ.getDept(),employ.getDesig(),
				 employ.getBasic(),employ.getEmpno()
			});
		return "Record Updated...";
	}
	public String addEmploy(Employ employ) {
		String cmd = "insert into Employ(empno,name,gender,dept,desig,basic)  "
				+ " values(?,?,?,?,?,?)";
		jdbcTemplate.update(cmd,new Object[] {employ.getEmpno(), 
				 employ.getName(),employ.getGender(),employ.getDept(),employ.getDesig(),
				 employ.getBasic()
			});
		return "Record Inserted...";
	}
	public Employ searchEmploy(int empno) {
		String sql = "select * from Employ where empno=?";
	    return jdbcTemplate.query(sql,new Object[] {empno}, new ResultSetExtractor<Employ>() {
	        @Override
	        public Employ extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	                Employ employ = new Employ();
		            employ.setEmpno(rs.getInt("empno"));
		            employ.setName(rs.getString("name"));
		            employ.setGender(rs.getString("gender"));
		            employ.setDept(rs.getString("dept"));
		            employ.setDesig(rs.getString("desig"));
		            employ.setBasic(rs.getInt("basic"));
		            return employ;
	            }
	 
	            return null;
	        }
	 
	    });
	}

	public Employ[] showEmploy() {
		String cmd = "select * from Employ";
		List<Employ> employList = null;
		
		employList = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(rs.getString("gender"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
				return employ;
			}
			
		});
		return employList.toArray(new Employ[employList.size()]);
	}
}
