package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class VendorDAO {

	@Autowired  
    JdbcTemplate jdbc;  
    
    public String authenticate(String user,String pwd) {
        String cmd = "select count(*) cnt from Vendor where Ven_UserName=? "
                + " AND Ven_Password=?";
        List str=jdbc.query(cmd,new Object[] {user,pwd}, new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                // TODO Auto-generated method stub
                return rs.getInt("cnt");
            }
            
        });
        return str.get(0).toString();
    }
    
    public Vendor showonevendor(String user) {
		String cmd = "select * from Vendor where ven_UserName=? ";
        List<Vendor> str=jdbc.query(cmd,new Object[] {user}, new RowMapper<Vendor>() {
            @Override
            public Vendor mapRow(ResultSet rs, int rowNum) throws SQLException {
                // TODO Auto-generated method stub
            	Vendor vendor = new Vendor();
        		
        			vendor.setVen_id(rs.getInt("ven_id"));
        			vendor.setVen_name(rs.getString("ven_name"));
        			vendor.setVen_phn_no(rs.getString("ven_phn_no"));
        			vendor.setVen_username(rs.getString("ven_username"));
        			vendor.setVen_email(rs.getString("ven_email"));
        			
        		
        		return vendor;
            }
            
        });
        return str.get(0);
	}
	
}
