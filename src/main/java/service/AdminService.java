package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Admin;


public class AdminService {
    private String query;
    ResultSet rs;
    private Connection connection = JDBCConnection.getJDBCConnection();
    
    public List<Admin> getAllAdmin(){
    	List<Admin> admin = new ArrayList<Admin>();
    	try {
    		Statement statement = connection.createStatement();
    		query = "SELECT * FROM admin";
    		rs = statement.executeQuery(query);
    		while(rs.next()) {
    			int admin_id = rs.getInt("admin_id"); 
    			String username = rs.getString("username");
    			String password = rs.getString("password");
    			
    			Admin a = new Admin(admin_id, username, password);
    		    admin.add(a);
    		}
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
		return admin;
    }
}
