package com.java.spr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.java.spr.model.Employ;

public class EmployDAOImpl implements EmployDAO {

	private JdbcTemplate jdbcTemplate;
	
	public EmployDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employ> list() {
		 String sql = "SELECT * FROM Employ";
		    List<Employ> listEmploy = jdbcTemplate.query(sql, new RowMapper<Employ>() {
		 
		        @Override
		        public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
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
		 
		    return listEmploy;
	}

}
