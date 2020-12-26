package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserService {
    private String query;
    ResultSet rs;
    private Connection connection = JDBCConnection.getJDBCConnection();

    public List<User> getAllUser(){
    	List<User> user = new ArrayList<User>();
    	try {
    		Statement statement = connection.createStatement();
    		query = "SELECT * FROM user";
    		rs = statement.executeQuery(query);
    		while(rs.next()) {
    			int user_id = rs.getInt("user_id");
    			String username = rs.getString("username");
    			String password = rs.getString("password");
    			String fullname = rs.getString("fullname");
    			String address = rs.getString("address");
    			String phone = rs.getString("phone");
    			String email = rs.getString("email");
    			Date birthday = rs.getDate("brithday");
    			
    			User u = new User(user_id, username, password, fullname, address, phone, email, birthday);
    			user.add(u);
    		}
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    	
    	return user;
    }
    
    public boolean addUser(User u) {
    		connection = JDBCConnection.getJDBCConnection();
    	   try {
    		   query = "INSERT INTO user(user_id, username, password, fullname, address, phone, email, brithday)"
                        +" VALUES(?,?,?,?,?,?,?,?)";
    		   PreparedStatement ps = connection.prepareStatement(query);
    		   ps.setInt(1, u.getUser_id());
    		   ps.setString(2, u.getUsername());
    		   ps.setString(3, u.getPassword());
    		   ps.setString(4, u.getFullname());
    		   ps.setString(5, u.getAddress());
    		   ps.setString(6, u.getPhone());
    		   ps.setString(7, u.getEmail());
    		   ps.setDate(8, new Date(u.getBirthday().getTime()));
    		   
    		   return ps.executeUpdate() > 0;
    	   } catch (SQLException e) {
    		   e.printStackTrace();
    	       }
    	return false;
    }
    
    public void deleteUser(int userid) {
    	connection = JDBCConnection.getJDBCConnection();
    	try {
    		query = "DELETE * FROM user WHERE user_id = '" + userid +"'";
    		PreparedStatement ps = connection.prepareStatement(query);
    		ps.executeUpdate();
    	} catch (SQLException e3) {
    		e3.printStackTrace();
    	}
    }
}
