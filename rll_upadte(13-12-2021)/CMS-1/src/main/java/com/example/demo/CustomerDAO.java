package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {

	@Autowired  
    JdbcTemplate jdbc;  
    
    public String authenticate(String user,String pwd) {
        String cmd = "select count(*) cnt from Customer where cus_UserName=? "
                + " AND cus_Password=?";
        List str=jdbc.query(cmd,new Object[] {user,pwd}, new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                // TODO Auto-generated method stub
                return rs.getInt("cnt");
            }
            
        });
        return str.get(0).toString();
    }
    
    public Customer showonecustomer(String user) {
		String cmd = "select * from Customer where cus_UserName=? ";
        List<Customer> str=jdbc.query(cmd,new Object[] {user}, new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                // TODO Auto-generated method stub
            	Customer customer = new Customer();
        		
        			customer.setCus_id(rs.getInt("cus_id"));
        			customer.setCus_name(rs.getString("cus_name"));
        			customer.setCus_phn_no(rs.getString("cus_phn_no"));
        			customer.setCus_username(rs.getString("cus_username"));
        			customer.setCus_email(rs.getString("cus_email"));
        			
        		
        		return customer;
            }
            
        });
        return str.get(0);
	}
}

