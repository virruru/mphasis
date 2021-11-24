package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class MenuDAO {
	

	    @Autowired  
	    JdbcTemplate jdbc;  
	    
	    public Menu searchMenu(int menuId) {
	        String cmd = "select * from Menu where men_id=?";
	        List<Menu> menuList=jdbc.query(cmd,new Object[] {menuId}, new RowMapper<Menu>() {
	            @Override
	            public Menu mapRow(ResultSet rs, int arg1) throws SQLException {
	                Menu menu = new Menu();
	                menu.setMen_id(rs.getInt("MEN_ID"));
	                menu.setMen_item(rs.getString("MEN_ITEM"));
	                menu.setMen_price(rs.getDouble("MEN_PRICE"));
	                menu.setMen_calories(rs.getInt("MEN_CALORIES"));
	                menu.setMen_speciality(rs.getString("MEN_SPECIALITY"));
	                return menu;
	            }
	            
	        });
	        return menuList.get(0);
	    }
	    public int generatemenid() {
	    	String cmd = " select case when max(men_id) is NULL"
					+ " then 1 else max(men_id)+1 end men_id from menu ";
	    	List str=jdbc.query(cmd, new RowMapper() {
	            @Override
	            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	                // TODO Auto-generated method stub
	                return rs.getInt("men_id");
	            }
	            
	        });
	        return (int) str.get(0);
	    }
	    
	}

