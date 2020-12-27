package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Genre;

public class GenreSevice {
	public static List<Genre> getAll(String bookId){
		List<Genre> genre = new ArrayList<Genre>();
		
		try {
			Connection connection = JDBCConnection.getJDBCConnection();
			Statement statement = connection.createStatement();
			String sql = "select *\r\n" + 
					"from genre, book \r\n" + 
					"where book.book_id = '" + bookId + "' and genre.book_id = book.book_id ";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				String genre_id = rs.getString("genre_id");
				String book_id = rs.getString("book_id");
				String name = rs.getString("name");
				Genre a = new Genre(genre_id, book_id, name);
				genre.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return genre;
	}
}
