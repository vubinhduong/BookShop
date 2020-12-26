package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Author;
public class AuthorService {
	public static List<Author> getBookAuthor(String id_book){
		List<Author> author = new ArrayList<Author>();
		try {
			Connection connection = JDBCConnection.getJDBCConnection();
			Statement statement = connection.createStatement();
			String sql = "select *\r\n" + 
					"from author, book\r\n" + 
					"where author.book_id = book.book_id";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				String author_id = rs.getString("author_id");
				String book_id = rs.getString("book_id");
				String name = rs.getString("name");
				String intro = rs.getString("intro");
				String image = rs.getString("image");
	
				Author a = new Author(author_id, book_id, name, intro, image);
				author.add(a);
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return author;
	}

}
