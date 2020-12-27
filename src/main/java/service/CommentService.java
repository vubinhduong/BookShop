package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Comment;

public class CommentService {
    private String query;
    ResultSet rs;
    private Connection connection = JDBCConnection.getJDBCConnection();
    
    public List<Comment> getAllCommnent(){
    	List<Comment> cmt = new ArrayList<Comment>();
    	try {
    		Statement stt = connection.createStatement();
    		query = "SELECT * FROM cmnt";
    		rs = stt.executeQuery(query);
    		while(rs.next()) {
    			int cmt_id = rs.getInt("cmt_id");
    			String book_id = rs.getString("book_id");
    			String username = rs.getString("username");
    			Date date_cmt = rs.getDate("date_cmt");
    			String content = rs.getString("content");
    			
    			Comment c = new Comment(cmt_id, book_id, username, date_cmt, content);
    		    cmt.add(c);
    		}
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return cmt;
    }
}
