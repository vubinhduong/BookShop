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
		Connection connection = JDBCConnection.getJDBCConnection();
		try {
			
			Statement statement = connection.createStatement();
			String sql = "SELECT a.author_id, name, a.intro, a.image\r\n" + 
					"FROM book b, author a, authorbook ab\r\n" + 
					"WHERE b.book_id = '" +  id_book + "' and b.book_id = ab.book_id and a.author_id = ab.author_id ";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				String author_id = rs.getString("author_id");
				String name = rs.getString("name");
				String intro = rs.getString("intro");
				String image = rs.getString("image");
	
				Author a = new Author(author_id, name, intro, image);
				author.add(a);
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return author;
	}

}
