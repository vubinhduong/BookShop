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
    
    public List<Comment> getCommnent(){
    	Connection connection = JDBCConnection.getJDBCConnection();
    	List<Comment> cmt = new ArrayList<Comment>();
    	try {
    		Statement stt = connection.createStatement();
    		rs = stt.executeQuery(query);
    		while(rs.next()) {
    			String book_id = rs.getString("book_id");
    			String username = rs.getString("username");
    			Date date_cmt = rs.getDate("date_cmt");
    			String content = rs.getString("content");
    			
    			Comment c = new Comment(book_id, username, date_cmt, content);
    		    cmt.add(c);
    		    System.out.println(c.getBook_id());
    		}
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    	finally {
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
    	return cmt;
    }
    
    // tất cả cmt
    public List<Comment> getAll(){
    	query = "SELECT * FROM CMT";
    	return getCommnent();
    }
    
    public List<Comment> getCmtByBookId(String book_id){
    	query = "SELECT * \r\n" + 
    			"FROM cmt\r\n" + 
    			"where book_id = '" + book_id + "'";
    	return getCommnent();
    }
    
    public void addCommentByBookId(String bookId, String comment, String username) {
    	long millis = System.currentTimeMillis();
    	Date date = new Date(millis);
    	query = "INSERT INTO cmt(book_id, username, date_cmt, content) VALUES "
    			+ "('" + bookId + "','" + username +  "','" + date.toString() + "','" + comment + "')";
    	Connection connection = JDBCConnection.getJDBCConnection();
    	
		try {
			Statement st = connection.createStatement();
			st.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
    }
    
}





